/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talos
 */
public class stack {
     
    private node start;
    private int lenght;
    
    public void stack(){
        start=null;
        lenght=0;
    }
    public boolean isEmpty(){
        if(start==null){
            System.out.println("La pila se encuentra vacia");
            return true;
        }else{
            return false;
        }

    }
    public int getLenght(){
        return lenght;
    }
    //
    public void push (int value){
        node newNode = new node();
        newNode.setValue(value);
        
        // verifica si la lista esta vacia
        if (isEmpty()){
            //inicializa la pila con el newNode
            start=newNode;
            System.out.println("Se ha agregado un elemento a la pila");
            System.out.println(start.getValue());
        }else{
            System.out.println("El top anterior fue: ");
            System.out.println(start.getValue());
            newNode.setNext(start);
            
            start=newNode;
            System.out.println("Se ha agregado un elemento a la pila");
            System.out.println(start.getValue());
            
            
        }
        lenght++;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("No existen elementos");
        }else{
            System.out.println("se removio el primer de la fila");
            System.out.println(start.getValue());
            //Asigna el start al valor que estaba de segundo
            start=start.getNext();
            System.out.println("El nuevo top es: ");
            System.out.println(start.getValue());
            lenght--;
        }
    }
}

