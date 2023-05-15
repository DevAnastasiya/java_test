public class Reverse {
    public static String reverseString(String str) {
// Мама, мыла раму?
        int i = str.length() - 1; // Индекс последнего символа в строке
        int start, end = i + 1; //
        String reversedString = ""; // строка с первыми тремя словами

        while (i >= 0) { // Начинаем с start, end = 16; i = 15
            if (str.charAt(i) == ' ') { // Если символ - пробел, впервые при i = 10
                start = i + 1;
                while (start != end) {
                    reversedString += str.charAt(start++); // Пока слово не закончится, i плюсуется
                }
                reversedString += ' ';
                end = i;
            }
            i--; // Если символ не пробел, то i--
        }
        start = 0;
        while (start != end) {
            reversedString += str.charAt(start++);
        }
        return reversedString;
    }
}
