package carrera;

public class Notas {
   int nota;
    int Notas[]= new int[5];{
}
    int Promedio=0, ciclo=0, opcion=0, SumNot=0;
    Ciclo SelCiclo= new Ciclo();
    String Mensaje[]= new String[5];{
}
    ArchivosGuardados guarda= new ArchivosGuardados();
    public void Notas(int a,int  b){
    ciclo=a;
    opcion=b;
    SelCiclo.Ciclos(ciclo,opcion);
    if(getNot1()>=61)Mensaje[0]="APROBADO"; else Mensaje[0]="REPROBADO";
    if(getNot2()>=61)Mensaje[1]="APROBADO"; else Mensaje[1]="REPROBADO";
    if(getNot3()>=61)Mensaje[2]="APROBADO"; else Mensaje[2]="REPROBADO";
    if(getNot4()>=61)Mensaje[3]="APROBADO"; else Mensaje[3]="REPROBADO";
    if(getNot5()>=61)Mensaje[4]="APROBADO"; else Mensaje[4]="REPROBADO";
    for(int i=0;i<5;i++){
        SumNot+=Notas[i];
    }
    Promedio=SumNot/5;
    System.out.println("-------------------------------------");
    System.out.println(SelCiclo.curso[0]+" Nota: "+getNot1()+" "+Mensaje[0]);
    System.out.println(SelCiclo.curso[1]+" Nota: "+getNot2()+" "+Mensaje[1]);
    System.out.println(SelCiclo.curso[2]+" Nota: "+getNot3()+" "+Mensaje[2]);
    System.out.println(SelCiclo.curso[3]+" Nota: "+getNot4()+" "+Mensaje[3]);
    System.out.println(SelCiclo.curso[4]+" Nota: "+getNot5()+" "+Mensaje[4]);
    System.out.println("EL PROMEDIO ES: "+Promedio);
    System.out.println("-------------------------------------\n");
    
    
}
   public int getCicl(){
       return ciclo;
   }
   public void setCicl(int ciclo){
    this.ciclo = ciclo;  
   }
   public int getNot1(){
       return Notas[0];
   }
   public void setNot1(int nota){
    this.nota = nota;
    Notas[0]= nota;
   }
   public int getNot2(){
       return Notas[1];
   }
   public void setNot2(int nota){
    this.nota = nota;
    Notas[1]= nota;  
   }
   public int getNot3(){
       return Notas[2];
   }
   public void setNot3(int nota){
    this.nota = nota;
    Notas[2]= nota;    
   }
   public int getNot4(){
       return Notas[3];
   }
   public void setNot4(int nota){
    this.nota = nota;
    Notas[3]= nota;    
   }
   public int getNot5(){
       return Notas[4];
   }
   public void setNot5(int nota){
    this.nota = nota;
    Notas[4]= nota;    
   }
   
}