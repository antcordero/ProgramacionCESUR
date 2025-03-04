import java.util.Random;

public class Simulacro {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nSimulacro control de temperaturas\n");

        Random r = new Random();

        int i = 1;
        int contFrio = 0;
        int contCalor = 0;

        while (contCalor<15 || contFrio<5) {
            //generar temp aleatorio entre 0 y 90
            Thread.sleep((int)(Math.random()*2000));
            int temp = r.nextInt(0,91);

            //probar si está fuera de los límites
            try {
                if (temp>50){
                    contCalor++;
                    throw new DemasiadoCalor(temp);
                } else if (temp<20) {
                    contFrio++;
                    throw new DemasiadoFrio(temp);
                }
            } catch (DemasiadoCalor | DemasiadoFrio e) {
                System.out.println(e.getMessage());
            }

            i++;
            System.out.printf("%dºMarca > %dºC\n", i, temp);
        }

    }
}
