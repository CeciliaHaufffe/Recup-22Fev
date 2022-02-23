/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Remedio;

/**
 *
 * @author IFSC
 */
public class Farmacia {
       public  static  void  main (String [] args){
         remedio rem = new remedio ("Garganta","Generio", 36.00 ); 
         remedio rem2 = new remedio ("Barriga","Generico", 37.00 ); 
         remedio rem3 = new remedio ("Dor de Coluna", "Generico",  55.00 );
         remedio rem4 = new remedio ("Dor de Cabeça", "Iboprofeno",  20.00 );
         remedio rem5 = new remedio ("Dor", "Paracetamol",  19.00 );
         resul reslta = new resul (36.00, 37.00,23.00, 55.00, 20.00);
         
                   
                   
        rem.imprimirdaods();
        rem2.imprimirdaods();
        rem3.imprimirdaods();
        rem4.imprimirdaods();
        rem5.imprimirdaods();
        System.out.println("\n");
        reslta.imprimirdaods();
        
        
    }
}
