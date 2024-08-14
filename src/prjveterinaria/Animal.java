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
public abstract class Animal {
    
    //declaração de atributos   
    
    private String nome;
    private String dataNasc;
    private String corPredominante;
    
    //métodos construtores
    public Animal(){}
    
    public Animal(String nome, String cor){
        this.corPredominante = cor;
        this.nome = nome;    
    }

    public Animal(String nome){
        this.nome = nome;
    }
        
    //métodos de acesso aos atributos
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }
        
    //métodos delegados
    
    public abstract void dormir();
    
    public abstract void comer();
    
    public abstract void avancar();
    
    public abstract void emitirSom();
    
}
