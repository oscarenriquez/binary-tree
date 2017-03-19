/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import binarytree.exception.DuplicateNodeException;
import binarytree.struct.BinaryTree;
import binarytree.struct.Node;
import binarytree.struct.SortedBinaryTree;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Oscar Enríquez
 */
public class MainFrame extends javax.swing.JFrame {

    private BinaryTree tree;
    private DrawTree drawTree;

    public MainFrame() {
        try {
            initComponents();
            tree = new SortedBinaryTree();
            this.addComponentListener(new ComponentAdapter() {

                @Override
                public void componentResized(ComponentEvent e) {
                    super.componentResized(e);
                    if (drawTree != null) {
                        drawTree.setSize(new Dimension(contentTree.getWidth(), contentTree.getHeight()));
                        drawTree.repaint();
                    }
                }
            });
        } catch (Exception e) {
        }
    }

    public BinaryTree getTree() {
        return tree;
    }

    public void setTree(BinaryTree tree) {
        this.tree = tree;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTree = new javax.swing.JPanel();
        contentOptions = new javax.swing.JPanel();
        lblAgregarHoja = new javax.swing.JLabel();
        textAgregar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        lblBuscar = new javax.swing.JLabel();
        textBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblEliminar = new javax.swing.JLabel();
        textEliminar = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arbol Binario Ordenado");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));

        contentTree.setBackground(new java.awt.Color(204, 255, 51));

        javax.swing.GroupLayout contentTreeLayout = new javax.swing.GroupLayout(contentTree);
        contentTree.setLayout(contentTreeLayout);
        contentTreeLayout.setHorizontalGroup(
            contentTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        contentTreeLayout.setVerticalGroup(
            contentTreeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );

        contentOptions.setBackground(new java.awt.Color(0, 204, 51));

        lblAgregarHoja.setLabelFor(lblAgregarHoja);
        lblAgregarHoja.setText("AGREGAR NODO:");
        lblAgregarHoja.setName("lblAgregarHoja"); // NOI18N

        textAgregar.setName("textAgregarHoja"); // NOI18N

        btnAgregar.setText("AGREGAR");
        btnAgregar.setName("btnAgregar"); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        lblBuscar.setLabelFor(lblBuscar);
        lblBuscar.setText("BUSCAR:");

        textBuscar.setName("textBuscar"); // NOI18N

        btnBuscar.setText("BUSCAR");
        btnBuscar.setName("btnBuscar"); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblEliminar.setLabelFor(lblBuscar);
        lblEliminar.setText("ELIMINAR");

        textEliminar.setName("textBuscar"); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(255, 102, 102));
        btnEliminar.setForeground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("ELIMINAR:");
        btnEliminar.setName("btnBuscar"); // NOI18N
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contentOptionsLayout = new javax.swing.GroupLayout(contentOptions);
        contentOptions.setLayout(contentOptionsLayout);
        contentOptionsLayout.setHorizontalGroup(
            contentOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contentOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAgregarHoja, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(textAgregar)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textBuscar)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textEliminar)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contentOptionsLayout.setVerticalGroup(
            contentOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contentOptionsLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblAgregarHoja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(lblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(lblEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contentTree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentTree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contentOptions, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            String value = textAgregar.getText();
            tree.insert(Integer.valueOf(value));
            textAgregar.setText("");

            if (drawTree == null) {
                drawTree = new DrawTree(tree);
                drawTree.setSize(new Dimension(contentTree.getWidth(), contentTree.getHeight()));
                drawTree.setBackground(Color.YELLOW);
                contentTree.add(drawTree, BorderLayout.CENTER);
            }
            drawTree.setSearch(false);
            drawTree.setToSearch(null);
            drawTree.repaint();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "VALOR INVALIDO", "WARNING", JOptionPane.WARNING_MESSAGE);
        } catch (DuplicateNodeException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            String value = textBuscar.getText();
            Node node = tree.search(Integer.valueOf(value));
            textBuscar.setText("");

            if (node == null) {
                JOptionPane.showMessageDialog(this, "NO EXISTE EL NODO", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            } else {
                drawTree.setSearch(true);
                drawTree.setToSearch(value);
                drawTree.repaint();
                JOptionPane.showMessageDialog(this, "BUSQUEDA EXITOSA", "INFORMATION", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "VALOR INVALIDO", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            String value = textEliminar.getText();
            tree.delete(Integer.valueOf(value));
            textEliminar.setText("");
            
            drawTree.setSearch(false);
            drawTree.setToSearch(null);
            drawTree.repaint();

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "VALOR INVALIDO", "WARNING", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel contentOptions;
    private javax.swing.JPanel contentTree;
    private javax.swing.JLabel lblAgregarHoja;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblEliminar;
    private javax.swing.JTextField textAgregar;
    private javax.swing.JTextField textBuscar;
    private javax.swing.JTextField textEliminar;
    // End of variables declaration//GEN-END:variables
}
