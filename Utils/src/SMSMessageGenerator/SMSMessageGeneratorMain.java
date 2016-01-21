package SMSMessageGenerator;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class SMSMessageGeneratorMain {
	
	private static final String DELIM = "~";

	//change file path
	private static final String FILEPATH = "X:\\PD\\PAYMENT ADVICE\\ForText\\2015\\Number20151124.txt";
	
	public static void main(String[] args) throws Exception {
		
		List<String> listOfRecipient = new ArrayList<String>();
		List<SMS> listOfSMS = new ArrayList<SMS>();
		
		//Message in SMS
		String message = "Salamat po sa pagtangkilik sa Aeon Credit Service. Ang Billing Advice ay naipadala na sa inyong email address. Salamat po";
		
		listOfRecipient = readRecipient(FILEPATH);
		
		for(String recipient : listOfRecipient){
			
			String[] rContent = recipient.split("@");
			
			SMS msg = new SMS();
			
			msg.setMsg(message);
			msg.setHeaderFooter("Subject|Footer");
			//Change schedule
			msg.setSchedule("N");
			msg.setRecipient(recipient);
			msg.setHeaderFooterFlag("N,N");
			msg.setDelimeter(DELIM);
			
			
			//check if the mobile number is valid
			if(msg.getRecipient().length()<=10){
				System.out.println("We cannot send sms to this number " + msg.getRecipient());
			} else {
				listOfSMS.add(msg);
			}
			
			
		}
		
		writeToFile(listOfSMS);
		
		
	}
	
	//Fetch All Recipient
	public static List<String> readRecipient(String filePath) throws Exception{
		
		BufferedReader bf = new BufferedReader(new FileReader(new File(filePath)));
		String msg = new String();		
		List<String> noException = new ArrayList<String>();
		
		while((msg = bf.readLine()) != null){
			noException.add(msg);
		}
		
		bf.close();
		
		System.out.println(noException.size());
		
		return noException;
		
	}
	
	//Create Bulk SMS file
	public static void writeToFile(List<SMS> processedSMS) throws IOException{
		
		File file = new File("X:\\MIS\\Kelvin\\SMS\\CMD\\"
				+"D3AboveSMSReminder"
				+(new String (new SimpleDateFormat("yyyyMMdd_HHmmss").
						format(Calendar.getInstance().getTime())))+".txt");  
		
		FileWriter writer = new FileWriter(file, true);  
		PrintWriter output = new PrintWriter(writer);
		for(SMS newSMSToWrite : processedSMS){
			output.println(newSMSToWrite.getMsg());
			output.println(newSMSToWrite.getHeaderFooter());
			output.println(newSMSToWrite.getSchedule());
			output.println(newSMSToWrite.getRecipient());
			output.println(newSMSToWrite.getHeaderFooterFlag());
			output.println(newSMSToWrite.getDelimeter());
		}
		
		output.close();
	}
	
	//Generate SMS object
	public String generateSMS(String receipient, String message){
	
		StringBuilder sb = new StringBuilder();
		
		sb.append("%");
		sb.append("Subject|Footer%");
		sb.append("N%");
		sb.append(receipient+"%"); 
		sb.append("N,N%~");
		
		return sb.toString();
	}
	
}
