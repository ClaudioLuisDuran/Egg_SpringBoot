package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ClaudioDuran
 */
public class ServicioAlquiler {

    ArrayList<Alquiler> listadoAlquileres = new ArrayList();
    boolean[] posiciones;
    Barco b;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Menu() {
        System.out.println(" *** MENU ALQUILER DE AMARRES PARA EMBARCACIONES ***");
        int opc;

        do {
            if (posiciones != null) {
                System.out.print("1. Cantidad de posiciones de amarre");
                int cont = 0;
                for (int i = 0; i < posiciones.length; i++) {
                    if (posiciones[i] == false) {
                        cont++;
                    }
                }
                System.out.println(" (" + cont + " de " + posiciones.length + ")");
            } else {
                System.out.println("1. Cantidad de posiciones de amarre");
            }
            System.out.println("2. Ingresar nuevo alquiler\n"
                    + "3. Consultar Alquiles actuales\n"
                    + "7. Salir");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.print("¿Cuantas posiciones dispone para alquilar?");

                    if (posiciones == null) {
                        int x = leer.nextInt();
                        posiciones = new boolean[x];
                        for (int i = 0; i < x; i++) {
                            posiciones[i] = false;
                        }
                    }
                    System.out.println("");
                    break;
                case 2:
                    int alquilado = 0;
                    int pos = 0;
                    if (posiciones != null) {
                        for (int i = 0; i < posiciones.length; i++) {
                            if (posiciones[i] == false) {
                                pos = i;
                                posiciones[i] = true;
                                break;
                            } else {
                                alquilado++;
                            }
                        }
                        if (alquilado >= posiciones.length) {
                            System.out.println("Lamentablemnte no hay lugar disponible.");
                            break;
                        } else {
                            this.alquilarBarco(listadoAlquileres, pos);
                        }
                    } else {
                        System.out.println("Primero debe indicar las posiciones disponibles en alquiler (Opción 1)");
                    }

                    System.out.println("");
                    break;
                case 3:
                    this.mostrarAlquileres();
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Hasta mañana!");
                    break;
                default:
                    System.out.println("La opcion ingresada no existe. Elija una del menú.");
            }
        } while (opc != 7);
    }

    public void mostrarAlquileres() {
        System.out.println("Alquileres realizados");
        for (Alquiler alq : listadoAlquileres) {
            System.out.println("Pos\tNombre\tMatricula\tInicio\tFin\tPrecio");
            System.out.println((alq.getPosicion() + 1) + " \t" + alq.getNombre() + " \t" + alq.getBarco().getMatricula() + " \t" + alq.getFecha_ini() + " \t" + alq.getFecha_fin() + " \t$ " + alq.getPrecio());
        }
    }

    public ArrayList<Alquiler> alquilarBarco(ArrayList<Alquiler> listado, int posicion) {
        Alquiler a = new Alquiler();
        System.out.println("Nuevo alquiler de amarre.Datos del cliente:");
        System.out.print("Nombre completo: ");
        a.setNombre(leer.next());
        System.out.print("DNI: ");
        a.setDNI(leer.next());
        a.setFecha_ini(LocalDate.now());
        System.out.println("Cuantos dias completos de alquiler necesita?");
        int d = leer.nextInt();
        a.setFecha_fin(LocalDate.now().plusDays(d));
        a.setPosicion(posicion);
        System.out.println("¿Que tipo es su embarcación? Elija su opción:\n"
                + "1. Velero\n"
                + "2. Barco convencional a motor\n"
                + "3. Yate\n"
                + "7. Salir.");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                Velero v = new Velero();
                v.cargarBarco();
                a.setBarco(v);
                a.setPrecio(v.calcularPrecio(d, v));
                break;
            case 2:
                BarcoMotor bM = new BarcoMotor();
                bM.cargarBarco();
                a.setBarco(bM);
                a.setPrecio(bM.calcularPrecio(d, bM));
                break;
            case 3:
                Yate y = new Yate();
                y.cargarBarco();
                a.setBarco(y);
                a.setPrecio(y.calcularPrecio(d, y));
                break;
            default:
                throw new AssertionError();
        }

        listado.add(a);
        return listado;
    }
}
