/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.SystemAdmin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Chaitanya
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateTree();
    }

    public void populateTree() {

        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();

        ArrayList<Network> networkList = business.getNetworkDir().getLstNetwork();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getCityName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDir().getLstEnterprises();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrdDir().getLstOrganisation();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }

        model.reload();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        rightPane = new javax.swing.JPanel();
        sysAdminLabel = new javax.swing.JLabel();
        manageNetworksBtn = new javax.swing.JButton();
        manageEnterpriseBtn = new javax.swing.JButton();
        manageOrganizationBtn = new javax.swing.JButton();
        selectNode = new javax.swing.JLabel();
        selectedNodeLabel = new javax.swing.JLabel();
        leftPane = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();

        rightPane.setBackground(new java.awt.Color(204, 255, 255));

        sysAdminLabel.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        sysAdminLabel.setText("System Admin Work Area");

        manageNetworksBtn.setBackground(new java.awt.Color(255, 51, 51));
        manageNetworksBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        manageNetworksBtn.setText("Manage Networks");
        manageNetworksBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageNetworksBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworksBtnActionPerformed(evt);
            }
        });

        manageEnterpriseBtn.setBackground(new java.awt.Color(255, 51, 51));
        manageEnterpriseBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        manageEnterpriseBtn.setText("Manage Enterprises");
        manageEnterpriseBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseBtnActionPerformed(evt);
            }
        });

        manageOrganizationBtn.setBackground(new java.awt.Color(255, 51, 51));
        manageOrganizationBtn.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        manageOrganizationBtn.setText("Manage Enterprise Admin");
        manageOrganizationBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manageOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationBtnActionPerformed(evt);
            }
        });

        selectNode.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 16)); // NOI18N
        selectNode.setText("Selected Node:");

        javax.swing.GroupLayout rightPaneLayout = new javax.swing.GroupLayout(rightPane);
        rightPane.setLayout(rightPaneLayout);
        rightPaneLayout.setHorizontalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPaneLayout.createSequentialGroup()
                .addGroup(rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightPaneLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightPaneLayout.createSequentialGroup()
                                .addComponent(selectNode)
                                .addGap(18, 18, 18)
                                .addComponent(selectedNodeLabel))
                            .addComponent(sysAdminLabel)))
                    .addGroup(rightPaneLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(manageNetworksBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageEnterpriseBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageOrganizationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        rightPaneLayout.setVerticalGroup(
            rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPaneLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(sysAdminLabel)
                .addGap(18, 18, 18)
                .addGroup(rightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectNode)
                    .addComponent(selectedNodeLabel))
                .addGap(30, 30, 30)
                .addComponent(manageNetworksBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(manageEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(manageOrganizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        splitPane.setRightComponent(rightPane);

        leftPane.setBackground(new java.awt.Color(0, 204, 204));

        jTree.setFont(new java.awt.Font("Franklin Gothic Medium", 0, 16)); // NOI18N
        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(leftPane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(splitPane)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged
        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            selectedNodeLabel.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    private void manageNetworksBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworksBtnActionPerformed
        ManageNetworksJPanel manageNetworks = new ManageNetworksJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageEnterpriseJPanel", manageNetworks);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageNetworksBtnActionPerformed

    private void manageEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseBtnActionPerformed
        ManageEnterprisesJPanel manageEnterprise = new ManageEnterprisesJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageEnterpriseJPanel", manageEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEnterpriseBtnActionPerformed

    private void manageOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationBtnActionPerformed
        ManageEnterpriseAdminJPanel manageAdminEnterprise = new ManageEnterpriseAdminJPanel(userProcessContainer, business);
        userProcessContainer.add("ManageEnterpriseAdminJPanel", manageAdminEnterprise);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JPanel leftPane;
    private javax.swing.JButton manageEnterpriseBtn;
    private javax.swing.JButton manageNetworksBtn;
    private javax.swing.JButton manageOrganizationBtn;
    private javax.swing.JPanel rightPane;
    private javax.swing.JLabel selectNode;
    private javax.swing.JLabel selectedNodeLabel;
    private javax.swing.JSplitPane splitPane;
    private javax.swing.JLabel sysAdminLabel;
    // End of variables declaration//GEN-END:variables
}