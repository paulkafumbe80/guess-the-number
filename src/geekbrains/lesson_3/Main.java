package geekbrains.lesson_3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" ваша задача угадать число.");
        int range = 10;
        int number = (int) (Math.random()* range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали.");
                break;

            } else if(input_number > number) {
                System.out.println("загаданное число меньше.");
            } else {
                System.out.println("угаданное число больше.");

            }
        }
        scanner.close();
    }
}
