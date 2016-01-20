package arrayalumnos;

import javax.swing.JOptionPane;

public class ArrayAlumnos {

    public static void main(String[] args) {
        //Declarar un Array de tamaño 5
        MetodosArrayAlumnos arr=new MetodosArrayAlumnos();
        int res;     
        do{
       res= Integer.parseInt(JOptionPane.showInputDialog("Elija la opcion deseada \n 1.Introducir alumnos y notas \n 2.Mostrar las notas \n 3. Consultar las notas \n 4. Ordenar las nota de mayor a menor \n 5. Ordenar las notas de menor a mayor \n 6. Finalizar programa  "));
        switch (res){
            case 1:arr.cargarArray();
                   break;
            case 2:arr.visualizar();
                   break;
            case 3:arr.consultarNota();
                  break;
            case 4:arr.maytomen();
                break;
            case 5:arr.mentomay();
                break;
            //case 6:arr.ordenome();
              //  break;
            case 7:System.exit(0);
        }}
          while (res<7);
        
    }
        
    }


