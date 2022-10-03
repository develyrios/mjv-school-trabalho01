public class ExemploString {
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

			/*
			o metodo substring é um metodo sobrecarregado que avalia uma variavel e retorna uma nova string que está dentro
			da primeira string avaliada. A substring gerada começa com a posição do char especificado pelo comando,
			e segue até o final da string original.
				*/

			// primeiro criamos uma string de uma conta corrente, por exemplo, com agencia e conta:
			String contaCorrente = "12345-67";

			//agora, queremos identificar qual a agencia dessa conta. No caso, os dois ultimos numeros da nossa variavel
			String agencia = contaCorrente.substring(6);

			/*assim, queremos os numeros que ocupam as posições 6 e 7 da nossa string (contamos 0, 1, 2, 3... até a posição
			que queremos, lembrando de contar o hífen também)
			 */

			//logo, com nosso comando, puxamos a substring para a possição 7

			System.out.println("numero de agência é: "+ agencia);

			/*agora, queremos identificar qual o numero da conta da nossa contaCorrente. se utilizarmos o mesmo comando
			substring que utilizamos antes, ele vai retornar o valor completo da String. Para evitar isso, especificamos
			qual o intervalo de caracteres que queremos retornar. No caso, 0 e 4, e usamos o método substring.
			 */
			String conta = contaCorrente.substring(0,4);

			System.out.println("numero de conta é: " + conta);

		}





}
