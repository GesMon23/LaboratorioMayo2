
package carrera;

public class Alumno {
    String nombre;
    String apellido;
    String direccion;
    String carne;
    String dpi;
    int telefono;
    ArchivosGuardados guarda= new ArchivosGuardados();
    public void Ingreso(){
        System.out.println("-------------------------------------");
        System.out.println("Nombre: "+getNom()+ " " +getApe());
        System.out.println("Direccion: "+getDir());
        System.out.println("No.DPI: "+getDPI());
        System.out.println("No.Telefono: "+getTel());
        System.out.println("El total a pagar es de: Q910");
        System.out.println("-------------------------------------");
        System.out.println(" ");
        guarda.ArchivosAlumnos(nombre, apellido, direccion, carne, dpi, telefono);
    }
    public void Reingreso(){
        System.out.println("-------------------------------------");
        System.out.println("Nombre: "+getNom()+ " " +getApe());
        System.out.println("Direccion: "+getDir());
        System.out.println("No.DPI: "+getDPI());
        System.out.println("No.Telefono: "+getTel());
        System.out.println("No. Carne: "+getCarne());
        System.out.println("El total a pagar es de: Q610");
        System.out.println("-------------------------------------");
        System.out.println(" ");
        guarda.ArchivosAlumnos(nombre, apellido, direccion, carne, dpi, telefono);
    }
    public String getNom(){
        return nombre;
    }
    public void setNom(String nombre){
        this.nombre = nombre;
    }
    public String getApe(){
        return apellido;
    }
    public void setApe(String apellido){
        this.apellido = apellido;
    }
    public String getDir(){
        return direccion;
    }
    public void setDir(String direccion){
        this.direccion = direccion;
    }
    public String getDPI(){
        return dpi;
    }
    public void setDPI(String dpi){
        this.dpi = dpi;
    }
    public int getTel(){
        return telefono;
    }
    public void setTel(int telefono){
        this.telefono = telefono;
    }
    public String getCarne(){
        return carne;
    }
    public void setCarne(String carne){
        this.carne = carne;
    }
}