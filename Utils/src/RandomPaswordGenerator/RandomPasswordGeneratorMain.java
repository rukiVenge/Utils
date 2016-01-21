package RandomPaswordGenerator;

import java.util.Random;

public class RandomPasswordGeneratorMain {
	
	private final static int passLen = 7;
	
	public static String generatePassword() {
		String val = "abbcdefghijklmnopqrstuvwxz0123456789";
		char[] valArr = val.toCharArray();
		StringBuilder result = new StringBuilder();
		
		for(int a=0; a<passLen; a++){
			Random r = new Random();
		
			result.append(valArr[r.nextInt(36)]);
		}
		
		return result.toString();
	}
}
