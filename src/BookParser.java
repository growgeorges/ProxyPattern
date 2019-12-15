public class BookParser implements ISubject {
    //Role : RealSubject
    //Une classe existante qu'on ne veut pas modifier mais qui est tres couteuse à l'instanciation !
    String bookContent;

    public BookParser(String bookContent){
        this.bookContent = bookContent;
    }

    public int getNumberChapters(){
        return bookContent.length()/3;
    }

    public int getNumberWords(){
        return bookContent.length()*4;
    }
}
