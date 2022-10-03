import java.util.StringJoiner;

public class ExemploStringJoiner {

    //StringJoiner é usado para construir uma sequência de caracteres separados por um
    //delimitador (delimiter) e que podem vir acompanhada de um prefixo (prefix) ou de
    //um sufixo (sufix)

    //A classe está localizada no pacote java.util desde a versão JDK1.0

    //A instanciação pode ser feita da seguinte forma:
    StringJoiner stringJoinerExemplo = new StringJoiner(" delimitador ","prefixo "," sufixo");

    void run () {
        //Vamos aos exemplos!
        this.exemploSetEmptyValue();
        this.exemplosAdd();
        this.exemplosMerge();
    }

    private void exemploSetEmptyValue() {
        //A string aparentemente está preenchida, certo? Vejamos!
        System.out.println(stringJoinerExemplo);

        //Entretanto, podemos definir um valor padrão caso a String esteja vazia:

        stringJoinerExemplo.setEmptyValue("Esta String está vazia");
        System.out.println(stringJoinerExemplo);

        //Opa! Apesar de termos declarado um delimitador, um prefixo e um sufixo, não adicionamos nada a essa string,
        //por isso foi printada a mensagem que a String está vazia. É importante ter em mente que delimitador,
        //prefixo e sufixo NÃO são considerados na hora de manusear ou alterar a String.
    }

    private void exemplosAdd() {
        //O método .add adiciona ao final da string uma sequência de caracteres desejada.
        //Vamos entender melhor como funciona esse método e como ocorre o posicionamento do prefixo, do delimitador,
        //do sufixo e de novos caracteres dentro da String.

        stringJoinerExemplo.add("caracteres 1").add("caracteres 2").add("caracteres 3");
        System.out.println(stringJoinerExemplo);

        //Uma vez que o prefixo, o delimitador e o sufixo não mudam mesmo com a adição de novos caracteres,
        //podemos criar uma espécia de "layout" para a nossa String. Vamos ver um exemplo:

        StringJoiner listaDeCompras = new StringJoiner(", ","Eu preciso comprar "," no mercado");

        listaDeCompras.add("batata");
        listaDeCompras.add("leite");
        listaDeCompras.add("manteiga");
        listaDeCompras.add("mussarela");
        listaDeCompras.add("extrato de tomate");
        listaDeCompras.add("peito de frango");
        System.out.println(listaDeCompras);
    }

    private void exemplosMerge() {
        //O método .merge adiciona uma String a outra String, vejamos só:

        StringJoiner stringMerge = new StringJoiner("");
        stringMerge.add("caracteres merge 1");
        System.out.println(stringMerge);

        stringJoinerExemplo.merge(stringMerge);
        System.out.println(stringJoinerExemplo);

        //Olha só, então a nova sequência de caracteres é colocada ao final da string antes do sufixo, assim
        //como o método .add faz. Mas e se nossa string a ser mergeada tivesse prefixo, delimitador e sufixo?

        StringJoiner stringMergeCompleta = new StringJoiner(" delimitador-merge ", "prefixo-merge ", " sufixo-merge");
        stringMergeCompleta.add("caracteres merge 2").add("caracteres merge 3").add("caracteres merge 4");
        System.out.println(stringMergeCompleta);

        stringJoinerExemplo.merge(stringMergeCompleta);
        System.out.println(stringJoinerExemplo);

        //Interessante! O prefixo e sufixo são deixados de fora, entretanto, a String nova é adicionada com
        //o seu delimitador. Vamos aplicar esses conhecimentos a um novo exemplo:

        //exemplo Merge
    }
}
