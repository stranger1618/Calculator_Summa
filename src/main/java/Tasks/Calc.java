package Tasks;

/**
 * Класс Калькулятор
 * Объект хранит значения двух дробных чисел и осуществляет операции над ними
 */


public class Calc {


    /**
     * Метод для сложения двух чисел, хранящихся в текущем объекте
     *
     * @return Результат сложения двух чисел
     */
    /**
     * Операция сложение
     * @param FirstNumber Первое слагаемое
     * @param SecondNumber Второе слагаемое
     */
    public static double plus (double FirstNumber, double SecondNumber) {
        return FirstNumber + SecondNumber;
    }
    /**
     * Операция вычитания
     * @param FirstNumber Первое слагаемое
     * @param SecondNumber Второе слагаемое
     */
    public static double minus (double FirstNumber, double SecondNumber) {
        return FirstNumber - SecondNumber;
    }
    /**
     * Операция умножения
     * @param FirstNumber Первое слагаемое
     * @param SecondNumber Второе слагаемое
     */
    public static double umn (double FirstNumber, double SecondNumber) {
        return FirstNumber * SecondNumber;
    }
    /**
     * Операция деления
     * @param FirstNumber Первое слагаемое
     * @param SecondNumber Второе слагаемое
     */
    public static double del (double FirstNumber, double SecondNumber) {
        return FirstNumber / SecondNumber;
    }
}
