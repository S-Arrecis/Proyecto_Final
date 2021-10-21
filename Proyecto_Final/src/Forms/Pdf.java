
package Forms;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Arrecis
 */
public class Pdf {
    String nombre;
    int columnas;
    PdfPTable tabla  = new PdfPTable(4);
    
    public void iniciarEmpleado(){
        tabla.addCell("Codigo");
        tabla.addCell("Nombre");
        tabla.addCell("Apellido");
        tabla.addCell("Comentario");
    }
    public void CrearPdfEmpleado(String codigo,String nombre,String apellido,String puesto){
        Document documento = new Document();
        
        try{
            
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream(ruta+"/Desktop/Empleados.pdf"));
            documento.open();
            
            tabla.addCell(codigo); 
            tabla.addCell(nombre);
            tabla.addCell(apellido);
            tabla.addCell(puesto);
            documento.add(tabla);
            
            
            documento.close();
            
        }catch(Exception e){}
        
        
    }
}
