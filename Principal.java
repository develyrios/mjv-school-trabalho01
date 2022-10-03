public class Principal {

    public static void main (String [] parametro) {
        //Como instanciar classes
        ExemploString exemploString = new ExemploString();
        ExemploStringBuilder exemploStringBuilder = new ExemploStringBuilder();
        ExemploStringJoiner exemploStringJoiner = new ExemploStringJoiner();

        //Chamando métodos run
        exemploString.contarCaracteres("email@teste.com");
        // para demonstração
        //System.out.println(exemploString.contarCaracteres("email@teste.com"));
        exemploStringBuilder.run();
        exemploStringJoiner.run();
    }
}
