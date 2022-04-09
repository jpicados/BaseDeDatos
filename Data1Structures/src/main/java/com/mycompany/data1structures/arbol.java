/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.data1structures;

/**
 *
 * @author Talos
 */
public class arbol {
    private nodetree root;
    private int altura;
    
    public void insert(int value){
        if(root==null){
            root=new nodetree(value);
        }else{
            inserting(root, value);
        }
    }
    
    public void inserting(nodetree node,int value){
        if(value<node.getId()){
            if(node.getLeft()==null){
                node.setLeft(new nodetree(value));
            }
            else{
                inserting(node.getLeft(),value);
            }
        }
        else{
            if(node.getRight()==null){
                node.setRight(new nodetree(value));
            }
            else{
                inserting(node.getRight(),value);
            }
        }
    }
    public void inOrder(){
        if(root!=null){
            inOrderrun(root);
        }else{
            System.out.println("Arbol esta vacio");
        }
    }
    public void inOrderrun(nodetree node){
        if(node!=null){
            inOrderrun(node.getLeft());
            System.out.println(node.getId());
            inOrderrun(node.getRight());
        }
    }
    public void menor(){
        if(root!=null){
            imprimirMenor(root);
        }else{
            System.out.println("Arbol vacio");
        }
    }
    public void imprimirMenor(nodetree node){
        if(node.getLeft()!=null){
            imprimirMenor(node.getLeft());
        }else{
            System.out.println(node.getId());
        }
    }
    public void retornarAltura(nodetree node,int nivel){
        if(node!=null){
            retornarAltura(node.getLeft(),nivel+1);
            if(nivel>altura)
                altura=nivel;
            retornarAltura(node.getRight(),nivel+1);
        }
    }
    public int retornarAltura(){
        altura=0;
        retornarAltura(root,1);
        System.out.println();
        return altura;
    }
}
