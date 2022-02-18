package desafioQuestao3;
import java.util.Arrays;
public class Questao3 {
	
	static boolean anagrama(String s1, String s2){
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2))
		return true;
		else
		return false;
}

    static int countAnagramas(String palavra1, String palavra2){
		int N = palavra1.length();
		int n = palavra2.length();
		int res = 0;
		
		for (int i = 0; i <= N - n; i++) {
		
		String s = palavra1.substring(i, i + n);
		if (anagrama(palavra2, s))
		res++;
	}
	return res;
}

	public static void main(String[] args) {
		    String palavra1 = "ifailuaifhkqq";
	        String palavra2 = "q";
	        System.out.print(countAnagramas(palavra1, palavra2));
	}
}