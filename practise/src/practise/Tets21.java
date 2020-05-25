package practise;

import java.util.Scanner;

public class Tets21 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
int temp;
        int num_swaps=0;
        for(int i=0;i<a.length;i++) {
            int flag=0;
            for(int j=0;j<a.length-1-i;j++) {
                if(a[j]>a[j+1]) { 
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    num_swaps++;
                      flag=1;
                }
                
            }
            
            
            if(flag==0) {  
                break;
                
            }
        }
        

        System.out.println("Array is sorted in " +num_swaps+  " swaps.");
        System.out.println("First Element: " +a[0]);
        System.out.println("Last Element: " +a[a.length-1]);
        

		
	}

}
