/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjveterinaria;

import java.util.ArrayList;

/**
 *
 * @author Andrelise Serena Buttner
 */
public class Veterinaria {
    
   //declaração de variáveis que representam atributos.
   private ArrayList<Animal> listaAnimais;//declaração do ArrayList  
    
   //método construtor              
   public Veterinaria(){
        
       this.listaAnimais = new ArrayList();//criado explícitamente
        
   }
    
   //métodos delegados 
   public void receberAnimal(Animal a){
       
       this.listaAnimais.add(a);
       
   }        
    
   public void alimentarAnimais(){
   
       for(Animal itemAnimal: this.listaAnimais){
           itemAnimal.comer();
       }
   } 
   
   public void passearComAnimais(){
          
        for(Animal itemAnimal: this.listaAnimais){
            itemAnimal.avancar();
        }
   }
   
   public void dormirAnimais(){
      
        for(Animal itemAnimal: this.listaAnimais){
            itemAnimal.dormir();
        }         
   }    
    
   public void conversarComAnimais(){
      
        for(Animal itemAnimal: this.listaAnimais){
            itemAnimal.emitirSom();
        }         
   }
   
      public void mostrarAnimais(){
      
       for(Animal itemAnimal: this.listaAnimais){
            System.out.println("Nome: "+itemAnimal.getNome());
            System.out.println("Cor: "+itemAnimal.getCorPredominante());
       }         
   }
      
        
}
