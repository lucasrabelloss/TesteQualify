package desafioQuestao2;
import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
        
		Scanner scr = new Scanner(System.in);
        String senha;
        final String requeridos = "^(?=.\\d)(?=.[a-z])(?=.[A-Z])(?=.[!@#$%^&()-+])[0-9a-zA-Z!@#$%^&()-+]{6,}$";        
        
        while(scr.hasNextLine()) {
            senha = scr.nextLine();
            
            if(senha.length() > 5  && senha.matches(requeridos)){
            	
                System.out.println("Senha válida." );
            } else {
                System.out.println("Senha Invalida! Verifique as regras da senha ou Complete mais "+ (6 - senha.length()) + " caractere(s).");
            }
        }
    }
}