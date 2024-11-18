import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num;
        System.out.print("Enter a number between 0 and 1000 : ");
        num=input.next();
        int sum=0;
        for(int i=0;i<num.length();i++){
            sum+=num.charAt(i)-'0';  
        }
        System.out.println("The sum of the digits is "+sum);
    }
}
