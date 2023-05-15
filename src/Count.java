import java.util.List;

public class Count {
    public static String countWords(String str) {

        String firstWords = ""; // строка с первыми тремя словами

        if (str.isBlank()) { // проверка строки на пустоту
            return "Пустая строка";
        } else {

            int wordsCount = 0;

                for (int i = 0; i < str.length(); i++) {

                    char c = str.charAt(i);
                    if (Character.isLetter(c)) {
                        firstWords = firstWords + c;
                    }
                    if (!Character.isLetter(c)) {
                        firstWords = firstWords + " ";
                    }
                    if (c == ' ') {
                        wordsCount++;
                    }
                    if (wordsCount == 3) {
                        break;
                }
            }
            return firstWords;
        }
    }
}