package CP02;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        System.out.println("\nCaso Práctico 2 - Tema 7\n");

        final int MAX = 5;

        Mundo[] planetas = new Mundo[MAX];

        //bucle for para crear objetos en cada posición
        for (int i = 0; i < planetas.length; i++) {
            planetas[i] = new Mundo();
        }

        Scanner sc = new Scanner(System.in);

        //Segundo bucle for para introducir valores a cada objeto
        for (int i = 0; i < planetas.length; i++) {
            System.out.print("Nombre del planeta: ");
            planetas[i].setNombre(sc.nextLine());
            System.out.print("Diametro del planeta: ");
            try {
                int diametro = Integer.parseInt(sc.nextLine());
                if (diametro <= 0) {
                    throw new ValorNegativoException(diametro);
                } else {
                    planetas[i].setDiametro(diametro);
                }
            } catch (NumberFormatException format) {
                System.out.println("Error de formato, vuela a introducir un numero.");
                i--;
            } catch (ValorNegativoException vNeg) {
                System.out.println(vNeg.getMessage());
                i--;
            }
        }
        sc.close();

        //Bucle while para recorrer el array
        boolean encontrado = false;
        int i = 0;
        int contInferiores = 0;

        while (!encontrado && i < planetas.length) {

            //Si hay alguno por encima de 100 se sale del bucle (encontrado) + lanzar excepción
            //lanzar una excepción si hay alguno por debajo de 20 km
            try {

                if (planetas[i].getDiametro()>100) {
                    encontrado = true;
                    throw new DiametroSuperiorException(planetas[i].getNombre());
                }

                if(planetas[i].getDiametro()<20){
                    throw new DiametroInferiorException(planetas[i].getNombre());
                }

            } catch (DiametroInferiorException dInf) {
                System.out.println(dInf.getMessage());
                contInferiores++;
            } catch (DiametroSuperiorException dSup) {
                System.out.println(dSup.getMessage());
            } catch (Exception e) {
                System.out.println("HA OCURRIDO UNA EXCEPCIÓN");
            } finally {
                i++;
            }
        }

        if (contInferiores>0) {
            System.out.println("Número de planetas con diametro menor a 20km = " + contInferiores);
        }
    }
}
