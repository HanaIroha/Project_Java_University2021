/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import Model.BacLuongModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import DAO.implement.BacLuong;
import Model.BacLuongTableModel;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Iroha
 */
public class salaryCalculatorEdit extends javax.swing.JDialog {

    hosoPanel previousPanel;
    
    /**
     * Creates new form detailInfor
     */
    public salaryCalculatorEdit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        prepare();
    }
    
    public void prepare(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 0));
        this.setBackground(new java.awt.Color(255, 255, 255, 0));
        table_luong.getTableHeader().setDefaultRenderer(new HeaderColor());
        table_luong.getTableHeader().setBackground(new Color(82,147,255));
        table_luong.getTableHeader().setBackground(new Color(32, 136, 203));
        loadTableData();
        table_luong.revalidate();
        
        getSetting();
    }
    
    public void loadTableData(){
        List<BacLuongModel> luong = new BacLuong().getBacLuong();
        table_luong.setModel(new BacLuongTableModel(luong));
    }
    
    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setOpaque(false);
            setFont(new Font("Times New Roman", Font.BOLD, 16));
            setForeground(new Color(255,255,255));
            setPreferredSize(new Dimension(1230, 35));
            return this;
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
        txt_heso = new javax.swing.JTextField();
        txt_luongcoban = new javax.swing.JTextField();
        txt_namthamnien = new javax.swing.JTextField();
        txt_thuongthamnien = new javax.swing.JTextField();
        txt_thuongthamnienthem = new javax.swing.JTextField();
        txt_baohiem = new javax.swing.JTextField();
        txt_bac = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_updateluong = new javax.swing.JButton();
        btn_deleteluong = new javax.swing.JButton();
        btn_addluong = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_luong = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_heso.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_heso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_heso, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 80, -1));

        txt_luongcoban.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_luongcoban.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_luongcoban, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 320, -1));

        txt_namthamnien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_namthamnien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_namthamnien, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 170, -1));

        txt_thuongthamnien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_thuongthamnien.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_thuongthamnien, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 150, -1));

        txt_thuongthamnienthem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_thuongthamnienthem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_thuongthamnienthem, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 240, 150, -1));

        txt_baohiem.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_baohiem.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_baohiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 300, -1));

        txt_bac.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_bac.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txt_bac, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 90, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hệ số:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Bậc:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lương cơ bản:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Số năm bắt đầu hưởng thâm niêm:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phần trăm thưởng thâm niên cơ bản:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Phần năm thâm niên thêm từng năm:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số tiền bảo hiểm:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        btn_updateluong.setBackground(new java.awt.Color(24, 98, 151));
        btn_updateluong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_updateluong.setForeground(new java.awt.Color(255, 255, 255));
        btn_updateluong.setText("Sửa bậc lương");
        btn_updateluong.setBorder(null);
        btn_updateluong.setBorderPainted(false);
        btn_updateluong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_updateluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateluongActionPerformed(evt);
            }
        });
        jPanel1.add(btn_updateluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 40));

        btn_deleteluong.setBackground(new java.awt.Color(24, 98, 151));
        btn_deleteluong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_deleteluong.setForeground(new java.awt.Color(255, 255, 255));
        btn_deleteluong.setText("Xoá bậc lương");
        btn_deleteluong.setBorder(null);
        btn_deleteluong.setBorderPainted(false);
        btn_deleteluong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_deleteluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteluongActionPerformed(evt);
            }
        });
        jPanel1.add(btn_deleteluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 140, 40));

        btn_addluong.setBackground(new java.awt.Color(24, 98, 151));
        btn_addluong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_addluong.setForeground(new java.awt.Color(255, 255, 255));
        btn_addluong.setText("Thêm bậc lương");
        btn_addluong.setBorder(null);
        btn_addluong.setBorderPainted(false);
        btn_addluong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_addluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addluongActionPerformed(evt);
            }
        });
        jPanel1.add(btn_addluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 140, 40));

        btn_save.setBackground(new java.awt.Color(24, 98, 151));
        btn_save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Lưu");
        btn_save.setBorder(null);
        btn_save.setBorderPainted(false);
        btn_save.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 500, 170, 50));

        btn_cancel.setBackground(new java.awt.Color(24, 98, 151));
        btn_cancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Huỷ");
        btn_cancel.setBorder(null);
        btn_cancel.setBorderPainted(false);
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 500, 170, 50));

        table_luong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        table_luong.setCellSelectionEnabled(true);
        table_luong.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table_luong.setFocusable(false);
        table_luong.setGridColor(new java.awt.Color(204, 204, 204));
        table_luong.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_luong.setRowHeight(25);
        table_luong.setSelectionBackground(new java.awt.Color(255, 102, 102));
        table_luong.setShowVerticalLines(false);
        table_luong.getTableHeader().setReorderingAllowed(false);
        table_luong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_luongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_luong);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 260, 400));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 10, 390));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/salaryCalculatorEdit.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1000, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        saveSetting();
        this.dispose();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void saveSetting(){
        JSONObject settingfile = new JSONObject();
        settingfile.put("LuongCoBan", Double.valueOf(txt_luongcoban.getText()));
        settingfile.put("NamThamNien", Integer.valueOf(txt_namthamnien.getText()));
        settingfile.put("ThuongThamNien", Double.valueOf(txt_thuongthamnien.getText()));
        settingfile.put("ThuongThemThamNien", Double.valueOf(txt_thuongthamnienthem.getText()));
        settingfile.put("BaoHiem",Double.valueOf(txt_baohiem.getText()));
        try (FileWriter file = new FileWriter(System.getProperty("user.dir") + "\\settings.json")) {
            file.write(settingfile.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void getSetting(){
        JSONParser parser = new JSONParser();

        try (Reader reader = new FileReader(System.getProperty("user.dir") + "\\settings.json")) {

            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            txt_luongcoban.setText(String.valueOf(jsonObject.get("LuongCoBan")));
            txt_namthamnien.setText(String.valueOf(jsonObject.get("NamThamNien")));
            txt_thuongthamnien.setText(String.valueOf(jsonObject.get("ThuongThamNien")));
            txt_thuongthamnienthem.setText(String.valueOf(jsonObject.get("ThuongThemThamNien")));
            txt_baohiem.setText(String.valueOf(jsonObject.get("BaoHiem")));
            

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(salaryCalculatorEdit.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void btn_addluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addluongActionPerformed
        int bl = Integer.valueOf(txt_bac.getText());
        if(!new BacLuong().CheckBacLuong(bl)){
            Double hsl = Double.valueOf(txt_heso.getText());
            if(new BacLuong().ThemBacLuong(bl, hsl))
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
            loadTableData();
        }
        else{
            JOptionPane.showMessageDialog(this, "Bậc lương này đã tồn tại!");
        }
        
    }//GEN-LAST:event_btn_addluongActionPerformed

    private void btn_deleteluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteluongActionPerformed
        int bl = Integer.valueOf(txt_bac.getText());
        if(new BacLuong().CheckBacLuong(bl)){
            if(new BacLuong().XoaBacLuong(bl))
                JOptionPane.showMessageDialog(this, "Xoá thành công!");
            loadTableData();
        }
        else{
            JOptionPane.showMessageDialog(this, "Bậc lương này không tồn tại!");
        }
    }//GEN-LAST:event_btn_deleteluongActionPerformed

    private void btn_updateluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateluongActionPerformed
        int bl = Integer.valueOf(txt_bac.getText());
        if(new BacLuong().CheckBacLuong(bl)){
            Double hsl = Double.valueOf(txt_heso.getText());
            if(new BacLuong().SuaBacLuong(bl, hsl))
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
            loadTableData();
        }
        else{
            JOptionPane.showMessageDialog(this, "Bậc lương này không tồn tại!");
        }
    }//GEN-LAST:event_btn_updateluongActionPerformed

    private void table_luongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_luongMouseClicked
        int row = table_luong.rowAtPoint(evt.getPoint());
        if(row>=0)
        {
            txt_bac.setText(table_luong.getValueAt(row, 0).toString());
            txt_heso.setText(table_luong.getValueAt(row, 1).toString());
        }
    }//GEN-LAST:event_table_luongMouseClicked

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
            java.util.logging.Logger.getLogger(salaryCalculatorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salaryCalculatorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salaryCalculatorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salaryCalculatorEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                salaryCalculatorEdit dialog = new salaryCalculatorEdit(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_addluong;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_deleteluong;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_updateluong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable table_luong;
    private javax.swing.JTextField txt_bac;
    private javax.swing.JTextField txt_baohiem;
    private javax.swing.JTextField txt_heso;
    private javax.swing.JTextField txt_luongcoban;
    private javax.swing.JTextField txt_namthamnien;
    private javax.swing.JTextField txt_thuongthamnien;
    private javax.swing.JTextField txt_thuongthamnienthem;
    // End of variables declaration//GEN-END:variables
}
