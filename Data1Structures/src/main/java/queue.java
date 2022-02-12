/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talos
 */
public class queue {
    private node head;
    private node tail;
    private int lenght;
    
    public queue(){
        head = null;
        tail = null;
        
    }
    //public int getLenght(){
    //    return lenght;
    //}
    public void insertar(int dato){
        node newNode = new node();
        newNode.setValue(dato);
        newNode.setNext(null);
        
        if(head == null && tail == null){
            head = newNode;
            tail = newNode;
            
        }
        System.out.println("El valor anterior de tail es");
        System.out.println(tail.getValue());
        tail.setNext(newNode);
        tail = newNode;
        lenght++;
        System.out.println("El valor actual de tail es");
        System.out.println(tail.getValue());
    }
    public void extraer(){
        System.out.println("El valor anterior de head es");
        System.out.println(head.getValue());
        head = head.getNext();
        
        System.out.println("El valor actual de head es");
        System.out.println(head.getValue());
        lenght--;
    }
    public boolean isEmpty(){
        boolean cola = false;
        if (head == null && tail == null){
            cola = true;
            System.out.println("La cola esta vacia");
        }else{
            System.out.println("La cola no esta vacia");
            cola =false;
        }return cola;
    }
    public int getLenght(){
        int resultado = 0;
        node C = this.head;
        if (isEmpty()){
            return resultado;
        }
        while (C!=null){
            
            C = head.getNext();
            resultado++;
        }
        return resultado;
    }
    
    
}
