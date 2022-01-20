package partie1;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[])  
    {   
		int nbr1=0, nbr2=1, nbr3, i, count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Afficher la série de fibonacci jusqu'a combien de termes ? ");
		count = sc.nextInt();
        
        //Pour afficher la premiere valeur
        System.out.print(nbr1);   
    
        //La boucle commence par 2 car 0 est deja affiches
        for(i=2; i<count; ++i)
        {    
            nbr3 = nbr1 + nbr2;       
            nbr1 = nbr2;    
            nbr2 = nbr3;  
            System.out.print(" "+nbr3); 
        }    
  
    }
}
