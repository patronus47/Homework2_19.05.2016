import java.util.Scanner;

/**
 * Created by Fandorin on 19.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        //вывод на экран квадратной рамки из пробелов и символов "*"

        // объявляем переменные i, j
        double i;
        double j;


        for (i = 0; i < 9; i++) {

            for (j = 0; j < 9; j++) {

                if (i == 0 || i == 8) { // при выполнении заданного условия
                    System.out.print("* "); // будут выводиться верхняя и нижняя стороны рамки

                } else if (j == 0) {        // при выполнении заданного условия
                    System.out.print("* ");  // будет выводиться левая сторона рамки

                } else {                    // пространство внутри рамки
                    System.out.print("  ");
                }
            }

            System.out.println("*"); // вывод на экран правой стороны рамки
        }

        // Решение квадратного уравнения с пользовательским вводом переменных a, b, c

        // Объявляем переменные a, b, c, d (дискриминант) и x

        double a = 0;
        double b = 0;
        double c = 0;
        double d = b * b - 4 * a * c;
        double x = 0;
        double x2 = 0;

        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner

        // просим пользователя ввести переменные a, b, c

        System.out.print("Введите переменную a = ");
        if (sc.hasNextDouble()) {
            a = sc.nextDouble();
        } else {
            System.out.println("Переменная задана некорректно");

        }
        System.out.print("Введите переменную b = ");
        if (sc.hasNextDouble()) {
            b = sc.nextDouble();

        } else {
            System.out.println("Переменная задана некорректно");

        }
        System.out.print("Введите переменную b = ");
        if (sc.hasNextDouble()) {
            c = sc.nextDouble();
        } else {
            System.out.println("Переменная задана некорректно");

        }

        // считаем дискриминант и выводим его значение на экран

        System.out.println("D = b*b - 4*a*c = " + d);

        // в зависимости от значения дискриминанта определяем количество корней
        // и выводим их на экран (или указываем на отсутствие корней)
        if (d > 0) {
            x = (-b - (Math.sqrt(b * b - 4 * a * c)) / 2 * a);
            x2 = (-b + (Math.sqrt(b * b - 4 * a * c)) / 2 * a);
            System.out.println("У уравнения два корня: x = " + x + ";" + " x2 = " + x2);

        }else if (d == 0){
            x = -b/2*a;
            System.out.println("У уравнения один корень: x = " + x);

        }else{
            System.out.println("Нет корней");

        }




    }
    }