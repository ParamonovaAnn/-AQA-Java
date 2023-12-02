/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qa_aston;
 
import java.util.Scanner;

/**
 *
 * @author Парамонова Анна
 */
public class QA_Aston1 {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println ("Введите номер задания: ");
       
        int a = in.nextInt();
           if (a == 1){
            Ex_1.zad1();
            
            
        }
           else  if (a == 2){
            Ex_2.zad2();
            }
           
             else  if (a == 3){
            Ex_3.zad3();
            } 
             
             else{
                  System.out.println ("Такого задания не существует, попробуйте снова ");
             }

}
}