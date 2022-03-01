package com.mycompany.data1structures;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Talos
 */
public class Recursion {
    
    static int arr[]={12,34,64,2,3};
    
    public static int factorial (int n){
        if (n==0){
            return 1;
        }else{
            return(n*factorial(n-1));
        } 
    }
    public static int buscarElemento(int arr[],int i, int n,int f){
        if(f<1){
            return -1;
        }
        if(arr[i]==n){
            return n;
        }
        if(arr[f]==n){
            return n;
        }else{
            return buscarElemento(arr,i+1,n,f-1);
        }
    }
}
