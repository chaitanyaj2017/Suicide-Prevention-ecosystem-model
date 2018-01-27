/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.CounsellorWorkAreaa;

import Business.DrugAbuseControl.DrugEvaluation;
import Business.DrugAbuseControl.DrugReport;
import Business.EcoSystem;
import Business.Enterprise.DrugFreeEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.User.UserAccount;
import Business.WorkRequest.WorkResponse;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.WorkRequest.WorkRequest;
import java.awt.CardLayout;

/**
 *
 * @author Suyog Sathe
 */
public class CounsellingQuestionnaireJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private WorkResponse wr;
    private UserAccount account;
    private Organization organisation;
    private Enterprise etrp;
    private EcoSystem business;

    CounsellingQuestionnaireJPanel(JPanel userProcessContainer, WorkResponse wr, UserAccount account, Organization organisation, Enterprise etrp, EcoSystem business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.wr=wr;
        this.account=account;
        this.organisation=organisation;
        this.etrp=etrp;
        this.business=business;
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        q1yes = new javax.swing.JRadioButton();
        q1no = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        q2yes = new javax.swing.JRadioButton();
        q2no = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        q3yes = new javax.swing.JRadioButton();
        q3no = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        q4yes = new javax.swing.JRadioButton();
        q4no = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        q5yes = new javax.swing.JRadioButton();
        q5no = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        q6no = new javax.swing.JRadioButton();
        q6yes = new javax.swing.JRadioButton();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("Counsellor Questionnaire:");

        jLabel2.setText("Have you ever seen a counselor before? ");

        buttonGroup1.add(q1yes);
        q1yes.setText("Yes");

        buttonGroup1.add(q1no);
        q1no.setText("No");

        jLabel3.setText("Do you consider yourself to have a low, average or high interpersonal I.Q.?");

        buttonGroup2.add(q2yes);
        q2yes.setText("Yes");

        buttonGroup2.add(q2no);
        q2no.setText("No");

        jLabel4.setText("If you had a magic red button in front of you which will make your problem disappear, would you press it?");

        buttonGroup3.add(q3yes);
        q3yes.setText("Yes");

        buttonGroup3.add(q3no);
        q3no.setText("No");

        jLabel5.setText("Are you scared?");

        buttonGroup4.add(q4yes);
        q4yes.setText("Yes");

        buttonGroup4.add(q4no);
        q4no.setText("No");

        jLabel6.setText("Did you start taking drugs on your own or somebody forced you to do so?");

        buttonGroup5.add(q5yes);
        q5yes.setText("Yes");

        buttonGroup5.add(q5no);
        q5no.setText("No");

        jLabel7.setText("Are you willing to quit your drug habit?");

        buttonGroup6.add(q6no);
        q6no.setText("No");

        buttonGroup6.add(q6yes);
        q6yes.setText("Yes");

        submitBtn.setBackground(new java.awt.Color(255, 51, 51));
        submitBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        submitBtn.setText("SUBMIT");
        submitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 51, 51));
        backBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        backBtn.setText("BACK");
        backBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(backBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q5yes)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(q1yes, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(q2yes)
                                            .addComponent(q3yes)
                                            .addComponent(q4yes)
                                            .addComponent(q6yes)))
                                    .addGap(77, 77, 77)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(q2no)
                                .addComponent(q3no)
                                .addComponent(q1no)
                                .addComponent(q4no)
                                .addComponent(q5no)
                                .addComponent(q6no)))))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q1yes)
                    .addComponent(q1no)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q2yes)
                    .addComponent(q2no)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q3yes)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q3no)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(q4yes)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(q4no)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q5yes)
                    .addComponent(q5no)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(q6yes)
                    .addComponent(q6no)
                    .addComponent(jLabel7))
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(149, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
       //        int selectedRow = advisorTable.getSelectedRow();
//        if (selectedRow > -1) {
//            WorkResponse wr = (WorkResponse) counsellorTable.getValueAt(selectedRow, 0);
            if (wr != null) {
                if (!wr.getOl().equals(WorkRequest.OperationalLevel.CounsellingOrganization)) {
                    JOptionPane.showMessageDialog(null, "Request is being serviced at " + wr.getOl().name() + " operational level", "WARNING", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (wr.getReceiver() != account) {
                    JOptionPane.showMessageDialog(null, "Request is not assigned to current user", "WARNING", JOptionPane.WARNING_MESSAGE);
                    return;
                }
//                CounsellorOrganization co = null;
//                AddictionRecoveryOrganization aro = null;
//                if (wr.getResult()[0].equals("Mediums")) {
////            for(Network net :system.getNetworkDir().getLstNetwork())
//                    // {
//                    for (Organization o : enterprise.getOrdDir().getLstOrganisation()) {
//                        if (o instanceof AddictionRecoveryOrganization) {
//                            aro = (AddictionRecoveryOrganization) o;
//                            break;
//                        }
//                    }
//              if(aro!=null)
//              {
//                  break;
//              }

                //if (aro != null) {
               
                 int count = 0;
        if (!wr.isIsComplete()) {
            if (!q1yes.isSelected() && !q1no.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select atleast one option", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (q1yes.isSelected()) {
                count++;
            }
            if (!q2yes.isSelected() && !q2no.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select atleast one option", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (q2yes.isSelected()) {
                count++;
            }
            if (!q3yes.isSelected() && !q3no.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select atleast one option", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (q3yes.isSelected()) {
                count++;
            }
            if (!q4yes.isSelected() && !q4no.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select atleast one option", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (q4yes.isSelected()) {
                count++;
            }
            if (!q5yes.isSelected() && !q5no.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select atleast one option", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (q5yes.isSelected()) {
                count++;
            }
            if (!q6yes.isSelected() && !q6no.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select atleast one option", "WARNING", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (q6yes.isSelected()) {
                count++;
            }

            DrugEvaluation de = (DrugEvaluation) wr.getResult()[0];
            
            if(de!=null)
        {
        int sum=de.getC();
        sum=sum+count*2;
        de.setC(sum);
        }
        //wr.setReceiver(null);
        DrugFreeEnterprise dfe=null;
        if(etrp instanceof DrugFreeEnterprise)
        {     
           dfe =(DrugFreeEnterprise) etrp;
        }
        boolean flag=true;
        if(dfe!=null)
        {
            for(DrugEvaluation dev:dfe.getDrugRep().getLstDrugEvaluation())
            {
                if(dev.getP()==wr.getPerson())
                {
                  flag=false;  
                }
            }
            if(flag)
            dfe.getDrugRep().addDrugEvaluation(de); 
        }
            //dre.addDrugEvaluation(de);
           
        wr.setIsComplete(true);
         wr.setReceiver(null);
               
                //wr.setOl(WorkRequest.OperationalLevel.AddictionRecovery);
                wr.setStatus("Completed");
//                        ua.getWorkQueue().getLstWorkRequest().add(wr);
//                        aro.getWorkQueue().getLstWorkRequest().add(wr);
                JOptionPane.showMessageDialog(null, "Person has been registered for the Counselling program successfully!!");
        
       
        }
         wr.setIsComplete(true);
        }
            
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        userProcessContainer.remove(this);
        ((CardLayout) userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton q1no;
    private javax.swing.JRadioButton q1yes;
    private javax.swing.JRadioButton q2no;
    private javax.swing.JRadioButton q2yes;
    private javax.swing.JRadioButton q3no;
    private javax.swing.JRadioButton q3yes;
    private javax.swing.JRadioButton q4no;
    private javax.swing.JRadioButton q4yes;
    private javax.swing.JRadioButton q5no;
    private javax.swing.JRadioButton q5yes;
    private javax.swing.JRadioButton q6no;
    private javax.swing.JRadioButton q6yes;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
