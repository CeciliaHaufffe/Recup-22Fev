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
public class remedio {
    public String nome;
    public double preco;
    private String marca;
    
    remedio (String nome, String marca ,double preco){
        this.nome = nome;
        this.preco = preco; 
        this.marca = marca;
             }   

  
        void imprimirdaods() {
         System.out.println("---------Remédio----------");
         System.out.println("Remedio: "+nome);
          System.out.println("Marca: "+marca);
         System.out.println("Preço: "+preco);

    }
    
}
