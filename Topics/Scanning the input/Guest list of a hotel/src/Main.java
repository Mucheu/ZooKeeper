import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstPerson = scanner.next();
        String secondPerson = scanner.next();
        String thirdPerson = scanner.next();
        String lastPerson = scanner.next();

        System.out.println(lastPerson);
        System.out.println(thirdPerson);
        System.out.println(secondPerson);
        System.out.println(firstPerson);
    }
}