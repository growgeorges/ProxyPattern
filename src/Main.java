public class Main {
    public static void main(String[] args) {
        ISubject monBookProxy = new ProxyBookParser("ceci est le contenu d'un livre");

        System.out.println(monBookProxy.getNumberChapters()); //le proxy permet ici de n'instancier un bookparser que si une des méthodes est appellée
        System.out.println(monBookProxy.getNumberWords());
    }
}
