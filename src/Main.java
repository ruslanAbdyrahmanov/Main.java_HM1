import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myFriend;
        final int Num = 19;
        String word = " age";
        myFriend = Num + word;
        System.out.println(myFriend);

        if (Num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (Num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }
        System.out.println("Задание_на_сообразительность");

        Scanner scan = new Scanner(System.in);
        System.out.println("Ввeдите ваше имя");
        String name = scan.nextLine();
        System.out.println("Hello!" + " " + name);
    }
}