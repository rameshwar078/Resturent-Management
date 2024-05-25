
package flying_potato;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author rames
 */
public class loginpage extends javax.swing.JFrame {

    public String uname;
    public String cid;

    /**
     * Creates new form loginpage
     */
    public loginpage() {
        initComponents();
        this.setTitle("Login Page");
        this.setLocationRelativeTo(null);
        this.pack();
        forgetpass.setVisible(false);
        
    }
    //public String cid;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLable1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        loginid = new javax.swing.JTextField();
        JLable2 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        message = new javax.swing.JLabel();
        forgetpass = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLable1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JLable1.setForeground(new java.awt.Color(255, 255, 255));
        JLable1.setText("Login ID:");
        getContentPane().add(JLable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 111, -1, -1));

        jLabel1.setFont(new java.awt.Font("Chiller", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setText("Welcome To Flying Potato");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        loginid.setToolTipText("");
        loginid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginidMouseClicked(evt);
            }
        });
        getContentPane().add(loginid, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 113, 200, -1));

        JLable2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        JLable2.setForeground(new java.awt.Color(255, 255, 255));
        JLable2.setText("Password:");
        getContentPane().add(JLable2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 147, -1, -1));

        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 149, 200, -1));

        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 205, -1, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 205, -1, -1));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        getContentPane().add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 205, -1, -1));

        message.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        message.setForeground(new java.awt.Color(255, 0, 0));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 177, 288, 22));

        forgetpass.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        forgetpass.setForeground(new java.awt.Color(255, 0, 0));
        forgetpass.setText("Forget Password !!");
        forgetpass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgetpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                forgetpassMouseClicked(evt);
            }
        });
        getContentPane().add(forgetpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flying_potato/image/fhspu0tc.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 460, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forgetpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_forgetpassMouseClicked
        new forget().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_forgetpassMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        loginid.setText(null);
        password.setText(null);
        message.setText(null);
        forgetpass.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new regestration().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void loginidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginidMouseClicked
        message.setText(null);
        forgetpass.setVisible(false);
    }//GEN-LAST:event_loginidMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        message.setText(null);
        forgetpass.setVisible(false);
    }//GEN-LAST:event_passwordMouseClicked

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        if(loginid.getText().length()<=0 || password.getText().length()<=0)
        {
            message.setText("ID and Password can not be Empty !!!");
        }
        else
        {
            
            try
            {            
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyingpotato", "root", "root");
            PreparedStatement ps=con.prepareCall("select * from costumer where Email=? and Passwords=?");
            ps.setString(1, loginid.getText());
            ps.setString(2, password.getText());
            ps.execute("delete from temp");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {
                PreparedStatement pst=con.prepareCall("insert into temp values(?,?,?);");
                pst.setString(1, rs.getString("C_ID"));
                pst.setString(2, rs.getString("First_Name")+" "+rs.getString("Last_Name"));
                pst.setString(3,rs.getString("Email"));
                pst.execute();
                JOptionPane.showMessageDialog(null,"Welcome "+rs.getString("First_Name"));
                new homepage().setVisible(true);
                this.hide();
            }
            else
            {
                message.setText("Wrong ID or Password!!!");
                forgetpass.setVisible(true);
            }
            }
            catch(SQLException e)
            {
                if(e instanceof SQLSyntaxErrorException)
                {
                    try
                    {
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/flyingpotato", "root", "root");
                        PreparedStatement pse=con.prepareCall("create table temp(ID int,Name char(25) unique,Email char(25));");
                        pse.execute();
                    }
                    catch(SQLException ee)
                    {
                        
                    }
                }
                else
                {
                     JOptionPane.showMessageDialog(null,e);
                }
            }
        }                                     
    }//GEN-LAST:event_submitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLable1;
    private javax.swing.JLabel JLable2;
    private javax.swing.JLabel forgetpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField loginid;
    private javax.swing.JLabel message;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

}