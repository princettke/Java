import java.util.*;
public class Function {
  public static void printMyName(String name){
    System.out.print(name);
    return; // for exit the function 
  }
  public static  void main (String [] args){
    Scanner sc = new Scanner(System.in);
    String name =sc.next();
    printMyname(name); // call kiya function ko 


  }
  
}
