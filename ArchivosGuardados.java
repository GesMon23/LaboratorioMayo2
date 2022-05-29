
package carrera;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ArchivosGuardados {
    public void ArchivosAlumnos (String nombre, String apellido, String direccion, String carne, String dpi, int telefono){
        try{    
            String separador;
            String ruta ="D:\\Documentos\\U\\Tercer Semestre\\Programación I\\Laboratorio Mayo 2\\ArchivoAlumnos.txt";
            File doc = new File(ruta);
            if(!doc.exists()){
                doc.createNewFile();
            }
            FileWriter fw = new FileWriter(doc);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Nombre del Estudiante: "+nombre+"\n");
            bw.write("Apellido del Estudiante: "+apellido+"\n");
            bw.write("Direccion del Estudiante: "+direccion+"\n");
            bw.write("No. Carné del Estudiante: "+carne+"\n");
            bw.write("No.DPI: "+dpi+"\n");
            bw.write("No.Telefono: "+telefono+"\n");
            bw.write(separador = "******************************\n");
            bw.close();  
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void ArchivosCiclos(String cursos[]){
        try{
        String encabezado, separador,ciclo1,ciclo2,ciclo3,ciclo4,ciclo5,ciclo6,ciclo7,ciclo8,ciclo9,ciclo10;
        String ruta="D:\\Documentos\\U\\Tercer Semestre\\Programación I\\Laboratorio Mayo 2\\ArchivoCiclos.txt";
        File doc = new File(ruta);
        if(!doc.exists()){
            doc.createNewFile();
        }
        FileWriter fw = new FileWriter(doc);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(encabezado= "Nombre Del Curso                    Creditos");
            bw.write(ciclo1="\n1.Desarrollo Humano y Profesional          4"
                    + "\n2.Metodología de la Investigacion          5"
                    + "\n3.Contabilidad I                           5"
                    + "\n4.Intr. a los Sistemas de Computo          5"
                    + "\n5.Lógica de Sistemas                       5");
            bw.write(ciclo2="\n6.Precalculo                               5"
                    + "\n7.Algebra Lineal                           5"
                    + "\n8.Algoritmos                               5"
                    + "\n9.Contabilidad II                          5"
                    + "\n10.Matematica Discreta                     5");
            bw.write(ciclo3="\n11.Fisica I                                5"
                    + "\n12.Programacion I                          5"
                    + "\n13.Calculo I                               5"
                    + "\n14.Proceso Administrativo                  4"
                    + "\n15.Derecho Informatico                     5");
            bw.write(ciclo4="\n16.Microeconomia                           5"
                    + "\n17.Programacion II                         5"
                    + "\n18.Calculo II                              5"
                    + "\n19.Estadistica I                           5"
                    + "\n20.Fisica II                               5");
            bw.write(ciclo5="\n21.Metodos Numericos                       5"
                    + "\n22.Programacion III                        5"
                    + "\n23.Emprendedores de Negocios               5"
                    + "\n24.Electronica Analogica                   5"
                    + "\n25.Estadistica II                          5");
            bw.write(ciclo6="\n26.Investigacion de Operaciones            5"
                    +"\n27.Base de Datos I                         5"
                    +"\n28.Automatas y Lenguajes Formales          5"
                    +"\n29..Sistemas Operativos I                  5"
                    +"\n30.Electronica Digital                     5");
            bw.write(ciclo8="\n36.Desarrollo Web                          5"
                    + "\n37.Analisis de Sistemas II                 5"
                    + "\n38.Redes de Computadoras I                 5"
                    + "\n39.Etica Profesional                       5"
                    + "\n40.Arquitectura de Computadoras II         5");
            bw.write(ciclo7="\n31.Base de Datos II                        5"
                    +"\n32.Analisis de Sistemas I                  5"
                    +"\n33.Sistemas Operativos II                  5"
                    +"\n34.Arquitectura de Computadoras I          5"
                    +"\n35.Compiladores                            5");
            bw.write(ciclo9="\n41.Adm.de Tecnologias de la Informacion    5"
                    + "\n42.Ingenieria de Software                  5"
                    + "\n43.Proyecto de Graduacion I                5"
                    + "\n44.Redes de Computadoras II                5"
                    + "\n45.Inteligencia Artificial                 5");
            bw.write(ciclo10="\n36.Telecomunicaciones                      5"
                    + "\n37.SeminarioDeTecnologiasDeInformacion     6"
                    + "\n38.Aseguramiento de Calidad de Software    5"
                    + "\n39.Proyecto de Graduacion II               6"
                    + "\n40.Seguridad Y Autoría de Sistemas         5");
            bw.close();     
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void ArchivosNotas(int Notas[], int ciclo, int Promedio){
        try{
            String separador;
            String ruta ="D:\\Documentos\\U\\Tercer Semestre\\Programación I\\Laboratorio Mayo 2\\ArchivoNotas.txt";
            File doc = new File(ruta);
            if(!doc.exists()){
                doc.createNewFile();
            }
            FileWriter fw = new FileWriter(doc);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Ciclo No."+ciclo+"\n");
            bw.write("Primer Nota: "+Notas[0]+"\n");
            bw.write("Segunda Nota: "+Notas[1]+"\n");
            bw.write("Tercer Nota: "+Notas[2]+"\n");
            bw.write("Cuarta Nota: "+Notas[3]+"\n");
            bw.write("Quinta Nota: "+Notas[4]+"\n");
            bw.write("Promedio Final: "+Promedio+"\n");
            bw.write(separador = "******************************\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }        
}