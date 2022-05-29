
package carrera;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args){
        int opcion = 0;
        int Ins = 0;
        int NoCiclo = 0;
        Scanner leer = new Scanner(System.in);
        Alumno alumno = new Alumno();
        Ciclo ciclo = new Ciclo();
        Notas notas = new Notas();
        ArchivosGuardados guarda= new ArchivosGuardados();
        guarda.ArchivosCiclos(args);
        while(opcion!=4){
            System.out.println("-SISTEMA UNIVERSIDAD MARIANO GALVEZ DE GUATEMALA-");
            System.out.println("        --FACULTAD DE INGENIERIA--      ");
            System.out.println("---INGRESE LA OPCION QUE DESEA---");
            System.out.println("1.Inscripcion de Alumno");
            System.out.println("2.Ver Ciclos de la Carrera");
            System.out.println("3.Ingresar Notas");
            System.out.println("4.Salir del Menu");
            opcion = leer.nextInt();
            switch(opcion){
                case 1:
                        System.out.println("BIENVENIDO AL SERVICIO DE INSCRIPCION DE UMG");
                        leer.nextLine();
                        System.out.println("------INGRESE LOS DATOS DEL ESTUDIANTE------");
                        System.out.println("No.DPI: ");
                        alumno.setDPI(leer.nextLine());
                        System.out.println("Nombre: ");
                        alumno.setNom(leer.nextLine());
                        System.out.println("Apellido: ");
                        alumno.setApe(leer.nextLine());
                        System.out.println("Direccion: ");
                        alumno.setDir(leer.nextLine());
                        System.out.println("No. Telefono");
                        alumno.setTel(leer.nextInt());
                        System.out.println("¿QUE DESEA HACER?");
                        System.out.println("1.Primer Ingreso");
                        System.out.println("2.Reingreso");
                        Ins= leer.nextInt();
                        if(Ins==1){
                            alumno.Ingreso();
                            leer.nextLine();
                        }
                        else{ 
                                System.out.println("Ingrese su No.Carne");
                                alumno.setCarne(leer.nextLine());
                                if(Ins==2){
                                alumno.setCarne(leer.nextLine());
                                alumno.Reingreso();
                                }
                        }
                    System.out.println("ENTER PARA CONTINUAR");
                    leer.nextLine();
                    guarda.ArchivosAlumnos(alumno.getNom(), alumno.getApe(), alumno.getDir(), alumno.getCarne(), alumno.getDPI(), alumno.getTel());
                    break;
                case 2:
                    opcion=0;
                    do{
                        System.out.println("INSGRESE EL NUMERO DE CICLO QUE DESEA CONSULTAR (1-10)");
                        NoCiclo=leer.nextInt();
                        ciclo.Ciclos(NoCiclo, opcion);
                        System.out.println("¿DESEA CONSULTAR OTRO CICLO?");
                        System.out.println("1. Consultar Otro Ciclo");
                        System.out.println("2. Salir");
                        opcion=leer.nextInt();
                        guarda.ArchivosCiclos(args);
                    }while(opcion!=2);
                    break;
                case 3:
                    do{
                        System.out.println("INGRESE EL CICLO DEL QUE DESEA INGRESAR NOTAS(1-10)");
                        notas.setCicl(leer.nextInt());
                        NoCiclo=notas.getCicl();
                        ciclo.Ciclos(NoCiclo, opcion);
                        System.out.println("Curso:\n"+ciclo.curso[0]+"\nIngrese la Nota:");
                        notas.setNot1(leer.nextInt());
                        System.out.println("Curso:\n"+ciclo.curso[1]+"\nIngrese la Nota:");
                        notas.setNot2(leer.nextInt());
                        System.out.println("Curso:\n"+ciclo.curso[2]+"\nIngrese la Nota:");
                        notas.setNot3(leer.nextInt());
                        System.out.println("Curso:\n"+ciclo.curso[3]+"\nIngrese la Nota:");
                        notas.setNot4(leer.nextInt());
                        System.out.println("Curso:\n"+ciclo.curso[4]+"\nIngrese la Nota:");
                        notas.setNot5(leer.nextInt());
                        notas.Notas(NoCiclo, opcion);
                        leer.nextLine();
                        System.out.println("¿DESEA INGRESAR OTRAS NOTAS?");
                        System.out.println("1. Ingresar nuevas notas");
                        System.out.println("2. Salir");
                        opcion=leer.nextInt();
                    }while(opcion!=2);
                    guarda.ArchivosNotas(notas.Notas, notas.ciclo, notas.Promedio);
                    break;
                default:System.out.println("ELIJA UNA OPCION VALIDA");
            }
        }
    }
}
