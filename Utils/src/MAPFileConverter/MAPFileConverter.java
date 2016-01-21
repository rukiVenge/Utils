package MAPFileConverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import SMSMessageGenerator.SMS;

public class MAPFileConverter {
	
	
	
	private List<MAPObject> convertRD2MAP (List<String> listRawDR){
		
		List<MAPObject> listMAPobj = new ArrayList<MAPObject>();
		
		
		//check list if empty
		if(!listRawDR.isEmpty()){
			System.out.println(listRawDR.size() + " records to be processed");
			
							
		}else {
			System.out.println("List is EMPTY !");
		}
		
		return listMAPobj;
	}
	
	
	private List<RawDataObject> processRawRD (List<String> listRawRD){
		
		List<RawDataObject> listrawRDObj =  new ArrayList<RawDataObject>();
		
		
		
		return null;
	}
	
	
	public List<String> readRawData(String filePath) throws IOException,FileNotFoundException{
		
		BufferedReader bf = new BufferedReader(new FileReader(new File(filePath)));
		String line = new String();		
		List<String> listRawRD = new ArrayList<String>();
		
		while((line = bf.readLine()) != null){
			listRawRD.add(line);
		}
		
		bf.close();
		
		System.out.println(listRawRD.size());
		
		//remove header
		listRawRD.remove(0);
		
		
		return listRawRD;
		
	}
	
	

}
