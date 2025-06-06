
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Students_and_Teachers_Management extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    
    public Students_and_Teachers_Management() {
        initComponents();
        
                
        conn=javaconnect.connerDb();
        CurrentDate();
    }
    
    
        
    public void CurrentDate() 
    {

        
        Thread clock=new Thread()
        {
            public void run()
            {
                for(;;)
                    
                {
                
        Calendar cal=new GregorianCalendar();
        int month=cal.get(Calendar.MONTH);
        int year=cal.get(Calendar.YEAR);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        
        date_txt.setText(day+"/"+(month+1)+"/"+(year));
        
        
        
        int second=cal.get(Calendar.SECOND); 
        int mint=cal.get(Calendar.MINUTE);
        int hour=cal.get(Calendar.HOUR);
        txt_time.setText(hour+":"+(mint)+":"+(second));  
        

                    
                    try {
                        sleep(1000);
                        
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Students_and_Teachers_Management.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        
        
        
        clock.start();
        
                
    }
    
        
    public  void close()
    {
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txt_teacher_management = new javax.swing.JLabel();
        txt_student_management = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_teachers = new javax.swing.JButton();
        txt_students = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        date_txt = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txt_me = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_Employee = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        txt_help = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel1.setText("jLabel1");

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("All Information");
        setResizable(false);

        txt_teacher_management.setBackground(new java.awt.Color(0, 204, 204));
        txt_teacher_management.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_teacher_management.setForeground(new java.awt.Color(0, 0, 255));
        txt_teacher_management.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Teacher-male-icon.png"))); // NOI18N
        txt_teacher_management.setText("Tearchers");
        txt_teacher_management.setToolTipText("Tearcher Management Option-1");
        txt_teacher_management.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_teacher_managementAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txt_student_management.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_student_management.setForeground(new java.awt.Color(0, 153, 51));
        txt_student_management.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Student-3-icon.png"))); // NOI18N
        txt_student_management.setText("Srudents");
        txt_student_management.setToolTipText("Srudent Management Option-2");
        txt_student_management.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txt_student_managementAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("School Management System");

        jLabel4.setText("NB: By Click to choice  one");
        jLabel4.setToolTipText("NB: By Click to choice  one");

        txt_teachers.setBackground(new java.awt.Color(255, 255, 255));
        txt_teachers.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_teachers.setForeground(new java.awt.Color(0, 51, 51));
        txt_teachers.setText("Teachers");
        txt_teachers.setToolTipText("Teachers Data Entry Option");
        txt_teachers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_teachersActionPerformed(evt);
            }
        });

        txt_students.setBackground(new java.awt.Color(255, 255, 255));
        txt_students.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_students.setForeground(new java.awt.Color(0, 51, 51));
        txt_students.setText("Students");
        txt_students.setToolTipText("Students Data Entry Option");
        txt_students.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_studentsActionPerformed(evt);
            }
        });

        date_txt.setText("Current Date:");

        txt_time.setText("Time:");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 51));
        jButton2.setText("Current date:");
        jButton2.setToolTipText("Current date");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 51, 51));
        jButton3.setText("Time:");
        jButton3.setToolTipText("Time");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 102));
        jButton4.setText("Close");
        jButton4.setToolTipText("Close The Window");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txt_me.setBackground(new java.awt.Color(255, 255, 255));
        txt_me.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txt_me.setForeground(new java.awt.Color(51, 0, 51));
        txt_me.setText("About me");
        txt_me.setToolTipText("About me");
        txt_me.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_meActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Person-Male-Light-icon.png"))); // NOI18N
        jLabel2.setText("Employees");
        jLabel2.setToolTipText("Employee Management Option-3");

        txt_Employee.setBackground(new java.awt.Color(255, 255, 255));
        txt_Employee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_Employee.setForeground(new java.awt.Color(51, 51, 51));
        txt_Employee.setText("Employees");
        txt_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EmployeeActionPerformed(evt);
            }
        });

        txt_help.setBackground(new java.awt.Color(255, 255, 255));
        txt_help.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_help.setText("Help");
        txt_help.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_helpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(date_txt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_time)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_help, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_me))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txt_teachers)
                                .addGap(93, 93, 93)
                                .addComponent(txt_students)
                                .addGap(120, 120, 120)
                                .addComponent(txt_Employee))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_teacher_management)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_student_management)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(jLabel4)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date_txt)
                    .addComponent(txt_time)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(txt_me)
                    .addComponent(txt_help))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_teacher_management)
                    .addComponent(txt_student_management)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_teachers)
                        .addComponent(txt_students))
                    .addComponent(txt_Employee))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_teacher_managementAncestorAdded(javax.swing.event.AncestorEvent evt) {
    }
            private void txt_student_managementAncestorAdded(javax.swing.event.AncestorEvent evt) {}
    private void txt_teachersActionPerformed(java.awt.event.ActionEvent evt) {
                Teachers_Information_System t = new Teachers_Information_System();
                t.setVisible(true);
                close();}
    private void txt_studentsActionPerformed(java.awt.event.ActionEvent evt) {
                 Students_Infromation_System s = new Students_Infromation_System();
                 s.setVisible(true);
                 close();}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        close();}
    private void txt_meActionPerformed(java.awt.event.ActionEvent evt) {
        My_Profile s = new My_Profile();
        s.setVisible(true);
    }
    private void txt_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {
        Employees_Infromation_System s = new Employees_Infromation_System();
        s.setVisible(true);
        close();
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {}
    private void txt_helpActionPerformed(java.awt.event.ActionEvent evt) {
                 Help s = new Help();
                 s.setVisible(true);
                 close();}
    private javax.swing.JLabel date_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton txt_Employee;
    private javax.swing.JButton txt_help;
    private javax.swing.JButton txt_me;
    private javax.swing.JLabel txt_student_management;
    private javax.swing.JButton txt_students;
    private javax.swing.JLabel txt_teacher_management;
    private javax.swing.JButton txt_teachers;
    private javax.swing.JLabel txt_time;}