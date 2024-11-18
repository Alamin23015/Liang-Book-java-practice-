import java.util.Scanner;
public class feettometer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double feet;
        System.out.print("Enter a value for feet : ");
        feet=input.nextDouble();
        double met=feet*0.305;
        System.out.println(feet+" feet is "+met+" meters");
    }
}
