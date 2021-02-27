/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //declaracion de variables
        int saldo_inicial = 100;
        int resta_saldoInicial=0;
        int numero_para_jugar=0;
        int op=0;
        int alazar=0;
        String color;
        Scanner datos = new Scanner(System.in);
        
        System.out.println("*********************************************");
        System.out.println("*Este es un simulador del juego de la ruleta*");
        System.out.println("*********************************************");
        
        do{
           System.out.println("********************************************"); 
           System.out.println("1. Apostar" + " " + "2.salir del juego");
           System.out.println("********************************************"); 
           op=datos.nextInt(); 
            System.out.println("********************************************");
            System.out.println("Su saldo inicial es de: " + saldo_inicial);
            System.out.println("********************************************");
           
              switch(op){
            case 1: 
                System.out.println("Digite el color con que va a jugar:");
                color = datos.next();
                
                System.out.println("Digite el numero con que va a jugar: ");
                numero_para_jugar=datos.nextInt();
                
               resta_saldoInicial = (saldo_inicial-10);
               saldo_inicial = resta_saldoInicial;
               
               
               alazar = (int) (Math.random()*11);
              
               if(alazar == numero_para_jugar){
                   System.out.println("acaba de acertar");
                   System.out.println("Su saldo inicial es de: " + saldo_inicial);
               }else{
                   System.out.println("no le acerto");
               }
                break;
                
            case 2: 
                System.out.println("saliendo del programa");
                
    }
            
           
           
        }while(op!=2);
        
        
           
   }
    
}
