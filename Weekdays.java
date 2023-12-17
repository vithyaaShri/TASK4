import java.util.Scanner;

public class Weekdays {
    public static void main(String[] args) {
        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        try (Scanner obj = new Scanner(System.in)) {
            int n=obj.nextInt();
            if(n<days.length-1){
            for(int i=0;i<days.length;i++){
                if(i==n){
                    System.out.println(days[i]);
                }
            }
            }
            else{
                throw new ArrayIndexOutOfBoundsException("Not a valid index entered");
            }
        }
    }
    
}
