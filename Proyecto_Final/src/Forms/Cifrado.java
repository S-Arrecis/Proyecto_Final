package Forms;

/**
 *
 * @author Arrecis
 */
public class Cifrado {
//    private String nombre,correo,pass;

    private String cifrado = "", decifrado = "";

//    public Cifrado(String nombre,String correo, String pass){
//        this.nombre = nombre;
//        this.correo = correo;
//        this.pass = pass;
//    }
    public Cifrado() {
    }

    public String cifrar(String nombre) {
        cifrado = "";
        int longitud = nombre.length();
        for (int J = 0; J < longitud; J++) {

            char letra = nombre.charAt(J);

            switch (letra) {

                case 'm':
                    cifrado += "0";
                    break;

                case 'U':
                    cifrado += "*";
                    break;
                case 'u':
                case 'ú':
                    cifrado += "1";
                    break;

                case 'R':
                case 'r':
                    cifrado += "2";
                    break;

                case 'C':
                case 'c':
                    cifrado += "3";
                    break;

                case 'I':
                    cifrado += "+";
                    break;
                case 'i':
                case 'í':
                    cifrado += "4";
                    break;

                case 'E':
                    cifrado += "=";
                    break;
                case 'e':
                case 'é':
                    cifrado += "5";
                    break;

                case 'L':
                case 'l':
                    cifrado += "6";
                    break;

                case 'A':
                    cifrado += "¡";
                    break;
                case 'a':
                case 'á':
                    cifrado += "7";
                    break;

                case 'G':
                case 'g':
                    cifrado += "8";
                    break;

                case 'O':
                    cifrado += "_";
                    break;
                case 'o':
                case 'ó':
                    cifrado += "9";
                    break;

                case '0':
                    cifrado += "!";
                    break;
                case '1':
                    cifrado += "#";
                    break;
                case '2':
                    cifrado += "$";
                    break;
                case '3':
                    cifrado += "%";
                    break;
                case '4':
                    cifrado += "&";
                    break;
                case '5':
                    cifrado += "/";
                    break;
                case '6':
                    cifrado += "(";
                    break;
                case '7':
                    cifrado += ")";
                    break;
                case '8':
                    cifrado += "-";
                    break;
                case '9':
                    cifrado += "?";
                    break;

                default:
                    cifrado += String.valueOf(letra);
                    break;

            }
        }
        return cifrado;
    }

    public String decifrar(String nombre) {
        decifrado = "";
        int longitud = nombre.length();
        for (int J = 0; J < longitud; J++) {

            char letra = nombre.charAt(J);

            switch (letra) {

                //case 'M':  
                case '0':
                    decifrado += "m";
                    break;

                case '*':
                    decifrado += "U";
                    break;
                //case 'u' :
                case '1':
                    decifrado += "u";
                    break;

                //case 'R':  
                case '2':
                    decifrado += "r";
                    break;

                //case 'C':  
                case '3':
                    decifrado += "c";
                    break;

                case '+':
                    decifrado += "I";
                    break;
                //case 'i' :
                case '4':
                    decifrado += "i";
                    break;

                case '=':
                    decifrado += "E";
                    break;
                //case 'e' :
                case '5':
                    decifrado += "e";
                    break;

                //case 'L':  
                case '6':
                    decifrado += "l";
                    break;

                case '¡':
                    decifrado += "A";
                    break;
                //case 'a': 
                case '7':
                    decifrado += "a";
                    break;

                //case 'G':  
                case '8':
                    decifrado += "g";
                    break;

                case '_':
                    decifrado += "O";
                    break;
                //case 'o' :
                case '9':
                    decifrado += "o";
                    break;

                case '!':
                    decifrado += "0";
                    break;
                case '#':
                    decifrado += "1";
                    break;
                case '$':
                    decifrado += "2";
                    break;
                case '%':
                    decifrado += "3";
                    break;
                case '&':
                    decifrado += "4";
                    break;
                case '/':
                    decifrado += "5";
                    break;
                case '(':
                    decifrado += "6";
                    break;
                case ')':
                    decifrado += "7";
                    break;
                case '-':
                    decifrado += "8";
                    break;
                case '?':
                    decifrado += "9";
                    break;

                default:
                    decifrado += String.valueOf(letra);
                    break;

            }
        }
        nombre = "";
        return decifrado;

    }

}
