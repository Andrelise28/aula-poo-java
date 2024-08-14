/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prjveterinaria;

/**
 *
 * @author 368748
 */
public class Ave extends Animal {
    
    // variáveis atributos
    private String atributoAve;
    
    //métodos construtores
    
    public Ave(){
        super();
    }
    
    public Ave(String nome){
        super(nome);
    }
    
    @Override
    public void comer(){
        System.out.println("Comendo como uma ave");
    }
    
    @Override
    public void dormir(){
        System.out.println("Dormindo como uma ave");
    }
    
    /**
     *
     */
    @Override
    public void avancar(){
        System.out.println("Avançar como uma ave");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som como uma ave");
    }
}
