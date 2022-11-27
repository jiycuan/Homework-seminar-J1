// 4. +Задано уравнение вида q + w = e, где q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет. 

import java.util.Scanner;

public class zad_4 {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Укажите первое число: ");
        String q = in.nextLine();
        System.out.print("Укажите второе число: ");
        String w = in.nextLine();
        System.out.print("Какой результат? ");
        String e = in.nextLine();
        in.close();

        String temp = "?";
        String temp_j = "";
        String temp_i = "";
        String temp_k = "";
        int new_w = 0;
        int new_q = 0;
        int new_e = 0;
        boolean flag = true;

        for (int i = 0; i < 10; i++) {
            temp_i = Integer.toString(i);
            new_q = Integer.valueOf(q.replace(temp, temp_i));
            for (int j = 0; j < 10; j++) {
                temp_j = Integer.toString(j);
                new_w = Integer.valueOf(w.replace(temp, temp_j));
                for (int k = 0; k < 10; k++) {
                    temp_k = Integer.toString(k);
                    new_e = Integer.valueOf(e.replace(temp, temp_k));
                    if (new_q + new_w == new_e) {
                        System.out.printf("Равенство выполняется при значениях: %d + %d = %d", new_q, new_w, new_e);
                        System.out.println();
                        flag = false;
                    }
                }
            }
        }
    
    if (flag == true) {
        System.out.println("С указанными параметрами равенство невозможно при любых значениях неизвестных");
        } 
    }
}
