import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;
import javax.swing.JOptionPane;
public class SecretKeyGenerator extends javax.swing.JFrame {

    
    public SecretKeyGenerator() {
        initComponents();
        Engine();
        this.setLocation(400, 200);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textSecretKey = new javax.swing.JTextArea();
        buttonSave = new javax.swing.JButton();
        buttonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Key Generator");

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Secret Key", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(0, 0, 102))); // NOI18N

        textSecretKey.setColumns(20);
        textSecretKey.setRows(5);
        jScrollPane1.setViewportView(textSecretKey);

        buttonSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonSave.setForeground(new java.awt.Color(0, 0, 102));
        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        buttonExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        buttonExit.setForeground(new java.awt.Color(0, 0, 102));
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonExit, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(buttonSave, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void buttonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExitActionPerformed
        // Exit window
        this.dispose();
    }//GEN-LAST:event_buttonExitActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // Save the secret key to storage
        try{
                    //Get connection
                    Connection conn;
                    Class.forName("com.mysql.jdbc.Driver");
                    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_data_security", "root", "");
                    //JOptionPane.showMessageDialog(null, "Connection successful");
                    
                    
                    // set query
                    String query = "INSERT INTO secret_key(id, user_key) VALUES(?,?)";
                    PreparedStatement st = conn.prepareStatement(query);
    			st.setString(1, null);
    			st.setString(2, textSecretKey.getText());
                        
                        st.execute();
    			JOptionPane.showMessageDialog(null, "Data stored");
                        textSecretKey.setText(null);
    			st.close();
                        conn.close();
    		
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "error occured");
                } 
    }//GEN-LAST:event_buttonSaveActionPerformed
    //Declare array for secret key letter, digit and special character combination
    private char array[] = {'a','1','@','2','b','#','3','$','c','&','4',
        '%','d','5','?','e','6','+','f','7','#','g','8','h','@',
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
               textSecretKey.setText(sb.toString());
            }
            if(count++ == max){
                running = false;
                System.out.println("Finished: ");
            }// end of if statement
            
        }// end of while looping
        
    } // end of function Engine   
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecretKeyGenerator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonExit;
    private javax.swing.JButton buttonSave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textSecretKey;
    // End of variables declaration//GEN-END:variables
}
