/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjveterinaria;

/**
 *
 * @author Andrelise Serena Buttner
 */
public class Gato extends Animal{
  
    // variáveis atributos
    private String atributoGato;
    
    //métodos construtores
    
    public Gato(){
        super();
    }
    
    public Gato(String nome){
        super(nome);
    }
    
    @Override
    public void comer(){
        System.out.println("Comendo como um gato");
    }
    
    @Override
    public void dormir(){
        System.out.println("Dormindo como um gato");
    }
    
    /**
     *
     */
    @Override
    public void avancar(){
        System.out.println("Avançar como um gato");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som como um gato");
    }

}
