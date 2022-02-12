/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talos
 */
public class Main {
    
    static int arr[]={12,24,5,7,9};
    public static void main (String [] args){
       
        /*
        
        System.out.println(Recursion.factorial(4));
        System.out.println(Recursion.buscarElemento(arr, 0, 9, arr.length-1));
        */ 
        
        
        /*
        stack pila = new stack();
        System.out.println(pila.getLenght()+" elementos");
        pila.push(1);
        System.out.println(pila.getLenght()+" elementos");
        pila.push(7);
        System.out.println(pila.getLenght()+" elementos");
        pila.push(909090);
        System.out.println(pila.getLenght()+" elementos");
        pila.pop();
        System.out.println(pila.getLenght()+" elementos");

        */
        queue cola1=new queue();
        cola1.insertar(46);
        System.out.println(cola1.getLenght()+" elementos");
        cola1.insertar(12);
        System.out.println(cola1.getLenght()+" elementos");
        cola1.insertar(87);
        System.out.println(cola1.getLenght()+" elementos");
        cola1.insertar(125);
        System.out.println(cola1.getLenght()+" elementos");
        cola1.insertar(30);
        System.out.println(cola1.getLenght()+" elementos");
        cola1.extraer();
        System.out.println(cola1.getLenght()+" elementos");
        cola1.isEmpty();
        System.out.println(cola1.getLenght()+" elementos");
        
        
    }
    
    
    
    
    
}
