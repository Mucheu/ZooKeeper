import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();
        int num2 = 0;
        int num3 = 10;

        boolean isBetween = num3 > num1 && num1 > num2;

        System.out.println(isBetween);
    }
}