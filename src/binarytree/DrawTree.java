/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import binarytree.struct.BinaryTree;
import binarytree.struct.Node;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Oscar Enríquez
 */
public class DrawTree extends JPanel {

    private final int PADDING = 10;
    private final String MAX_STRING = "999";
    private BinaryTree binaryTree;
    private boolean search;
    private String toSearch;

    public DrawTree(BinaryTree tree) {
        this.binaryTree = tree;
    }

    public BinaryTree getBinaryTree() {
        return binaryTree;
    }

    public void setBinaryTree(BinaryTree binaryTree) {
        this.binaryTree = binaryTree;
    }

    public boolean isSearch() {
        return search;
    }

    public void setSearch(boolean search) {
        this.search = search;
    }    

    public String getToSearch() {
        return toSearch;
    }

    public void setToSearch(String toSearch) {
        this.toSearch = toSearch;
    }        

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setFont(new Font("Arial", Font.BOLD, 20));        
        DrawTree(g, 0, getWidth(), 0, getHeight() / binaryTree.getHeight(binaryTree.getRoot()), 0, 0, binaryTree.getRoot());
    }

    public void DrawTree(Graphics g, int StartWidth, int EndWidth, int StartHeight, int Level, int x, int y, Node node) {
        String data = String.valueOf(node.getElement());
        g.setFont(new Font("Arial", Font.BOLD, 20));
        if(isSearch() && data.equalsIgnoreCase(getToSearch())) {
            g.setColor(Color.RED);
        } else {
            g.setColor(Color.BLACK);
        }        
        FontMetrics fm = g.getFontMetrics();
        int dataWidth = fm.stringWidth(data);
        int ovalWidht = fm.stringWidth(MAX_STRING) + PADDING;

        g.drawOval((StartWidth + EndWidth) / 2 - ovalWidht / 2, StartHeight + ((Level - (ovalWidht + 10)) / 2), ovalWidht, ovalWidht);
        g.drawString(data, (StartWidth + EndWidth) / 2 - dataWidth / 2, StartHeight + Level / 2);
        
        int nextX = (StartWidth + EndWidth) / 2;
        int nextY = StartHeight + Level / 2;
        
        if(x > 0 && y > 0) {
            g.drawLine(x, y, nextX, nextY);
        }
        
        if (node.getLeftChild() != null) {                        
            DrawTree(g, StartWidth, (StartWidth + EndWidth) / 2, StartHeight + Level, Level, nextX, nextY, node.getLeftChild());
        }

        if (node.getRightChild() != null) {            
            DrawTree(g, (StartWidth + EndWidth) / 2, EndWidth, StartHeight + Level, Level, nextX, nextY, node.getRightChild());
        }
    }

}
