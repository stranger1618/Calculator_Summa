/**
 * Калькулятор для сложения дробных чисел
 * @author Amenova G. stranger1618
 */
import java.util.Scanner;

public class Calculator_Summa {
    /**
     * @param number1  слагаемое 1
     * @param number2  слагаемое 2
     */
    public static float summa(float number1, float number2) {
        return (number1 + number2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ввод с консоли 1-го слагаемого
        System.out.println("Введите первое слагаемое: ");
        float number1 = scanner.nextFloat();

        // Ввод с консоли 2-го слагаемого
        System.out.println("Введите второе слагаемое: ");
        float number2 = scanner.nextFloat();

        // вывод суммы 1-го и 2-го числа с 4 знаками после запятой
        System.out.printf("Сумма чисел = " + "%.4f", summa(number1,number2));
        scanner.close();
    }
}
