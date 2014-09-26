
package ieee.quiz;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;


public class Main_Grid extends javax.swing.JFrame {
Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    static int i=0;//Movies
    static int j=0;//Countries
    static int k=0;//Abbreviations
    static int l=0;//Gadgets   
    static int m=0;//Mumbai
    static int n=0;//Sports
    static int o=0;//Olympics
    static int p=0;//Television
    static int q=0;//Logos
    
    /**
     * Creates new form Main_Grid
     */
    public Main_Grid() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movies = new javax.swing.JButton();
        countries = new javax.swing.JButton();
        abbr = new javax.swing.JButton();
        gadg = new javax.swing.JButton();
        mumbai = new javax.swing.JButton();
        sports = new javax.swing.JButton();
        olympics = new javax.swing.JButton();
        tele = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        movies.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        movies.setText("MOVIES");
        movies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moviesActionPerformed(evt);
            }
        });

        countries.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        countries.setText("COUNTRIES");
        countries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countriesActionPerformed(evt);
            }
        });

        abbr.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        abbr.setText("ABBREVIATIONS");
        abbr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abbrActionPerformed(evt);
            }
        });

        gadg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        gadg.setText("GADGETS");
        gadg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gadgActionPerformed(evt);
            }
        });

        mumbai.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mumbai.setText("MUMBAI");
        mumbai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mumbaiActionPerformed(evt);
            }
        });

        sports.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sports.setText("SPORTS");
        sports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sportsActionPerformed(evt);
            }
        });

        olympics.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        olympics.setText("OLYMPICS");
        olympics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                olympicsActionPerformed(evt);
            }
        });

        tele.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tele.setText("TELEVISION");
        tele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teleActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton9.setText("LOGOS");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(olympics, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tele, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(gadg, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mumbai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(movies, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(countries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(abbr, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(movies, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abbr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(countries, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sports, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(gadg, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mumbai, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tele, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(olympics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void teleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teleActionPerformed
      try
      {
            System.out.println("Inside television");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:8000/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from television where flag="+p);
            p++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_Tele().setVisible(true);
                Ques_Tele.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }
    }//GEN-LAST:event_teleActionPerformed

    private void olympicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_olympicsActionPerformed
        try
       {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from olympics where flag="+o);
            o++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_Olym().setVisible(true);
                Ques_Olym.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }
    }//GEN-LAST:event_olympicsActionPerformed

    private void moviesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moviesActionPerformed
    try
       {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from movies where flag="+i);
            i++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_mov().setVisible(true);
                Ques_mov.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }
    }//GEN-LAST:event_moviesActionPerformed

    private void sportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sportsActionPerformed
     try
       {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from sports where flag="+n);
            n++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_Sports().setVisible(true);
                Ques_Sports.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }   
    }//GEN-LAST:event_sportsActionPerformed

    private void countriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countriesActionPerformed
        try
       {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from countries where flag="+j);
            j++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_Coun().setVisible(true);
                Ques_Coun.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }               
    }//GEN-LAST:event_countriesActionPerformed

    private void abbrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abbrActionPerformed
       try
       {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from abbr where flag="+k);
            k++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_abbr().setVisible(true);
                Ques_abbr.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }    
        
    }//GEN-LAST:event_abbrActionPerformed

    private void gadgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gadgActionPerformed
           try
       {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from gadgets where flag="+l);
            l++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_Gadg().setVisible(true);
                Ques_Gadg.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }   
    }//GEN-LAST:event_gadgActionPerformed

    private void mumbaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mumbaiActionPerformed
         try
       {
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ieee_quiz","root","chelsea12");
            System.out.println("Connection created");
            stmt=conn.createStatement();
            System.out.println("Statement created");
            rs=stmt.executeQuery("select * from mumbai where flag="+m);
            m++;
            System.out.println("Query Executed");
            while(rs.next())
            {
                new Ques_Mum().setVisible(true);
                Ques_Mum.question.setText(rs.getString("question"));             
            }
       }
    catch(SQLException e)
    {
        System.out.println("SQL Exception caught");
    }   
    }//GEN-LAST:event_mumbaiActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        //LGOGS
       
       {
           ImageIcon img[] = new ImageIcon[5]; 
           img[0] = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("starbucks.png")));
           img[1] = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Bridgestone.png")));
           img[2] = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("versace.png")));
           img[3] = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fifa-logo.png")));
           img[4] = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("jaguar.png")));
           //Ques_Logo.jLabel1.setIconImage(Toolkit.getDefaultToolkit().getImage("icon_confused.gif"));
           //img.setImage(img);
          //ImageIcon temp = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("fifa-logo.jpg")));
            

           
           if(q<5){
                new Ques_Logo().setVisible(true);
                //Ques_Mum.question.setText(rs.getString("question"));  
                //setIcon(1);
                Ques_Logo.jLabel1.setIcon(img[q]);
                //Ques_Logo.jLabel1.setIcon(img[m]);
                q++;
           }
       }
    
        
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {
     
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Grid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main_Grid().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton abbr;
    public static javax.swing.JButton countries;
    public static javax.swing.JButton gadg;
    public static javax.swing.JButton jButton9;
    public static javax.swing.JButton movies;
    public static javax.swing.JButton mumbai;
    public static javax.swing.JButton olympics;
    public static javax.swing.JButton sports;
    public static javax.swing.JButton tele;
    // End of variables declaration//GEN-END:variables

    private void setIcon(int qno) {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("starbucks.png")));
        
        
    }
}
