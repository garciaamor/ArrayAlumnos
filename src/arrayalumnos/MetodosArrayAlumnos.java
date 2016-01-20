package arrayalumnos;

import javax.swing.JOptionPane;
import libreria.Metodos;

public class MetodosArrayAlumnos {
    
    int numelementos=pedirElementos();
        
       String []nomes=new String[numelementos];
       float []notas=new float[numelementos];
       float aux;
       String auxn;
       
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
        //for(int i=0;i<numelementos;i++)
        //System.out.println("El alumno "+ nomes[i]+" tiene un " + notas[i]);
        String cadea="";
        for(int y=0;y<nomes.length;y++){
            cadea=cadea + nomes[y]+"-->"+notas[y]+"\n";
            JOptionPane.showMessageDialog(null, cadea);
        }
       }
       
       public void mentomay(){
           for (int i=0;i<numelementos-1;i++)
               for (int j=i+1;j<numelementos;j++)
                   if (notas[i]>notas[j]){
                       aux=notas[i];
                       notas[i]=notas[j];
                       notas[j]=aux;
                       auxn=nomes[i];
                       nomes[i]=nomes[j];
                       nomes[j]=auxn;                       
                   }
                  }
       public void maytomen(){
           for (int i=0;i<numelementos-1;i++)
               for (int j=i+1;j<numelementos;j++)
                   if (notas[i]<notas[j]){
                       aux=notas[i];
                       notas[i]=notas[j];
                       notas[j]=aux;
                       auxn=nomes[i];
                       nomes[i]=nomes[j];
                       nomes[j]=auxn;                       
                   }
                  }
       public void consultarNota(){
           String nomBus=JOptionPane.showInputDialog("nome a buscar");
           boolean atopado=false;//non se atopou
           for (int i=0;i<nomes.length;i++){
               if ((nomes[i].compareToIgnoreCase(nomBus)==0)){
                   JOptionPane.showMessageDialog(null, "nota = "+notas[i]);
                   atopado=true;
               }
           }
       }
           
           
       
}



