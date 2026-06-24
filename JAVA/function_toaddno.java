// make function to add  2 numbers and return the sum
import java.util.*;
public class function_toaddno {
  public static int printSumOf(int a, int b){   //create function and take agruments 
    int sum = a+b; // for sum a function
    return sum;
  }
  public static void main(String []args){
    Scanner sc  = new Scanner(System.in);
    int a =sc.nextInt();
    int b=sc.nextInt();

    int sum = printSumOf(a,b); // for call the function of we can not driectlty call the function in this case 
    System.out.println(sum);

  }
  
}
