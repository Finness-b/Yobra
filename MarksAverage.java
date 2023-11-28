import java.util.Scanner;
public class MarksAverage {  
  public static void ComputeAverage(){
   
   double average;
   Scanner input = new Scanner(System.in);
   System.out.println("Enter marks for java programming: ");
   double javaProgrammingMarks = input.nextInt();

   System.out.println("Enter marks for networking: ");
   double networkingMarks = input.nextInt();

   System.out.println("Enter marks for maths: ");
   double mathsMarks = input.nextInt();

   average = (javaProgrammingMarks + networkingMarks + mathsMarks) / 3;

   System.out.println("marks for java programming is: " + javaProgrammingMarks);
   System.out.println("marks for networking is: " + networkingMarks);
   System.out.println("marks for maths is: " + mathsMarks);
   System.out.println("the average is: " + average);
  }

  public static void main(String[] args){
   ComputeAverage();
  }
}
  