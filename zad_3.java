// 3. Реализовать простой калькулятор

import java.util.Scanner;

public class zad_3 {

    public static void main(String[] args) {

        Scanner in_3 = new Scanner(System.in);
        System.out.print("Выберите тип операции. 1 - сложение. 2 - вычитание. 3 - умножение. 4 - деление. ");
        double oper = in_3.nextInt();


        Scanner in_1 = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num_1 = in_1.nextInt();

        Scanner in_2 = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        double num_2 = in_2.nextInt();
        in_1.close();
        in_2.close();
        in_3.close();

        double result = 0;

        if (oper == 1) {
            result = num_1 + num_2;
            printed(result);
        }
        if (oper == 2) {
            result = num_1 - num_2;
            printed(result);
        }
        if (oper == 3) {
            result = num_1 * num_2;
            printed(result);
        }
        if (oper == 4) {
            result = num_1 / num_2;
            printed(result);
        }
        else {
            System.out.println("Некорректный выбор типа операции");
        }
    }
    
    public static void printed(double result) {
        System.out.print("Результат равен: ");
        System.out.println(result);
        
    }

}
