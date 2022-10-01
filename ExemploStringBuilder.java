public class ExemploStringBuilder {
    void run () {
        // StingBuilder é uma classe que permite a inserção de um número váriado de tipos de dados.");
        this.exemplosAppend();
        this.exemplosInsert();
        this.exemplosDelete();
    }

    private void exemplosAppend() {
        // Como ser criada com uma String
        StringBuilder drummond = new StringBuilder("Havia ");

        // O método append permite permite adicionar uma String no final
        drummond.append("uma pedra no ");

        // Ou uma array de char
        char[] meu = {'m', 'e', 'u', ' '};
        drummond.append(meu);

        // Ou um alcance dentro de uma array de char, usando dois int para definir inicio e fim
        char [] caminho = {'a', 'b', 'c', 'a', 'm','i', 'n', 'h', 'o', 'p', 'q'};
        drummond.append(caminho, 2, 7);

        // Ou um unico char
        drummond.append('.');

        // Resultado
        System.out.println(drummond);

        // Porém a vantagem de usar o StringBuilder é poder trabalhar com dados além de texto como números e Boolean
        StringBuilder conta = new StringBuilder();

        // Como int
        int inteiro = 10;
        conta.append("int: ");
        conta.append(inteiro);

        // Ou float
        float flutuante = 2;
        conta.append(" float: ");
        conta.append(flutuante);

        // Ou double
        double dobrado = 2.5;
        conta.append(" double: ");
        conta.append(dobrado);

        // Ou long
        double longo = 1000000;
        conta.append(" long: ");
        conta.append(longo);

        // E até mesmo boolean
        boolean booleano = false;
        conta.append(" boolean: ");
        conta.append(booleano);

        // Resultado
        System.out.println(conta);

        // Outros possíveis exemplos seria sua interação com objetos e StringBuffer
    }

    private void exemplosInsert() {
        //  Mykaeli
    }

    private void exemplosDelete() {
        // Vago
    }
}
