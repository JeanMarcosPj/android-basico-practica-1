
//Main.java
public class Main{
    public static void main(String[] args){
        Estudiante[] estudiantes = {
        new Estudiante("Juan", 24),
        new Estudiante("Erica", 20),
        new Estudiante("Emilio", 23),
        new Estudiante("Karina", 21),
        new Estudiante("Eduardo", 24),
        new Estudiante("Tomas", 25),
        };

      System.out.println("Total de estudiantes: " + estudiantes.length);
      
      int mayor = estudiantes[0].getEdad(), menor = estudiantes[0].getEdad();
      String nombreMe = "", nombreMa = "";
      int promedio = 0;
      
      for (int x = 0 ; x < estudiantes.length ; x++){
        promedio = promedio + estudiantes[x].getEdad();
        
        if (estudiantes[x].getEdad() <= menor){
          menor = estudiantes[x].getEdad();
          nombreMe = estudiantes[x].getNombre();
        }
        
        if (estudiantes[x].getEdad() >= mayor){
          mayor = estudiantes[x].getEdad();
          nombreMa = estudiantes[x].getNombre();
        }
        
        System.out.println(x+1 + "- " + estudiantes[x].getNombre());
      }
      System.out.println("La edad minima es " + menor + ", perteneciente a " + nombreMe);
      System.out.println("La edad maxima es " + mayor + ", perteneciente a " + nombreMa);
      System.out.println("La edad promedio es de " + (promedio/estudiantes.length));
    }
}