
import java.util.*;
public class Loops {
  
  static void displayNnums(int num){
    for(int i =1;i<=num;i++){
       System.out.println(i);
    }
  }
   
  static int sumToN(int num){
    int sum=0;
   for(int i=1;i<=num;i++){
      sum += i;
   }
   
    return sum;
  }
 
  static int factorial(int num){
     int temp=1;
    for(int i=1;i<=num;i++){
      temp *= i;
    }
    return temp;
  }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
       int num = sc.nextInt();
       displayNnums(num);
      System.out.println("Sum :" +sumToN(num)); 
      System.out.println("Factorial :" + factorial(num) );
    sc.close();
  }    
}
