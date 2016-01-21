package PaymentUploadConverter;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import com.aeoncredit.bankinterface.domain.common.FileData;
import com.aeoncredit.bankinterface.domain.sm.SMObject;
import com.aeoncredit.bankinterface.parser.AEONBankFileCreator;
import com.aeoncredit.bankinterface.parser.SMParser;


public class PaymentUploadConverterMain {
	public static void main(String[] args) {
		
		String fileName = "X://PD//IN//";
		
		File folder = new File("X://PD//IN//");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		    	  fileName += listOfFiles[i].getName();
		        System.out.println("File " + listOfFiles[i].getName());
		        System.out.println(fileName + " Here");
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
		
		
		
			SMObject smObject = new SMObject();
			smObject = SMParser.getSMObject(fileName);
			
			/*
			 * Data
			 */
			List dataList = (List) smObject.getFileData();
			int i = 0;
			Iterator dataItr = dataList.iterator();
			while (dataItr.hasNext()) {
			FileData data = (FileData) dataItr.next();
				
					System.out.println("===================================");
					System.out.println("Record ID: "+data.getRecordId());
					System.out.println("Seq No: "+data.getSeqNo());
					System.out.println("Product Code: "+data.getProductCode());
					System.out.println("Product Name: "+data.getProductName());
					System.out.println("Sett Account: "+data.getSettlementAccount());
					System.out.println("Currency: "+data.getCurrencyCode());
					System.out.println("PlatForm: "+data.getFlatformId());
					System.out.println("REf No: "+data.getReferenceNo());
					System.out.println("Ref Desc: "+data.getReferenceDesc());
					System.out.println("Amount: "+data.getTransactionAmount());
					System.out.println("Tranc Date: "+data.getTransactionDate());
					System.out.println("Tranc Time: "+data.getTransactionTime());
					System.out.println("Rec Branch: "+data.getReceiveBranch());
					System.out.println("DRCR: "+data.getDrcr());
					System.out.println("Tranc Code: "+data.getTransactionCode());
					System.out.println("Desc: "+data.getDescription());
				
			}
			
			
			AEONBankFileCreator.createAEONBankFile(smObject, 
					"X://PD//OUT//");
			
			File fileDel = new File (fileName);
			
			if(fileDel.delete()){
				System.out.println(fileDel + " is already deleted.");
			}else{
				System.out.println("Cannot delete : " + fileDel);
			}
		}
		
		
		
		

}
