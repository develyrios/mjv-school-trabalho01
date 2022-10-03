public class ExemploStringBuilder {
    void run () {
        // StingBuilder é uma classe que permite a inserção de um número váriado de tipos de dados.");
        this.exemplosAppend();
        this.exemplosInsert();
        this.exemplosDelete();
    }

    private void exemplosAppend() {
        // Como ser criada com uma String
        StringBuilder drummond = new StringBuilder("Tinha ");

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
        StringBuilder tiposDeNumeros = new StringBuilder();

        // Como int
        int inteiro = 10;
        tiposDeNumeros.append("int: ");
        tiposDeNumeros.append(inteiro);

        // Ou float
        float flutuante = 2;
        tiposDeNumeros.append(" float: ");
        tiposDeNumeros.append(flutuante);

        // Ou double
        double dobrado = 2.5;
        tiposDeNumeros.append(" double: ");
        tiposDeNumeros.append(dobrado);

        // Ou long
        double longo = 1000000;
        tiposDeNumeros.append(" long: ");
        tiposDeNumeros.append(longo);

        // E até mesmo boolean
        boolean booleano = false;
        tiposDeNumeros.append(" boolean: ");
        tiposDeNumeros.append(booleano);

        // Resultado
        System.out.println(tiposDeNumeros);

        // Outros possíveis exemplos seria sua interação com objetos e StringBuffer
    }

    private void exemplosInsert() {
        // O método Insert permite adicionar na posição que você escolher a partir de 0.

        StringBuilder mykaeli = new StringBuilder("mi");
        mykaeli.insert(1, "ykael");
        System.out.println(mykaeli);


        StringBuilder numero = new StringBuilder("02468");
        numero.insert(1,1);
        numero.insert(3,3);
        numero.insert(5,5);
        numero.insert(7,7);
        numero.insert(9,10);

        System.out.println(numero);

        StringBuilder poema = new StringBuilder("pedra");
        poema.insert(0,"Tinha ");
        poema.insert(6,"uma ");
        poema.insert(15," no");
        poema.insert(18," meu");
        poema.insert(22," caminho");

        System.out.println(poema);

    }

    private void exemplosDelete() {
        // O metodo delete permite remover uma parte de uma string apartir de um alcance ou com um caracter em uma posição especifica
        StringBuilder conta = new StringBuilder("12 + 2 = erro404");
        // Lucas Vicente
        conta.deleteCharAt(0); // excluir primeira posicao
        conta.delete(8,14);    // exclui o erro40
        System.out.println(conta);
    }
}
