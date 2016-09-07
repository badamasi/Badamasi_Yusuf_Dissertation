
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Grant_Access extends javax.swing.JFrame {

    String secretKey = "";
    public Grant_Access() {
        initComponents();
        Engine();
        this.setLocation(400, 200);
    }

    //Declare array for secret key letter, digit and special character combination
    private char array[] = {'a','1','A','@','2','b','#','B','3','$','c','&','C','4',
        '%','d','5','D','?','E','e','6','E','+','f','7','#','F','g','8','h','@','G',
        '9','i','!','j','k','l','m','n','o','p','q','r','s','t','u',
        'v','w','x','y','z'};
   
    //functoion to return Array data length
    private char getRandomCharacter(){
        return array[random(array.length)];
    }
    //function to generate random key
    private int random(int length){
        return new Random().nextInt(length);
    }
    // function that will determine key length
    protected void Engine(){
        boolean running = true;
        int count = 0;
        int max = 200;
        while(running){
            StringBuilder sb = new StringBuilder();
            //int size = random(8)+random(8);
            for(int i=0; i<6; i++){
               sb.append(getRandomCharacter());
               secretKey = (sb.toString());
            }
            if(count++ == max){
                running = false;
                System.out.println("Finished: ");
            }// end of if statement
            
        }// end of while looping
        
    } // end of function Engine
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textId = new javax.swing.JTextField();
        buttonGrant = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New User ");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grant new user access", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Enter user ID:");

        textId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        textId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textIdActionPerformed(evt);
            }
        });

        buttonGrant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonGrant.setForeground(new java.awt.Color(0, 0, 153));
        buttonGrant.setText("Grant");
        buttonGrant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGrantActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(0, 0, 153));
        buttonExit.setText("Exit");
        buttonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonGrant, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textId, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGrant, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textIdActionPerformed

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // Exit window
        this.dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonGrantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGrantActionPerformed
        // Grant new user acess
        // Remove admin record
        int count = 0;
        String firstname, lastname, password, nationality, email, mobile, gender, address;
        String name, password1, email1, mobile1, gender1;
        firstname = null;
        lastname = null;
        password = null;
        nationality = null;
        email = null;
        mobile = null;
        gender = null;
        address = null;
        name = null;
        password1 = null;
        email1 = null;
        mobile1 = null;
        gender1 = null;
        
        String num = textId.getText();
        int res = Integer.parseInt(num);
        try{
    		//Get connection
    		Connection conn;
    		Class.forName("com.mysql.jdbc.Driver");
    		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_data_security", "root", "");
    		//JOptionPane.showMessageDialog(null, "Connection successful");
    		
    		// set query
               
                
                ResultSet rs = null;
                Statement st = null;
    		String query = "SELECT * FROM request_table WHERE id = '"+res+"'";
                    st = conn.createStatement();
                    rs = st.executeQuery(query);
            
            while(rs.next()){
                
                firstname = rs.getString("firstname");
                lastname = rs.getString("lastname");
                //String username = rs.getString("username");
                password = rs.getString("password");
                nationality = rs.getString("nationality");
                email = rs.getString("email");
                mobile = rs.getString("mobile");
                gender = rs.getString("gender");
               // String maritalStatus = rs.getString("maritalStatus");
                address = rs.getString("address");
                
                
            }
        
                st.close();
                conn.close();
    		
    	}catch(Exception e){
    		JOptionPane.showMessageDialog(null, "error occured");
    	} 
        try{
            Connection conn;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_data_security", "root", "");
                // set query
            ResultSet rs = null;
                Statement statement = null;
    		String query1 = "SELECT * FROM cloud_users";
                statement = conn.createStatement();
                rs = statement.executeQuery(query1);
                while(rs.next()){
                    name = rs.getString("name");
                    password1 = rs.getString("password");
                    email1 = rs.getString("email_id");
                    mobile1 = rs.getString("phone_number");
                    gender1 = rs.getString("gender");
                    if(name.equals(firstname + " " + lastname) && password1.equals(password) && mobile1.equals(mobile)
                        && gender1.equals(gender)){
                        count = count + 1;
                        
                    }
                }
                if(count > 0){
                    JOptionPane.showMessageDialog(null, "Grant access failed! User exist already");
                }
                else{
                    try{
                        Connection conn1;
                        Class.forName("com.mysql.jdbc.Driver");
                        conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_data_security", "root", "");
                        // set query
                        String query = "INSERT INTO cloud_users(id, name, email_id, phone_number, password, gender, nationality, address ) VALUES(?,?,?,?,?,?,?,?)";
                        PreparedStatement st = conn1.prepareStatement(query);
                        st.setString(1, null);
                        st.setString(2, firstname + " " + lastname);
                        st.setString(3, email);
                        st.setString(4, mobile);
                        st.setString(5, password);
                        st.setString(6, gender);
                        st.setString(7, nationality);
                        st.setString(8, address);
                        st.execute();
    		
                        // Email composer source code
                        String user = "Username: "+email;
                        String pass = "Password: "+password;
                        String key1 = "secret key: "+secretKey;
                        String subject = "Access granted";
                        EmailSender es = new EmailSender(email, subject, (user+System.lineSeparator()+pass+System.lineSeparator()+key1));
                        textId.setText(null);
                        String query2 = "INSERT INTO secret_key(id, user_key) VALUES(?,?)";
                        PreparedStatement st1 = conn1.prepareStatement(query2);
                        st1.setString(1, null);
                        st1.setString(2, secretKey);
                        st1.execute();
                        JOptionPane.showMessageDialog(null, "New user access granted");
                        st.close();
                        st1.close();
                        conn1.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
            }
        }catch(Exception ex){
            ex.printStackTrace();
        } 
    }//GEN-LAST:event_buttonGrantActionPerformed
     
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
            java.util.logging.Logger.getLogger(Grant_Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grant_Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grant_Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grant_Access.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grant_Access().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonGrant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textId;
    // End of variables declaration//GEN-END:variables
}
