public class ExemploString {
	// A classe String está no pacote Java.lang, e foi implementado na versão JDK 1.0

	void run() {
		this.contarCaracteres();
		this.exemplosSubstring();

	}
		void contarCaracteres() {

			// o método length() retorna o comprimento do texto em uma String
			String email = "email@teste.com";
			int tamanho = email.length();
			System.out.println(tamanho);

			// o método isEmpty() verifica se a string está vazia e retorna true se estiver e false, se não
			String vazio = "";
			boolean estaVazio = vazio.isEmpty();
			System.out.println(estaVazio);

		}

		void exemplosSubstring() {

			/* Exemplo 1 - Explicação:

			o metodo substring é um metodo sobrecarregado que avalia uma variavel e retorna uma nova string que está
			dentro da primeira string avaliada. A substring gerada começa com a posição do char especificado pelo
			comando, e segue até o final da string original.
				*/

			// primeiro criamos a nossa string base:

			String exemplo01 = "exemplo";

			/* agora, vamos criar uma substring a partir da terceira posição da nossa string, contando a primeira
			posição como 0, a segunda como 1, e assim por diante: */

			String subExemplo = exemplo01.substring(3);

			//nesse caso, nosso retorno será o char na posição 3 e tudo o que vem depois dele

			System.out.println(subExemplo);
			//retorno: mplo

			/*nós podemos delimitar também, qual o último char queremos da nossa substring.
			Para isso, inserimos a posição inicial e a posição final que queremos. No caso, 0 e 2
			 */
			String subExemplo02 = exemplo01.substring(0,2);
			// nesse caso, nosso retorno será uma string da posição 0 até a posição 2

			System.out.println(subExemplo02);
			// retorno: exe


			//Exemplo 2 - Conta corrente

			String contaCorrente = "12345-67";
			String agencia = contaCorrente.substring(6);
			System.out.println("numero de agência é: "+ agencia);
			String conta = contaCorrente.substring(0,4);
			System.out.println("numero de conta é: " + conta);

			/* retorno:

			Sua agência é: 67
			Sua conta é: 12345

			 */

		}





}
