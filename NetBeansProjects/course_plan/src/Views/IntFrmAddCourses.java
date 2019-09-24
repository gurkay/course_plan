/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Collections.CllNavigationButton;
import Models.MdlCourses;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author gurkay
 */
public class IntFrmAddCourses extends javax.swing.JInternalFrame {
    
    CllNavigationButton cllNavigationButton = new CllNavigationButton();
    
    /**
     * Creates new form IntFrmAddCourses
     */
    public IntFrmAddCourses() {
        initComponents();
        
        cllNavigationButton.refreshButton("refreshButtonIntFrmAddCourses");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPersonalInfo = new javax.swing.JPanel();
        lblCoursesID = new javax.swing.JLabel();
        txtCoursesID = new javax.swing.JTextField();
        lblCoursesName = new javax.swing.JLabel();
        scrPnlCourses = new javax.swing.JScrollPane();
        tblCourses = new javax.swing.JTable();
        scrPnlCoursesName = new javax.swing.JScrollPane();
        txtAreaCoursesName = new javax.swing.JTextArea();
        lblCoursesCode = new javax.swing.JLabel();
        txtCoursesCode = new javax.swing.JTextField();
        txtSearchCoursesName = new javax.swing.JTextField();
        lblSearchCoursesName = new javax.swing.JLabel();
        btnSearchCoursesName = new javax.swing.JButton();
        pnlNavigator = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setClosable(true);

        pnlPersonalInfo.setBackground(new java.awt.Color(124, 203, 237));

        lblCoursesID.setText("Courses ID");

        txtCoursesID.setEditable(false);

        lblCoursesName.setText("Kurs Adı");

        scrPnlCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scrPnlCoursesMouseClicked(evt);
            }
        });

        tblCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblCourses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCoursesMouseClicked(evt);
            }
        });
        scrPnlCourses.setViewportView(tblCourses);

        scrPnlCoursesName.setAutoscrolls(true);
        scrPnlCoursesName.setHorizontalScrollBar(null);

        txtAreaCoursesName.setColumns(20);
        txtAreaCoursesName.setLineWrap(true);
        txtAreaCoursesName.setRows(5);
        txtAreaCoursesName.setWrapStyleWord(true);
        scrPnlCoursesName.setViewportView(txtAreaCoursesName);

        lblCoursesCode.setText("Courses Code");

        txtSearchCoursesName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchCoursesNameKeyReleased(evt);
            }
        });

        lblSearchCoursesName.setText("Kurs Adına Göre Ara");

        btnSearchCoursesName.setText("Bul");

        javax.swing.GroupLayout pnlPersonalInfoLayout = new javax.swing.GroupLayout(pnlPersonalInfo);
        pnlPersonalInfo.setLayout(pnlPersonalInfoLayout);
        pnlPersonalInfoLayout.setHorizontalGroup(
            pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                        .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblCoursesID))
                            .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCoursesCode)))
                        .addGap(16, 16, 16)
                        .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCoursesID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCoursesCode)))
                    .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCoursesName)
                            .addComponent(scrPnlCoursesName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrPnlCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                        .addComponent(lblSearchCoursesName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchCoursesName, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearchCoursesName, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlPersonalInfoLayout.setVerticalGroup(
            pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCoursesID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoursesID)
                    .addComponent(lblSearchCoursesName)
                    .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSearchCoursesName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearchCoursesName)))
                .addGap(15, 15, 15)
                .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPersonalInfoLayout.createSequentialGroup()
                        .addGroup(pnlPersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCoursesCode)
                            .addComponent(txtCoursesCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblCoursesName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrPnlCoursesName, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrPnlCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlNavigator.setBackground(new java.awt.Color(137, 181, 209));

        btnNew.setText("Yeni");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Kaydet");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Güncelle");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnRefresh.setText("Yenile");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnDelete.setText("Sil");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNavigatorLayout = new javax.swing.GroupLayout(pnlNavigator);
        pnlNavigator.setLayout(pnlNavigatorLayout);
        pnlNavigatorLayout.setHorizontalGroup(
            pnlNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigatorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
        );
        pnlNavigatorLayout.setVerticalGroup(
            pnlNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigatorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNavigatorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlNavigator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(pnlPersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlNavigator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCoursesMouseClicked
        try {

            int selectedRow = tblCourses.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) tblCourses.getModel();

            MdlCourses mdlCourses = new MdlCourses();
            String query = "SELECT c.courses_id, c.courses_name, c.courses_code FROM courses c "
                    + "WHERE c.courses_id = " + Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

            List<Object[]> result = mdlCourses.selectCourses("recordCourses", query);

            String arrayHeader[] = {"ID", "Kurs Adı", "Kurs Kodu"};
            DefaultTableModel table = new DefaultTableModel(arrayHeader, 0);
            for (Object[] temp : result) {
                table.addRow(temp);
            }
            
            txtCoursesID.setText(table.getValueAt(0, 0).toString());
            txtAreaCoursesName.setText(table.getValueAt(0, 1).toString());
            txtCoursesCode.setText(table.getValueAt(0, 2).toString());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
    }//GEN-LAST:event_tblCoursesMouseClicked

    private void scrPnlCoursesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scrPnlCoursesMouseClicked

    }//GEN-LAST:event_scrPnlCoursesMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        cllNavigationButton.newButton("newButtonIntFrmAddCourses");
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtAreaCoursesName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kurs Adı Giriniz");
        } else {
            cllNavigationButton.saveButton("saveButtonIntFrmAddCourses");
            cllNavigationButton.refreshButton("refreshButtonIntFrmAddCourses");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (txtAreaCoursesName.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Kurs Adı Giriniz");
        } else {
            cllNavigationButton.updateButton("updateButtonIntFrmAddCourses");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        cllNavigationButton.refreshButton("refreshButtonIntFrmAddCourses");
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (txtCoursesID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Lütfen Silinecek Kursu seçiniz");
        } else {
            cllNavigationButton.deleteButton("deleteButtonIntFrmAddCourses");
            cllNavigationButton.newButton("newButtonIntFrmAddCourses");
            cllNavigationButton.refreshButton("refreshButtonIntFrmAddCourses");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchCoursesNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchCoursesNameKeyReleased
        //String query = txtSearchCoursesName.getText().toLowerCase();
        //filter(query);
    }//GEN-LAST:event_txtSearchCoursesNameKeyReleased

    /**
     * To Filter Table Row data info
     */
    private void filter(String query) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>((DefaultTableModel) tblCourses.getModel());
        tblCourses.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchCoursesName;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblCoursesCode;
    private javax.swing.JLabel lblCoursesID;
    private javax.swing.JLabel lblCoursesName;
    private javax.swing.JLabel lblSearchCoursesName;
    private javax.swing.JPanel pnlNavigator;
    private javax.swing.JPanel pnlPersonalInfo;
    public static javax.swing.JScrollPane scrPnlCourses;
    public static javax.swing.JScrollPane scrPnlCoursesName;
    public static javax.swing.JTable tblCourses;
    public static javax.swing.JTextArea txtAreaCoursesName;
    public static javax.swing.JTextField txtCoursesCode;
    public static javax.swing.JTextField txtCoursesID;
    public static javax.swing.JTextField txtSearchCoursesName;
    // End of variables declaration//GEN-END:variables
}