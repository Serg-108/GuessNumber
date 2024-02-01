import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество попыток:");
        int trials = scanner.nextInt();
        System.out.println("Угадайте число от 1 до 100:");
        Random random = new Random();
        int randomInt = random.nextInt(1,101);
        int num = scanner.nextInt();

        while (num != randomInt) {
            trials = trials - 1;
            if (trials == 0) {
                System.out.println("Неправильно. Превышено количество попыток (" + trials + ")");
                break;
            }
            System.out.println("Неправильно, попробуйте еще раз:");
            num = scanner.nextInt();
        }

        if (num == randomInt) {
            System.out.println("Правильно!");
        }
    }
}

