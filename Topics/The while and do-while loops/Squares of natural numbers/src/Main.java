import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = 0;
        while (n >= a * a) {
            a++;
            if (a * a <= n) {
                System.out.println(a * a);
            }

        }
    }

}