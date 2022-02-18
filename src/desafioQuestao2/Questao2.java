package desafioQuestao2;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
        
		Scanner scr = new Scanner(System.in);
        String senha;
        final String requeridos = "^(?:(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).*)$";        
        
        while(scr.hasNextLine()) {
            senha = scr.nextLine();
            
            if(senha.length() < 7 && senha.matches(requeridos)){
            	
                System.out.println("Senha valida." );
            } else {
                System.out.println("Complete mais "+ (6 - senha.length()) + " caractere(s).");
            }
        }
    }
}