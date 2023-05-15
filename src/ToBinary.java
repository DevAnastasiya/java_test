public class ToBinary {

    // теперь функция для перевода числа в двоичную систему
    public static String toBinary(long number) {
        long a, b; //long - т.к. работаем со степенями, число может быть большим
        a = number;
        String binary = ""; // для склейки 0 и 1 в одну строку
        while(a != 0) {
            b = a % 2; // b - это "0" или "1"
            binary = b + binary; // склейка результата со строкой
            a = a / 2;
        }
        return binary;
    }
}
