import java.util.*;
public class Multiply2_no_inFunction {
  public static int printMulti( int a ,int b){
    int multi = a*b;
    return multi;

  }
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int multi = printMulti(a,b);
    System.out.println("multiply of two number :"+ multi);
    sc.close();

  }
  
}
