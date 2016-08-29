
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
public class Login_form extends javax.swing.JFrame {
    
    //variable declaration for time and date.
    int count = 0;
    int runTime = 0;
    int day, month, year;
    int second, minute, hour;
    
    //creating object for calender
    Calendar cl = new GregorianCalendar();
    
    // start of contructor
    public Login_form() {
        //component initialization
        initComponents();
        this.setLocation(200, 100);
        
        try{
            //get current day, month and year
            day = cl.get(Calendar.DAY_OF_MONTH);
            month = cl.get(Calendar.MONDAY);
            year = cl.get(Calendar.YEAR);
            String date = day+"-"+(month+1)+"-"+year;
            labelDate.setText("Date: "+date);
        }catch(Exception e){
            e.printStackTrace();
        }
        //start new thread
        new Thread(){
            public void run(){
                while(runTime == 0){
                    Calendar c = new GregorianCalendar();
                    
                    second = c.get(Calendar.SECOND);
                    minute = c.get(Calendar.MINUTE);
                    hour = c.get(Calendar.HOUR);
                    int AM_PM = c.get(Calendar.AM_PM);
                    
                    String day_night = "";
                    if(AM_PM == 1){
                        day_night = "PM";
                    }else{
                        day_night = "AM";
                    }
                    // variable declaration for time
                    String time = hour+":"+minute+":"+second;
                    //set date and time into Label name labelTime
                    labelTime.setText("Time: "+time+" "+day_night);
                }
            }
        }.start();
    }//end of contructor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jcbLoginType = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        btnClose = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        labelDate = new javax.swing.JLabel();
        labelTime = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        textFirstName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        textUsername = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        textMobile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAddress = new javax.swing.JTextArea();
        textMaritalStatus = new javax.swing.JComboBox();
        textGender = new javax.swing.JComboBox();
        buttonSubmit = new javax.swing.JButton();
        buttonReset = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        cbbNationality = new javax.swing.JComboBox();
        textPassword = new javax.swing.JPasswordField();
        textConfirm = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SYSTEM HOME PAGE");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 102));
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Login Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 153))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Login Type:");

        jcbLoginType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcbLoginType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "User" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Username:");

        txtUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Password:");

        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 153));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(0, 0, 153));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnClose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnClose.setForeground(new java.awt.Color(51, 0, 153));
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbLoginType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbLoginType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date and Time", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N

        labelDate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelDate.setForeground(new java.awt.Color(0, 0, 153));

        labelTime.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTime.setForeground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTime, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                    .addComponent(labelDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(labelDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTime)
                .addGap(21, 21, 21))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 153));
        jLabel17.setText("ENSURE DATA STORAGE SECURITY IN CLOUD COMPUTING ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 153));
        jLabel18.setText("WITH ADVANCE ENCRYPTION STANDARD AND AUTHENTICATION SCHEME");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/img3.jpg"))); // NOI18N

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cloudsecurity.jpg"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cloud12.jpg"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cloud11.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel18))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Home Page", jPanel6);

        jPanel7.setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Welcome to new user request form");

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter your details below", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 153))); // NOI18N

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 153));
        jLabel22.setText("First Name:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 153));
        jLabel23.setText("Last Name:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(0, 0, 153));
        jLabel24.setText("UserName:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 0, 153));
        jLabel25.setText("Password:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(0, 0, 153));
        jLabel26.setText("Confirm pswd:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 0, 153));
        jLabel27.setText("Email:");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 153));
        jLabel28.setText("Mobile No:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 0, 153));
        jLabel29.setText("Gender:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 153));
        jLabel30.setText("Marital Status:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 153));
        jLabel31.setText("Full Address:");

        textFirstName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        textLastName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        textUsername.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });

        textEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        textMobile.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        textAddress.setColumns(20);
        textAddress.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        textAddress.setRows(5);
        jScrollPane1.setViewportView(textAddress);

        textMaritalStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textMaritalStatus.setForeground(new java.awt.Color(0, 0, 153));
        textMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Married" }));

        textGender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        textGender.setForeground(new java.awt.Color(0, 0, 153));
        textGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        buttonSubmit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSubmit.setForeground(new java.awt.Color(0, 0, 153));
        buttonSubmit.setText("Submit");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });

        buttonReset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonReset.setForeground(new java.awt.Color(0, 0, 204));
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 0, 153));
        jLabel32.setText("Nationality:");

        cbbNationality.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cbbNationality.setForeground(new java.awt.Color(0, 0, 153));
        cbbNationality.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Afghanistan", "Armenia", "Azerbaijan", "Bahrain", "Bangladesh", "Bhutan", "Brunei", "Cambodia", "China", "Cyprus", "Georgia", "India", "Indonesia", "Iran", "Iraq", "Israel", "Japan", "Jordan", "Kazakhstan", "Kuwait", "Kyrgyzstan", "Laos", "Lebanon", "Malaysia", "Maldives", "Mongolia", "Myanmar (Burma)", "Nepal", "North Korea", "Oman", "Pakistan", "Palestine", "Philippines", "Qatar", "Russia", "Saudi Arabia", "Singapore", "South Korea", "Sri Lanka", "Syria", "Taiwan", "Tajikistan", "Thailand", "Timor-Leste", "Turkey", "Turkmenistan", "United Arab Emirates (UAE)", "Uzbekistan", "Vietnam", "Yemen" }));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel22))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel32))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbbNationality, 0, 233, Short.MAX_VALUE)
                            .addComponent(textConfirm))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(textMaritalStatus, 0, 233, Short.MAX_VALUE)
                            .addComponent(textGender, 0, 233, Short.MAX_VALUE)
                            .addComponent(textMobile, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(textEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel27)
                    .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel28)
                    .addComponent(textMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel29)
                    .addComponent(textGender, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel30)
                    .addComponent(textMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(textConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(jLabel31)))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(cbbNationality, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(323, 323, 323)
                .addComponent(jLabel1)
                .addContainerGap(258, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("New Request", jPanel7);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(0, 51, 153));
        jLabel34.setText("ENSURE DATA STORAGE SECURITY IN CLOUD COMPUTING");
        jLabel34.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("WITH ADVANCED ENCRYPTION STANDARD AND AUDITING SCHEME");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/datasecurity.jpg"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/aim.jpg"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/storage_evolution.jpg"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("DESIGNED BY: BADAMASI YUSUF MASTER IN SOFTWARE ENGINEERING (ID:77172239)");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("                                                             Copywright @ badamasiyusuf611@gmial.com All right reserved");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34)
                .addGap(191, 191, 191))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(176, 176, 176)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("About", jPanel8);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 904, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Login source code:
        //varaible declaration for login type
        String selection = (String)jcbLoginType.getSelectedItem();
        
        //Get object for database connection and data retrieval
        Connection conn;
        String user = null;
        String pass = null;
        ResultSet result = null;
        Statement statement = null;
        // Variable declaration to hold username and password entered by users
        String text1 = txtUsername.getText();
        String text2 = txtPassword.getText();
 
        try{
            //Get connection
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_data_security", 
                        "root", "");
            // test to check if username or password field is empty
            if(text1.equals("") || text2.equals("")){
                JOptionPane.showMessageDialog(null, "Username and password field must not be empty");
                txtUsername.setText(null);
                txtPassword.setText(null);
            }
            // if selection is equal to user
            else if (selection.equals("User")){
                // set and execute query
                String query = "SELECT * FROM cloud_users";
                statement = conn.createStatement();
                result = statement.executeQuery(query);
                 // check if there are more users in the database       
                while(result.next()){
                    user = result.getString("email_id");
                    pass = result.getString("password");
                     // check if username and password is valid       
                    if (text1.equals(user) && text2.equals(pass)){
                        count = count + 1;
                        JOptionPane.showMessageDialog(null, "Welcome access granted");
                        
                        //create next page object 
                        User_Authentication2 userAuth1 = new User_Authentication2();
                        //set the next page to be visible
                        userAuth1.setVisible(true);
                        // hide the current page
                        this.dispose();
                    }
                }
                // if username or password entered is not currect
                if (count < 1){
                    JOptionPane.showMessageDialog(null, "Invalid username or password"); 
                    txtUsername.setText(null);
                    txtPassword.setText(null);
                }         
            }
           // Check if selection is equavalent to admin 
           else if (selection.equals("Administrator")){
                 // set and execute query   
                String query = "SELECT * FROM administrator";
                statement = conn.createStatement();
                result = statement.executeQuery(query);
                        
                while(result.next()){
                    user = result.getString("username");
                    pass = result.getString("password");
                    
                     // check if username and password is valid      
                    if (text1.equals(user)&&text2.equals(pass)){
                        count = count + 1;
                        JOptionPane.showMessageDialog(null, "Welcome access granted");
                        User_Authentication userAuth = new User_Authentication();
                        userAuth.setVisible(true);
                                
                        this.dispose();
                    }          
                } 
                 // dispaly error if admin username or password entered is wrong              
                if (count < 1){
                    JOptionPane.showMessageDialog(null, "Invalid username or password"); 
                    txtUsername.setText(null);
                    txtPassword.setText(null);
                }           
            } 
            // Close the connection
            result.close();
            statement.close();
            conn.close(); 	
    	}//end of try next is catch operation if error found 
        catch(Exception e){
            // if execution is not successful
            JOptionPane.showMessageDialog(null, "Execution failed!");  
    	} //end of catch operation  
       
    }//GEN-LAST:event_btnLoginActionPerformed
    //end of login function
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // clear text field data
        txtUsername.setText(null);
        txtPassword.setText(null);
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // close the window
       this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsernameActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        // Submit user request information
        // Variable declaration
            int min = 8;
            int max = 16;
            int digit = 0;
            int special = 0;
            int up = 0;
            int lo = 0;
        // varaible to hold password entered by user
            String password = textPassword.getText();
            String confirmPassword = textConfirm.getText();
            
        // test password length
        if(password.length() >= min && password.length()<= max){
            for(int i = 0; i < password.length(); i++){
                char letter = password.charAt(i);
                if(Character.isUpperCase(letter)){
                    up++;
                }
                if(Character.isLowerCase(letter)){
                    lo++;
                }
                if(Character.isDigit(letter)){
                    digit++;
                }
                if(letter >= 33 && letter <= 44 || letter == 64){
                    special++;
                }
            }    
        }
        
        // Check if the password length is less than 8 or greater than 16
        if(password.length() < min || password.length()> max){
            JOptionPane.showMessageDialog(null, "Password must be within  8 to 16 length");
            textPassword.setText(null);
            textConfirm.setText(null);
            
        }
        // Check if the password entered are not equal
        else if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(null, "Password doesn't match");
            textPassword.setText(null);
            textConfirm.setText(null);
        }
        // check to make sure that password contained at least one digit, 
        //letter and special character
        else  if(up < 1 || lo < 1 || digit < 1 || special < 1){
            JOptionPane.showMessageDialog(null, "Password must have atleast one Uppercase, "
                    + "Lowercase, Digit, and Special character");
            textPassword.setText(null);
            textConfirm.setText(null);
        }
        
            // variable declaration to for email checking
            String message = textEmail.getText().toString();
            char at = '@';
            char dot = '.';
            int count = 0;
            int atpos = 0;
            int dotpos = 0;
            int flag = 0;
            // looping for checking email 
            for(int i = 0; i<message.length(); i++){
                if(message.charAt(i) == at){
                    count ++;
                    atpos = i;
                    if(count >= 2){
                        flag = 1;
                        break;
                    }
                }
                if(message.charAt(i) == dot){
                    dotpos = i;
                }
            }
            // Check @ and . position
            if(atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= message.length() || flag == 1){
                JOptionPane.showMessageDialog(null, "Invalid Email entry");
                textEmail.setText(null);
            }
            // Check phone number validity
            String data = textMobile.getText();
            for (int i=0; i<data.length(); i++){
                if(!Character.isDigit(data.charAt(i))){
                    JOptionPane.showMessageDialog(this, "Invalid phone number entered! ");
                    textMobile.setText(null);
                    textMobile.requestFocus();
                    return;
                }
            }
            
        try{
            // get connection 
            Connection conn;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cloud_data_security", "root", "");
    		
                // variable declaration for holding new user data
                String name = textFirstName.getText();
                String secondName = textLastName.getText();
                String user = textUsername.getText();
                String pass = textPassword.getText();
                String email = textEmail.getText();
                String phone = textMobile.getText();
                String add = textAddress.getText();
                
                // Check if there is any empty field
    		if(name.equals("")||secondName.equals("")||user.equals("")||pass.equals("")||
                        email.equals("")||phone.equals("")||add.equals("")){
                    //Display message for incomplete data
                    JOptionPane.showMessageDialog(this, "All field must not be empty ");
                }
                // If all data entries field are filled
                else{
    		// set query
                    String query = "INSERT INTO request_table(id, firstname, lastname, username, password, "
                        + "nationality, email, mobile, gender, maritalStatus, address) "
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
                
                    PreparedStatement st = conn.prepareStatement(query);
                    //Save the data into database table
                    st.setString(1, null);
                    st.setString(2, textFirstName.getText());
                    st.setString(3, textLastName.getText());
                    st.setString(4, textUsername.getText());
                    st.setString(5, textPassword.getText());
                    String nationality = (String)cbbNationality.getSelectedItem();
                    st.setString(6, nationality);
                    st.setString(7, textEmail.getText());
                    st.setString(8, textMobile.getText());
                    String gender = (String)textGender.getSelectedItem();
                    st.setString(9, gender);
                    String status = (String)textMaritalStatus.getSelectedItem();
                    st.setString(10, status);
                    st.setString(11, textAddress.getText());
                    
                    //execute query
                    st.execute();
                    // prompt message to user for sending data successfully
                    JOptionPane.showMessageDialog(null, "Request sent, you will receive response through "
                        + "your email");
                    
                    //close the connection
                    st.close();
                    conn.close();
                
                    //Set all text field to null
                    textFirstName.setText(null);
                    textLastName.setText(null);
                    textUsername.setText(null);
                    textPassword.setText(null);
                    textConfirm.setText(null);
                    textEmail.setText(null);
                    textMobile.setText(null);
                    textAddress.setText(null);
                
                }// End of else if statement
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
       
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // Reset all field entry
        textFirstName.setText(null);
        textLastName.setText(null);
        textUsername.setText(null);
        textPassword.setText(null);
        textConfirm.setText(null);
        textEmail.setText(null);
        textMobile.setText(null);
        textAddress.setText(null);
    }//GEN-LAST:event_buttonResetActionPerformed

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
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton buttonReset;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JComboBox cbbNationality;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox jcbLoginType;
    private javax.swing.JLabel labelDate;
    private javax.swing.JLabel labelTime;
    private javax.swing.JTextArea textAddress;
    private javax.swing.JPasswordField textConfirm;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textFirstName;
    private javax.swing.JComboBox textGender;
    private javax.swing.JTextField textLastName;
    private javax.swing.JComboBox textMaritalStatus;
    private javax.swing.JTextField textMobile;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsername;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
