/*
codigo para notas, caputura 4 notas, para 4 estudiantes 
calcula el promedio. los almacena en vectores
 */
package notas;

import java.util.*;

public class Promedio {

    Scanner s = new Scanner(System.in);
    //Definir vector notas 
    private int calif[] = new int[4];
    private String nombre = "";
    // definir variables suma 
    private int suma = 0;
    // crear el constructor 

    public Promedio() {
        // capturar nombre y asignarlo
        System.out.println("Digite el nombre del estudiante: ");
        nombre = s.nextLine();
        // llamada al metodo capturar notas
        this.calif = capturar_notas();
    }

    // metodo Capturar 4 notas , mediante ciclo for 
    public int[] capturar_notas() {
        System.out.println("Calificaciones del primer Sem /n");
        // ciclo for
        for (int i = 0; i < calif.length; i++) {
            System.out.println("Ingrese la calificacion numero: " + (i + 1) + " : ");
            calif[i] = s.nextInt();
            //sumar las calificaciones
            suma += calif[i];
        }
        return calif;

    }

    // metodo calcular y retornar promedio
    public double promedio_notas() {
        double promedio = (double)(suma / 4.0);
        return promedio;

    }

    // Retornar el nombre y el promedio
    @Override
    public String toString() {
        
        return "nombre=" + nombre + " promedio " + promedio_notas();
    }
// metodo principal

    public static void main(String[] args) {

        // crear objeto promedio tipo vector tamaño 4
        Promedio e[] = new Promedio[4];
        // crear un vector nota para las notas de los estudiantes
        double nota[] = new double[4];

        // llamar al ciclo for
        for (int i = 0; i < e.length; i++) {
            // crea un objeto tipo promedio
            e[i] = new Promedio();
            //llenar vector nota
            nota[i] = e[i].promedio_notas();
            // mustra su nombre y nota final
            // llamar al metodo promedio
            System.out.println("\n=======================E- fianal===============");
            System.out.println(" Alumno : " + e[i].toString());
            System.out.println("\n================================================");
        }// fin del for

        // crear variable local estu_max_nota
        double estu_max_nota = 0.0;
        // hacer nota estu_max_nota = la primera nota promedio
        estu_max_nota = nota[0];
        // crear variable local tipo vector para indice del estu_max_nota
        int indice_nota_max[] = new int[4];
        // hacer indice_nota_max = primera nota
        indice_nota_max[0]=0;
        int indice =0;
        // recorrer vector notas para hallar el nombre del estudiante
        // con mayor calificacion

        for (int i = 1; i < nota.length-1; i++) {

            // comparar si  estu_max_nota menor a nota siguiente, entonces estu_max_nota = nota sig.
            if ( estu_max_nota <= nota[i]) {
                estu_max_nota = nota[i];
                
                // colocar el indice correspondiente en la variable local
                indice_nota_max[i] = i;
                indice = i;
                System.out.println("entro ok! "+ nota[i]);

            } // fin del if
           

        } // fin del for

        // mostrar el nombre del estu con la nota max
        System.out.println("programa promedio de notas ...");
        System.out.println("=============================== mayor ==============================");
        System.out.println(" alumno : "+e[indice].toString());
        // recorrer el vector indice_nota_max
        System.out.println("======================total notas===================");
        for (int i = 0; i < nota.length; i++) {

            System.out.println(" Alumno : " + e[i].toString());
        }// fin del for
        

    }

}
