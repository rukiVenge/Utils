
public class SimpleCombination {
	public static void main(String[] args) {
		String [] gender = {"GENDER='Male'","GENDER='Female'"};
		String [] age = {"AGE between 18 and 22","AGE between 23 and 26","AGE between 27 and 30","AGE between 31 and 35","AGE between 36 and 40","AGE between 41  and 45","AGE between 46 and 50","AGE between 51 and 55","AGE between 56 and 60","AGE between 61 and 65","AGE between 66 and 70"};
		String [] cs = {"CIVILSTATUS='Single'","CIVILSTATUS='Married'","CIVILSTATUS='Separated'","CIVILSTATUS='Single Parent'","CIVILSTATUS='Widowed'"};
		String [] rs = {"RESIDNETIALSTATUS='Owned'","RESIDNETIALSTATUS='Parent Owned'","RESIDNETIALSTATUS='Mortgage'","RESIDNETIALSTATUS='Rented'","RESIDNETIALSTATUS='Others'"};
		String [] ly = {"LIVEYEAR < 1","LIVEYEAR between 1 and 3","LIVEYEAR between 4 and 6","LIVEYEAR between 7 and 10","LIVEYEAR between 11 and 14","LIVEYEAR between 15 and 17","LIVEYEAR between 18 and 20","LIVEYEAR between 21 and 23","LIVEYEAR between 24 and 26","LIVEYEAR between 27 and 30","LIVEYEAR > 30"};
		String [] lw = {"LIVINGWITH='Alone'","LIVINGWITH='Spouse'","LIVINGWITH='Parents'","LIVINGWITH='Relatives'","LIVINGWITH='Friend'"};
		String [] position = {"POSITION='CASUAL'","POSITION='COMMISSION'","POSITION='CONTRACT/PROJECT BASED'","POSITION='CO-TERMINOUS'","POSITION='PROBATIONARY'","POSITION='REGULAR'","POSITION='REMITTANCE/PENSION RECEIVER'","POSITION='SELF-EMPLOYED'","POSITION='UNEMPLOYED'","POSITION='UNIDENTIFIED'"};
		String [] nob = {"NOB='HIGH COLLECTION NOB'","NOB='LOW COLLECTION NOB'"};
		String [] wy = {"WORKYEAR < 1","WORKYEAR between 1 and 2","WORKYEAR between 3 and 5","WORKYEAR between 6 and 10","WORKYEAR between 1 1and 15","WORKYEAR between 16 and 20","WORKYEAR between 21 and 25","WORKYEAR between 26 and 30","WORKYEAR > 30"};
		String [] product = {"PRODUCT='HIGH COLLECTION PRODUCT'","PRODUCT='LOW COLLECTION PRODUCT'"};
		
		// gender
		for(int a=0; a <= (gender.length-1); a++){
			// age
			for(int b=0; b<=(age.length-1); b++){
				// civil status
				for(int c=0; c<=(cs.length-1); c++){
					// residential status
						for(int d=0; d<=(rs.length-1); d++){
							// live year
							for(int e=0; e<=(ly.length-1); e++){
								System.out.println(gender[a] + " AND " + age[b] + " AND " + cs[c] +
										" AND " + rs[d] + " AND " + ly[e]);
//								// living with
//								for(int f=0; f<=(lw.length-1); f++){
//									// position
//									for(int g=0; g<=(position.length-1); g++){
//										System.out.println(gender[a] + " AND " + age[b] + " AND " + cs[c] +
//												" AND " + rs[d] + " AND " + ly[e] + " AND " + lw[f] + " AND " + position[g]);
//									}
//									
//								}
							}
					}
					
				}

			}
				
		}
		
		
	}

}
