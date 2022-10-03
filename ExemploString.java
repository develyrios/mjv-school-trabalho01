public class ExemploString {
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
}
