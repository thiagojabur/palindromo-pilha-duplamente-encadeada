
public class Principal {

	public static void main(String[] args) {
		
		Stack pilha1 = new Stack();
		
		String testarPalindromo = "anilina";
		String stringInvertida = "";
		
		for (int i = 0; i < testarPalindromo.length(); i++) {
			pilha1.push(new DNode(testarPalindromo.charAt(i) + ""));	
		}
		for (int i = 0; i < testarPalindromo.length(); i++) 
			stringInvertida += pilha1.pop();
	
		 if (stringInvertida.compareTo(testarPalindromo) == 0)
			 System.out.println("� pal�ndromo");
		 else 
			 System.out.println("N�o � pal�ndromo" );

    }

}
