package TipoCEjercicio1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaSeguridad seguridad = new SistemaSeguridad();

        // Bucle de intentos hasta que se logre un acceso exitoso.
        while (true) {
            System.out.print("Ingrese la contraseña: ");
            String clave = scanner.nextLine();

            try {
                seguridad.acceder(clave);
                // Salir del bucle en caso de éxito.
                break;
            } catch (CuentaBloqueadaException e) {
                System.out.println("⚠️ " + e.getMessage());
            } catch (CredencialesIncorrectasException | DemasiadosIntentosException e) {
                System.out.println("❌ " + e.getMessage());
            }
        }

        // Mostrar el historial de intentos tras el acceso exitoso.
        seguridad.mostrarHistorial();
        scanner.close();
    }
}
