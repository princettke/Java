import java.util.Scanner;

class calculator {
public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  double num1,num2,result;
  char operator;

  System.out.println("urCalculator");
  System.out.println("Enter first number:");
  num1 = sc.nextInt();

  System.out.println("Enter operator(+,-,*,/):");
  operator = sc.next().charAt(0);

    System.out.println("enter second number:");
  num2 = sc.nextInt();
  switch (operator){
    case '+':
      result = num1 + num2;
      System.out.println("result="+result);
      break;
      
    case '-':
      result = num1 - num2;
      System.out.println("result="+result);
      break;

     
    case '*':
      result = num1 * num2;
      System.out.println("result="+result);
      break;
     
     case '/':
    if(num2 !=0){
      result=num1/num2;
      System.out.println("result="+result);
    } else {
      System.out.println("error: division by zero");
    
    }
    break;
    default:
      System.out.println("invaild operator");







}  

sc.close();
}
}
