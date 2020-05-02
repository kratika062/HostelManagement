
import java.awt.event.KeyEvent;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win 10
 */
public class Add extends javax.swing.JFrame {
  String filename=null;
  byte[] photo=null;  
     int vc=0;  
  /**
     * Creates new form Add
     */
    public Add() {
        initComponents();
        
        
        
        
        
        
        
        //setSize(800,500);
        //setVisible(true);
    
    }
    
    
    
    
     public static boolean validateEmail(String email) {                 

                        
       boolean status=false;    
       String EMAIL_PATTERN = 
  "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
  + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
       Pattern pattern = Pattern.compile(EMAIL_PATTERN);
       Matcher matcher=pattern.matcher(email);
       if(matcher.matches())
       {
           status=true;
       }
       else{
           status=false;
       }
           return status;
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        t4 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        ro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("DETAILS OF HOSTELITE");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel3.setText("NAME");

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        t3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t3KeyPressed(evt);
            }
        });

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel4.setText("Phone number");

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel6.setText("Email ID");

        t5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t5KeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel8.setText("Join Date");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel9.setText("Room Number");

        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t2KeyPressed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        b1.setText("ADD");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jb3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jb3.setText("Reset");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        img.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        img.setMaximumSize(new java.awt.Dimension(500, 500));

        jButton1.setText("Browse");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lb1.setForeground(new java.awt.Color(255, 0, 0));

        lb2.setForeground(new java.awt.Color(255, 0, 0));

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel10.setText("Floor");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "G", "1", "2", "3.4" }));

        ro.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(ro, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(t5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(t4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(106, 106, 106)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton1)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ro, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(b1)
                    .addComponent(jb3))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

       if(t1.getText().trim().isEmpty() && t2.getText().trim().isEmpty() && t3.getText().trim().isEmpty() && t5.getText().trim().isEmpty()){
    lb1.setText("Name is Empty");
    lb2.setText("Emailid is Empty");
    
}     
else if(t1.getText().trim().isEmpty())
{
    lb1.setText("Username is empty");
}
     
else if(t2.getText().trim().isEmpty())
{
    lb1.setText("Password is empty");
}
       
else{

        try {
            
              Class.forName("com.mysql.jdbc.Driver");
             String url="jdbc:mysql://localhost:3306/fee";
             String uid="root";
             String pwd="root";
             Connection con=DriverManager.getConnection(url, uid, pwd);
             String name=t1.getText();
             String mob=t2.getText();
             String email=t3.getText();
            
            String sq="Select * from entry where name='" +name+"' and mob='" +mob+"'  ";
          PreparedStatement p=con.prepareStatement(sq);
           ResultSet rs= p.executeQuery(sq);
          
            if(rs.next()){
            JOptionPane.showMessageDialog(null, "ENTRY ALREADY EXISTS");
            }           
            else{

            String sql="insert into entry(name,mob,email,joinD,rno,photo) values(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(sql);
                                    
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String d = sdf.format(t4.getDate());
            
            
            String rno=t5.getText();
        
              ps.setString(1,name);
               
                         //Convert string to date
                         SimpleDateFormat f1=new SimpleDateFormat("yyyy-mm-dd");
                         Date date=f1.parse(d);
                         java.sql.Date sd=new java.sql.Date(date.getTime());
                         ps.setDate(4, sd);
                    
                        ps.setString(2,mob);
                        ps.setString(3,email);
                        ps.setString(5,rno);
                        ps.setBytes(6,photo);

                        int n=ps.executeUpdate();
                        if(vc!=0){
                            vc=vc-1;
                            String ss="update roomview set vacancy='"+vc+"'where room='"+rno+"'";
                            PreparedStatement ps1=con.prepareStatement(ss);
                            ps1.executeUpdate();
                           
                        }
                        if(n==1)
                        {
                             JOptionPane.showMessageDialog(null, "ENTRY ADDED SUCCESSFULLY");
          
                        }

                         
                        
                        
//                        if(rno!=null){
  //                          String s="update entry set status='occupied' where rno='"+rno+"' ";
    //                        PreparedStatement pi=con.prepareStatement(s);
      //                      int no=pi.executeUpdate();
        //                System.out.println(no);
          //              }
                        
                        System.out.println(n);
            }
            //else
            //{
              //               JOptionPane.showMessageDialog(null, "ENTRY ADDED SUCCESSFULLY");
            //}
        
        }
     catch (Exception e) {
        e.printStackTrace();
        }
}
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
FeeD F=new FeeD();
F.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
t1.setText(" ");
t3.setText(" ");
t2.setText(" ");
t5.setText(" ");
        // TODO add your handling code here:
    }//GEN-LAST:event_jb3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
       JFileChooser chooser=new JFileChooser();
       chooser.showOpenDialog(null);
       File f=chooser.getSelectedFile();
       img.setIcon(new ImageIcon(f.toString()));
       filename=f.getAbsolutePath();
       
       try{
             
         File image=new File(filename);
         FileInputStream fis=new FileInputStream(image);
         ByteArrayOutputStream bos=new ByteArrayOutputStream();
         byte[] buf=new byte[5000];
         for(int readNum; (readNum=fis.read(buf))!=-1;){
             bos.write(buf,0,readNum);
         }
            photo=bos.toByteArray();
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
       
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyPressed
String phn=t2.getText();
int length=phn.length();
        
char c=evt.getKeyChar();
if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
{
    if(length<10)
    {
        t2.setEditable(true);
        lb2.setText("Enter 10 digits mobile number");
    }
    else
    {
        t2.setEditable(false);
    }
        
}
else{
    if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE )
    {
        t2.setEditable(true);
    }
    else{
        t2.setEditable(false);
    }
}
// TODO add your handling code here:
    }//GEN-LAST:event_t2KeyPressed

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyPressed

char c=evt.getKeyChar();
if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
{
    t1.setEditable(true);
    
}
else
{
    t1.setEditable(false);
}




// TODO add your handling code here:
    }//GEN-LAST:event_t1KeyPressed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
 
        
        
    }//GEN-LAST:event_t3ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void t5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyPressed
     



    }//GEN-LAST:event_t5KeyPressed

    private void t3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t3KeyPressed
String email=t3.getText();
        
        String email_pattern="^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        
            Pattern pattern=Pattern.compile(email_pattern);
            Matcher matcher=pattern.matcher(email);
           
            if(matcher.matches()){
                lb1.setText(" ");
                
            }else{
                lb1.setText("invalid email");
                
            }

// TODO add your handling code here:
    }//GEN-LAST:event_t3KeyPressed

    private void t5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t5KeyReleased

 try{  
            Connection con=Data.connect();
            Statement stmt = con.createStatement();
            String r=t5.getText();
            int length=r.length();
           
           
            char c=evt.getKeyChar();
            if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9' )
            {
            if(length==3){
             t5.setEditable(true);
            String sqls="select * from roomview where room='"+r+"'";
            ResultSet rs1= stmt.executeQuery(sqls);
           
            if(rs1.next()){
                    vc=rs1.getInt(4);
                    System.out.println(vc);
                     if(vc==0){
                           ro.setText("filled");
                           b1.setEnabled(false);
                        } else {
                           ro.setText("vacant");
                        }
                   }
            else{
                ro.setText("Room don't exist");
                t5.setEditable(false);
            }
            }
            }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE )
            {
              t5.setEditable(true);
              ro.setText(" ");
            }else{
              t5.setEditable(false);
            }
            }
         }catch(Exception e){
             e.printStackTrace();
         }
        









// TODO add your handling code here:
    }//GEN-LAST:event_t5KeyReleased

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JLabel img;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JButton jb3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel ro;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private com.toedter.calendar.JDateChooser t4;
    private javax.swing.JTextField t5;
    // End of variables declaration//GEN-END:variables
}