import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Выберите задачу для проверки от 1 до 4: ");
        int task = scanner.nextInt();
        switch (task) {
            case 1:
                Task1();
                break;
            case 2:
                Task2();
                break;
            case 3:
                Task3();
                break;
            case 4:
                Task4();
                break;

        }
    }

    //Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void  Task1(){
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        System.out.printf("Сумма чисел от 1 до %d = %d\n", num, sumNumber(num));
        System.out.printf("Факториал %d! = %d", num, factorial(num));
    }
    //Вывести все простые числа от 1 до 1000
    public static void  Task2(){
        for (int i = 0; i <= 1000; i++) {
            BigInteger b = new BigInteger(String.valueOf(i));
            if (b.isProbablePrime(1)) System.out.printf("%d, ", b);
        }
    }

    //Реализовать простой калькулятор
    public static void Task3() {
        int res = 0;
        System.out.print("Введите первое число: \n");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: \n");
        int num2 = scanner.nextInt();
        System.out.print("Введите результирующее действие: \n");
        String symbol = scanner.next();
        switch (symbol) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        System.out.printf("Результат: %d\n", res);
    }
    //* +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
    // Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
public static void Task4(){
    System.out.print("Введите первую цифру первого числа: \n");
    int num1 = scanner.nextInt();
    System.out.print("Введите вторую цифру второго числа: \n");
    int num2 = scanner.nextInt();
    System.out.print("Введите сумму: \n");
    int sum = scanner.nextInt();
    for (int i = 1; i < 10; i++) {
        if (new Integer(num1 + "" + i) + new Integer(i + "" + num2) == sum) {
            System.out.printf(num1 + "" + i + "+" + i + "" + num2 + "=" + sum);
            return;
        }
    }
    System.out.println("Решения нет");
}
    public static int sumNumber(int num) {
        int sumNumber = 0;
        for (int i = 1; i <= num; i++) {
            sumNumber += i;
        }
        return sumNumber;
    }

    public static int factorial(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

