import java.util.Scanner;
public class poutokilo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p;
        System.out.print("Enter a value for pounds : ");
        p=input.nextDouble();
        double kg=p*0.454;
        System.out.println(p+" pounds is "+kg+" kilograms");
    }
}
