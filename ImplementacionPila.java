/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacionpila;

/**
 *
 * @author K02-07
 */
public class ImplementacionPila {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila=new Pila(50);
        pila.Insertar("maria");
        pila.Insertar("juan");
        
        System.out.println("tamaño "+pila.Tamaño());
        pila.Sacar();
        pila.Insertar("rico");
        
        while(!pila.Vacia()){
            System.out.println(pila.Sacar());
        }
    }
    
}
