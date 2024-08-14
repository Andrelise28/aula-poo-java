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
public class Cachorro extends Animal {
    
    // variáveis atributos
    private String atributoCachorro;
    
    //métodos construtores
    
    public Cachorro(){
        super();
    }
    
    public Cachorro(String nome){
        super(nome);
    }
    
    @Override
    public void comer(){
        System.out.println("Comendo como um cachorro");
    }
    
    @Override
    public void dormir(){
        System.out.println("Dormindo como um cachorro");
    }
    
    @Override
    public void avancar(){
        System.out.println("Avançar como um cachorro");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("som como um cachorro");
    }
}
