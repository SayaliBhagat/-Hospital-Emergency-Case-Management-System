/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.Business;
import Business.Enterprise.Enterprise;
import Business.Organisation.Organization;
import Business.UserAccount.UserAccount;
import Business.DB4OUtil.DB4OUtil;
import Business.Network.Network;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author puja_
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private Business business;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public MainJFrame() {
         
        initComponents();
         business = dB4OUtil.retrieveSystem();
//        business = ConfigureABusiness.configure();
        this.setSize(1680, 1050);
        
            
        
    }
 private Matcher matcher;
   
    private final Pattern patternUsername = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]", Pattern.CASE_INSENSITIVE);
    private final Pattern patternPassword = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]");
    
    public boolean validateUsername(final String username){
		  
		  matcher = patternUsername.matcher(username);
		  return matcher.matches();
	    	    
	  }
          
           public boolean validatePassword(final String password){
		  
		  matcher = patternPassword.matcher(password);
		  return matcher.matches();
	    	    
	  }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        leftPanel = new javax.swing.JPanel();
        userName = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        pswdLabel = new javax.swing.JLabel();
        pswdField = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        rightPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane2.setBackground(new java.awt.Color(0, 102, 153));

        leftPanel.setBackground(new java.awt.Color(255, 255, 255));
        leftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userName.setBackground(new java.awt.Color(153, 153, 153));
        userName.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        userName.setForeground(new java.awt.Color(153, 153, 153));
        userName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/Webp.net-resizeimage (6).png"))); // NOI18N
        userName.setText("User Name:");
        leftPanel.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 40));

        usernameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTxtActionPerformed(evt);
            }
        });
        leftPanel.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 212, 40));

        pswdLabel.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        pswdLabel.setForeground(new java.awt.Color(153, 153, 153));
        pswdLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/pass).png"))); // NOI18N
        pswdLabel.setText("Password:");
        leftPanel.add(pswdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 120, 30));
        leftPanel.add(pswdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, 40));

        loginBtn.setBackground(new java.awt.Color(255, 255, 255));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/login.png"))); // NOI18N
        loginBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginBtn.setBorderPainted(false);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.setHideActionText(true);
        loginBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        leftPanel.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 140, 60));

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/logout.png"))); // NOI18N
        logoutBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logoutBtn.setBorderPainted(false);
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        leftPanel.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 140, 60));

        jSplitPane2.setLeftComponent(leftPanel);

        rightPanel.setBackground(new java.awt.Color(4, 126, 187));
        rightPanel.setLayout(new java.awt.CardLayout());

        jLabel3.setBackground(new java.awt.Color(0, 51, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ObjectModel/medical-devices-575.v1.gif"))); // NOI18N
        rightPanel.add(jLabel3, "card2");

        jSplitPane2.setRightComponent(rightPanel);

        getContentPane().add(jSplitPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
       
        if(!validateUsername(usernameTxt.getText())){
            JOptionPane.showMessageDialog(null, "Not a valid Username!");
        return;
        }
        else{
            business.setName(usernameTxt.getText());
            
        }
        String password = String.valueOf(pswdField.getPassword());
        if(!validatePassword(password)){
            JOptionPane.showMessageDialog(null, "Not a valid Password!");
            return;
        } else {
          char[] passwordCharArray = pswdField.getPassword();
            password = String.valueOf(passwordCharArray);   
       
        // Get Password
       
        
        
           // Get user name
        String userName = usernameTxt.getText();     
        
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount=business.getUserAccountDirectory().authenticateUser(userName, password);
        
        Enterprise inEnterprise=null;
        Organization inOrganization=null;
        
        if(userAccount==null){
            //Step 2: Go inside each network and check each enterprise
            for(Network network:business.getNetworkList()){
                //Step 2.a: check against each enterprise
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if(userAccount==null){
                       //Step 3:check against each organization for each enterprise
                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                           if(userAccount!=null){
                               inEnterprise=enterprise;
                               inOrganization=organization;
                               break;
                           }
                       }
                        
                    }
                    else{
                       inEnterprise=enterprise;
                       break;
                    }
                    if(inOrganization!=null){
                        break;
                    }  
                }
                if(inEnterprise!=null){
                    break;
                }
            }
        }
        
        if(userAccount==null){
            JOptionPane.showMessageDialog(null, "Invalid credentials");
            return;
        }
        else{
            
            CardLayout layout=(CardLayout)rightPanel.getLayout();
            rightPanel.add("workArea",userAccount.getRole().createWorkArea(rightPanel, userAccount, inOrganization, business, inEnterprise));
            layout.next(rightPanel);
        }
        
        
        loginBtn.setEnabled(false);
        logoutBtn.setEnabled(true);
        usernameTxt.setEnabled(false);
        pswdField.setEnabled(false);
    }//GEN-LAST:event_loginBtnActionPerformed
    }
    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
     logoutBtn.setEnabled(false);
        usernameTxt.setEnabled(true);
        pswdField.setEnabled(true);
        loginBtn.setEnabled(true);

        usernameTxt.setText("");
        pswdField.setText("");

        rightPanel.removeAll();
        JPanel blankJP = new JPanel();
        rightPanel.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) rightPanel.getLayout();
        crdLyt.next(rightPanel);
        dB4OUtil.storeSystem(business);
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void usernameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTxtActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPasswordField pswdField;
    private javax.swing.JLabel pswdLabel;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JLabel userName;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
