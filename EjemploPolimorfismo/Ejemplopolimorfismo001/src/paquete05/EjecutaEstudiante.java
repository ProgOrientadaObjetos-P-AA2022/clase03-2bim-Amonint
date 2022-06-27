
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;


public class EjecutaEstudiante {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador = 0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        boolean bandera = true;

        // inicio de solución
        while (bandera) {

            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial\n"
                    + "Ingrese (2) para Estudiante Distancia\n");
            tipoEstudiante = Integer.parseInt(entrada.nextLine());
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = Integer.parseInt(entrada.nextLine());
            if (tipoEstudiante == 1) {

                // Declarar,crear e iniciar objeto tipo EstudiantePresencial
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                // Solicitar ingreso de valores para variables 
                // Solicitar numeroCreds, costoCred
                // Leer numeroCreds, costoCred
                System.out.println("Ingrese el número de créditos");
                numeroCreds = Integer.parseInt(entrada.nextLine());
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = Double.parseDouble(entrada.nextLine());
                // se hace uso de los métodos establecer para asignar valores
                // a los datos (atributos) del objeto
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                // Se agrega al arreglo estudiantes un objeto de tipo
                // EstudiantePresencial
//                estudiantes[contador] = estudianteP;
                estudiantes.add(estudianteP);

        

            } else {

                EstudianteDistancia estudianteD = new EstudianteDistancia();

                System.out.println("Ingrese el número de asignaturas");
                numeroAsigs = entrada.nextInt();
                System.out.println("Ingrese el costo de cada cada asignatura");
                costoAsig = entrada.nextDouble();

                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                estudiantes.add(estudianteD);

            }
            entrada.nextLine();
            System.out.println("¿Desea ingresar otro estudiante?");
            String a = entrada.nextLine();
            if ("si".equals(a) || "Si".equals(a)) {
                bandera = true;
            } else {
                bandera = false;
            }
        }

        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();

            System.out.printf("Datos Estudiante\n"
                    + "%s\n",
                    estudiantes.get(i));

        }
        System.out.println("Ciclo terminado");
    }
}