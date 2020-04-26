import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("geef het eerste nummmer:");
        int nummer1 = input.nextInt();
        System.out.println("geef het tweede nummer:");
        int nummer2 = input.nextInt();

        int sum = sum(nummer1, nummer2);

        System.out.println(sum);
    }

    public static int sum(int n1, int n2){
        int sum = n1 + n2;
        return sum;
    }
}
