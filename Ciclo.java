
package carrera;

public class Ciclo {
    String curso[]= new String[5];{
    
}
    public void Ciclos(int Ciclo,int Opcion){
        switch(Ciclo){
            case 1:Ciclo1();break;
            case 2:Ciclo2();break;
            case 3:Ciclo3();break;
            case 4:Ciclo4();break;
            case 5:Ciclo5();break;
            case 6:Ciclo6();break;
            case 7:Ciclo7();break;  
            case 8:Ciclo8();break;
            case 9:Ciclo9();break;
            case 10:Ciclo10();break;
            default:System.out.println("Solo Hay 10 Ciclos");
        }
        if(Opcion!=3){
        System.out.println("-----------------Ciclo No."+Ciclo+"-----------------");
        System.out.println("Nombre                             ");
        System.out.println(curso[0]);
        System.out.println(curso[1]);
        System.out.println(curso[2]);
        System.out.println(curso[3]);
        System.out.println(curso[4]);
        }
    }
    public void Ciclo1(){
    curso[0]=("1.Desarrollo Humano y Profesional      ");
    curso[1]=("2.Metodologia de la Investigacion      ");
    curso[2]=("3.Contabilidad I                       ");
    curso[3]=("4.Intr. a los Sistemas de Computo      ");
    curso[4]=("5.Logica de Sistemas                   ");
    }
    public void Ciclo2(){
    curso[0]=("6.Precalculo                           ");
    curso[1]=("7.Algebra Lineal                       ");
    curso[2]=("8.Algoritmos                           ");
    curso[3]=("9.Contabilidad II                      ");
    curso[4]=("10.Matematica Discreta                 ");
    }
    public void Ciclo3(){
    curso[0]=("11.Fisica I                            ");
    curso[1]=("12.Programacion I                      ");
    curso[2]=("13.Calculo I                           ");
    curso[3]=("14.Proceso Administrativo              ");
    curso[4]=("15.Derecho Informatico                 ");
    }
    public void Ciclo4(){
    curso[0]=("16.Microeconomia                       ");
    curso[1]=("17.Programacion II                     ");
    curso[2]=("18.Calculo II                          ");
    curso[3]=("19.Estadistica I                       ");
    curso[4]=("20.Fisica II                           ");
    }
    public void Ciclo5(){
    curso[0]=("21.Metodos Numericos                   ");
    curso[1]=("22.Programacion III                    ");
    curso[2]=("23.Emprendedores de Negocios           ");
    curso[3]=("24.Electronica Analogica               ");
    curso[4]=("25.Estadistica II                      ");
    }
    public void Ciclo6(){
    curso[0]=("26.Investigacion de Operaciones        ");
    curso[1]=("27.Base de Datos I                     ");
    curso[2]=("28.Automatas y Lenguajes Formales      ");
    curso[3]=("29.Sistemas Operativos I               ");
    curso[4]=("30.Electronica Digital                 ");
    }
    public void Ciclo7(){
    curso[0]=("31.Base de Datos II                    ");
    curso[1]=("32.Analisis de Sistemas I              ");
    curso[2]=("33.Sistemas Operativos II              ");
    curso[3]=("34.Arquitectura de Computadoras I      ");
    curso[4]=("35.Compiladores                        ");
    }
    public void Ciclo8(){
    curso[0]=("36.Desarrollo Web                      ");
    curso[1]=("37.Analisis de Sistemas II             ");
    curso[2]=("38.Redes de Computadoras I             ");
    curso[3]=("39.Etica Profesional                   ");
    curso[4]=("40.Arquitectura de Computadoras II     ");
    } 
    public void Ciclo9(){
    curso[0]=("41.Adm.de Tecnologias de la Informacion");
    curso[1]=("42.Ingenieria de Software              ");
    curso[2]=("43.Proyecto de Graduacion I            ");
    curso[3]=("44.Redes de Computadoras II            ");
    curso[4]=("45.Inteligencia Artificial             ");
    }
    public void Ciclo10(){
    curso[0]=("36.Telecomunicaciones                  ");
    curso[1]=("37.Seminario De Tecnologias De Informacion ");
    curso[2]=("38.Aseguramiento de Calidad de Software");
    curso[3]=("39.Proyecto de Graduacion II           ");
    curso[4]=("40.Seguridad Y Autoria de Sistemas     ");
    }
}
