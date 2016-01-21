//SC from SDD1.PArdz

package PDFEncrypt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import RandomPaswordGenerator.RandomPasswordGeneratorMain;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.PdfWriter;

public class PDFEncrypt{
	
	public static void main(String[] args) throws FileNotFoundException, DocumentException, IOException{
		//generateUsingWriter();
		System.out.println(generateUsingReader("C:\\Users\\kpineda\\Desktop\\test0210\\Test.pdf"));
	}
	
	public static String generateUsingReader(String filePath) throws FileNotFoundException, DocumentException, IOException{
		
		String password = RandomPasswordGeneratorMain.generatePassword();
		
		String USER_PASS = password;
	    String OWNER_PASS = password;
		
		String PDF = filePath;
		String PDF_OUT = (filePath.substring(0, filePath.length()-4)) + "_encrypt.pdf";
		System.out.println(PDF_OUT);
		
		System.out.println(password); 
		
		PdfReader reader = new PdfReader(PDF);
		PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(PDF_OUT));
		stamper.setEncryption(USER_PASS.getBytes(), OWNER_PASS.getBytes(),
                PdfWriter.ALLOW_PRINTING, PdfWriter.ENCRYPTION_AES_128);
		stamper.close();
		reader.close();
		
		return password;
	}

}	