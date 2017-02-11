/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.html.simpleparser.HTMLWorker;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author DELL
 */
public class FillFormTechnical extends javax.swing.JFrame {

    /**
     * Creates new form FillFormTechnical
     */
    public FillFormTechnical() {
        initComponents();
         setBounds(600, 600, 450, 475);
        setResizable(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        l1.setVisible(false);
        l2.setVisible(false);
        l3.setVisible(false);
        l4.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l5.setVisible(false);
        l8.setVisible(false);
        l9.setVisible(false);
        l10.setVisible(false);
        l11.setVisible(false);
        l12.setVisible(false);
        
        
        t1.setVisible(false);
        t2.setVisible(false);
        t3.setVisible(false);
        t4.setVisible(false);
        t5.setVisible(false);
        t6.setVisible(false);
        t7.setVisible(false);
        t8.setVisible(false);
        t9.setVisible(false);
        t10.setVisible(false);
        t11.setVisible(false);
        t12.setVisible(false);
        
        showAll();
        }

    public final void showAll()
    {
        
        if(TechnicalAttributes.eduBoo)
        {
            l1.setVisible(true);
            t1.setVisible(true);
        }
        if(TechnicalAttributes.acadBoo)
        {
            l2.setVisible(true);
            t2.setVisible(true);
        }
        if(TechnicalAttributes.schBoo)
        {
            l3.setVisible(true);
            t3.setVisible(true);
        }
        if(TechnicalAttributes.pubBoo)
        {
            l4.setVisible(true);
            t4.setVisible(true);
        }
        if(TechnicalAttributes.resBoo)
        {
            l5.setVisible(true);
            t5.setVisible(true);
        }
        if(TechnicalAttributes.confBoo)
        {
            l6.setVisible(true);
            t6.setVisible(true);
        }
        if(TechnicalAttributes.certiBoo)
        {
            l7.setVisible(true);
            t7.setVisible(true);
        }
        if(TechnicalAttributes.internBoo)
        {
            l8.setVisible(true);
            t8.setVisible(true);
        }
        if(TechnicalAttributes.posBoo)
        {
            l9.setVisible(true);
            t9.setVisible(true);
        }
        if(TechnicalAttributes.extraBoo)
        {
            l10.setVisible(true);
            t10.setVisible(true);
        }
        if(TechnicalAttributes.entreBoo)
        {
            l11.setVisible(true);
            t11.setVisible(true);
        }
        if(TechnicalAttributes.miscBoo)
        {
            l12.setVisible(true);
            t12.setVisible(true);
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        l11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        l12 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        t12 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        t11 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton2.setText("Generate Html Page & Pdf");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(230, 420, 210, 25);
        jPanel1.add(t3);
        t3.setBounds(260, 160, 130, 30);
        jPanel1.add(t4);
        t4.setBounds(260, 190, 130, 30);
        jPanel1.add(t5);
        t5.setBounds(260, 220, 130, 30);
        jPanel1.add(t2);
        t2.setBounds(260, 130, 130, 30);
        jPanel1.add(t1);
        t1.setBounds(260, 100, 130, 30);

        l11.setText("Entrepreneurship");
        jPanel1.add(l11);
        l11.setBounds(70, 370, 130, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 0, 130, 100);

        l2.setText("Academic Achievements");
        jPanel1.add(l2);
        l2.setBounds(70, 130, 140, 20);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 420, 59, 25);

        l12.setText("Miscellaneous");
        jPanel1.add(l12);
        l12.setBounds(70, 390, 120, 20);

        l10.setText("Extra Curricular Activities");
        jPanel1.add(l10);
        l10.setBounds(70, 350, 190, 20);

        l9.setText("Positions of Responsibility");
        jPanel1.add(l9);
        l9.setBounds(70, 330, 190, 20);

        l8.setText("Internships");
        jPanel1.add(l8);
        l8.setBounds(70, 310, 120, 20);

        l7.setText("Certifications");
        jPanel1.add(l7);
        l7.setBounds(70, 280, 110, 20);

        l6.setText("Conferences/ Workshops Attended");
        jPanel1.add(l6);
        l6.setBounds(70, 250, 190, 20);

        l5.setText("Sponsored Research Projects");
        jPanel1.add(l5);
        l5.setBounds(70, 220, 160, 20);

        l4.setText("Publications");
        jPanel1.add(l4);
        l4.setBounds(70, 190, 100, 20);

        l3.setText("Scholastic Achievements");
        jPanel1.add(l3);
        l3.setBounds(70, 160, 140, 20);

        l1.setText("Educational Qualifications");
        jPanel1.add(l1);
        l1.setBounds(70, 110, 150, 16);
        jPanel1.add(t12);
        t12.setBounds(260, 390, 130, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BannerProjects.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 10, 110, 80);
        jPanel1.add(t11);
        t11.setBounds(260, 370, 130, 22);
        jPanel1.add(t10);
        t10.setBounds(260, 350, 130, 20);
        jPanel1.add(t9);
        t9.setBounds(260, 330, 130, 22);
        jPanel1.add(t8);
        t8.setBounds(260, 310, 130, 22);
        jPanel1.add(t7);
        t7.setBounds(260, 280, 130, 30);
        jPanel1.add(t6);
        t6.setBounds(260, 250, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new TechnicalAttributes().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        makeHTML();
        convertToHTML("$f1","&edu",t1.getText(),TechnicalAttributes.eduBoo);
        convertToHTML("$f2","&acad",t2.getText(),TechnicalAttributes.acadBoo);
        convertToHTML("$f3","&schol",t3.getText(),TechnicalAttributes.schBoo);
        convertToHTML("$f4","&pub",t5.getText(),TechnicalAttributes.resBoo);
        convertToHTML("$f5","&res",t4.getText(),TechnicalAttributes.pubBoo);
        convertToHTML("$f6","&work",t6.getText(),TechnicalAttributes.confBoo);
        convertToHTML("$f7","&certi",t7.getText(),TechnicalAttributes.certiBoo);
        convertToHTML("$f8","&intern",t8.getText(),TechnicalAttributes.internBoo);
        convertToHTML("$f9","&pos",t9.getText(),TechnicalAttributes.posBoo);
        convertToHTML("$y1","&cocurr",t10.getText(),TechnicalAttributes.extraBoo);
        convertToHTML("$y2","&entre",t11.getText(),TechnicalAttributes.entreBoo);
        convertToHTML("$y3","&misc",t12.getText(),TechnicalAttributes.miscBoo);
        convertToHTML("$n1","$name",PersonalDetails.name,true);
        convertToHTML("$n2","$email",PersonalDetails.email,true);
        convertToHTML("$n3","$contact",PersonalDetails.contact,true);
        convertToHTML("$n4","$address",PersonalDetails.address,true);
        convertToHTML("$n5","$discipline",PersonalDetails.discipline,true);
        convertToHTML("$n6","$dob",PersonalDetails.dob,true);
        convertToHTML("$n7","$batch",PersonalDetails.batch,true);
        
        try {     
            makePdf();
        } catch (IOException ex) {
//            Exceptions.printStackTrace(ex);
        } catch (DocumentException ex) {
           // Exceptions.printStackTrace(ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(FillFormTechnical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FillFormTechnical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FillFormTechnical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FillFormTechnical.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FillFormTechnical().setVisible(true);
            }
        });
    }

    public void convertToHTML(String field,String value,String attr,boolean boo)
        {
            
            try{
                 BufferedReader in;
                in = new BufferedReader(new FileReader("Allnew1.html"));
                 String str = "";
                 StringBuilder contentBuilder = new StringBuilder();
                 while((str=in.readLine())!=null)
                 {
                        contentBuilder.append(str);
                 }
                 in.close();
                 
                 //String html = "<div><h1>hello</h1><p>hi<p></div";
                String content = contentBuilder.toString();
                String sh = "none";
                
                if(boo == false)
                    content = content.replace(field, sh);
                else 
                    content = content.replace(value, attr);
                // content = content + "<table border='2' cellpadding='15' cellspacing='2' width='80%' align='center'><tr><td> Address:</td> </tr></table>";
                 File f = new File("Allnew1.html");
        
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write(content);
                bw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    public void makeHTML()
        {
            
            try{
                
                 BufferedReader in;
                in = new BufferedReader(new FileReader(TechnicalTemplate.fName));
                 String str = "";
                 StringBuilder contentBuilder = new StringBuilder();
                 while((str=in.readLine())!=null)
                 {
                        contentBuilder.append(str);
                 }
                 in.close();
                 
                 //String html = "<div><h1>hello</h1><p>hi<p></div";
                String content = contentBuilder.toString();
                
                //else 
                //    content = content.replace(value, attr);
                // content = content + "<table border='2' cellpadding='15' cellspacing='2' width='80%' align='center'><tr><td> Address:</td> </tr></table>";
                 File f = new File("Allnew1.html");
        
                BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                bw.write(content);
                bw.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        }
    
    public void makePdf() throws IOException, DocumentException
    {
        String path = "Allnew1.pdf";
        PdfWriter pdfWriter = null;

        // create a new document
        Document document = new Document();
        pdfWriter = PdfWriter.getInstance(document, new FileOutputStream(
                    path));
        document.open();
        HTMLWorker htmlWorker = new HTMLWorker(document);
        String str = "";
        StringBuilder contentBuilder = new StringBuilder();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("Allnew1.html"));

     while ((str = in.readLine()) != null) {

           contentBuilder.append(str);

    }
} catch (IOException e) {
    System.out.print("HTML file close problem:" + e.getMessage());
} finally {
    in.close();

}
String content = contentBuilder.toString();

htmlWorker.parse(new StringReader(content));

document.close();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}