/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import java.io.File;
import java.io.FileWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author HP
 */
public class CheckUp extends javax.swing.JFrame {
     ArrayList<Medicine> allMedicines = new ArrayList<>();
     ArrayList<Patient> allPatients = new ArrayList<>();
     ArrayList<BillingInfo> allRecord = new ArrayList<>();
    
  
    public CheckUp() {
        initComponents();
        readAllMData();
        readAllPData();
        LoadMed();
        readAllRData();
        
    }
    void LoadMed()
    {
        allM.removeAllItems();
        for(int i=0;i < allMedicines.size();i++)
        {
            allM.addItem(allMedicines.get(i).getId()+";"+allMedicines.get(i).getName());
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
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        allM = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        mList = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fee = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        rec = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        quantity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkup.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setText("CheckUp Menu");

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
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Patient ID");

        id.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Medicines");

        allM.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        allM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        allM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allMActionPerformed(evt);
            }
        });

        mList.setColumns(20);
        mList.setRows(5);
        jScrollPane1.setViewportView(mList);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 255, 0));
        jButton1.setText("Add Medicines");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Medicines List");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Fee");

        fee.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        rec.setColumns(20);
        rec.setRows(5);
        jScrollPane2.setViewportView(rec);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Recommendation");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 255, 0));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Quantity");

        quantity.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fee, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(allM, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quantity))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(387, 387, 387)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(152, 152, 152))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(allM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(982, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        new HomePage().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
   boolean  patientIdExist()
   {
       for(int i=0; i < allPatients.size();i++)
       {
           if(id.getText().equals(allPatients.get(i).getId()+""))
           {
               return false;
           }
       }
       
       return true;
   }
       
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       String Bill ="";
            int total = 0;
        if(id.getText().equals("")|| fee.getText().equals("")|| rec.getText().equals(""))
       {
           JOptionPane.showMessageDialog(null,"All fields are required");
       }
        
       else if(patientIdExist())
        {
            JOptionPane.showMessageDialog(null,"Patient Id did not exist");
        }
        else
        {
              
            BillingInfo billingInfo = new BillingInfo();
            
            billingInfo.setPatientID(Integer.parseInt(id.getText()));
            billingInfo.setFee(Integer.parseInt(fee.getText()));
            String[] Mdata = mList.getText().split("\n");
            
            for(int i=0;i<Mdata.length;i++){          
                billingInfo.setMedicineID(Integer.parseInt(Mdata[i].split(";")[0]));
                int curQ = Integer.parseInt(Mdata[i].split(";")[2]);
                int curID = Integer.parseInt(Mdata[i].split(";")[0]);
                for(int j=0;j<allMedicines.size();j++) {              
                    if(allMedicines.get(j).getId()==curID)
                    {
                        Bill += allMedicines.get(j).getName()+"  =  "+allMedicines.get(j).getSellingPrice()+"\n";
                        total += allMedicines.get(j).getSellingPrice();
                        allMedicines.get(j).setQuantity(allMedicines.get(j).getQuantity()-curQ);
                    }
                }
            }
            billingInfo.setRecommendation(rec.getText());
            DateFormat cDateFormat = new SimpleDateFormat("dd:MM:yyyy");
            Date cdate = new Date();
            billingInfo.setDate(cDateFormat.format(cdate));
            allRecord.add(billingInfo);
        }
       saveAllMData();
       saveAllRData();
       Bill += "\nTotal Medicines cost= "+total;
       Bill += "\nDoctor fee = "+fee.getText();
       Bill += "\nTotal = "+ (total+Integer.parseInt(fee.getText()));
       JOptionPane.showMessageDialog(null,"Your Bill \n"+ Bill);
       id.setText("");
       fee.setText("");
       rec.setText("");
       mList.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    boolean checkForQuantity()
    {
        int currMId = Integer.parseInt(allM.getSelectedItem().toString().split(";")[0]);
        for(int i=0; i < allMedicines.size();i++)
        {
            if(currMId == allMedicines.get(i).getId())
            {
                if(Integer.parseInt(quantity.getText()) > allMedicines.get(i).getQuantity())
                    return true;
            }
        }
        
        
        return false;
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if(quantity.getText().equals("")|| allM.getSelectedItem().toString().equals(""))
       {
           JOptionPane.showMessageDialog(null,"Please select medicine or enter quantity");
       }
       else if(checkForQuantity())
       {
           JOptionPane.showMessageDialog(null,"Current quantity is greater than available quantity");
       }
       else
       {
           mList.append(allM.getSelectedItem()+";"+quantity.getText()+"\n");
           quantity.setText("");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void allMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allMActionPerformed

    void saveAllMData()
       {
           try{
               FileWriter fileWriter = new FileWriter("MData.txt");
               for(int i=0;i<allMedicines.size();i++)
               {
                   fileWriter.write(allMedicines.get(i).getId()+";"+allMedicines.get(i).getName()+";"+allMedicines.get(i).getSellingPrice()+";"+allMedicines.get(i).getBuyingPrice()+";"+allMedicines.get(i).getQuantity()+";"+allMedicines.get(i).getDescription()+"\n");
               }
               fileWriter.close();
               
           } catch(Exception e){
               
           }
       }
    
    void saveAllRData()
       {
           try{
               FileWriter fileWriter = new FileWriter("Record.txt");
               for(int i=0;i<allRecord.size();i++)
               {
                   fileWriter.append(allRecord.get(i).getPatientID()+";"+allRecord.get(i).getFee()+";"+allRecord.get(i).getRecommendation()+";"+allRecord.get(i).getDate()+";");
                  ArrayList<Integer> temp = allRecord.get(i).getMedicineID();
                   for(int j=0;j < temp.size();j++)
                   {
                       fileWriter.append(temp.get(j)+";");
                   }
                   fileWriter.append("\n");
               }
               fileWriter.close();
               
           } catch(Exception e){
               
           }
       }
    
    void saveAllPData()
       {
           try{
               FileWriter fileWriter = new FileWriter("PData.txt");
               for(int i=0;i<allPatients.size();i++)
               {
                   fileWriter.write(allPatients.get(i).getId()+";"+allPatients.get(i).getName()+";"+allPatients.get(i).getAge()+";"+allPatients.get(i).getGender()+";"+allPatients.get(i).getAddress()+";"+allPatients.get(i).getContact()+"\n");
               }
               fileWriter.close();
               
           } catch(Exception e){
               
           }
       }
    
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
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> allM;
    private javax.swing.JTextField fee;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea mList;
    private javax.swing.JTextField quantity;
    private javax.swing.JTextArea rec;
    // End of variables declaration//GEN-END:variables
}
