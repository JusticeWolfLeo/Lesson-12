import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        char operation;
        int num1, num2, result;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Первое число?");
            num1 = scanner.nextInt();
            System.out.println("Второе число?");
            num2 = scanner.nextInt();
            System.out.println("Операция?");
            operation = scanner.next().charAt(0);
            result = 0;
            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Введите правильный оператор");
                    operation = scanner.next().charAt(0);
            }
            System.out.println("Результат " + result);
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение");
        } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя");
        } finally {
            System.out.println("Программа завершилась");
        }
    }
}