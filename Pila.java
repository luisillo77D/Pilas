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
public class Pila {
    private Object[] ArregloPila;
    private int cima,CapacidadMax,Tamaño;
    
     /**
     * Constructor para la serie de números aleatorios
     * @param capacidad El parámetro capacidad define el número de elementos que va a tener la pila
     */
    public Pila(int capacidad){
        ArregloPila=new Object[capacidad];
        Tamaño=0;
        CapacidadMax=capacidad;
        cima=-1;
    } //Cierre del constructor
    
     /**
     * Metodo para el ingreseo de objetos a la pila
     * @param dato El parámetro entry define el objeto que se va ingresar en la pila
     */
    public void Insertar(Object dato){
        cima++;
        ArregloPila[cima]=dato;
        Tamaño++;
    }
    /**
     * Metodo para sacar objetos de la pila, retorna el ArregloPila en la posicion cima, decrese el tamaño y la cima 
     */
    public Object Sacar(){
        Tamaño--;
        cima--;
        return ArregloPila[cima+1];       
    }
    
    /**
     * Metodo para el retorno del tamaño de la pila retorna un dato de tipo entero
     */
    public int Tamaño(){
        return Tamaño;
    }
    
    /**
     * Metodo para el retorno del estado de la pila, retorna un valor booleano
     */
    public boolean Vacia(){
        if(Tamaño==0){
            return true;
        }
        else{
            return false;
        }
    }
}
