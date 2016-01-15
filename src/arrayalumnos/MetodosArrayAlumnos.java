package arrayalumnos;

import javax.swing.JOptionPane;

public class MetodosArrayAlumnos {
    
    int numelementos=pedirElementos();
        
       String []nomes=new String[numelementos];
       float []notas=new float[numelementos];
       
       public int pedirElementos(){
           return Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de alumnos") );
       }
       public float pedirNota(){
           return Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del alumno"));
       }
       public String pedirNome(){
           return JOptionPane.showInputDialog("Introduce el nombre del alumno");
       }
       public void cargarArray(){
           for(int i=0;i<nomes.length;i++){
               nomes[i]=pedirNome();
               notas[i]=pedirNota();
               
           }}
       public void visualizar(){
        for(int i=0;i<numelementos;i++)
        System.out.println("El alumno "+ nomes[i]+" tiene un " + notas[i]);
       }
}



