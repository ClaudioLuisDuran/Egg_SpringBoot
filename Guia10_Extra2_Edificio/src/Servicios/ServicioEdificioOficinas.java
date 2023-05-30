package Servicios;

import Entidades.EdificioDeOficinas;
import Entidades.Piso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class ServicioEdificioOficinas {

    Scanner leer;

    public void cantPersonas(EdificioDeOficinas e) {
        int cant;
        int total = 0;
        //personasporpiso
        for (Piso piso : e.getPisos()) {
            cant = piso.getOficinas() * e.getCantPersXofice();
            System.out.println("Piso " + piso.getNumeroPiso() + ": " + cant + " personas.");
            total = total + cant;
        }
        System.out.println("Total de personas del edificio: " + total + " personas.");
    }

    public EdificioDeOficinas crearEdificio() {

        leer = new Scanner(System.in).useDelimiter("\n");
        EdificioDeOficinas e = new EdificioDeOficinas();
        ArrayList<Piso> ps = new ArrayList<>();
        System.out.println("Crear nuevo Edificio de Oficinas");

        //Nombre
        System.out.print("Ingrese el nombre del Edificio: ");
        e.setNombre(leer.next());

        // Ancho y largo
        System.out.print("Ingrese el ancho del edificio en metros: ");
        e.setAncho(leer.nextInt());
        System.out.print("Ingrese el largo del edificio en metros: ");
        e.setLargo(leer.nextInt());

        // Cantidad de pisos
        System.out.print("¿Que cantidad de pisos tiene el edificio?: ");
        int pisos = leer.nextInt();

        // Oficinas por piso
        int totalOficinas = 0;
        for (int i = 0; i < pisos; i++) {
            Piso p = new Piso();
            System.out.print("Cuantas oficinas tendra el piso " + i + "?: ");
            p.setOficinas(leer.nextInt());
            totalOficinas = totalOficinas + p.getOficinas();
            p.setNumeroPiso(i);
            p.setAlturaPiso(3);
            ps.add(p);
        }
        e.setNumOficinas(totalOficinas);
        // Altura = alto de piso x cant de pisos
        e.setAlto(pisos * ps.get(0).getAlturaPiso());

        // guardar edificio de Oficinas
        e.setPisos(ps);
        System.out.print("¿Capacidad máxima promedio de personas de cada oficina?: ");
        e.setCantPersXofice(leer.nextInt());
        return e;
    }

    // Mostrar edificio con su superficie y volumen incluidos y la cantidad de personas por piso y total
    public void mostrarEdificio(EdificioDeOficinas e) {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Edificio " + e.getNombre());
        System.out.println("Dimensiones:\n"
                + "                  Ancho: " + e.getAncho() + " mts.\n"
                + "                  Largo: " + e.getLargo() + " mts.\n"
                + "                  Altura total: " + e.getAlto() + " mts.\n"
                + " Total de pisos: " + e.getPisos().size() + ", según el siguiente detalle: ");
        for (Piso piso : e.getPisos()) {
            System.out.println("                  Piso " + piso.getNumeroPiso() + ": " + piso.getOficinas() + " oficinas.\n"
                    + "                  Capacidad máxima del piso: " + (piso.getOficinas() * e.getCantPersXofice()) + " personas.");
        }
        e.calcularVolumen();
        e.calcularSuperficie();
        System.out.println("Capacidad máxima: " + (e.getCantPersXofice() * e.getNumOficinas()) + " personas");
        System.out.println("------------------------------------------------------------------------");
    }
}
