// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.*;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        // 3. Вывести латинский алфавит от “a” до “z”.
        // Перевести знаки в int
        // Готово
/*
        int a = (int)'a';
        int z = (int)'z';

        for (int i = a; i <= z; i++) {
            System.out.print((char)i + " ");
        }
        System.out.println("\n");
*/

        // 4. Вывести все СТЕПЕНИ от двух от нулевой степени до 31й,
        // в двоичной системе
        // Готово
/*
        for (int i = 0; i <= 31; i++) {
            long powResult = Pow.makePow(2, i);
            String binary = ToBinary.toBinary(powResult);
            System.out.println(binary);
        }
*/

        // 6. Вывести десять букв в алфавите после буквы “й”
        // Готово
/*
        int i = (int)'й';
        int j = i + 10;

        for (i = i + 1; i <= j; i += 1) {
            System.out.print((char)i + " ");
        }
*/

        // 7. Вывести десять букв в алфавите, идущие до буквы “ю”.
        // Готово
/*
        int c = (int)'ю'; // 1102
        int h = c - 10; // 1092

        for (c = c - 1; c >= h; c = c - 1) {
            System.out.print((char)c + " ");
        }
*/

        // 8. Пользователь вводит строку. Вывести первые 3 слова.
        // Может быть меньше трех слов; переделать с циклом без сплита
        // Готово
/*
        System.out.println("Введите строку:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String res = Count.countWords(str);
        System.out.println(res);
*/

        // 9. Пользователь вводит строку, вывести её задом-наперёд.
        // Переделать с циклом без сплита
        // Готово
/*
        System.out.println("Введите строку из нескольких слов:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        System.out.println("Ваша строка задом-наперёд:");
        System.out.println(Reverse.reverseString(str));
*/

        // 13. В файле 10 дробных чисел. Считать в массив, вывести те, что больше числа ПИ.
        // Готово
/*
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "User" + separator +
                "Desktop" + separator + "floats.txt";
        File file = new File(path);
        Scanner scan = new Scanner(file);

        int size = 10;
        String[] numbers = new String[10];

        for (int i = 0; i < size; i++) {
            numbers[i] = scan.next();
        }

        double pi = Math.PI;

        for (int i = 0; i < 10; i++) {
            double d = Double.parseDouble(numbers[i]);
            if (d > pi) {
                System.out.println(d);
            }
        }
*/

        //10. Пользователь вводит 10 чисел, сохранить их в файл.
        //Готово
/*
        // Подключаем файл
        String separator = File.separator;
        String path = separator + "C:" + separator + "Users" + separator + "User" + separator +
                "Desktop" + separator + "numbers.txt";
        File file = new File(path);

        // Работа с пользователем
        System.out.println("Введите 10 чисел по одному:");
        int size = 10;
        for (int i = 0; i < size; i++) {
            Scanner scan = new Scanner(System.in);
            String number = scan.next();

            // Запись в файл в цикле
            try (FileWriter fw = new FileWriter(file, true);
                 BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write(number);
                bw.newLine();
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
        System.out.println("Data written successfully");
*/

        // 11. Сохранить 10 чисел в массив, вывести их с конца.
        // без констант
        // Готово
/*
        int size = 10;
        int[] arr = new int[size];
        System.out.println("Введите 10 чисел по одному:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("\nВаш массив сохранён, содержимое массива задом-наперёд:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
*/

        // 12. Сохранить 10 строк в массив, вывести с конца каждую вторую строку.
        // без констант, только 1 цикл - у меня уже один?
/*
        int size = 10;
        String[] arr = new String [size];
        System.out.println("Введите 10 строк:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextLine();
        }

        System.out.println("Ваш массив сохранён, каждая вторая строка с конца:");
        for (int i = size - 1; i >= 0; i -= 2) {
            System.out.println(arr[i]);
        }
*/

        // 14. Пользователь вводит буквы. Пока не введёт букву ‘ю’,
        // сохранить буквы в массив char (пусть в нем будет 100 элементов максимум).
        // Потом создать новый массив char размером столько, сколько букв ввёл пользователь.
        // Скопировать в него буквы из первого массива.
        // Готово
/*
        int trueSize = 0;
        int maxSize = 100;
        char[] charArray = new char[maxSize];
        System.out.println("Вводите буквы по одной:");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < maxSize; i++) {
            char letter = scan.nextLine().charAt(0);
            charArray[i] = letter;
            trueSize++;
            if (letter == 'ю') {
                break;
            }
        }
        scan.close();
        // в общем нужно переконвертировать скан в char, затем проверить символ на условие и поместить в массив

        System.out.println("Ваш массив сохранён, его содержимое:");
        for (int i = 0; i < trueSize; i++) { // null-ячейки остались в массиве, но не будут отображаться в консоли
                System.out.print(charArray[i] + " ");
        }

        System.out.println("\nВаш массив скопирован, содержимое копии массива:");
        char[] charArrayCopy = new char[trueSize];
        for (int i = 0; i < trueSize; i++) {
            charArrayCopy[i] = charArray[i];
            System.out.print(charArrayCopy[i] + " ");
        }

*/
        // 15. Поле чудес. Игрок один пишет слово. Выводится: ##### (по количеству букв).
        // Игрок два пытается угадать буквы.
        // Если угадал, буква открывается: #а#а#, ба#а#, ... банан
        // Пользователь должен вводить слово
        // без fill.array, с циклами
        // Готово, защита от дурака есть :)
/*
        System.out.println("Введите слово:");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        Guess.guess(word);
*/


        // 16. Given an int x, return true if x is a palindrome, and false otherwise.
        // без читерства, с циклами
        // без доп.памяти
        // деление нацело
        // Готово
/*
        System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Palindrome.isPalindrome(num);
*/

        // Максимальная сумма.
        // Даны два массива целых чисел одинаковой длины A[0...n - 1] и B[0...n - 1].
        // Необходимо найти первую пару индексов iX и jY, iX ≤ jY,
        // такую что A[i0] + B[j0] = max(A[i] + B[j]), где 0 ≤ i, j < n, i ≤ j, n ≤ 10^5(в 5 степени).
        // Требования.Время работы O(n).

        // A[i=X], B[j=Y]
/*        int size = 10;

        int[] A = new int[size];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5; // Наибольший эл-т: j=4
        A[5] = -1;
        A[6] = -2;
        A[7] = -3;
        A[8] = 10;
        A[9] = 20;

        int[] B = new int[size];
        B[0] = 10;
        B[1] = 20;
        B[2] = 30;
        B[3] = 40;
        B[4] = 50;
        B[5] = 60;
        B[6] = 70;
        B[7] = 80; // Наибольший эл-т: j=7
        B[8] = -10;
        B[9] = -20;

        int max_in_B_array = B[0]; // значение наибольшего эл-та в массиве В
        int max_index = 0; // его индекс
        int max_in_A_array = A[0]; // значение наибольшего эл-та в массиве A
        int second_index = 0; // его индекс

        for (int j = 0; j < size; j++) {
            if (B[j] > max_in_B_array) {
                max_in_B_array = B[j];
                max_index = j;
            }
            if (A[j] > max_in_A_array & j <= max_index) {
                max_in_A_array = A[j];
                second_index = j;
            }
            int sum = max_in_A_array + max_in_B_array;
        }

        int sum = max_in_A_array + max_in_B_array;

        System.out.println("Индекс макс.значения в массиве А: " + second_index);
        System.out.println("Индекс макс.значения в массиве B: " + max_index);
        System.out.println(sum);*/
        // Сумма должна быть равна 85


        // Задача: Проверить четность целочисленного числа,
        // используя только 1 операцию сдвига битов вправо и 1 операцию деления с остатком
        // Сдвига вправо на n битов = деление на 2 в степени n, остаток откидывается

        // Получаем число
        /*System.out.println("Введите число:");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();*/

        // СПОСОБ 1: ТОЛЬКО деление с остатком
        /*int x = num % 2;
        if (x == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
        */

        // СПОСОБ 2: ТОЛЬКО побитовая "И" (&)
        /*int x = num & 1; // Возвращает 0 (чётное) или 1 (нечётное)
        if (x == 0)
            System.out.println("Число чётное");
        else
            System.out.println("Число нечётное");
*/

        // СПОСОБ 3: Проверка результатов операции >>1 у соседних чисел
        /*int next_num = num + 1;
        int x = num >> 1;
        int y = next_num >> 1;

        if (x == y) System.out.println("Число чётное");
        else System.out.println("Число нечётное");*/

        // СПОСОБ 4: Попытка совместить % и >>1
        /*int x  = num >> 1;
        int y = num % x;

        int res1 = x * 2;
        int res2 = x * 2 + y;
        if (res1 == res2) System.out.println("Число чётное");
        else System.out.println("Число нечётное");*/


        //
        //
        //


        // Задача: Есть массив int-ов nums и int target.
        // Верните индексы двух чисел так, чтобы их сумма была равна target.
        // Можно полагать, что у каждого инпута только одно решение, и эл-ты не используются дважды.
        // Ответ можно вернуть в любом порядке. О(n).
        // Решение через хэшсет;
        // ГОТОВО

        /*int nums_size = 10; // Массив
        int[] nums = new int[nums_size];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = -1;
        nums[6] = -2;
        nums[7] = -3;
        nums[8] = 10;
        nums[9] = 20;

        int target = 7;
        int counter = 0;

        HashSet<Integer> hset = new HashSet<>(); //Хэшсет

        // Помещаем в хэшсет; вычитаем из target значение, ищем такое значение
        for (int i = 0; i < nums_size; i++) { // Это все еще O(n)?
            hset.add(nums[i]);
            int pair = target - nums[i];
            if (hset.contains(pair)) {
                counter++;
                System.out.println(pair + " + " + nums[i] + " = " + target);
            }
        }
        if (counter == 0) System.out.println("Таких пар значений нет");*/


        // Задача: убрать повторяющиеся эл-ты из неосортированного списка
        // UPD: Появился второй способ с LinkedHashSet
        // ГОТОВО

        /*MyLinkedList<String> list = new MyLinkedList<>();

        list.push_back("11");
        list.push_back("11");
        list.push_back("11");
        list.push_back("12");
        list.push_back("12");
        list.push_back("12");

        System.out.println("Список с дубликатами:");
        System.out.println(list);*/

        //Первый способ: функция remove_duplicates в классе MyLinkedList
        /*list.remove_duplicates();
        System.out.println("Список без дубликатов [после функции remove_duplicates]:");
        System.out.println(list);*/

        // Второй способ: копировать список в linkedhashset и сравнивать
        /*list.linked_list_to_linked_hash_set();
        System.out.println("Список после очистки:");
        System.out.println(list);*/


        // Задача: Даны heads двусвязного списка, определить зациклен ли список (true/false),
        // т.е. если можно достичь уже достигнутого ранее head, следуя указателям next.
        // pos помечает индекс узла, на кот.указывает tail.
        // Написать 2 решения: 1 -ое с использованием дополнительной памяти,
        // 2-ое без использования дополнительной памяти.
        // UPD: Можно зацикливать эл-ты по их индексам
        // ГОТОВО

        /*MyLinkedList<String> list = new MyLinkedList<>();

        list.push_back("Zero");
        list.push_back("One");
        list.push_back("Two");
        list.push_back("Three");
        list.push_back("Four");
        list.push_back("Five");

        System.out.println("Содержание изначального списка:");
        System.out.println(list);

        // list.get_indice("Four");*/

        // Вариант 1 - без доп.памяти, своя функция check_for_cycles()
        // list.make_a_cycle(3, 0);
        // System.out.println(list.check_for_cycles());

        // Вариант 2 - с доп.памятью: проверить хэшсетом (записывать в хэшсет узлы)

        // list.make_a_cycle(3, 0);
        // System.out.println(list.find_cycles_with_hashset());


        //
        //

        // Дана строка, содержащая только символы . Определите, валидна ли исходная строка.
        // Исходная строка валидна, если:
        // 1. Открывающиеся скобки закрываются тем же типом скобок
        // 2. Открывающиеся скобки должны быть закрыты в правильном порядке
        // Пустая строка - валидная строка

        /*System.out.println("Напишите строку, содержащую только символы (, ), {, }, [ и ]:");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); // Проверка на null??

        // В LinkedList будем помещать парные символы открывающих скобок
        MyLinkedList<Character> list = new MyLinkedList<>();
        int odd = str.length() & 1;

        if (str.isEmpty()) System.out.println(true);
        if (odd != 0) System.out.println(false); // В "правильной" строке может быть только четное кол-во символов
        else {
            if (str.charAt(0) == ')' || str.charAt(0) == '}' || str.charAt(0) == ']') // Строка начинается с закрывающей скобки
                System.out.println(false);
            else {
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (c == '(' || c == '{' || c == '[' || c == ')' || c == '}' || c == ']') {
                        // Если открывающие скобки - помещаем в начало списка их пару
                        if (c == '(') list.push_front(')');
                        if (c == '{') list.push_front('}');
                        if (c == '[') list.push_front(']');

                        //Если закрывающие скобки - сравниваем с первым эл-тов списка
                        if (c == ')' || c == '}' || c == ']') {
                            char pair = list.get_first_element(); // Получаем первый эл-т в списке
                            if (pair == c) {
                                list.delete_first_element(); // Удаляем первый эл-т - так скорость поиска не деградирует
                            } else {
                                System.out.println(false);
                                break;
                            }
                            // Ниже - как получаем true для "правильных" строк
                            if (i == str.length() - 1 && list.isEmpty()) System.out.println(true);
                        }
                    } else {
                        System.out.println(false + "\nСтрока содержит недопустимые символы");
                        break;
                    }
                }
            }
        }*/

        // Реализуй свой стек, который поддерживает операции push, pop, top и getMin
        //- push(x) -- Засунуть элемент в стек
        //- pop() -- Удалить элемент из стека и вернуть
        //- top()/peek() -- Получить самый верхний элемент из стека
        //- getMin() -- Получить минимальный элемент из стека.
        //**Методы pop,top,getMin нельзя вызывать, если стек пустой!

        /*ArrayBasedStack stack = new ArrayBasedStack();

        stack.push(9);
        stack.push(1);
        stack.push(-3);
        stack.push(-6); //-11
        stack.push(-10); //-8

        System.out.println(stack.get_stack_size()); //5

        System.out.println(stack.getMin()); //-10
        System.out.println(stack.pop()); //-10
        System.out.println(stack.get_stack_size()); //4

        System.out.println(stack.peek()); //-6
        System.out.println(stack.getMin()); //-6

        stack.push(-8);
        System.out.println(stack.peek()); // -8
        System.out.println(stack.getMin()); //-8
        System.out.println(stack.pop()); //-8

        stack.push(-11);
        System.out.println(stack.getMin()); //-11
        System.out.println(stack.peek()); //-11
        */

        //
        //
        //

        // Написать реализацию очереди Queue на 2-стеках.
        // Очередь должна иметь возможность получения минимального элемента за среднее время O(1)

        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(6);
        System.out.println(queue.pop()); //1
        System.out.println(queue.pop()); //2
        System.out.println(queue.getMin()); //3

        queue.push(0);
        queue.push(-1);
        System.out.println(queue.getMin()); //-1

        queue.push(6);
        System.out.println(queue.getMin()); //-1
        System.out.println(queue.pop()); //3
        System.out.println(queue.pop()); //4
        System.out.println(queue.pop()); //5
        System.out.println(queue.pop()); //6
        System.out.println(queue.pop()); //0
        System.out.println(queue.pop()); //-1
        System.out.println(queue.getMin()); //6
        System.out.println(queue.pop()); //6
        System.out.println(queue.getMin()); //-2147483648

    }
}