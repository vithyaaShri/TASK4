import java.util.Scanner;
import java.util.Stack;

public class StackClass {
    public static void stackpush(Stack<Integer> stack,Integer n){
        stack.push(n);
    }

    public static void stackpop(Stack<Integer> stack){
        if(!stack.isEmpty()){
        Integer n=stack.pop();
        System.out.println("the popped element out of stack is:"+n );
        }
    }

    public static void isempty(Stack<Integer> stack){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        
        try (Scanner scan = new Scanner(System.in)) {
           String c="y";
            do{
            System.out.println("Select the option: \n 1.push \n 2.pop");
            int n=scan.nextInt();
            if(n==1){
            System.out.println("Enter the no of element to be pushed");
            int k=scan.nextInt();
            for(int i=0;i<k;i++){
                int m=scan.nextInt();
                stackpush(stack,m);   
            }
            System.out.println(stack);
            }
            else if(n==2){
                stackpop(stack);
            }
            else{
                System.out.println("Invalid option");
            }
            System.out.println("Do you want to continue y/n");
            c=scan.next();
            
        }while(c.equals("y"));
    }
    }   
}
