public class Palindrome {

    public static void isPalindrome(int number) {

        int newNumber = 0; // число, составляемое и 'x' и 'y' (number задом-наперёд)
        int x = number;
        int y; // остаток от деления

        while (x > 0) {
            y = x % 10;
            newNumber = (newNumber * 10) + y;
            x = x / 10;
        }
        if (number == newNumber) System.out.println("Это палиндром");
        else System.out.println("Это не палиндром");
    }
}
