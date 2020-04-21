import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("a= ");
        System.out.println("b= ");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int area= a*b;

        System.out.print("Rectangle area= ");
        System.out.println(area);

        int parameter= 2*a+2*b;

        System.out.print("Rectangle parameter= ");
        System.out.println(parameter);
    }
}