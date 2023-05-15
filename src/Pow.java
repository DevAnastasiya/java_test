public class Pow {

    // сначала - функция возведения в степеь
    public static long makePow(int number, int power) {
        long result;
        if (number == 0 || power == 0) {
            result = 1;
        } else {
            result = number;
            for (int i = 1; i < power; i++) {
                result *= number;
            }
        }
        return result;
    }
}