import java.util.*;

public class NumberAnalyzer {
    
    static boolean  isEven(int num){
        return  num%2 == 0;
    }

    static boolean isOdd(int num){
        return  num%2 != 0;
    }

    static int square(int num){
        return num*num;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num ;
        System.out.println("Enter a number: ");
        num = sc.nextInt();
         
        System.out.println("Number :"+num);
        System.out.println("Even   :"+isEven(num));
        System.out.println("Odd    :"+isOdd(num));
        System.out.println("Square :"+square(num));
        sc.close();
    }
    
}
