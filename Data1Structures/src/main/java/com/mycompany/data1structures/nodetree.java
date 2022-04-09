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
public class nodetree {
    private int id;
    private nodetree left;
    private nodetree right;

    public nodetree(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public nodetree getLeft() {
        return left;
    }

    public void setLeft(nodetree left) {
        this.left = left;
    }

    public nodetree getRight() {
        return right;
    }

    public void setRight(nodetree right) {
        this.right = right;
    }
}
