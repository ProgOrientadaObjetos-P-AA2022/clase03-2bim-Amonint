/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3;

import java.util.ArrayList;

public class ReporteDistancia extends Reporte {

    private ArrayList<EstudianteDistancia> lista;
    private double totalMatriculaDistancia;

    public ReporteDistancia(String nombre, String carrera, String ciclo) {
        super(nombre, carrera, ciclo);

    }

    public void establecerLista(ArrayList<EstudianteDistancia> listado) {
        lista = listado;
    }

    public void establecerTotalMatriculasDistancia() {

        for (int i = 0; i < lista.size(); i++) {
            totalMatriculaDistancia = totalMatriculaDistancia +
                    lista.get(i).obtenerMatriculaDistancia();
        }
    }

    public ArrayList<EstudianteDistancia> obtenerLista() {
        return lista;
    }

    public double obtenerTotalMatriculasDistancia() {
        return totalMatriculaDistancia;
    }

    @Override
    public String toString() {
        String cadena1 = String.format("%s\n ", "Lista Estudiantes");
        for (int i = 0; i < obtenerLista().size(); i++) {
            cadena1 = String.format("%s%s\n", cadena1, lista.get(i));
        }

        String cadena = String.format("%s\nCarrera: %s\n" + "ciclo: %s\n\n" + "%s" + "El total es: %.2f\n", nombre,
                nombre,
                carrera,
                ciclo, obtenerTotalMatriculasDistancia());
        return cadena;

    }

}
