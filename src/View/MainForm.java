package View;

import Model.AccountModel;
import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author Iroha
 */
public class MainForm extends javax.swing.JFrame {

    private int mouseX,mouseY;
    public AccountModel taikhoan;
    private int indexTab = 0;
    MainForm thisForm;
    hosoPanel tab1;
    
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        thisForm = this;
        taikhoan = new AccountModel(999, "iroha", "123", "Hana Iroha", null);
        prepare();
    }
    
    public MainForm(AccountModel tk) {
        initComponents();
        thisForm = this;
        taikhoan = new AccountModel(tk);
        prepare();
    }
    
    private void prepare(){
        movePanel.setBackground(new java.awt.Color(255, 255, 255, 0));
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new java.awt.Color(255, 255, 255, 0));
        lb_name.setText("Xin chào "+taikhoan.getTen()+"!");
        lb_namesmall.setText(taikhoan.getTen());
        try{
            if(taikhoan.getAnh()!=null){
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(taikhoan.getAnh()).getImage().getScaledInstance(lb_avt.getWidth(), lb_avt.getHeight(), Image.SCALE_SMOOTH));
                BufferedImage master = new BufferedImage(
                    imageIcon.getIconWidth(),
                    imageIcon.getIconHeight(),
                    BufferedImage.TYPE_INT_RGB);
                    Graphics g = master.createGraphics();
                imageIcon.paintIcon(null, g, 0,0);
                g.dispose();
                int diameter = Math.min(master.getWidth(), master.getHeight());
                BufferedImage mask = new BufferedImage(master.getWidth(), master.getHeight(), BufferedImage.TYPE_INT_ARGB);

                Graphics2D g2d = mask.createGraphics();
                applyQualityRenderingHints(g2d);
                g2d.fillOval(0, 0, diameter - 1, diameter - 1);
                g2d.dispose();

                BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
                g2d = masked.createGraphics();
                applyQualityRenderingHints(g2d);
                int x = (diameter - master.getWidth()) / 2;
                int y = (diameter - master.getHeight()) / 2;
                g2d.drawImage(master, x, y, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
                g2d.drawImage(mask, 0, 0, null);
                g2d.dispose();
                lb_avt.setIcon(new ImageIcon(masked));
            }
        }
        catch(Exception e){
            
        }
        tab1 = new hosoPanel(thisForm,taikhoan.getTen());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movePanel = new javax.swing.JPanel();
        infoPanel = new javax.swing.JPanel();
        lb_namesmall = new javax.swing.JLabel();
        btn_minimize = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_taikhoan = new javax.swing.JButton();
        btn_luong = new javax.swing.JButton();
        btn_lscongtac = new javax.swing.JButton();
        btn_hoso = new javax.swing.JButton();
        btn_phongban = new javax.swing.JButton();
        lb_menu = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        lb_avt = new javax.swing.JLabel();
        lb_name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        movePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                movePanelMouseDragged(evt);
            }
        });
        movePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                movePanelMousePressed(evt);
            }
        });

        javax.swing.GroupLayout movePanelLayout = new javax.swing.GroupLayout(movePanel);
        movePanel.setLayout(movePanelLayout);
        movePanelLayout.setHorizontalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        movePanelLayout.setVerticalGroup(
            movePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(movePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 20));

        infoPanel.setBackground(new java.awt.Color(178, 234, 227));

        lb_namesmall.setFont(new java.awt.Font("UVN Van", 1, 24)); // NOI18N
        lb_namesmall.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_namesmall.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addComponent(lb_namesmall, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addComponent(lb_namesmall, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(infoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 60, 250, 40));

        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizeIco.png"))); // NOI18N
        btn_minimize.setBorder(null);
        btn_minimize.setBorderPainted(false);
        btn_minimize.setContentAreaFilled(false);
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseExited(evt);
            }
        });
        btn_minimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_minimizeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, -1, -1));

        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitIco.png"))); // NOI18N
        btn_exit.setBorder(null);
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 10, -1, -1));

        btn_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_user1.png"))); // NOI18N
        btn_taikhoan.setBorder(null);
        btn_taikhoan.setBorderPainted(false);
        btn_taikhoan.setContentAreaFilled(false);
        btn_taikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_taikhoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_taikhoanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_taikhoanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_taikhoanMouseReleased(evt);
            }
        });
        btn_taikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taikhoanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        btn_luong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_luong1.png"))); // NOI18N
        btn_luong.setBorder(null);
        btn_luong.setBorderPainted(false);
        btn_luong.setContentAreaFilled(false);
        btn_luong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_luongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_luongMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_luongMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_luongMouseReleased(evt);
            }
        });
        btn_luong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luongActionPerformed(evt);
            }
        });
        getContentPane().add(btn_luong, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, -1, -1));

        btn_lscongtac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_lscongtac1.png"))); // NOI18N
        btn_lscongtac.setBorder(null);
        btn_lscongtac.setBorderPainted(false);
        btn_lscongtac.setContentAreaFilled(false);
        btn_lscongtac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lscongtacMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lscongtacMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_lscongtacMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_lscongtacMouseReleased(evt);
            }
        });
        btn_lscongtac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lscongtacActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lscongtac, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, -1, -1));

        btn_hoso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_hoso1.png"))); // NOI18N
        btn_hoso.setBorder(null);
        btn_hoso.setBorderPainted(false);
        btn_hoso.setContentAreaFilled(false);
        btn_hoso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_hosoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_hosoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_hosoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_hosoMouseReleased(evt);
            }
        });
        btn_hoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hosoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_hoso, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        btn_phongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_phongban1.png"))); // NOI18N
        btn_phongban.setBorder(null);
        btn_phongban.setBorderPainted(false);
        btn_phongban.setContentAreaFilled(false);
        btn_phongban.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_phongbanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_phongbanMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_phongbanMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_phongbanMouseReleased(evt);
            }
        });
        btn_phongban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_phongbanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_phongban, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        lb_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainMenu.png"))); // NOI18N
        getContentPane().add(lb_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 130));

        MainPanel.setMinimumSize(new java.awt.Dimension(1250, 650));
        MainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainPanel.add(lb_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 350, 350));

        lb_name.setFont(new java.awt.Font("UVN Van", 1, 48)); // NOI18N
        lb_name.setForeground(new java.awt.Color(255, 255, 255));
        lb_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_name.setVerifyInputWhenFocusTarget(false);
        MainPanel.add(lb_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 1250, 60));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panelDefault.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        MainPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        getContentPane().add(MainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1250, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_hosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hosoActionPerformed
        if(indexTab!=1)
        {
            indexTab=1;
            resetTab();
            lb_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainMenu1.png")));
            tab1.reloadTable();
            MainPanel.removeAll();
            MainPanel.setLayout(new BorderLayout());
            MainPanel.add(tab1);
            MainPanel.revalidate();
            MainPanel.repaint();
        }
    }//GEN-LAST:event_btn_hosoActionPerformed

    private void btn_minimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_minimizeActionPerformed
        setState(this.ICONIFIED);
    }//GEN-LAST:event_btn_minimizeActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void movePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movePanelMousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_movePanelMousePressed

    private void movePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_movePanelMouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_movePanelMouseDragged

    private void btn_hosoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hosoMouseEntered
        if(indexTab!=1)
            btn_hoso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_hoso2.png")));
    }//GEN-LAST:event_btn_hosoMouseEntered

    private void btn_hosoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hosoMouseExited
        if(indexTab!=1)
            btn_hoso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_hoso1.png")));
    }//GEN-LAST:event_btn_hosoMouseExited

    private void btn_hosoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hosoMousePressed
        btn_hoso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_hoso3.png")));
    }//GEN-LAST:event_btn_hosoMousePressed

    private void btn_hosoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_hosoMouseReleased
        btn_hoso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_hoso4.png")));
    }//GEN-LAST:event_btn_hosoMouseReleased

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitIco.png")));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitIco1.png")));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseEntered
        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizeIco1.png")));
    }//GEN-LAST:event_btn_minimizeMouseEntered

    private void btn_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseExited
        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizeIco.png")));
    }//GEN-LAST:event_btn_minimizeMouseExited

    private void btn_phongbanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_phongbanMouseEntered
        if(indexTab!=2)    
            btn_phongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_phongban2.png")));
    }//GEN-LAST:event_btn_phongbanMouseEntered

    private void btn_phongbanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_phongbanMouseExited
        if(indexTab!=2)
            btn_phongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_phongban1.png")));
    }//GEN-LAST:event_btn_phongbanMouseExited

    private void btn_phongbanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_phongbanMousePressed
        btn_phongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_phongban3.png")));
    }//GEN-LAST:event_btn_phongbanMousePressed

    private void btn_phongbanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_phongbanMouseReleased
        btn_phongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_phongban4.png")));
    }//GEN-LAST:event_btn_phongbanMouseReleased

    private void btn_lscongtacMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lscongtacMouseEntered
        if(indexTab!=3)
            btn_lscongtac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_lscongtac2.png")));
    }//GEN-LAST:event_btn_lscongtacMouseEntered

    private void btn_lscongtacMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lscongtacMouseExited
        if(indexTab!=3)
            btn_lscongtac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_lscongtac1.png")));
    }//GEN-LAST:event_btn_lscongtacMouseExited

    private void btn_lscongtacMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lscongtacMousePressed
        btn_lscongtac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_lscongtac3.png")));
    }//GEN-LAST:event_btn_lscongtacMousePressed

    private void btn_lscongtacMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lscongtacMouseReleased
        btn_lscongtac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_lscongtac4.png")));
    }//GEN-LAST:event_btn_lscongtacMouseReleased

    private void btn_luongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_luongMouseEntered
        if(indexTab!=4)
            btn_luong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_luong2.png")));
    }//GEN-LAST:event_btn_luongMouseEntered

    private void btn_luongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_luongMouseExited
        if(indexTab!=4)
            btn_luong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_luong1.png")));
    }//GEN-LAST:event_btn_luongMouseExited

    private void btn_luongMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_luongMousePressed
        btn_luong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_luong3.png")));
    }//GEN-LAST:event_btn_luongMousePressed

    private void btn_luongMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_luongMouseReleased
        btn_luong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_luong4.png")));
    }//GEN-LAST:event_btn_luongMouseReleased

    private void btn_taikhoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_taikhoanMouseEntered
        if(indexTab!=5)
            btn_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_user2.png")));
    }//GEN-LAST:event_btn_taikhoanMouseEntered

    private void btn_taikhoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_taikhoanMouseExited
        if(indexTab!=5)
            btn_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_user1.png")));
    }//GEN-LAST:event_btn_taikhoanMouseExited

    private void btn_taikhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_taikhoanMousePressed
        btn_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_user3.png")));
    }//GEN-LAST:event_btn_taikhoanMousePressed

    private void btn_taikhoanMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_taikhoanMouseReleased
        btn_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_user4.png")));
    }//GEN-LAST:event_btn_taikhoanMouseReleased

    private void btn_phongbanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_phongbanActionPerformed
        if(indexTab!=2)
        {
            indexTab=2;
            resetTab();
            lb_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainMenu2.png")));
            MainPanel.removeAll();
            MainPanel.setLayout(new BorderLayout());
            MainPanel.add(new phongbanPanel(thisForm, taikhoan.getTen()));
            MainPanel.revalidate();
            MainPanel.repaint();
        }

    }//GEN-LAST:event_btn_phongbanActionPerformed

    private void btn_lscongtacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lscongtacActionPerformed
        if(indexTab!=3)
        {
            indexTab=3;
            resetTab();
            lb_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainMenu3.png")));
            MainPanel.removeAll();
            MainPanel.setLayout(new BorderLayout());
            MainPanel.add(new chucvuPanel(thisForm, taikhoan.getTen()));
            MainPanel.revalidate();
            MainPanel.repaint();
        }
    }//GEN-LAST:event_btn_lscongtacActionPerformed

    private void btn_luongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luongActionPerformed
        if(indexTab!=4)
        {
            indexTab=4;
            resetTab();
            lb_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainMenu4.png")));
            MainPanel.removeAll();
            MainPanel.setLayout(new BorderLayout());
            MainPanel.add(new luongPanel(thisForm));
            MainPanel.revalidate();
            MainPanel.repaint();
        }
    }//GEN-LAST:event_btn_luongActionPerformed

    private void btn_taikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taikhoanActionPerformed
        if(indexTab!=5)
        {
            indexTab=5;
            resetTab();
            lb_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mainMenu5.png")));
            MainPanel.removeAll();
            MainPanel.setLayout(new BorderLayout());
            if(taikhoan.getUsername().equals("iroha"))
                MainPanel.add(new taikhoanAdminPanel(thisForm, taikhoan));
            else
                MainPanel.add(new taikhoanPanel(thisForm, taikhoan));
            MainPanel.revalidate();
        }
    }//GEN-LAST:event_btn_taikhoanActionPerformed
    private void resetTab(){
        if(indexTab!=1)
            btn_hoso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_hoso1.png")));
        if(indexTab!=2)
            btn_phongban.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_phongban1.png")));
        if(indexTab!=3)
            btn_lscongtac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_lscongtac1.png")));
        if(indexTab!=4)
            btn_luong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_luong1.png")));
        if(indexTab!=5)
            btn_taikhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/btn_user1.png")));
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    public static void applyQualityRenderingHints(Graphics2D g2d) {

    g2d.setRenderingHint(RenderingHints.KEY_ALPHA_INTERPOLATION, RenderingHints.VALUE_ALPHA_INTERPOLATION_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
    g2d.setRenderingHint(RenderingHints.KEY_COLOR_RENDERING, RenderingHints.VALUE_COLOR_RENDER_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_DITHERING, RenderingHints.VALUE_DITHER_ENABLE);
    g2d.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
    g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
    g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
    g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_hoso;
    private javax.swing.JButton btn_lscongtac;
    private javax.swing.JButton btn_luong;
    private javax.swing.JButton btn_minimize;
    private javax.swing.JButton btn_phongban;
    private javax.swing.JButton btn_taikhoan;
    private javax.swing.JPanel infoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lb_avt;
    private javax.swing.JLabel lb_menu;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_namesmall;
    private javax.swing.JPanel movePanel;
    // End of variables declaration//GEN-END:variables
}
