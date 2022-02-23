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
class resul {
    public double resulta;
    
    resul (double rem1, double rem2, double rem3, double rem4, double rem5){
        this.resulta = rem1+rem2+rem3+rem4+rem5;
    }
    
   void imprimirdaods() {
         System.out.println("---------Preço Total----------");
         System.out.println("Preço total: "+resulta+" reais");
    }

    
}
