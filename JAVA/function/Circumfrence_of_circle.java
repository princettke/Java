import java.util.*;
public class Circumfrence_of_circle { 
  public static double Circumfrence( int radius){
    

    double Circumfrence =  2*3.14*radius;
   return Circumfrence; 
  }
  public static void main(String[]args){
    Scanner sc = new  Scanner(System.in);
    System.out.print("enter your radius :");
    int radius = sc.nextInt();
    System.out.println("circumfrence of circle is :"+Circumfrence(radius));

  }
  
}
