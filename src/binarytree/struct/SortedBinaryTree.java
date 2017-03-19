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
public class SortedBinaryTree extends BinaryTree {

    public SortedBinaryTree() {
        super();
    }

    @Override
    public void insert(Integer value) throws DuplicateNodeException {
        setRoot(insert(getRoot(), value));
    }

    @Override
    public Node search(Integer value) {
        return search(getRoot(), value);
    }

    @Override
    public void delete(Integer value) {
        setRoot(delete(getRoot(), value));
    }

    @Override
    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.getLeftChild()), getHeight(root.getRightChild())) + 1;
    }

    private Node insert(Node subRoot, Integer value) throws DuplicateNodeException {
        if (subRoot == null) {
            subRoot = new Node(value);
        } else if (value.compareTo(subRoot.getElement()) < 0) {
            Node leftChild = insert(subRoot.getLeftChild(), value);
            subRoot.setLeftChild(leftChild);
        } else if (value.compareTo(subRoot.getElement()) > 0) {
            Node rightChild = insert(subRoot.getRightChild(), value);
            subRoot.setRightChild(rightChild);
        } else {
            throw new DuplicateNodeException("NODO DUPLICADO", null);
        }
        return subRoot;
    }

    private Node search(Node subRoot, Integer value) {
        if (subRoot == null) {
            return null;
        } else if (value.compareTo(subRoot.getElement()) == 0) {
            return subRoot;
        } else if (value.compareTo(subRoot.getElement()) < 0) {
            return search(subRoot.getLeftChild(), value);
        } else {
            return search(subRoot.getRightChild(), value);
        }
    }

    private Node delete(Node subRoot, Integer value) {
        if (subRoot == null) {
            subRoot = null;
        } else if (value.compareTo(subRoot.getElement()) < 0) {
            Node leftChild = delete(subRoot.getLeftChild(), value);
            subRoot.setLeftChild(leftChild);
        } else if (value.compareTo(subRoot.getElement()) > 0) {
            Node rightChild = delete(subRoot.getRightChild(), value);
            subRoot.setRightChild(rightChild);
        } else {  
            Node q;
            q = subRoot;
            if (q.getLeftChild() == null) {
                subRoot = q.getRightChild();
            } else if (q.getRightChild() == null) {
                subRoot = q.getLeftChild();
            } else {
                q = replace(q);
            }
            q = null;
        }
        return subRoot;
    }

    private Node replace(Node subRoot) {
        Node a, p;
        p = subRoot;
        a = subRoot.getLeftChild(); // rama de nodos menores
        while (a.getRightChild()!= null) {
            p = a;
            a = a.getRightChild();
        }
        subRoot.setElement(a.getElement());
        if (p.equals(subRoot)) {
            p.setLeftChild(a.getLeftChild());
        } else {
            p.setRightChild(a.getLeftChild());
        }
        return a;        
    }
}
