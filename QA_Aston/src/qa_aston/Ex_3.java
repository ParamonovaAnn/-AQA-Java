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
public class Ex_3 {
    
    static void zad3(){
    Scanner in = new Scanner(System.in);
        
        System.out.println ("Задание №3: Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3");
        System.out.println ("Введите элементы массива: ");
   
        int[] a;
        a = new int[6];
        
             for (int i = 1; i < 6; i++) {
                 a[i] = in.nextInt();
        }
             
       System.out.println();
       System.out.println("Элементы массива, кратные 3 ");
                       
       for (int i = 1; i < 6; i++) {
                           
                 if (a[i] % 3 == 0){
                    System.out.println ( a[i] );
                }
           
        }
    }
}