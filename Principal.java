public class Principal {

    public static void main (String [] parametro) {
        //Como instanciar classes
        ExemploString exemploString = new ExemploString();
        ExemploStringBuilder exemploStringBuilder = new ExemploStringBuilder();
        ExemploStringJoiner exemploStringJoiner = new ExemploStringJoiner();

        //Chamando métodos run
        System.out.println("Exemplos de String:");
        exemploString.run();

        System.out.println("\nExemplos de StringBuilder:");
        exemploStringBuilder.run();

        System.out.println("\nExemplos de StringJoiner:");
        exemploStringJoiner.run();
    }
}   
