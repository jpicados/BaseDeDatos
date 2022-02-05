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
        
        System.out.println(Recursion.factorial(4));
        System.out.println(Recursion.buscarElemento(arr, 0, 9, arr.length-1));
    }
}
