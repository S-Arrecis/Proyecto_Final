/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lennyn
 */
public class Bicicletas {

    private File Archivo;

    private String NombreArchivo = "";

    public Bicicletas() {

    }

    String Codigo = "";
    private Path origenPath, destinoPath;

    public String AsignarBici() {
        try {

            BufferedReader bf = new BufferedReader(new FileReader(NombreArchivo));
            String temp = "";
            String fbRead;

            if ((fbRead = bf.readLine()) != null) {

                temp = fbRead;

            }

            Codigo = temp;

            System.out.println(Codigo);
            bf.close();
        } catch (IOException ex) {
            System.err.println("Archivo no encontrado");
            // Logger.getLogger(FrmUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return Codigo;
    }

    public void punto(int punto) {
        if (punto == 1) {

            NombreArchivo = "BicicletasPA.txt";
        } else {
            NombreArchivo = "BicicletasPB.txt";
        }

    }

    public void ActualizarBicicletas() {

        String texto = "";
        try {

            BufferedReader bf = new BufferedReader(new FileReader(NombreArchivo));
            String temp = "";
            String fbRead;

            fbRead = bf.readLine();

            while ((fbRead = bf.readLine()) != null) {

                if (Integer.parseInt(fbRead) != Integer.parseInt(Codigo)) {

                    temp = temp + "\r\n" + fbRead;

                }

            }

            texto = temp;
            System.out.println("empieza " + texto);
            bf.close();

        } catch (IOException ex) {
            System.err.println("Archivo no encontrado");
            Logger.getLogger(Bicicletas.class.getName()).log(Level.SEVERE, null, ex);

        }

        destinoPath = FileSystems.getDefault().getPath("./" + NombreArchivo);
        try {
            Files.delete(destinoPath);
        } catch (IOException ex) {
            Logger.getLogger(Bicicletas.class.getName()).log(Level.SEVERE, null, ex);
        }

        FileWriter escribir = null;
        try {

            Archivo = new File(NombreArchivo);
            escribir = new FileWriter(Archivo, true);
            escribir.write(texto.trim());

            escribir.close();

        } catch (IOException ex) {
            Logger.getLogger(Bicicletas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void EntregarBicileta(String Dato) {

        FileWriter escribir = null;
        try {

            Archivo = new File(NombreArchivo);
            escribir = new FileWriter(Archivo, true);
               escribir.write("\r\n");
            escribir.write(Dato.trim());
         

            escribir.close();

        } catch (IOException ex) {
            Logger.getLogger(Bicicletas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
