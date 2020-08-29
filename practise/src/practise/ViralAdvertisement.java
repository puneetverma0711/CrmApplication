package practise;

public class ViralAdvertisement {

	 static int viralAdvertising(int n) {
     int no_of_people=0;
     int total_like=0;
     int shared_count=5;
     int i=1;
     
     while(i<=n) {
    	 total_like=shared_count/2;
    	 shared_count=total_like*3;
    	 no_of_people=no_of_people+total_like; 
    	i++; 
     }
     
     
     
     
       return no_of_people;
	   
	 
	 }

	
	
	
	
	
	public static void main(String[] args) {
		int n = 25;

        int result = viralAdvertising(n);
         System.out.println(result);  
         
         
         
	}

}
