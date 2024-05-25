/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flying_potato;

import java.io.File;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Rameshwar
 */
public class DeleteItem extends javax.swing.JFrame {

    private String filename;

    /**
     * Creates new form DeleteItem
     */
    public DeleteItem() {
        initComponents();
        this.setTitle("Delete Item");
        this.setLocationRelativeTo(null);
        this.pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        type = new javax.swing.ButtonGroup();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        hprice = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        itemsearch = new javax.swing.JTextField();
        searchname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jRadioButton1.setText("Veg");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Non-Veg");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        back.setText("Close");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        hprice.setEditable(false);
        hprice.setEnabled(false);

        name.setEditable(false);
        name.setEnabled(false);

        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sanskrit Text", 0, 18)); // NOI18N
        jLabel3.setText("Type:");

        jLabel5.setFont(new java.awt.Font("Sanskrit Text", 0, 18)); // NOI18N
        jLabel5.setText("Full Price:");

        fprice.setEditable(false);
        fprice.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Sanskrit Text", 0, 18)); // NOI18N
        jLabel4.setText("Half Price:");

        jLabel1.setFont(new java.awt.Font("Sanskrit Text", 1, 20)); // NOI18N
        jLabel1.setText("Delete Menu Item");

        jLabel6.setFont(new java.awt.Font("Sanskrit Text", 0, 16)); // NOI18N
        jLabel6.setText("Enter Item Name");

        jLabel2.setFont(new java.awt.Font("Sanskrit Text", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        itemsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                itemsearchKeyReleased(evt);
            }
        });

        searchname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchnameMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(back)
                        .addGap(72, 72, 72)
                        .addComponent(delete))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))
                                    .addComponent(hprice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fprice, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(itemsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(searchname)))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1)
                    .addComponent(itemsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(searchname)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(hprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(back))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void search(){
        try
        {
            String sql = "select * from menuitem where Item_Name=?;";
            String url = "jdbc:mysql://localhost:3306/flyingpotato";
            Connection con=DriverManager.getConnection(url, "root","root");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,itemsearch.getText());
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                name.setText(rs.getString("Item_Name"));
                hprice.setText(rs.getString("Half_price"));
                fprice.setText(rs.getString("Full_price"));
                if(rs.getString("Item_Type").equals("Veg"))
                    jRadioButton1.setSelected(true);
                if(rs.getString("Item_Type").equals("Non-Veg"))
                    jRadioButton2.setSelected(true);
                filename=rs.getString("Image_Location");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Item Not Found.");
                itemsearch.setText(null);
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        foodtype="Veg";
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        search();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        if(name.getText().length()<=0 || type.toString().length()<=0 || hprice.getText().length()<=0 ||fprice.getText().length()<=0)
        {
            JOptionPane.showMessageDialog(null, "Fill all details");
        }
        else
        {
            try
            {
                String sql = "delete from menuitem where Item_Name=?";
                String url = "jdbc:mysql://localhost:3306/flyingpotato";
                Connection con=DriverManager.getConnection(url, "root","root");
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,itemsearch.getText());
                int a=ps.executeUpdate();
                if(a>0)
                {
                    JOptionPane.showMessageDialog(null,"Delete Sucessfull!!");
                    new copyimage().delete(filename);
                    name.setText(null);
                    type.clearSelection();
                    hprice.setText(null);
                    fprice.setText(null);
                    itemsearch.setText(null);
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Missing Data..");
                }
            }
            catch(SQLException e)
            {
                if(e instanceof SQLSyntaxErrorException)
                {

                }
                else
                {
                    JOptionPane.showMessageDialog(null,e);
                }
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        foodtype="Non-Veg";
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void itemsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_itemsearchKeyReleased
        try
        {
            String sql = "SELECT Item_Name FROM menuitem WHERE Item_Name LIKE CONCAT('%%',?,'%%') ;";
            String url = "jdbc:mysql://localhost:3306/flyingpotato";
            Connection con=DriverManager.getConnection(url, "root","root");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,itemsearch.getText());
            ResultSet rs=ps.executeQuery();
            if(itemsearch.getText().length()>=2)
            {
                if(rs.next())
                {
                    searchname.setText(rs.getString("Item_Name"));
                }
                else
                {
                    searchname.setText("Not Found.");
                }
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_itemsearchKeyReleased

    private void searchnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchnameMouseClicked
        itemsearch.setText(searchname.getText());
        search();
        searchname.setText(null);
    }//GEN-LAST:event_searchnameMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteItem().setVisible(true);
            }
        });
    }
    
    private String  foodtype;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JTextField fprice;
    private javax.swing.JTextField hprice;
    private javax.swing.JTextField itemsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel searchname;
    private javax.swing.ButtonGroup type;
    // End of variables declaration//GEN-END:variables
}