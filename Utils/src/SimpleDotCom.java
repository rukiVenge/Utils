
public class SimpleDotCom {
	private int[] locationCell;
	int numberOfHits = 0;
	
	public void setLocation(int[] loc){
		locationCell = loc;
	}
	
	public String checkYourself(String guess){
		int g = Integer.parseInt(guess);
		String result = "miss";
		
		for(int cell : locationCell){
			if(g == cell){
				numberOfHits ++;
				
				if(numberOfHits == 3){
					result = "KILL";
					break;
				}else {
					result = "HIT";
				}
			}
		}
		
		
		return result;
	}
	
}
