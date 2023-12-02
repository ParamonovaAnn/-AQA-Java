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
public class Chooser {
    static void chooser() {
                 Scanner in = new Scanner(System.in);
        
        ;
        System.out.println ("Введите номер задания: ");
       
        int a = in.nextInt();
           if (a == 1){
            System.out.println ("Привет!");
        }
            else{
            System.out.println ("a<7");
            }
        
}
}