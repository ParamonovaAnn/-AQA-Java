
package qa_aston;

import java.util.Scanner;

/**
 *
 * @author Парамонова Анна
 */
public class Ex_1 {
        static void zad1(){
                Scanner in = new Scanner(System.in);
        
         System.out.println ("Задание №1: Составить алгоритм: если введенное число больше 7, то вывести “Привет”");
        System.out.println ("Введите число: ");
       // int a = Integer.parseInt(input.readLine());
             
        int a = in.nextInt();
        if (a>7){
            System.out.println ("Привет!");
        }
            else{
            System.out.println ("a<7");
            }
    }
}
