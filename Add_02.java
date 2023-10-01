import java.util.Scanner;

public class Add_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Enter two number");
        int a = input.nextInt();
        int b = input.nextInt();

        int sum = a + b ;
        System.out.println(sum);
        input.close();
    }
}
