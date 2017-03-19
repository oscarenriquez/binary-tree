/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree.struct;

/**
 *
 * @author Oscar Enríquez
 */
public class Node implements Comparable<Node> {
    private Integer element;
    private Node leftChild;
    private Node rightChild;

    public Node(Integer element) {
        this.element = element;
    }

    public Node() {
    }
   
    public Integer getElement() {
        return element;
    }

    public void setElement(Integer element) {
        this.element = element;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public int compareTo(Node o) {
        return o.getElement().compareTo(this.getElement());
    }
        
}
