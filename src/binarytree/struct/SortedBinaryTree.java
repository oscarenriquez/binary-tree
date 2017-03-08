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

    public int getHeight(Node root) {
        if (root == null) {
            return 0;
        }
        return Math.max(getHeight(root.getLeftChild()), getHeight(root.getRightChild())) + 1;
    }

    protected Node insert(Node subRoot, Integer value) throws DuplicateNodeException {
        if (subRoot == null) {
            subRoot = new Node(value);
        } else if (value.compareTo(subRoot.getElement()) < 0) {
            Node leftChild = insert(subRoot.getLeftChild(), value);
            subRoot.setLeftChild(leftChild);
        } else if (value.compareTo(subRoot.getElement()) > 0) {
            Node rightChild = insert(subRoot.getRightChild(), value);
            subRoot.setRightChild(rightChild);
        } else {
            throw new DuplicateNodeException("DUPLICATE NODE", null);
        }
        return subRoot;
    }

    protected Node search(Node subRoot, Integer value) {
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
}
