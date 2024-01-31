import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число от 1 до 5:");
        Random random = new Random();
        int randomInt = random.nextInt(1,6);
        int num = scanner.nextInt();
        if (num == randomInt) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }
    }
}

