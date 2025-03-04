import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        final int MAX = 10;

        Mundo[] planetas = new Mundo[MAX];

        //Crear bucle for que recorre el array planetas y instancia un objeto mundo en cada posición
        for (int i = 0; i < planetas.length; i++) {
            planetas[i] = new Mundo();
        }

        Scanner sc = new Scanner(System.in);

        //Crear bucle for que asigna a cada planeta un nombre
        for (int i = 0; i < planetas.length; i++) {
            System.out.print("Nombre del planeta: ");
            String nombre = sc.nextLine();
            planetas[i].setNombre(nombre);

            try {
                System.out.print("Diámetro del planeta: ");
                double diametro = Double.parseDouble(sc.nextLine());
                if (diametro <= 0) {
                    throw new ValorNegativoException(diametro);
                } else {
                    planetas[i].setDiametro(diametro);
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Error, el valor debe ser numérico. Volver a introducir el valor");
                i--;
            } catch (ValorNegativoException vne) {
                System.out.println(vne.getMessage());
                i--;
            } finally {
                System.out.println("Finally 1 hecho");
            }
        }

        sc.close();

        //Bucle while que recorra el array mientras no encuentre diámetros menores a 100
        boolean encontrado = false;
        int cont = 0;
        while (!encontrado && cont < planetas.length) {

            if (planetas[cont].getDiametro()>100) {
                encontrado = true;
            }

            try {
                if (encontrado) {
                    throw new DiametroSuperiorExceptionplanetas(planetas[cont].getDiametro());
                } else if (planetas[cont].getDiametro()<20) {
                    throw new DiametroInferiorException(planetas[cont].getDiametro());
                }
            } catch (DiametroSuperiorExceptionplanetas dmsup) {
                System.out.println(dmsup.getMessage());
            } catch (DiametroInferiorException dminf) {
                System.out.println(dminf.getMessage());
            } catch (Exception e) {
                System.out.println("Ha ocurrido una excepción.");
            } finally {
                System.out.println("Finally 2 hecho");
                cont++;
            }

            //cont++;

        }

    }
}
