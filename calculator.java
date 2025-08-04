import java.util.Scanner;

public class calculator{
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        while(true){

            System.out.println("Type exit to quit");
            String ex = sc.next();
            
            if(ex.equalsIgnoreCase("exit")){
                break;
            }
        
         System.out.println("Enter value of a");
         int a = sc.nextInt();

         System.out.println("Enter value of b");
         int b = sc.nextInt();

         System.out.println("Enter your operator");
         char op = sc.next().charAt(0);
         switch(op){
            case '+' : System.out.println("Result : "+(a+b));
            break;
            case '-' : System.out.println("Result : "+(a-b));
            break;
            case '*' : System.out.println("Result : "+(a*b));
            break;
            case '/' :
             if(b==0){
                System.out.println("can't divide by zero");
             }
             else{
                 System.out.println("Result : "+(a/b));
             }
            continue;
            case '%' : System.out.println("Result : "+(a%b));
            break;
            default: System.out.println("invalid");
            break;
        
        }
    }
}
}