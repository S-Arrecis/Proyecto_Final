
package Forms;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Arrecis
 */
public class FrmLogin extends javax.swing.JFrame {
    
    private ImageIcon LogoUser = new ImageIcon("user.png");
    private String usuario,pass;
     private String[] datos= null;
     Cifrado cifrado = new Cifrado();
     private final File texto = new File("Users.txt");
  
    public FrmLogin() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Solucione Tecnologicas");
        avatar.setIcon((new ImageIcon(LogoUser.getImage().getScaledInstance(avatar.getWidth(),avatar.getHeight(),Image.SCALE_SMOOTH ))));
        user.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                cambiarImagen();
            }
        });
        
       
    }

    public void setLogoUser(ImageIcon LogoUser) {
        this.LogoUser = LogoUser;
    }

   
    
    
    public void leer() {
        String contenido, clave, User;
        pass = "";

        usuario = this.user.getText();
        for (int i = 0; i < contraseña.getPassword().length; i++) {
            pass += contraseña.getPassword()[i];
        }
        System.out.println(usuario);
        System.out.println(pass);
        try {
            FileReader lectura = new FileReader(texto);
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                System.out.println("contednido archivo: "+contenido);
                try {
                    datos = contenido.split(",");
                    System.out.println("Clave: "+cifrado.decifrar(datos[2]));
                    System.out.println("User: "+datos[3]);
                    clave = cifrado.decifrar(datos[2]);
                    User =  datos[3];

                    if ((User.equals(usuario)) && (pass.equals(clave))) {
                        JOptionPane.showMessageDialog(null, "BIENVENIDO");
                        FrmHome ventana = new FrmHome();
                        ventana.recibir(datos[4],cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]),datos[5],datos[3]);
                        ventana.setVisible(true);
                        dispose();
                    }
                  
                    contenido = lector.readLine();

                } catch (Exception e) {
                    System.out.println("Error. " + e);
                }
            }
            
//            //JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
//            setLogoUser(new ImageIcon("user.png"));
//            avatar.setIcon((new ImageIcon(LogoUser.getImage().getScaledInstance(avatar.getWidth(),avatar.getHeight(), Image.SCALE_SMOOTH))));
//            mostrar.setText("Usuario");
//            user.setText("");
//            contraseña.setText("");
                    
                  
        } catch (FileNotFoundException ex) {
            System.out.println("erro> " + ex);
        } catch (IOException ex) {
            System.out.println("erro> " + ex);
        }
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        avatar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        contraseña = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        mostrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        avatar.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel1.setText("Usuario");

        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jLabel2.setText("Contraseña");

        contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseñaMouseClicked(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mostrar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        mostrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrar.setText("usuario");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel2))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jButton1))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(mostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cambiarImagen(){
        String contenido, clave, User,nombre;
        pass = "";

        usuario = this.user.getText();
        
        try {
            FileReader lectura = new FileReader(texto);
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                System.out.println("contednido archivo: "+contenido);
                try {
                    datos = contenido.split(",");
                    System.out.println("User: "+datos[5]);
                    clave = datos[5];
                    User =  datos[3];
                    nombre = cifrado.decifrar(datos[0]);
                    

                    if ((User.equals(usuario))) {
                       setLogoUser(new ImageIcon(clave));
                       avatar.setIcon((new ImageIcon(LogoUser.getImage().getScaledInstance(avatar.getWidth(),avatar.getHeight(), Image.SCALE_SMOOTH))));
                       mostrar.setText(nombre);
                    }
//                    else if ((!User.equals(""))){
//                       setLogoUser(new ImageIcon("user.png"));
//                       avatar.setIcon((new ImageIcon(LogoUser.getImage().getScaledInstance(avatar.getWidth(),avatar.getHeight(), Image.SCALE_SMOOTH))));
//                       mostrar.setText("Usuario");
//                    }
                    contenido = lector.readLine();

                } catch (Exception e) {
                    System.out.println("Error. " + e);
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("erro> " + ex);
        } catch (IOException ex) {
            System.out.println("erro> " + ex);
        }
    
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        leer();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
       
    }//GEN-LAST:event_userMouseClicked

    private void contraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseñaMouseClicked
        cambiarImagen();
    }//GEN-LAST:event_contraseñaMouseClicked

    
    
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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avatar;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mostrar;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
