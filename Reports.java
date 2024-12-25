
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Reports extends javax.swing.JFrame {
    ArrayList<BillingInfo> allRecord = new ArrayList<>();
     ArrayList<Medicine> allMedicines = new ArrayList<>();
      ArrayList<Patient> allPatients = new ArrayList<>();
    
    public Reports() {
        initComponents();
        readAllMData();
        readAllPData();
        readAllRData();
    }

    void readAllPData()
     {
         try{
             File pfile = new File("PData.txt");
             Scanner scanner = new Scanner(pfile);
             
             while(scanner.hasNextLine()){
                 String data = scanner.nextLine();
                 String[] curData = data.split(";");
                 Patient patient = new Patient();
                 patient.setId(Integer.parseInt(curData[0]));
                 patient.setName(curData[1]);
                 patient.setAge(Integer.parseInt(curData[2]));
                 patient.setGender(curData[3]);
                 patient.setAddress(curData[4]);
                 patient.setContact(curData[5]);
                 allPatients.add(patient);
             }
             scanner.close();
         }catch(Exception e){
             
         }
     }
    
    void readAllMData()
     {
         try{
             File pfile = new File("MData.txt");
             Scanner scanner = new Scanner(pfile);
             
             while(scanner.hasNextLine()){
                 String data = scanner.nextLine();
                 String[] curData = data.split(";");
                 Medicine medicines = new Medicine();
                 medicines.setId(Integer.parseInt(curData[0]));
                 medicines.setName(curData[1]);
                 medicines.setSellingPrice(Integer.parseInt(curData[2]));
                 medicines.setBuyingPrice(Integer.parseInt(curData[3]));
                 medicines.setQuantity(Integer.parseInt(curData[4]));
                 medicines.setDescription(curData[5]);
                 allMedicines.add(medicines);
             }
             scanner.close();
         }catch(Exception e){
             
         }
     }
    
    void readAllRData()
     {
         try{
             File pfile = new File("Record.txt");
             Scanner scanner = new Scanner(pfile);
             
             while(scanner.hasNextLine()){
                 String data = scanner.nextLine();
                 String[] curData = data.split(";");
                 BillingInfo record = new BillingInfo();
                 record.setPatientID(Integer.parseInt(curData[0]));
                 
                 record.setFee(Integer.parseInt(curData[1]));
                 record.setRecommendation(curData[2]);
                 record.setDate(curData[3]);
                 
                 String[] mList =  curData[4].split(",");
                 for(int i=0;i< mList.length ;i++)
                 {
                     record.setMedicineID(Integer.parseInt(mList[i]));
                 }
                 
                 allRecord.add(record);
             }
             scanner.close();
         }catch(Exception e){
             
         }
     }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pr = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("CheckUp Menu");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resized_image_8.jpg"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setText("Reports Menu");

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 204, 0));
        jButton3.setText("HomePage");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pr.setColumns(20);
        pr.setRows(5);
        jScrollPane1.setViewportView(pr);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Get Record");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Enter ID for search");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(377, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(339, 339, 339))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(851, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed
     
    Patient getPData(int cid)
     {
         for(int i=0;i < allPatients.size();i++)
         {
             if(allPatients.get(i).getId()==cid)
             {
                 return allPatients.get(i);
             }
         }
         return null;
     }
    
    Medicine getMData(int cid)
     {
         for(int i=0;i < allMedicines.size();i++)
         {
             if(allMedicines.get(i).getId()==cid)
             {
                 return allMedicines.get(i);
             }
         }
         return null;
     }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(id.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter ID");
        }
        else
        {
            for(int i=0;i<allRecord.size();i++)
            {
                if(allRecord.get(i).getPatientID()== Integer.parseInt(id.getText()))
                {
                    pr.append("\nPatient Information\n");
                    Patient patient = getPData(allRecord.get(i).getPatientID());
                    pr.append("Patient name = "+patient.getName()+"\n");
                    pr.append("Patient contact = "+patient.getContact()+"\n");
                    pr.append("\n All recommended medicines\n");
                    ArrayList<Integer> temp = allRecord.get(i).getMedicineID();
                    for(int j=0;j<temp.size();j++)
                    {
                        Medicine medicine = getMData(temp.get(j));
                        
                        pr.append(medicine.getName()+"\n");
                    }
                    pr.append("\n Date "+allRecord.get(i).getDate());
                    pr.append("\n Recommendation "+allRecord.get(i).getRecommendation());
                    pr.append("\n*******************************************************************\n");
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea pr;
    // End of variables declaration//GEN-END:variables
}
