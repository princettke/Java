import java.util.*;

public class countpositivenegative { 
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int positive =0,negative =0 , zero =0;
     char choice;
     do { 
         System.out.print("Enter your number :");
         int num = sc.nextInt();
         if(num>0){
          positive++;
         } else if (num<0){
          negative++;
         } else {
          zero++;
         }
         System.out.print("Do you want to enter  another number ?(y/n);");
         choice = sc.next().charAt(0);
     } while (choice == 'y'||choice=='Y');
     System.out.println("\nResult:");
     System.out.println("positive number :"+positive);
     System.out.println("neagtivenumber:"+negative);
     System.out.println("zero numbers:");
     sc.close();
     }


  }
  

