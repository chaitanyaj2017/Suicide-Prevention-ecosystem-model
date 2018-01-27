/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AddictionRecoveryOrganization;
import Business.Organization.CounsellorOrganization;
import Business.Organization.InstituteRehabOrganization;
import Business.Organization.Organization;
import static Business.Organization.Organization.OrgType.InstituteRehabOrganization;
import Business.Organization.RegistrationOrganization;
import Business.User.UserAccount;
import Business.WorkRequest.WorkRequest;
import Business.WorkRequest.WorkResponse;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chaitanya
 */
public class ManageWorkRequestEducationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestEducationJPanel
     */
       private JPanel userProcessContainer;
    private UserAccount ua;
    private Enterprise enterprise;
    private EcoSystem system;

    ManageWorkRequestEducationJPanel(JPanel userProcessContainer, UserAccount ua, Enterprise enterprise, EcoSystem system) {
         initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ua=ua;
        this.enterprise=enterprise;
        this.system=system;
        populateWorkRequest();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void populateWorkRequest()
    {
        DefaultTableModel dtm=(DefaultTableModel) tblWorkRequest.getModel();
        dtm.setRowCount(0);
        for(WorkRequest wr:enterprise.getWorkQueue().getLstWorkRequest())
        {
            Object[] row=new Object[4];
            row[0]=wr;
            row[1]=wr.getPerson();
            row[2]=wr.getStatus();
            row[3]=wr.getReceiver();
            dtm.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Work Requests - Education");

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkRequestId", "Person", "Status", "Receiver"
            }
        ));
        jScrollPane1.setViewportView(tblWorkRequest);

        btnBack.setBackground(new java.awt.Color(255, 51, 51));
        btnBack.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAssign.setBackground(new java.awt.Color(255, 51, 51));
        btnAssign.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnProcess.setBackground(new java.awt.Color(255, 51, 51));
        btnProcess.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = tblWorkRequest.getSelectedRow();
        if (selectedRow > -1) {
            WorkResponse wr = (WorkResponse) tblWorkRequest.getValueAt(selectedRow, 0);
            if (wr != null) {
                if (!wr.getOl().equals(WorkRequest.OperationalLevel.Education )) {
                    JOptionPane.showMessageDialog(null, "Request is being serviced at " + wr.getOl().name() + " operational level", "WARNING", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                if (wr.getReceiver() != ua) {
                    JOptionPane.showMessageDialog(null, "Request is not assigned to current user", "WARNING", JOptionPane.WARNING_MESSAGE);
                    return;
                }
              RegistrationOrganization  ir = null;
         //       AddictionRecoveryOrganization aro = null;
               // if (wr.getResult()[0].equals("Mediums")) {
//            for(Network net :system.getNetworkDir().getLstNetwork())
                    // {
                    for (Organization o : enterprise.getOrdDir().getLstOrganisation()) {
                        if (o instanceof RegistrationOrganization) {
                            ir = (RegistrationOrganization) o;
                            break;
                        }
                    }
//              if(ir!=null)
//              {
//                  break;
//              }

                    if (ir != null) {
                        wr.setReceiver(null);
                        wr.setOl(WorkRequest.OperationalLevel.InstituteReception);
                        wr.setStatus("Pending-Request sent to Institution Registration Organization");
                        ua.getWorkQueue().getLstWorkRequest().add(wr);
                        ir.getWorkQueue().getLstWorkRequest().add(wr);
                        JOptionPane.showMessageDialog(null, "Request sent to Institution Registration Organization");
                        populateWorkRequest();
                    }
                } else {
//                for(Network net :system.getNetworkDir().getLstNetwork())
//            {
//                    for (Organization o : enterprise.getOrdDir().getLstOrganisation()) {
//                        if (o instanceof CounsellorOrganization) {
//                            co = (CounsellorOrganization) o;
//                            break;
//                        }
//                    }
//                    if (co != null) {
//                        break;
//                    }
                    //    }
//                    if (co != null) {
//                        wr.setReceiver(null);
//                        wr.setOl(WorkRequest.OperationalLevel.CounsellingOrganization); //to put enterprises and organizations in operational level
//                        co.getWorkQueue().getLstWorkRequest().add(wr);
//                        ua.getWorkQueue().getLstWorkRequest().add(wr);
//                        wr.setStatus("Pending-Request sent to Counselling Organization");
//                        JOptionPane.showMessageDialog(null, "Request sent to Counselling Organization");
//                        populateTable();
//                    }
//
//                }
//                //
//
//            }
        
            JOptionPane.showMessageDialog(null, "Please select a row from table", "WARNING", JOptionPane.WARNING_MESSAGE);
        }

//        int selectedRow=tblWorkRequest.getSelectedRow();
//        if(selectedRow>-1)
//        {
//            WorkResponse wr=(WorkResponse) tblWorkRequest.getValueAt(selectedRow,0);
//            if(wr!=null)
//            {
//                if(!wr.getOl().equals(WorkRequest.OperationalLevel.Hospital))
//                {
//                    JOptionPane.showMessageDialog(null,"Request is being serviced at "+wr.getOl().name() +" operational level","WARNING",JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
//                if(wr.getReceiver()!=ua)
//                {
//                    JOptionPane.showMessageDialog(null,"Request is not assigned to current user","WARNING",JOptionPane.WARNING_MESSAGE);
//                    return;
//                }
//                SuicideAwarenessEnterprise sae=null;
//                DrugFreeEnterprise dre = null;
//                if(wr.getRtype().equals(WorkRequest.RequestType.SuicidePrevention))
//                {
//                    for(Network net :system.getNetworkDir().getLstNetwork())
//                    {
//                        for(Enterprise etr:net.getEnterpriseDir().getLstEnterprises())
//                        {
//                            if(etr.getEt().equals(Enterprise.ErpType.SuicideAwareness))
//                            {
//                                sae=(SuicideAwarenessEnterprise) etr;
//                                break;
//                            }
//                        }
//                        if(sae!=null)
//                        {
//                            break;
//                        }
//                    }
//                    if(sae!=null)
//                    {
//                        wr.setReceiver(null);
//                        wr.setOl(WorkRequest.OperationalLevel.SP);
//                        wr.setStatus("Pending-Request sent to Suicide Prevention Enterprise");
//                        ua.getWorkQueue().getLstWorkRequest().add(wr);
//                        sae.getWorkQueue().getLstWorkRequest().add(wr);
//                        JOptionPane.showMessageDialog(null,"Request sent to Suicide Prevention");
//                        populateWorkRequest();
//                    }
//                }
//                else
//                {
//                    for(Network net :system.getNetworkDir().getLstNetwork())
//                    {
//                        for(Enterprise etr:net.getEnterpriseDir().getLstEnterprises())
//                        {
//                            if(etr.getEt().equals(Enterprise.ErpType.DrugFree))
//                            {
//                                dre=(DrugFreeEnterprise) etr;
//                                break;
//                            }
//                        }
//                        if(dre!=null)
//                        {
//                            break;
//                        }
//                    }
//                    if(dre!=null)
//                    {
//                        wr.setReceiver(null);
//                        wr.setOl(WorkRequest.OperationalLevel.DrugFree); //to put enterprises and organizations in operational level
//                        dre.getWorkQueue().getLstWorkRequest().add(wr);
//                        String priority="Medium";
//                        Object[] obj=new Object[2];
//                        obj[0]=priority;
//                        obj[1]=true;
//                        wr.setResult(obj);
//                        ua.getWorkQueue().getLstWorkRequest().add(wr);
//                        wr.setStatus("Pending-Request sent to Drug Free Enterprise");
//                        JOptionPane.showMessageDialog(null,"Request sent to Drug Free Enterprise");
//                        populateWorkRequest();
//                    }
//
//                }
//                //
//
//            }
//        }
//        else
//        {
//            JOptionPane.showMessageDialog(null,"Please select a row from table","WARNING",JOptionPane.WARNING_MESSAGE);
//        }
    }//GEN-LAST:event_btnProcessActionPerformed
    }
    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblWorkRequest.getSelectedRow();
        if(selectedRow>-1)
        {
            WorkRequest wr=(WorkRequest) tblWorkRequest.getValueAt(selectedRow,0);
            if(!wr.getOl().equals(WorkRequest.OperationalLevel.Education))
            {
                JOptionPane.showMessageDialog(null,"Request is being serviced at "+wr.getOl().name() +" operational level","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(wr.getReceiver()!=null && wr.getReceiver()!=ua)
            {
                JOptionPane.showMessageDialog(null,"Request is assigned to some other user","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(wr.getReceiver()==ua)
            {

                JOptionPane.showMessageDialog(null,"Request already assigned to current user","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }

            wr.setReceiver(ua);
            // wr.setOl(WorkRequest.OperationalLevel.Lab);
            JOptionPane.showMessageDialog(null,"Request id - "+wr.getRequestId()+" has been assigned to you!");
            populateWorkRequest();

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a request from table","WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}