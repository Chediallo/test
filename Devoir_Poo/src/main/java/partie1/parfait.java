package partie1;

import java.util.Scanner;

public class parfait {
	public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Saisir un nombre pour verifier si c'est un nombre parfait :");
        n = s.nextInt();
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Le nombre saisi est un nombre parfait");
        }
        else
        {
            System.out.println("Le nombre saisi n'est pas un nombre parfait");
        }    
    }
    int divisor(int x)
    {
       return x;
    }
	
}
