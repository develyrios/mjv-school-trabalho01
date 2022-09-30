public class Principal {

    public static void main (String [] parametro) {
        //Como instanciar classes
        ExemploString exemploString = new ExemploString();
        ExemploStringBuilder exemploStringBuilder = new ExemploStringBuilder();
        ExemploStringJoiner exemploStringJoiner = new ExemploStringJoiner();

        //Chamando métodos run
        exemploString.run();
        exemploStringBuilder.run();
        exemploStringJoiner.run();
    }
}
