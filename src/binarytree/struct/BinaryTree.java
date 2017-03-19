/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree.struct;

import binarytree.exception.DuplicateNodeException;

/**
 *
 * @author Oscar Enríquez
 */
public abstract class BinaryTree  {

    private Node root;

    public boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    
    public abstract int getHeight(Node root);
    
    public abstract void insert(Integer value) throws DuplicateNodeException;
    
    public abstract void delete(Integer value);
    
    public abstract Node search(Integer value);

}
