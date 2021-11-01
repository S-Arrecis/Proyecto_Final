
package Forms;

import java.awt.Desktop;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Arrecis
 */
public class FrmHome extends javax.swing.JFrame {

    Cifrado cifrado = new Cifrado();
    Pdf pdf = new Pdf();
    private ImageIcon LogoUser;
    private String[] datos=  new String[6];
    private String Pass,correo,Dato;
    private String nombre,apellido,foto,codigo;
    
    public FrmHome() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Solucione Tecnologicas");
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        PanelEmpleado = new javax.swing.JPanel();
        mostrarD = new javax.swing.JLabel();
        mostrarPuesto = new javax.swing.JLabel();
        mostrarImagen = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        PanelPuntos = new javax.swing.JPanel();
        PuntoA = new javax.swing.JButton();
        PuntoB = new javax.swing.JButton();
        PanelGernte = new javax.swing.JPanel();
        botonEmpleados = new javax.swing.JButton();
        botonClientes = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        botonBici = new javax.swing.JButton();
        botonEntrega = new javax.swing.JButton();
        botonBici1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleado", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        mostrarD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mostrarD.setText("jLabel1");

        mostrarPuesto.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        mostrarPuesto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarPuesto.setText("jLabel2");

        mostrarImagen.setText("jLabel1");

        javax.swing.GroupLayout PanelEmpleadoLayout = new javax.swing.GroupLayout(PanelEmpleado);
        PanelEmpleado.setLayout(PanelEmpleadoLayout);
        PanelEmpleadoLayout.setHorizontalGroup(
            PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(mostrarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mostrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelEmpleadoLayout.setVerticalGroup(
            PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                .addGroup(PanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mostrarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEmpleadoLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(mostrarD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        PanelPuntos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Punto", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        PuntoA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PuntoA.setText("Punto   \"A\"");
        PuntoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoAActionPerformed(evt);
            }
        });

        PuntoB.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PuntoB.setText("Punto  \"B\"");
        PuntoB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuntoBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelPuntosLayout = new javax.swing.GroupLayout(PanelPuntos);
        PanelPuntos.setLayout(PanelPuntosLayout);
        PanelPuntosLayout.setHorizontalGroup(
            PanelPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPuntosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(PuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        PanelPuntosLayout.setVerticalGroup(
            PanelPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPuntosLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(PanelPuntosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PuntoB, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PuntoA, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        PanelGernte.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Generar Reportes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        botonEmpleados.setText("Empleados");
        botonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadosActionPerformed(evt);
            }
        });

        botonClientes.setText("Clientes");
        botonClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClientesActionPerformed(evt);
            }
        });

        botonRegistrar.setText("Nuevo Empleado");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonBici.setText("Bicicletas");
        botonBici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBiciActionPerformed(evt);
            }
        });

        botonEntrega.setText("Entregas");
        botonEntrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEntregaActionPerformed(evt);
            }
        });

        botonBici1.setText("Devoluciones");
        botonBici1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBici1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGernteLayout = new javax.swing.GroupLayout(PanelGernte);
        PanelGernte.setLayout(PanelGernteLayout);
        PanelGernteLayout.setHorizontalGroup(
            PanelGernteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGernteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGernteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelGernteLayout.createSequentialGroup()
                        .addComponent(botonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(PanelGernteLayout.createSequentialGroup()
                        .addComponent(botonBici, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonBici1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        PanelGernteLayout.setVerticalGroup(
            PanelGernteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGernteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGernteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelGernteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBici1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBici, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PanelEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelPuntos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PanelGernte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelGernte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    public void recibir(String Dato,String nombre,String apellido,String foto,String codigo){
        this.Dato = Dato;
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto=foto;
        this.codigo=codigo;
        this.mostrarD.setText("Bienvenido "+nombre+" "+this.apellido);
        LogoUser = new ImageIcon(foto);
        this.mostrarImagen.setIcon((new ImageIcon(LogoUser.getImage().getScaledInstance(mostrarImagen.getWidth(),mostrarImagen.getHeight(),Image.SCALE_SMOOTH ))));
        this.mostrarPuesto.setText(Dato);
        validar(Dato);
    }
    public void validar(String Dato){
        if(Dato.equals("Engargado")){
            //this.PanelGernte.setVisible(false);
            this.botonEmpleados.setEnabled(false);
            this.botonClientes.setEnabled(false);
            this.botonRegistrar.setEnabled(false);
        }
        
    }
    
    public void traducirEmpleado(){
        String contenido, clave, user;
        String Pass = "";
        pdf.iniciarEmpleado();
        try {
            FileReader lectura = new FileReader("Users.txt");
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                try {

                   datos = contenido.split(",");
                   System.out.println(cifrado.decifrar(datos[0]));
                    System.out.println(cifrado.decifrar(datos[1]));
                    System.out.println(cifrado.decifrar(datos[2]));
                   String temp= nombre+" "+apellido;
                    pdf.CrearPdfEmpleado(datos[3],cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]),cifrado.decifrar(datos[4]),datos[5],temp);
                    contenido ="";
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
        JOptionPane.showMessageDialog(null,"Se genero el reporte");
    }
    
      public void traducirCliente(){
        String contenido, clave, user;
        String Pass = "";
        pdf.iniciarEmpleado();
        try {
            FileReader lectura = new FileReader("Cliente.txt");
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                try {

                   datos = contenido.split(",");
                   
                   String temp= nombre+" "+apellido;
                    pdf.CrearPdfClientes(cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]),cifrado.decifrar(datos[2]),cifrado.decifrar(datos[3]),temp);
                    //pdf.CrearPdfClientes(codigo, nombre, apellido, foto, apellido);
                    contenido ="";
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
        JOptionPane.showMessageDialog(null,"Se genero el reporte");
    }
    
    public void traducirBiciA(){
        String contenido, clave, user;
        String Pass = "";
        pdf.iniciarEmpleado();
        try {
            FileReader lectura = new FileReader("BicicletasPA.txt");
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                try {

                   //datos = contenido.split(",");
                   
                   //String temp= nombre+" "+apellido;
                    //pdf.CrearPdfClientes(cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]),cifrado.decifrar(datos[2]),cifrado.decifrar(datos[3]),temp);
                    //pdf.CrearPdfClientes(codigo, nombre, apellido, foto, apellido);
                    pdf.CrearPdfBici("WAKANDA"+contenido,"A","M136-1-500x333 (1).png",nombre+" "+this.apellido);
                    contenido ="";
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
        //JOptionPane.showMessageDialog(null,"Se genero el reporte");
        pdf.inicarBici();
    }  
    
     public void traducirBiciB(){
        String contenido, clave, user;
        String Pass = "";
        pdf.iniciarEmpleado();
        try {
            FileReader lectura = new FileReader("BicicletasPB.txt");
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                try {

                   //datos = contenido.split(",");
                   
                   //String temp= nombre+" "+apellido;
                    //pdf.CrearPdfClientes(cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]),cifrado.decifrar(datos[2]),cifrado.decifrar(datos[3]),temp);
                    //pdf.CrearPdfClientes(codigo, nombre, apellido, foto, apellido);
                    pdf.CrearPdfBici("WAKANDA"+contenido,"B","M136-1-500x333 (1).png",nombre+" "+this.apellido);
                    contenido ="";
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
        JOptionPane.showMessageDialog(null,"Se genero el reporte");
    } 
    
     public void traducirEntrega(){
        String contenido, clave, user;
        String Pass = "";
        pdf.iniciarEmpleado();
        try {
            FileReader lectura = new FileReader("Entrega.txt");
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                try {

                    datos = contenido.split(",");
                   
                   //String temp= nombre+" "+apellido;
                    //pdf.CrearPdfClientes(cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]),cifrado.decifrar(datos[2]),cifrado.decifrar(datos[3]),temp);
                    //pdf.CrearPdfClientes(codigo, nombre, apellido, foto, apellido);
                    //pdf.CrearPdfBici("WAKANDA"+contenido,"B","M136-1-500x333 (1).png",nombre+" "+this.apellido);
                    pdf.CrearEntrega(cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]), cifrado.decifrar(datos[2]),cifrado.decifrar(datos[3]),cifrado.decifrar(datos[4]),cifrado.decifrar(datos[5]),cifrado.decifrar(datos[6]),cifrado.decifrar(datos[7]));
                    contenido ="";
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
        JOptionPane.showMessageDialog(null,"Se genero el reporte");
    } 
 
          public void traducirRecibo(){
        String contenido, clave, user;
        String Pass = "";
        pdf.iniciarEmpleado();
        try {
            FileReader lectura = new FileReader("Recibo.txt");
            BufferedReader lector = new BufferedReader(lectura);
            contenido = lector.readLine();
            while (contenido != null) {
                try {

                    datos = contenido.split(",");
                   
                   //String temp= nombre+" "+apellido;
                    //pdf.CrearPdfClientes(cifrado.decifrar(datos[0]),cifrado.decifrar(datos[1]),cifrado.decifrar(datos[2]),cifrado.decifrar(datos[3]),temp);
                    //pdf.CrearPdfClientes(codigo, nombre, apellido, foto, apellido);
                    //pdf.CrearPdfBici("WAKANDA"+contenido,"B","M136-1-500x333 (1).png",nombre+" "+this.apellido);
                    pdf.CrearRecibo(datos[0],datos[1],datos[2],datos[3],datos[4],datos[5],datos[6],datos[7]);
                    contenido ="";
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
        JOptionPane.showMessageDialog(null,"Se genero el reporte");
    }
    private void botonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadosActionPerformed
        traducirEmpleado();
        abrirarchivo("Empleados.pdf");
    }//GEN-LAST:event_botonEmpleadosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmLogin ventana = new FrmLogin();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClientesActionPerformed
        pdf.iniciarClientes();
        traducirCliente();
        abrirarchivo("Clientes.pdf");
        //pdf.CrearPdfClientes("3032618490106","Matilde Leonara","Gonzalez Paz","17779808","kamila.jpg","Steven Arrecis");
    }//GEN-LAST:event_botonClientesActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
        FrmCrear_Usuario ventana = new FrmCrear_Usuario();
        ventana.Recibir(Dato,nombre, apellido, foto,codigo);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void PuntoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoAActionPerformed
        Elegir ventana = new Elegir();
        ventana.recibir(nombre, apellido, codigo,Dato,foto,"A",1);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_PuntoAActionPerformed

    private void botonEntregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEntregaActionPerformed
        pdf.iniciarEntrega();
        traducirEntrega();
        abrirarchivo("Entrega.pdf");
    }//GEN-LAST:event_botonEntregaActionPerformed

    private void botonBici1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBici1ActionPerformed
        pdf.iniciarRecibo();
        traducirRecibo();
        abrirarchivo("Recibo.pdf");
    }//GEN-LAST:event_botonBici1ActionPerformed

    private void botonBiciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBiciActionPerformed
        pdf.inicarBici();
        traducirBiciA();
        traducirBiciB();
        abrirarchivo("Bicicletas.pdf");
    }//GEN-LAST:event_botonBiciActionPerformed

    private void PuntoBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuntoBActionPerformed
        Elegir ventana = new Elegir();
        ventana.recibir(nombre, apellido, codigo,Dato,foto,"B",2);
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_PuntoBActionPerformed

     public void abrirarchivo(String archivo){
        try {

           File objetofile = new File (archivo);
           Desktop.getDesktop().open(objetofile);

        }catch (IOException ex) {
            JOptionPane.showMessageDialog(null,"Error al abrir el documento "+ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelEmpleado;
    private javax.swing.JPanel PanelGernte;
    private javax.swing.JPanel PanelPuntos;
    private javax.swing.JButton PuntoA;
    private javax.swing.JButton PuntoB;
    public javax.swing.JButton botonBici;
    public javax.swing.JButton botonBici1;
    public javax.swing.JButton botonClientes;
    public javax.swing.JButton botonEmpleados;
    public javax.swing.JButton botonEntrega;
    public javax.swing.JButton botonRegistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mostrarD;
    private javax.swing.JLabel mostrarImagen;
    private javax.swing.JLabel mostrarPuesto;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
