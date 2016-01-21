
public class SimpleDotComTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SimpleDotCom sdc = new SimpleDotCom();
		int [] location = {1,2,3};
		
		sdc.setLocation(location);
		
		String guess = "2";
		System.out.println(sdc.checkYourself(guess));
		
		guess = "4";
		System.out.println(sdc.checkYourself(guess));
		
		guess = "1";
		System.out.println(sdc.checkYourself(guess));
		
		guess = "3";
		System.out.println(sdc.checkYourself(guess));
		
		guess = "8";
		System.out.println(sdc.checkYourself(guess));

	}

}
