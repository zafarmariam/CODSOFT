package CODSOFT;

import java.util.Scanner;

public class gradecalculator{
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      //Marks out of 100
      System.out.println("Enter your marks:");
      int marks = sc.nextInt();
      char grade;
      sc.close();  
      if(marks>=90){
         grade = 'A';
      }else if(marks>=80 && marks<90){
         grade = 'B';
      }else if(marks>=70 && marks<80){
         grade = 'C';
      }else if(marks>=60 && marks<70){
         grade = 'D';
      }else if(marks>=40 && marks<60){
         grade = 'E';
      }
      else {
         grade = 'F';
      }

      switch(grade) {
         case 'A' :
            System.out.println("Outstanding!");
            break;
         case 'B' :
            System.out.println("Excellent!");
            break;
         case 'C' :
            System.out.println("Very Good");
            break;
         case 'D' :
            System.out.println("Good");
         case 'E' :
            System.out.println("You passed");
            break;
        case 'F' :
            System.out.println("Failed");
            break;
         default :
         System.out.println("Invalid grade");
      }
      System.out.println("Your grade is " + grade);
   }
}
    

