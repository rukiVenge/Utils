

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import com.lowagie.text.DocumentException;

import PDFEncrypt.PDFEncrypt;

public class EmailSend{
	
	public static void main(String[] args) {
		doSendEmail("5", "C:/Users/kpineda/Desktop/TestPDF/AEON_LON_AMANDO JR S. ESCARTIN.pdf");
	}

	
	//private static Logger logger = LogManager.getLogger(SendEmail.class);
   public static String doSendEmail(String k, String pdf){
	   
	   Properties properties = System.getProperties();
  
	   //get sending parameter
	   String from = "acsphil@aeonphilippines.com.ph";
	   String host = "192.168.100.125";
	   String smtp = "mail.smtp.host";
	   
	   String to = "pinedamarkkelvin@aeoncredit.com.ph";
	   String cc1 = "pinedamarkkelvin@aeoncredit.com.ph";
	   String cc2 = "cad@aeonphilippines.com.ph";
	   String customerName = "Test_client";
	   
	   properties.setProperty(smtp, host);
	   Session session = Session.getDefaultInstance(properties);
	   
	   String passPDF = "";
	   
	   try{
	         MimeMessage message = new MimeMessage(session);
	         message.setFrom(new InternetAddress(from));
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	         message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc1));
	         message.addRecipient(Message.RecipientType.CC, new InternetAddress(cc2));
	         //Getting Email Body
	       //  EmailTemplate emailTemplate = new EmailTemplate();
	         
//	         String subj = map.get("JUDGEMENTRESULT").equalsIgnoreCase("1") ? "Approved" :
//	        	 map.get("JUDGEMENTRESULT").equalsIgnoreCase("2") ? "Declined":"Cancelled";
	         String bodyText = ("Test email");     
//	         String filename = "AEON_LON_"+customerName+"_encrypt.pdf";
//	         //System.out.println(filename+"===================================");
//	         //String filename = pdf;
//	         
	         MimeBodyPart messagePart = new MimeBodyPart();
	         messagePart.setContent(bodyText, "text/html");
//	         MimeBodyPart attachmentPart = new MimeBodyPart();
//	         
	         
//	         
//	        //added for password protected LON 
	         try {
				passPDF = PDFEncrypt.generateUsingReader(pdf);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//	         
//	         
//	         FileDataSource fileDataSource = new FileDataSource((pdf.substring(0, pdf.length()-4)) + "_encrypt.pdf") {
//	             @Override
//	             public String getContentType() {
//	                 return "application/octet-stream";
//	             }
//	         };
//	         attachmentPart.setDataHandler(new DataHandler(fileDataSource));
//	         attachmentPart.setFileName((pdf.substring(0, pdf.length()-4)) + "_encrypt.pdf");
			
				
			 System.out.println((pdf.substring(0, pdf.length()-4)) + "_encrypt.pdf");
			
	         Multipart multipart = new MimeMultipart();
	         multipart.addBodyPart(messagePart);
	        // multipart.addBodyPart(attachmentPart);
	         message.setContent(multipart);
	         message.setSentDate(new Date());
	         message.setSubject("Test Email");
	         // Send message
	         
	         Transport transport = session.getTransport("smtp");
	            transport.connect(host, from);
	         Transport.send(message);
	         
	         System.out.println();
	         
	         //logger.info("LON successfully sent to : " + customerName + " <" + to + ">");
	         //return "Sent message successfully....";
	         //report file deletion
//	         File file = new File(filename);
//	         file.delete();
	      }catch (MessagingException mex) {
//	    	 logger.error("Failed in sending LON to : " + customerName + " <" + to + ">");
	         //mex.printStackTrace();
	    	 //errorSending(map);  
	      }
	   return passPDF;
   }
}
