  
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.AdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.EducationInstituteEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.SuicideAwarenessEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PoliceDepartmentOrganization;
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
public class ManageWorkRequestSecurityJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageWorkRequestSecurityJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount ua;
    private Enterprise enterprise;
    private EcoSystem system;

    public ManageWorkRequestSecurityJPanel(JPanel userProcessContainer, UserAccount ua, Enterprise enterprise, EcoSystem system) {
      initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ua=ua;
        this.enterprise=enterprise;
        this.system=system;
        populateWorkRequest();
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

        btnBack = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));

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

        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "WorkRequestId", "Person", "Status", "Receiver"
            }
        ));
        jScrollPane1.setViewportView(tblWorkRequest);

        btnProcess.setBackground(new java.awt.Color(255, 51, 51));
        btnProcess.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Manage Work Requests - Security");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(228, 228, 228)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(194, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        ((CardLayout)userProcessContainer.getLayout()).previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblWorkRequest.getSelectedRow();
        if(selectedRow>-1)
        {
            WorkRequest wr=(WorkRequest) tblWorkRequest.getValueAt(selectedRow,0);
            if(!wr.getOl().equals(WorkRequest.OperationalLevel.Security))
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

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow=tblWorkRequest.getSelectedRow();
        if(selectedRow>-1)
        {
            WorkResponse wr=(WorkResponse) tblWorkRequest.getValueAt(selectedRow,0);
            if(!wr.getOl().equals(WorkRequest.OperationalLevel.Security))
            {
                JOptionPane.showMessageDialog(null,"Request is being serviced at "+wr.getOl().name() +" operational level","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
            if(wr.getReceiver()!=ua)
            {
                JOptionPane.showMessageDialog(null,"Request is not assigned to current user","WARNING",JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{

               // if(wr!=null)
               // {
               if(wr.getRtype().equals(WorkRequest.RequestType.CrimePrevention))
               {
                   
                   EducationInstituteEnterprise edu  = null;
                 
            for(Network net :system.getNetworkDir().getLstNetwork())
            {
              for(Enterprise etr:net.getEnterpriseDir().getLstEnterprises())
              {
                  if(etr.getEt().equals(Enterprise.ErpType.EducationInstitute))
                  {
                      edu=(EducationInstituteEnterprise) etr;
                      break;
                  }
              }
              if(edu!=null)
              {
                  break;
              }
            }
            if(edu!=null)
            {
              wr.setReceiver(null);
              wr.setOl(WorkRequest.OperationalLevel.Education);
              wr.setStatus("Pending-Request sent to Education Institute Enterprise");
              ua.getWorkQueue().getLstWorkRequest().add(wr);
              edu.getWorkQueue().getLstWorkRequest().add(wr);
              JOptionPane.showMessageDialog(null,"Request sent to Education Enterprise");
              populateWorkRequest(); 
            }
               
               
               }
               
               
               else{   PoliceDepartmentOrganization pdOrg=null;
                    
                        for(Organization org:enterprise.getOrdDir().getLstOrganisation())
                        {
                            if(org instanceof PoliceDepartmentOrganization)
                            {
                                pdOrg=(PoliceDepartmentOrganization) org;
                                break;
                            }
                        }
                        
                    
                    if(pdOrg!=null)
                    {
                        wr.setReceiver(null);
                        wr.setOl(WorkRequest.OperationalLevel.Police);
                        wr.setStatus("Pending-Request sent to Police Organization");                        
                        pdOrg.getWorkQueue().getLstWorkRequest().add(wr);
                        JOptionPane.showMessageDialog(null,"Request sent to Police Organization");
                        populateWorkRequest();
                    }
            }
            
        }}
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row from table","WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}
