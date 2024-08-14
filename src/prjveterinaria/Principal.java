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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Veterinaria vet = new Veterinaria();
        
        Gato otto = new Gato("Otto");
        Cachorro sadan = new Cachorro("Sadan");
        Ave rio = new Ave("Rio");
        Gato luna = new Gato("Luna");
        Ave ave = new Ave("Ave");
        Cachorro catioro = new Cachorro("Catioro");

        
        vet.receberAnimal(otto);
        vet.receberAnimal(sadan);
        vet.receberAnimal(rio);
        
        vet.receberAnimal(luna);
        
        vet.receberAnimal(catioro);
        vet.receberAnimal(ave);

        vet.mostrarAnimais();
        
        
        vet.conversarComAnimais();
        
        vet.dormirAnimais();
        
        vet.passearComAnimais();
    }
    
}
