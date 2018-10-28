/**
 * Created by me on 28/10
 * @author Amenova G. stranger1618
 * @see #
 */
import java.util.Scanner;
public class BaseClass1 {
    public static void main(String[] args) {
//        System.out.println("Hi!  %)");
        System.out.println("Add string1");
        Scanner scanner = new Scanner (System.in);

        System.out.println("Введите первое дробное число: ");
        float FirstN=scanner.nextFloat();
        System.out.println("Введите второе дробное число: ");
        float SecondN=scanner.nextFloat();

        System.out.printf("Сумма чисел: "+"%.4f", (FirstN+SecondN));

//System.err.println("This is error stream");
        scanner.close();

    }
}
