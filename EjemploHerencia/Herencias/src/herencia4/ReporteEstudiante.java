package herencia4;

import java.util.ArrayList;
import herencia2.Estudiante;

/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;

    public ReporteEstudiante(String cod) {
        super(cod);
    }

    public void establecerLista(ArrayList<Estudiante> list) {
        lista = list;
    }

    public void establecerMatricula() {
        double suma = 0;
        for (int i = 0; i < lista.size(); i++) {
            suma = suma + lista.get(i).getMatricula();
        }
        promedioMatriculas = suma / lista.size();
    }

    public ArrayList<Estudiante> obtenerLista() {
        return lista;
    }

    public double obtenerMatricula() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s", super.codigo);
        for (int i = 0; i < lista.size(); i++) {
            cadena = String.format("%s\n%s\n", cadena, lista.get(i));
        }
        cadena = String.format("%sPromedio de edades: %.2f\n ", cadena,
                promedioMatriculas);
        return cadena;
    }
}
