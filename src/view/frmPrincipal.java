/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Luis
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();

        Image icono = new ImageIcon(getClass().getResource("/icon/logo-32x32.png")).getImage();
        setIconImage(icono);

        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon img = new ImageIcon(getClass().getResource("/img/logo-1024x768.png"));
        Image fondo = img.getImage();
        dpEscritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                int x = (this.getWidth() - fondo.getWidth(null)) / 2;
                int y = (this.getHeight() - fondo.getHeight(null)) / 2;
                g.drawImage(fondo, x, y, null);
            }
        };
        pContenedor = new javax.swing.JPanel();
        tpMenu = new javax.swing.JTabbedPane();
        tabSistemas = new javax.swing.JPanel();
        pSistemas = new javax.swing.JPanel();
        btnUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cloud Market 1.0 | Sistema de control para Minimarkets");

        dpEscritorio.setBackground(new java.awt.Color(255, 255, 255));

        pContenedor.setBackground(new java.awt.Color(0, 153, 255));

        tpMenu.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabSistemas.setBackground(new java.awt.Color(247, 247, 247));

        pSistemas.setBackground(new java.awt.Color(247, 247, 247));
        pSistemas.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnUsuarios.setBackground(new java.awt.Color(247, 247, 247));
        btnUsuarios.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_add_48x48.png"))); // NOI18N
        btnUsuarios.setText("Agregar Usuario");
        btnUsuarios.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnUsuarios.setContentAreaFilled(false);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuarios.setOpaque(true);
        btnUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseExited(evt);
            }
        });
        btnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSistemasLayout = new javax.swing.GroupLayout(pSistemas);
        pSistemas.setLayout(pSistemasLayout);
        pSistemasLayout.setHorizontalGroup(
            pSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSistemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(568, Short.MAX_VALUE))
        );
        pSistemasLayout.setVerticalGroup(
            pSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSistemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout tabSistemasLayout = new javax.swing.GroupLayout(tabSistemas);
        tabSistemas.setLayout(tabSistemasLayout);
        tabSistemasLayout.setHorizontalGroup(
            tabSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSistemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSistemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabSistemasLayout.setVerticalGroup(
            tabSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabSistemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pSistemas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpMenu.addTab("Sistemas", tabSistemas);

        javax.swing.GroupLayout pContenedorLayout = new javax.swing.GroupLayout(pContenedor);
        pContenedor.setLayout(pContenedorLayout);
        pContenedorLayout.setHorizontalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpMenu)
        );
        pContenedorLayout.setVerticalGroup(
            pContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pContenedorLayout.createSequentialGroup()
                .addComponent(tpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dpEscritorio.setLayer(pContenedor, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpEscritorioLayout = new javax.swing.GroupLayout(dpEscritorio);
        dpEscritorio.setLayout(dpEscritorioLayout);
        dpEscritorioLayout.setHorizontalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dpEscritorioLayout.setVerticalGroup(
            dpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpEscritorioLayout.createSequentialGroup()
                .addComponent(pContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 280, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseEntered
        btnUsuarios.setBackground(new Color(231, 231, 231));
    }//GEN-LAST:event_btnUsuariosMouseEntered

    private void btnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseExited
        btnUsuarios.setBackground(new Color(247, 247, 247));
    }//GEN-LAST:event_btnUsuariosMouseExited

    private void btnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosActionPerformed
        frmUsuarioList frm = new frmUsuarioList();

        if (showForm(frm)) {
            dpEscritorio.add(frm);
            centerForm(frm);
            frm.setVisible(true);
        }
    }//GEN-LAST:event_btnUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    public static boolean showForm(javax.swing.JInternalFrame frm) {
        boolean mostrar = true;
        
        for (int a = 0; a < dpEscritorio.getComponentCount(); a++) {     // verificar si es instancia de algun componente que ya este en el jdesktoppane
            if (frm.getClass().isInstance(dpEscritorio.getComponent(a))) {
                mostrar = false;
            }
        }

        return mostrar;
    }

    public static void centerForm(javax.swing.JInternalFrame frm) {
        Dimension desktopSize = dpEscritorio.getSize();
        Dimension FrameSize = frm.getSize();
        frm.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUsuarios;
    public static javax.swing.JDesktopPane dpEscritorio;
    private javax.swing.JPanel pContenedor;
    private javax.swing.JPanel pSistemas;
    private javax.swing.JPanel tabSistemas;
    private javax.swing.JTabbedPane tpMenu;
    // End of variables declaration//GEN-END:variables
}
