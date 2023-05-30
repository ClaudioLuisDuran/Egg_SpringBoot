package Servicio;

import Entidad.Fecha;
import java.util.Scanner;

/**
 *
 * @author Claudio Durán
 */
public class ServicioFecha {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String mes;

    public void mostrarFecha(Fecha f) {

        switch (f.getMes()) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
        }
        System.out.println("La fecha cargada es " + f.getDia() + " de " + mes + " de " + f.getAnio() + ".");
    }

    public Fecha cargarFecha(Fecha f) {
        boolean esbisiesto = false;

//Año
        System.out.print("Ingrese el año (1900-2022): ");
        f.setAnio(leer.nextInt());
        if (f.getAnio() < 1900 || f.getAnio() > 2022) {
            System.out.println("Año fuera de rango (1900-2022)");
            System.out.println("Se carga año por defecto: 1900");
            f.setAnio(1900);
        }

        esbisiesto = esBisiesto(f.getAnio());
        if (esbisiesto == true) {
            System.out.println("El año " + f.getAnio() + " es bisiesto.");
        } else {
            System.out.println("El año " + f.getAnio() + " no es bisiesto.");
        }

        //Mes
        do {
            System.out.print("Ingrese el mes (1-12): ");
            f.setMes(leer.nextInt());
            if (f.getMes() <= 0 || f.getMes() > 12) {
                System.out.println("El número no corresponde a un mes del año (1-12)");
            }
        } while (f.getMes() <= 0 || f.getMes() > 12);

        System.out.print("El mes ingresado:");
        switch (f.getMes()) {
            case 1:
                System.out.print(" Enero, tiene 31 días.");
                break;
            case 2:
                System.out.print(" Febrero, tiene ");
                if (esbisiesto == true) {
                    System.out.print(" 29 días.");
                } else {
                    System.out.print(" 28 días.");
                }
                break;
            case 3:
                System.out.print(" Marzo, tiene 31 días.");
                break;
            case 4:
                System.out.print(" Abril, tiene 30 días.");
                break;
            case 5:
                System.out.print(" Mayo, tiene 31 días.");
                break;
            case 6:
                System.out.print(" Junio, tiene 30 días.");
                break;
            case 7:
                System.out.print(" Julio, tiene 31 días.");
                break;
            case 8:
                System.out.print(" Agosto, tiene 31 días.");
                break;
            case 9:
                System.out.print(" Setiembre, tiene 30 días.");
                break;
            case 10:
                System.out.print(" Octubre, tiene 31 días.");
                break;
            case 11:
                System.out.print(" Noviembre, tiene 30 días.");
                break;
            case 12:
                System.out.print(" Diciembre, tiene 31 días.");
                break;
        }
        System.out.println("");

        //Dia
        do {
            System.out.print("Ingrese el día: ");
            f.setDia(leer.nextInt());
            if (f.getDia() < 0 || f.getDia() > 31) {
                System.out.println("El día cargada no corresponde a ningún mes del año.");
            }
        } while (f.getDia() < 0 || f.getDia() > 31);

        //verificar la cantidad de dias para meses de 30 dias
        if (f.getDia() == 31) {
            if (f.getMes() == 4 || f.getMes() == 6 || f.getMes() == 9 || f.getMes() == 11) {
                System.out.println("El mes " + f.getMes() + " tiene 30 dias máximos y usted ha ingresado dia " + f.getDia() + ".");
                do {
                    System.out.println("Ingrese un nuevo dia (1-30):");
                    f.setDia(leer.nextInt());
                    if (f.getDia() < 0 || f.getDia() > 31) {
                        System.out.println("Día fuera de rango para el mes cargado (1-30)");
                    }
                } while (f.getDia() < 0 || f.getDia() > 30 || f.getMes() == 2);
            }
        }

        //verificar cantidad de dias para mes de febrero
        if (f.getMes() == 2) {
            int diafinal;
            do {
                if (esbisiesto) {
                    diafinal = 29;
                } else {
                    diafinal = 28;
                }
                if (f.getDia() < 0 || f.getDia() > diafinal) {
                    System.out.println("En el año " + f.getAnio() + ", Febrero tiene " + diafinal + " dias.");
                    System.out.println("Ingrese un nuevo dia para la fecha (1-" + diafinal + ")");
                    f.setDia(leer.nextInt());
                    if (f.getDia() < 0 || f.getDia() > diafinal) {
                        System.out.println("Día fuera de rango para el mes de febrero (1-" + diafinal + ")");
                    }
                }
            } while (f.getDia() < 0 || f.getDia() > diafinal);
        }

        mostrarFecha(f);
        return f;
    }

    public boolean esBisiesto(int anio) {
        boolean retorno = false;
        if (anio % 4 == 0) {
            retorno = true;
        }
        return retorno;
    }

    public void diaPosterior(Fecha f) {
        int diaP = 0;
        int mesP = 0;
        int anioP;
        String nombreMes = "";

        //dia y mes
        if (f.getMes() == 2 && f.getDia() == 28 && this.esBisiesto(f.getAnio()) == true) {
            diaP = 29;
            mesP = 2;
        } else if (f.getMes() == 2 && f.getDia() == 28 && this.esBisiesto(f.getAnio()) == false) {
            diaP = 1;
            mesP = 3;
        } else if (f.getMes() == 2 && f.getDia() == 29) {
            diaP = 1;
            mesP = 3;
        }

        if (f.getDia() == 30 && ((f.getMes() == 4 || f.getMes() == 6 || f.getMes() == 9 || f.getMes() == 11))) {
            diaP = 1;
            mesP = f.getMes() + 1;
        } else if (f.getDia() == 31) {
            diaP = 1;
            mesP = f.getMes() + 1;
        } else if (f.getMes() != 2) {
            diaP = f.getDia() + 1;
            mesP = f.getMes();
        }

        switch (mesP) {
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Setiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
        }

        //año
        if (f.getDia() == 31 && f.getMes() == 12) {
            anioP = f.getAnio() + 1;
            nombreMes = "Enero";
        } else {
            anioP = f.getAnio();
        }

        //imprimo dia posterior
        System.out.println("El dia siguiente es el " + diaP + " de " + nombreMes + " de " + anioP + ".");
    }
}
