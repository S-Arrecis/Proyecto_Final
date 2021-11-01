
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
    private PdfPTable tablaCliente = new PdfPTable(4);
    private PdfPTable tablaEntrega = new PdfPTable(8);
    private PdfPTable tablaRecibo = new PdfPTable(5);
    private PdfPTable tablaBici = new PdfPTable(2);
    
    public void iniciarEmpleado(){
       
        tabla.addCell("Codigo");
        tabla.addCell("Nombre");
        tabla.addCell("Apellido");
        tabla.addCell("Comentario");
        tabla.addCell("Imagen");
    }
    
    public void inicarBici(){
        tablaBici.addCell("Punto");
        tablaBici.addCell("Serie");
        //tablaBici.addCell("Fotografia");
        
    }
    public void iniciarClientes(){
        tablaCliente.addCell("DPI");
        tablaCliente.addCell("Nombre");
        
        tablaCliente.addCell("Celular");
        tablaCliente.addCell("Fotografia");
        
    }
    public void iniciarEntrega(){
        tablaEntrega.addCell("Codigo");
        tablaEntrega.addCell("Punto de Partida");
        tablaEntrega.addCell("Codigo Empleado");
        tablaEntrega.addCell("Nombre Empleado");
        
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

    
    public void CrearPdfClientes(String codigo,String nombre,String celular,String foto,String EMPLEADO){
        
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
            tablaCliente.addCell(celular);
            tablaCliente.addCell(Foto);
            documento.add(tablaCliente);
            
            documento.close();
            
        }catch(Exception e){}
    
    }
    
    public void CrearEntrega(String codigo,String punto,String nombreEmpleado,String codigoEmpleado,String nombre,String numero,String Serie,String foto){
        
        Document documento = new Document(PageSize.A4_LANDSCAPE,0,10f,0,20f);
        
        
        try{
            
            //String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream("Entrega.pdf"));
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
//            Paragraph parrafo1 = new Paragraph();
//            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
//            parrafo1.setFont(FontFactory.getFont("Arial",10,Font.ITALIC,BaseColor.BLUE));
//            //parrafo1.add("Genera: "+EMPLEADO);
//            documento.add(parrafo1);
            
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
            tablaEntrega.addCell(Serie);
            tablaEntrega.addCell(Foto);
            documento.add(tablaEntrega);
            
            documento.close();
            
        }catch(Exception e){}
    
    
    
    }

//    public void CrearPdfClientes(String codigo,String nombre,String celular,String foto,String EMPLEADO){
//        
//          Document documento = new Document(PageSize.A4_LANDSCAPE,0,10f,0,20f);
//        
//        
//        try{
//            
//            //String ruta = System.getProperty("user.home");
//            PdfWriter.getInstance(documento,new FileOutputStream("Clientes.pdf"));
//            //PdfWriter.getInstance(documento,new FileOutputStream(ruta + "/Desktop/Clientes.pdf"));
//            Image cabeza = Image.getInstance(String.format( "src/img/Header.jpeg"));
//            Image Foto = Image.getInstance(String.format(foto));
//            Foto.scaleToFit(25,100);
//            Foto.scaleAbsoluteWidth(100);
//            cabeza.scaleToFit(365,1000);
//            cabeza.scaleAbsoluteWidth(600);
//            
//            
//            
//            documento.open();
//            documento.left(100f);
//            documento.right(1000f);
//            documento.bottom(20f);
//            documento.add(cabeza);
//            Paragraph parrafo1 = new Paragraph();
//            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
//            parrafo1.setFont(FontFactory.getFont("Arial",10,Font.ITALIC,BaseColor.BLUE));
//            parrafo1.add("Genera: "+EMPLEADO);
//            documento.add(parrafo1);
//            
//            Paragraph parrafo = new Paragraph();
//            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
//            parrafo.setFont(FontFactory.getFont("Arial",28,Font.BOLD,BaseColor.BLACK));
//            parrafo.add("\n\n\n\nLista de Clientes\n\n");
//            documento.add(parrafo);
//                     
//            tablaCliente.addCell(codigo); 
//            tablaCliente.addCell(nombre);
//            tablaCliente.addCell(celular);
//            tablaCliente.addCell(Foto);
//            documento.add(tablaCliente);
//            
//            documento.close();
//            
//        }catch(Exception e){}
//    
//    }

    public void CrearPdfBici(String codigo,String punto,String foto ,String EMPLEADO) {
         Document documento = new Document(PageSize.A4_LANDSCAPE,0,10f,0,20f);
        
        
        try{
            
            //String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream("Bicicletas.pdf"));
            //PdfWriter.getInstance(documento,new FileOutputStream(ruta + "/Desktop/Clientes.pdf"));
            Image cabeza = Image.getInstance(String.format( "src/img/Header.jpeg"));
            Image Foto = Image.getInstance(String.format(foto));
//            Foto.scaleToFit(00,00);
//            Foto.scaleAbsoluteWidth(00);
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
            parrafo.add("\n\n\n\nBicicletas Disponibles \n\n");
            documento.add(parrafo);
                     
            
            tablaBici.addCell(punto);
            tablaBici.addCell(codigo);
            //tablaBici.addCell(Foto);
            documento.add(tablaBici);
            
            documento.close();
            
        }catch(Exception e){}
    }

    
    //(String codigo,String punto, String fotoQR, String nombreEmpleado, String codigoEmpleado, String nombre, String dpi, String numero, String direccion, String foto, String serie, String fotoBici)
    public void GenerarFormularioEntrega(String Hora ,String codigo,String punto, String fotoQR,String nombreEmpleado, String codigoEmpleado, String nombre, String dpi, String numero, String direccion, String foto, String serie, String fotoBici){
        
         Document documento = new Document(PageSize.A4_LANDSCAPE,0,10f,0,20f);
        
        
        try{
            
            //String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento,new FileOutputStream("FormularioEnvio.pdf"));
            //PdfWriter.getInstance(documento,new FileOutputStream(ruta + "/Desktop/Clientes.pdf"));
            Image cabeza = Image.getInstance(String.format( "src/img/header.png"));
//            Image Foto = Image.getInstance(String.format(foto));
//            Foto.scaleToFit(25,100);
//            Foto.scaleAbsoluteWidth(100);
//            Image FotoQR = Image.getInstance(String.format(fotoQR));
//            FotoQR.scaleToFit(25,100);
//            FotoQR.scaleAbsoluteWidth(100);
            cabeza.scaleToFit(245,1000);
            cabeza.scaleAbsoluteWidth(600);
            Image Foto = Image.getInstance(String.format("QR/"+fotoQR+".png"));
            Foto.scaleToFit(145,1000);
            Foto.setAbsolutePosition(460f, 460f);
            
            Image FotoCliente = Image.getInstance(String.format(foto));
            FotoCliente.scaleToFit(145,900);
            FotoCliente.setAbsolutePosition(440f, 310f);
            
            Image FotoBici = Image.getInstance(String.format(fotoBici));
            FotoBici.scaleToFit(145,1000);
            FotoBici.setAbsolutePosition(440f, 100f);
            
            documento.open();
            
            documento.left(100f);
            documento.right(1000f);
            documento.bottom(20f);
            documento.add(cabeza);
            documento.add(Foto);
            documento.add(FotoCliente);
            documento.add(FotoBici);
            
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.setFont(FontFactory.getFont("Arial",28,Font.BOLD,BaseColor.BLACK));
            parrafo.add("\nFormulario de Entrega");
            documento.add(parrafo);
            
            Paragraph parrafo1 = new Paragraph();
            parrafo1.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo1.add("\n   ____________________________________________________________________________________________________________________");
//            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLACK));
//            parrafo1.add("\n\n     Fecha: ");
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLUE));
            parrafo1.add("\n\n   "+Hora);
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLACK));
            parrafo1.add("\n\n   Codigo: ");
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLUE));
            parrafo1.add(codigo);
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLACK));
            parrafo1.add("  Punto de Partida: ");
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLUE));
            parrafo1.add(punto);
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLACK));
            parrafo1.add("\n\n   Empleado: ");
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLUE));
            parrafo1.add(nombreEmpleado);
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLACK));
            parrafo1.add("   Codigo Empleado: ");
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.ITALIC,BaseColor.BLUE));
            parrafo1.add(codigoEmpleado);
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo1.add("\n    ____________________________________________________________________________________________________________________");
            documento.add(parrafo1);
            ///datos del cliente
            
            parrafo1.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo1.add("\n\n   ____________________________________________________________________________________________________________________");
            Paragraph par = new Paragraph();
            par.setAlignment(Paragraph.ALIGN_CENTER);
            par.setFont(FontFactory.getFont("Arial",20,Font.BOLD,BaseColor.BLACK));
            par.add("\n\nDatos del Cliente\n");
            documento.add(par);
            Paragraph parrafo2 = new Paragraph();
            parrafo2.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo2.add("\n\n Nombre: ");
            parrafo2.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo2.add(nombre);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo2.add("\n\n DPI: ");
            parrafo2.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo2.add(dpi);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo2.add("\n\n Numero: ");
            parrafo2.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo2.add(numero);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo2.add("\n\n Dirección: ");
            parrafo2.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo2.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo2.add(direccion);
            documento.add(parrafo2);
            Paragraph pa = new Paragraph();
            pa.setAlignment(Paragraph.ALIGN_CENTER);
            pa.setFont(FontFactory.getFont("Arial",20,Font.BOLD,BaseColor.BLACK));
            pa.add("\n\nDatos de la Bicicleta");
            documento.add(pa);
            Paragraph parrafo22 = new Paragraph();
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo22.add("\n\n\n Marca: ");
            parrafo22.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo22.add("TRINX");
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo22.add("   Color: ");
            parrafo22.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo22.add("Blanco y Negro");
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo22.add("\n\n  Linea: ");
            parrafo22.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo22.add("TR3229");
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLACK));
            parrafo22.add("   Serie: ");
            parrafo22.setAlignment(Paragraph.ALIGN_LEFT);
            parrafo22.setFont(FontFactory.getFont("Arial",18,Font.BOLDITALIC,BaseColor.BLUE));
            parrafo22.add(serie);
            
            
            documento.add(parrafo22);
           
            documento.close();
            
        }catch(Exception e){}
    
    }
}
