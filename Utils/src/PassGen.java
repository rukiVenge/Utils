import java.math.BigDecimal;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;



/**
 * Encrypt String with MD5
 * @author  Chen Jiang 2003/08/07
 */
public class PassGen {

	/**
	 * The hashcode which be used to generate  string
	 * @param pass String
	 * @return  Return new created hashcode in HEX
	 */
	public static synchronized String generate(String pass) {
		if (pass == null)
			throw new IllegalArgumentException();

		byte[] digest = null;
		try {
			//Get MessageDigest in MD5
			MessageDigest md = MessageDigest.getInstance("MD5");
			//Updating
			md.update(pass.getBytes());
			//MessageDigest get value from digest
			digest = md.digest();
		} catch (NoSuchAlgorithmException e) {
			//MD5 arithmetic throw Exception
		}

		//Digest value Output
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < digest.length; i++) {
			int x = digest[i] & 0x00FF;
			result.append(Integer.toHexString(x));
		}

		return result.toString();
	}
	
	public static synchronized String generatei(String pass) {
		 String digest = generate(pass);
		 char[] ipass = pass.toCharArray();
		 char[] digestpass =digest.toCharArray();
		 int j = 1;
		 for(int i=0;i<ipass.length;i++){ 
		 	digestpass[j]=(char)(ipass[i]+1);
		 	j+=2;
		 	
		 }
		 String length = (pass.length()<10?"0"+String.valueOf(pass.length()):String.valueOf(pass.length())); 
		 String result =String.valueOf(digestpass) +  length;
		  
		 return result;
	}
	public static synchronized String generateo(String pass) throws Exception {
		if(pass.equals("")){
		  	 return "";
		}  
		if(pass.length()<15){
		  	throw new Exception("the dbpassword which set in print.xml or batchproptis.xml is wrong ");
		  }
		  int passLength = new BigDecimal(pass.substring(pass.length()-2)).intValue();
		  char[] ipass = pass.toCharArray();
		  StringBuffer result = new StringBuffer();
		  for(int i=0;i<passLength;i++){
		  	result=result.append((char)(ipass[2*i+1]-1));
		  }
		   
		  return result.toString();
		
	}

	public static void main(String[] args) {

		System.out.println("pass used in xml  = " + generatei("P@ssw0rd"));
		System.out.println("MD5pass cashier = " + generate("Rhanilene@1234547htyu58776"));
		System.out.println("MD5pass system= " + generate("P@ssw0rd"));
//		/f2da38a683dd2a958a6ff3ce68dcd73
	//Rhanilene@1234567
	}
}