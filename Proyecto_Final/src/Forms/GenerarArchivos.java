
package Forms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Arrecis
 */
public class GenerarArchivos {
    
    private File Documento;
    private String nombre,apellido,codigo,foto,numero,direccion,dpi;
    String nombreEmpleado,codigoEmpleado,fotoQR,fotoBici,serie,punto;
    private Cifrado cifrar = new Cifrado();
    //formulario
    
    //String codigo,
    
    public void CrearCliente(String codigo,String nombre,String numero,String foto){
        FileWriter escribir = null;
        String temp="";
       try {
           Documento = new File("Cliente.txt");
           escribir = new FileWriter(Documento,true);
           
           this.codigo = cifrar.cifrar(codigo);
           this.nombre = cifrar.cifrar(nombre);
           this.numero = cifrar.cifrar(numero);
           this.foto = cifrar.cifrar(foto);
           temp = this.codigo+","+this.nombre+","+this.numero+","+this.foto;
           escribir.write(temp);
           escribir.write("\r\n");           
           escribir.close();
           //JOptionPane.showMessageDialog(null,"Registrando los datos del Empleado "+cifrar.decifrar(Nombre));
           
       } catch (IOException ex) {
           Logger.getLogger(FrmCrear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
       } 
    }
    //(String codigo,String punto, String fotoQR, String nombreEmpleado, String codigoEmpleado, String nombre, String dpi, String numero, String direccion, String foto, String serie, String fotoBici)
    //apellido voy a recibir DPI ya que en nombre viene todo el nombre del cliente
    
    public void CrearEntrega(String codigo,String punto,String nombreEmpleado,String codigoEmpleado,String nombre,String numero,String Serie,String foto){

        FileWriter escribir = null;
        String temp="";
       try {
           Documento = new File("Entrega.txt");
           escribir = new FileWriter(Documento,true);
           this.punto = cifrar.cifrar(punto);
           this.nombreEmpleado =cifrar.cifrar(nombreEmpleado);
           this.codigoEmpleado =cifrar.cifrar(codigoEmpleado);
           this.serie=cifrar.cifrar(Serie);
           this.codigo = cifrar.cifrar(codigo);
           this.nombre = cifrar.cifrar(nombre);
           this.numero = cifrar.cifrar(numero);
           this.foto = cifrar.cifrar(foto);
           temp = this.codigo+","+ this.punto+","+this.codigo+","+this.nombreEmpleado+","+this.nombre+","+this.numero+","+this.serie+","+this.foto;
           escribir.write(temp);
           escribir.write("\r\n");           
           escribir.close();
           //JOptionPane.showMessageDialog(null,"Registrando los datos del Empleado "+cifrar.decifrar(Nombre));
           
       } catch (IOException ex) {
           Logger.getLogger(FrmCrear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
       } 
    
    }
    
    public void CrearEntregaT(String codigo,String punto, String fotoQR, String nombreEmpleado, String codigoEmpleado, String nombre, String dpi, String numero, String direccion, String foto, String serie, String fotoBici) {
        this.codigo = cifrar.cifrar(codigo);
        this.punto = cifrar.cifrar(punto);
        this.fotoQR=cifrar.cifrar(fotoQR);
        this.nombreEmpleado = cifrar.cifrar(nombreEmpleado);
        this.codigoEmpleado = cifrar.cifrar(codigoEmpleado);
        this.nombre = cifrar.cifrar(nombre);
        this.dpi = cifrar.cifrar(dpi);
        this.numero= cifrar.cifrar(numero);
        this.direccion = cifrar.cifrar(direccion);
        this.foto = cifrar.cifrar(foto);
        this.serie = cifrar.cifrar(serie);
        this.fotoBici = cifrar.cifrar(fotoBici);
        
        FileWriter escribir = null;
        String temp="";
       try {
           Documento = new File("EntregaT.txt");
           escribir = new FileWriter(Documento,true);
           
           temp = this.codigo+","+this.punto+","+this.fotoQR+","+this.nombreEmpleado+","+this.codigoEmpleado+","+this.nombre+","+this.dpi+","+this.numero+","+this.direccion+","+this.foto+","+this.serie+","+this.fotoBici;
           escribir.write(temp);
           escribir.write("\r\n");           
           escribir.close();
           //JOptionPane.showMessageDialog(null,"Registrando los datos del Empleado "+cifrar.decifrar(Nombre));
           
       } catch (IOException ex) {
           Logger.getLogger(FrmCrear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
     public void CrearRecibo(String codigo,String punto, String fotoQR, String nombreEmpleado, String codigoEmpleado, String nombre, String dpi, String numero, String direccion, String foto, String serie, String fotoBici) {
        this.codigo = codigo;
        this.punto = punto;
        this.fotoQR=fotoQR;
        this.nombreEmpleado = nombreEmpleado;
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.dpi = dpi;
        this.numero=numero;
        this.direccion = direccion;
        this.foto = foto;
        this.serie = serie;
        this.fotoBici = fotoBici;
        
        FileWriter escribir = null;
        String temp="";
       try {
           Documento = new File("Recibo.txt");
           escribir = new FileWriter(Documento,true);
           
           temp = codigo+","+punto+","+fotoQR+","+nombreEmpleado+","+codigoEmpleado+","+nombre+","+dpi+","+numero+","+direccion+","+foto+","+serie+","+fotoBici;
           escribir.write(temp);
           escribir.write("\r\n");           
           escribir.close();
           //JOptionPane.showMessageDialog(null,"Registrando los datos del Empleado "+cifrar.decifrar(Nombre));
           
       } catch (IOException ex) {
           Logger.getLogger(FrmCrear_Usuario.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }
    
}

