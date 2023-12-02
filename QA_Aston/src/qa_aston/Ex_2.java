/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qa_aston;

import java.util.Scanner;

/**
 *
 * @author Анна
 */
public class Ex_2 {
     static void zad2() {
        
        Scanner in = new Scanner(System.in);
        
        System.out.println ("Задание №2: Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести “Нет такого имени“");
        System.out.println ("Введите имя на латинце: ");
  
        String a = "Vyacheslav";
        String b = in.nextLine();
        
        if (a.equals(b)){
            System.out.println ("Привет, Вячеслав!");
        }
            else{
            System.out.println ("Нет такого имени");
            }

    }
}
