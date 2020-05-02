
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author win 10
 */
public class FeeRecord extends javax.swing.JFrame {

    /**
     * Creates new form FeeRecord
     */
    public FeeRecord() {
        initComponents();
    fetch();
    
  //  Exporter exp=new Exporter();
    //try{
       // exp.exportTable(table2, new File("F:\\BackupFee\\Fee.xls"));
    //}catch(Exception e){
      //  e.printStackTrace();
    //}
    
    }

    private void fetch()
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/fee";
            String uid="root";
            String pwd="root";
            Connection con=DriverManager.getConnection(url, uid, pwd);
           // String sql="select* from january";
           //String sql="select january.name,march.name from january,march where january.name=march.name";
            String sql= "select * from january union select * from febuary union select * from march union select *from april union select * from may union select * from june union select * from july union select * from august union select * from september union select * from october union select * from november union select * from december order by name";//order by dd
            PreparedStatement ps=con.prepareStatement(sql);
           
           ResultSet rs=ps.executeQuery();
           table1.setModel(DbUtils.resultSetToTableModel(rs));
}
catch(Exception e){
    e.printStackTrace();
}

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cb4 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("VIEW FEE RECORD DETAILS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel3.setText("Name :");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Room no", "Date of payment", "Mode of Payment", "Amount"
            }
        ));
        table1.setEnabled(false);
        jScrollPane1.setViewportView(table1);

        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Name", "Room no", "Date of payment", "Mode of Payment", "Amount"
            }
        ));
        jScrollPane2.setViewportView(table2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 24)); // NOI18N
        jLabel4.setText("Month:");

        cb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "january", "febuary", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december" }));
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(481, 481, 481)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        
        String s1 = null,s2=null,s3=null,s4=null,s5=null,s6=null;

        String month=cb4.getSelectedItem().toString();
        String name=t1.getText();

        try{
            Connection con=Data.connect();
            Statement stmt=con.createStatement();
            if(month.equals("january")){
                String Sql= "select * from january where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from january where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                      
                         s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
                }
            }

            if(month.equals("febuary")){
                String Sql= "select * from febuary where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from febuary where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                       // table2.setModel(DbUtils.resultSetToTableModel(rs));
                   
                    s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    
                    
                    
                    
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("march")){
                String Sql= "select * from march where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from march where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("april")){
                String Sql= "select * from april where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from april where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("may")){
                String Sql= "select * from may where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from may where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("june")){
                String Sql= "select * from june where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from june where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("july")){
                String Sql= "select * from july where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from july where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("august")){
                String Sql= "select * from august where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from august where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("september")){
                String Sql= "select * from september where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from september where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("october")){
                String Sql= "select * from october where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from october where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("november")){
                String Sql= "select * from november where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from november where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
            if(month.equals("december")){
                String Sql= "select * from december where name='"+name+"' ";

                ResultSet r= stmt.executeQuery(Sql);

                if(r.next()){
                    String sql="select* from december where name=? ";
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1,name);

                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){
                        s1=rs.getString(1);
                         s2=rs.getString(2);
                         s3=rs.getString(3);
                         s4=rs.getString(4);
                         s5=rs.getString(5);
                         s6=rs.getString(6);
                         table2.setModel(DbUtils.resultSetToTableModel(rs));
                         DefaultTableModel model=(DefaultTableModel)table2.getModel();
                         Object[] data={s1,s2,s3,s4,s5,s6};                  
                         model.addRow(data);
                    }
                }
                else{
                    DefaultTableModel model=(DefaultTableModel)table2.getModel();
                     model.setRowCount(0);

                    JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");

                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

                                         


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
 String s1 = null,s2=null,s3=null,s4=null,s5=null;       
 
 String month=cb4.getSelectedItem().toString();  
 String name=t1.getText();
    
try{
            Connection con=Data.connect();
           Statement stmt=con.createStatement();
            if(month.equals("january")){
              String Sql= "select * from january where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from january where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            
            if(month.equals("febuary")){
              String Sql= "select * from febuary where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from febuary where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("march")){
              String Sql= "select * from march where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from march where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("april")){
              String Sql= "select * from april where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from april where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("may")){
              String Sql= "select * from may where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from may where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("june")){
              String Sql= "select * from june where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from june where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("july")){
              String Sql= "select * from july where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from july where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("august")){
              String Sql= "select * from august where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from august where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("september")){
              String Sql= "select * from september where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from september where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("october")){
              String Sql= "select * from october where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from october where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("november")){
              String Sql= "select * from november where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from november where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
            if(month.equals("december")){
              String Sql= "select * from december where name='"+name+"' ";
            
            ResultSet r= stmt.executeQuery(Sql);
         
            if(r.next()){
            String sql="select* from december where name=? ";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,name);
           
           ResultSet rs=ps.executeQuery();
          while(rs.next()){
          table2.setModel(DbUtils.resultSetToTableModel(rs));
          }
            }
            else{
                           
            JOptionPane.showMessageDialog(null, "NOT YET DEPOSITED");
           
            }
          }
}
catch(Exception e){
    e.printStackTrace();
}
                        
*/                        
                        
                        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

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
            java.util.logging.Logger.getLogger(FeeRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FeeRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FeeRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FeeRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeeRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cb4;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField t1;
    public javax.swing.JTable table1;
    private javax.swing.JTable table2;
    // End of variables declaration//GEN-END:variables
}