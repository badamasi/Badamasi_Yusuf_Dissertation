
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Request_Database extends javax.swing.JFrame {

    /**
     * Creates new form Request_Database
     */
    public Request_Database() {
        initComponents();
        Show_Users_In_JTable();
        this.setLocation(200, 100);
    }
    public Connection getConnection(){
        Connection conn;
        try{
               
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_data_security", "root", "");
    		//JOptionPane.showMessageDialog(null, "Connection successful");
            return conn;
        }catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<RequestDatabase> getUsersList(){
        ArrayList<RequestDatabase> usersList = new ArrayList<RequestDatabase>();
        Connection conn = getConnection();
        
        String query = "SELECT * FROM request_table";
        ResultSet rs = null;
        Statement statement = null;
        
        try{
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            RequestDatabase admin;
            while(rs.next()){
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String nationality = rs.getString("nationality");
                String email = rs.getString("email");
                String mobile = rs.getString("mobile");
                String gender = rs.getString("gender");
                String maritalStatus = rs.getString("maritalStatus");
                String address = rs.getString("address");
                
                admin = new RequestDatabase(id, firstname, lastname, username, password, nationality, email, mobile, gender, maritalStatus, address);
                usersList.add(admin);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return usersList;
    }
    
    public void Show_Users_In_JTable(){
        ArrayList<RequestDatabase> list = getUsersList();
        DefaultTableModel model = (DefaultTableModel)requestTable.getModel();
        Object[] row = new Object[11]; 
        
        for (int i = 0; i<list.size(); i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getFirstName();
            row[2] = list.get(i).getLastName();
            row[3] = list.get(i).getUsername();
            row[4] = list.get(i).getPassword();
            row[5] = list.get(i).getNationality();
            row[6] = list.get(i).getEmail();
            row[7] = list.get(i).getMobile();
            row[8] = list.get(i).getGender();
            row[9] = list.get(i).getMaritalStatus();
            row[10] = list.get(i).getAddress();
            
            model.addRow(row);
        }
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        buttonClose = new javax.swing.JButton();
        btnDeny = new javax.swing.JButton();
        btnGrant = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Request Record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "firstname", "lastname", "username", "password", "nationality", "email", "mobile", "gender", "maritalStatus", "address"
            }
        ));
        jScrollPane1.setViewportView(requestTable);

        buttonClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonClose.setForeground(new java.awt.Color(0, 0, 153));
        buttonClose.setText("Close");
        buttonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCloseActionPerformed(evt);
            }
        });

        btnDeny.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeny.setForeground(new java.awt.Color(0, 0, 153));
        btnDeny.setText("Deny access");
        btnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDenyActionPerformed(evt);
            }
        });

        btnGrant.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGrant.setForeground(new java.awt.Color(0, 0, 153));
        btnGrant.setText("Grant access");
        btnGrant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrantActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGrant, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(btnDeny, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137)
                .addComponent(buttonClose, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonClose, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnDeny, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrant, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCloseActionPerformed
        // Close the window
        this.dispose();
    }//GEN-LAST:event_buttonCloseActionPerformed

    private void btnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDenyActionPerformed
        // View Deny Access form
        DenyAccess deny = new DenyAccess();
        deny.setVisible(true);
    }//GEN-LAST:event_btnDenyActionPerformed

    private void btnGrantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrantActionPerformed
        // View grant access form
        Grant_Access grant = new Grant_Access();
        grant.setVisible(true);
    }//GEN-LAST:event_btnGrantActionPerformed

   
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
            java.util.logging.Logger.getLogger(Request_Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Request_Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Request_Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Request_Database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Request_Database().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeny;
    private javax.swing.JButton btnGrant;
    private javax.swing.JButton buttonClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable requestTable;
    // End of variables declaration//GEN-END:variables
}
