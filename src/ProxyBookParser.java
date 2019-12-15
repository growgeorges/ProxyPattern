import java.util.Objects;

public class ProxyBookParser implements ISubject {
    //role : Proxy
    //Le proxy qui va permettre de n'instancier le bookParser QUE SI une des méthode de bookParser est demandée
    ISubject monBookParser;
    String bookContent;

    public ProxyBookParser(String bookContent){
        this.bookContent = bookContent;
    }

    public int getNumberChapters(){
        if(Objects.isNull(monBookParser)){
            instanciateBookParser();
        }
        return monBookParser.getNumberChapters();
    }

    public int getNumberWords(){
        if(Objects.isNull(monBookParser)){
            instanciateBookParser();
        }
        return monBookParser.getNumberWords();
    }

    private void instanciateBookParser(){
        monBookParser = new BookParser(bookContent);
    }
}
