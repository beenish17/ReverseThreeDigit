
package reversethreedigit;

import java.util.Scanner;

public class ReverseThreeDigit {

    public static void main(String[] args) {
       
        int a,b,c,d,e,f,g,h;
        Scanner bunny=new Scanner(System.in);
        System.out.println("enter the 3-digit number:");
        int number=bunny.nextInt();
        
        a= number/100;
        number=number%100;
        c=number/10;
        d=number%10;
        
        System.out.println("a three digit number is:"+d + c + a );
    }
    
}
