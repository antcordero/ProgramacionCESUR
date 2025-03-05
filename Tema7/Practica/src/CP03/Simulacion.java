package CP03;

import java.util.Random;

public class Simulacion {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("\nCaso Práctico 3 - Tema 7\n");

        Random r = new Random();
        int contFrio = 0;
        int contCalor = 0;

        while (contFrio<5 && contCalor<15) {
            Thread.sleep((int)(Math.random()*2000));
            int temp = r.nextInt(0, 90);
            System.out.printf("> %d\n", temp);
            try {
                if (temp > 50) {
                    throw new DemasiadoCalorException(temp);
                } else if (temp<20){
                    throw new DemasiadoFrioException(temp);
                }
            } catch (DemasiadoCalorException eC) {
                System.out.println(eC.getMessage());
                contCalor++;
            } catch (DemasiadoFrioException eF) {
                System.out.println(eF.getMessage());
                contFrio++;
            }
        }

        System.out.printf("\nTotal avisos de calor %d\nTotal avisos de frio %d\n", contCalor, contFrio);
    }
}
