import java.util.Scanner;

public class Guess {

    public static void guess(String word) {// Считываем букву
        // Создаём слово и массив с его симвоами
        char[] wordArray = word.toCharArray(); // теперь слово (строка) - массив букв

        // Создаём массив с символами вместо букв
        int length = wordArray.length; // длина для работы с циклами
        char[] charArray = new char[length]; // новый массив, равный предыдущему, но заполненный символами

        System.out.println("Ваше слово в символах:");
        for (int i = 0; i < length; i++) {
            charArray[i] = '#';
            System.out.print(charArray[i]);
        }

        int guessedletters = 0; // угаданных букв
        int count = 0; // попытки
        boolean guessed = false; // ход - угадал или нет

        while (guessedletters < length) {

        // Угадываем буквы
        System.out.println("\nВведите букву:");
        Scanner scan = new Scanner(System.in);
        char letter = scan.nextLine().charAt(0); // Считываем букву

            // Проверяем массив
            for (int i = 0; i <= length - 1; i++) {
                if (wordArray[i] == letter && charArray[i] == '#') {
                    guessed = true;
                    guessedletters++;
                    charArray[i] = letter;
                }
            }

            // Оповещаем игрока
            if (guessed) {
                count++;
                System.out.println("\nВы угадали!");
                guessed = false;
                for (int i = 0; i < length; i++) {
                    System.out.print(charArray[i]);
                }
            } else {
                count++;
                System.out.print("\nНет такой буквы!");
            }
        }

        System.out.println("\nВы угадали слово! Правильный ответ: " + word);
        System.out.println("\nВы угадали с " + count + " попытки");
    }
}