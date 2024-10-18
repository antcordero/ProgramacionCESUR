import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        int numCita;
        int cita;
        int precio=0;
        int precioTotal=0;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nIndique cuál es su número de cita: ");
        numCita=sc.nextInt();
        cita = numCita;

        //Hacerlo con case es más corto
        if (numCita>0 && numCita<=3) {
            precio = 150;
        } else if (numCita>=4 && numCita<=5) {
            precio = 100;
        } else if (numCita>=6 && numCita<=8) {
            precio = 90;
        } else if (numCita>=9) {
            precio = 50;
        }

        //cita 9+
        if (numCita>=9) {
            while (numCita>=9) {
                precioTotal += 50;
                numCita--;
            }
        }
        //cita 6-8
        if (numCita>=6 && numCita<=8) {
            while (numCita>=6) {
                precioTotal += 90;
                numCita--;
            }
        //cita 4-5
        }
        if (numCita>=4 && numCita<=5) {
            while (numCita>=4) {
                precioTotal += 100;
                numCita--;
            }
        }
        //cita 1-3
        if (numCita>0 && numCita<=3) {
            while (numCita>=1) {
                precioTotal += 150;
                numCita--;
            }
        }

        System.out.printf("La cita actual nº%d le costará %d €\n", cita, precio);
        System.out.printf("El total pagado por el tratamiento son %d €\n", precioTotal);

        sc.close();
    }
}
