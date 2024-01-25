import java.util.Scanner;

public class Calculator{
    public static void main(String[]args){
        //To create Scanner class to accept the users input.
        Scanner input = new Scanner(System.in);
        Double a, b, result;
        int operator;

        System.out.print("Enter two numbers: \n"); 
        a = input.nextDouble();      

        //Enable the users to select an operator to be able to perform an operation.
        System.out.print("Select the operator (+, -, *, /, ^): \n");
        operator = input.next().charAt(0);

        b = input.nextDouble();
        
        //Use the if else statement to perform the selected operation.
        if (operator == '+'){
            result = a + b;
            System.out.print(a + b);
            }
            else if (operator == '-'){
                result = a - b;
                System.out.print(a - b);
            }
            else if (operator == '*'){
                result = a * b;
                System.out.print(a * b);
            }
            else if (operator == '/'){
                //To check if b is not equal to zero, then it perfoms the operation.
                if (b != 0){
                    result = a / b;
                    System.out.print(a / b);
                }
                else{
                    System.out.print("Can't divide by 0");
                }
            }
            else if (operator == '^'){
                result = Math.pow(a,b);
                System.out.print(result); 
                return;
            }
            
        else{
            System.out.print("Syntax error ");
        }
    }
}
