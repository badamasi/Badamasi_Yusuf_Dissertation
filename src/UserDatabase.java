
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER
 */
public class UserDatabase extends javax.swing.JFrame {

    /**
     * Creates new form UserDatabase
     */
    public UserDatabase() {
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
    
    public ArrayList<User> getUsersList(){
        ArrayList<User> usersList = new ArrayList<User>();
        Connection conn = getConnection();
        
        String query = "SELECT * FROM cloud_users";
        ResultSet rs = null;
        Statement statement = null;
        
        try{
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            User user;
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email_id");
                String phone = rs.getString("phone_number");
                String pass = rs.getString("password");
                String gend = rs.getString("gender");
                String nat = rs.getString("nationality");
                String add = rs.getString("address");
                
                user = new User(id, name, email, phone, pass, gend, nat, add);
                usersList.add(user);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return usersList;
    }
    
    public void Show_Users_In_JTable(){
        ArrayList<User> list = getUsersList();
        DefaultTableModel model = (DefaultTableModel)jUserTable.getModel();
        Object[] row = new Object[8]; 
        
        for (int i = 0; i<list.size(); i++){
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getEmail();
            row[3] = list.get(i).getPhone();
            row[4] = list.get(i).getPass();
            row[5] = list.get(i).getGend();
            row[6] = list.get(i).getNationality();
            row[7] = list.get(i).getAddress();
            
            model.addRow(row);
        }
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jUserTable = new javax.swing.JTable();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Table");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "User record", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(204, 204, 0))); // NOI18N

        jUserTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "name", "email", "phone number", "password", "gender", "nationality", "address"
            }
        ));
        jScrollPane1.setViewportView(jUserTable);

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(0, 51, 153));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(323, 323, 323))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // close the window
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

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
            java.util.logging.Logger.getLogger(UserDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDatabase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserDatabase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jUserTable;
    // End of variables declaration//GEN-END:variables
}
