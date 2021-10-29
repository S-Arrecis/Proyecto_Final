
package Forms;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import java.io.IOException;


/**
 *
 * @author Arrecis
 */
public class Pdf {
    private String nombre;
    private int columnas;
    private PdfPTable tabla  = new PdfPTable(5);
    private PdfPTable tablaCliente = new PdfPTable(5);
    private PdfPTable tablaEntrega = new PdfPTable(8);
    private PdfPTable tablaRecibo = new PdfPTable(5);
    
    
    public void iniciarEmpleado(){
       
        tabla.addCell("Codigo");
        tabla.addCell("Nombre");
        tabla.addCell("Apellido");
        tabla.addCell("Comentario");
        tabla.addCell("Imagen");
    }
    
    
    public void iniciarClientes(){
        tablaCliente.addCell("DPI");
        tablaCliente.addCell("Nombre");
        tablaCliente.addCell("Apellido");
        tablaCliente.addCell("Celular");
        tablaCliente.addCell("Fotografia");
        
    }
    public void iniciarEntrega(){
        tablaEntrega.addCell("Codigo");
        tablaEntrega.addCell("Punto de Partida");
        tablaEntrega.addCell("Nombre Empleado");
        tablaEntrega.addCell("Codigo Empleado");
        tablaEntrega.addCell("Nombre Cliente");
        tablaEntrega.addCell("Celular Cliente");
        tablaEntrega.addCell("Serie Bicicleta");
        tablaEntrega.addCell("Fotografia Cliente");
        //tablaEntrega.addCell("Codigo QR");
    }

    public void CrearPdfEmpleado(String codigo,String nombre,String apellido,String puesto,String foto,String EMPLEADO){
        
        Document documento = new Document(PageSize.A4_LANDSCAPE, 0, 10f, 0, 20f);

        try {

            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream("Empleados.pdf"));
            Image cabeza = Image.getInstance(String.format("src/img/Header.jpeg"));
            Image Foto = Image.getInstance(String.format(foto));
            Foto.scaleToFit(165, 1000);
            Foto.scaleAbsoluteWidth(200);
            cabeza.scaleToFit(365, 1000);
            cabeza.scaleAbsoluteWidth(600);

            documento.open();
            documento.left(100f);
            documento.right(1000f);
            documento.bottom(20f);
            documento.add(cabeza);
            Paragraph parrafo1 = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo1.setFont(FontFactory.getFont("Arial", 10, Font.ITALIC, BaseColor.BLUE));
            parrafo1.add("Genera: " + EMPLEADO);
            documento.add(parrafo1);

            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial", 28, Font.BOLD, BaseColor.BLACK));
            parrafo.add("\n\n\n\nLista de Empleados\n\n");
            documento.add(parrafo);

            tabla.addCell(codigo);
            tabla.addCell(nombre);
            tabla.addCell(apellido);
            tabla.addCell(puesto);
            tabla.addCell(Foto);

            documento.add(tabla);

            documento.close();

        } catch (Exception e) {
        }
        
        
    }

    
    public void CrearPdfClientes(String codigo,String nombre,String apellido,String celular,String foto,String EMPLEADO){
        
          Document documento = new Document(PageSize.A4_LANDSCAPE,0,10f,0,20f);
        
        
        try{
            
            //String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream("Clientes.pdf"));
            //PdfWriter.getInstance(documento,new FileOutputStream(ruta + "/Desktop/Clientes.pdf"));
            Image cabeza = Image.getInstance(String.format( "src/img/Header.jpeg"));
            Image Foto = Image.getInstance(String.format(foto));
            Foto.scaleToFit(25,100);
            Foto.scaleAbsoluteWidth(100);
            cabeza.scaleToFit(365,1000);
            cabeza.scaleAbsoluteWidth(600);
            
            
            
            documento.open();
            documento.left(100f);
            documento.right(1000f);
            documento.bottom(20f);
            documento.add(cabeza);
            Paragraph parrafo1 = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo1.setFont(FontFactory.getFont("Arial",10,Font.ITALIC,BaseColor.BLUE));
            parrafo1.add("Genera: "+EMPLEADO);
            documento.add(parrafo1);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial",28,Font.BOLD,BaseColor.BLACK));
            parrafo.add("\n\n\n\nLista de Clientes\n\n");
            documento.add(parrafo);
                     
            tablaCliente.addCell(codigo); 
            tablaCliente.addCell(nombre);
            tablaCliente.addCell(apellido);
            tablaCliente.addCell(celular);
            tablaCliente.addCell(Foto);
            documento.add(tablaCliente);
            
            documento.close();
            
        }catch(Exception e){}
    
    }

    public void CrearPdfEntregas(String codigo,String punto, String fotoQR, String nombreEmpleado, String codigoEmpleado, String nombre,String numero,String foto, String serie,String EMPLEADO) {
         Document documento = new Document(PageSize.A4_LANDSCAPE,0,10f,0,20f);
        
        
        try{
            
            //String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream("Entregas.pdf"));
            //PdfWriter.getInstance(documento,new FileOutputStream(ruta + "/Desktop/Clientes.pdf"));
            Image cabeza = Image.getInstance(String.format( "src/img/Header.jpeg"));
            Image Foto = Image.getInstance(String.format(foto));
            Foto.scaleToFit(25,100);
            Foto.scaleAbsoluteWidth(100);
            Image FotoQR = Image.getInstance(String.format(fotoQR));
            FotoQR.scaleToFit(25,100);
            FotoQR.scaleAbsoluteWidth(100);
            cabeza.scaleToFit(365,1000);
            cabeza.scaleAbsoluteWidth(600);

            documento.open();
            documento.left(100f);
            documento.right(1000f);
            documento.bottom(20f);
            documento.add(cabeza);
            Paragraph parrafo1 = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo1.setFont(FontFactory.getFont("Arial",10,Font.ITALIC,BaseColor.BLUE));
            parrafo1.add("Genera: "+EMPLEADO);
            documento.add(parrafo1);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial",28,Font.BOLD,BaseColor.BLACK));
            parrafo.add("\n\n\n\nLista de Entregas\n\n");
            documento.add(parrafo);
                     
            tablaEntrega.addCell(codigo);
            tablaEntrega.addCell(punto);
            tablaEntrega.addCell(nombreEmpleado);
            tablaEntrega.addCell(codigoEmpleado);
            tablaEntrega.addCell(nombre);
            tablaEntrega.addCell(numero);
            tablaEntrega.addCell(serie);
            tablaEntrega.addCell(Foto);
            //tablaEntrega.addCell(FotoQR);
            documento.add(tablaCliente);
            
            documento.close();
            
        }catch(Exception e){}
    }

}
