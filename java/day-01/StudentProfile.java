import java.util.*;

public class StudentProfile {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String name,Branch,college,status ;
      int age;
      double cgpa;
      System.out.println("Enter your name:");
      name = sc.nextLine();
      System.out.println("Enter your age:");
      age = sc.nextInt();
      sc.nextLine();
      System.out.println("Enter your Branch:");
      Branch = sc.nextLine();
      System.out.println("Enter your college:");
      college = sc.nextLine ();
      System.out.println("Enter your cgpa:");
      cgpa = sc.nextDouble();

      if (cgpa >= 7){
        status ="Good academic standing";
      }else{ 
        status = "Needs improvement";
      }
      
      System.out.println("======================");
      System.out.println("  STUDENT PROFILE  ");
      System.out.println("======================");
      System.out.println();
      System.out.println("Name    :"+name);
      System.out.println("Age     :"+age);
      System.out.println("Branch  :"+Branch);
      System.out.println("College :"+college);
      System.out.println("CGPA    :"+cgpa);
      System.out.println();
      System.out.println("Status  :"+status);
      System.out.println("======================");

         sc.close();
    }
}
