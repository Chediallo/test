package partie1;

import java.util.Scanner;

public class Palyndrome {
	public static void main(String args[]){
	    int n = 0;  
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Donner la taille du tableau : ");
        n = sc.nextInt();
        int[] nombres = new int[n];
        System.out.println("Saisir un nombre pour verifier s'il est palyndrome :");
        for (int i = 0; i < n; i++) {
        	nombres[i] = sc.nextInt();	
		}
        
        
       
        
        try {
        	for(int i = 0; i<n;i++) {
            	for(int j =n-1; j<n;i-- ) {
            		if(nombres[i]==nombres[j]) {
            			System.out.println("Le nombre saisi est un palyndrome !");
            			for(int k =0; k<n;k++) {
            				System.out.println(nombres[k]);
            			}
            			
            		}else {
            			System.out.println("Le nombre saisi n'est pas un palyndrome !");
            		}
            	}
            }
        	
        }catch(ArrayIndexOutOfBoundsException exception) {
            
        }
        
        
               
    }

    
    
	
	
	

}
