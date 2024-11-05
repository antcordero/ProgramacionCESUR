    /*
     *  4. (3’5 puntos) Escribe un programa que encuentre todos los pares de números primos
     *  gemelos menores a 100. Dos números primos son gemelos si la diferencia entre ellos
     *  es 2 (por ejemplo, 3 y 5).
     *  Resultado:
     *  (3, 5)
     *  (5, 7)
     *  (11, 13)
     *  (17, 19)
     *  (29, 31)
     *  (41, 43)
     *  (59, 61)
     *  (71, 73)
     */

    public class ExamenTipoCEj4PrimosGemelos {
        public static void main(String[] args) {

            int anteriorPrimo = 3;
            boolean esPrimo = true;

            for (int i=5; i<100; i+=2) {
                //Actualizar
                esPrimo = true;

                //Comprobar si el i es primo
                for (int j=2; j<=i-1; j++) {
                    if (i%j==0) {
                        esPrimo = false;
                    }
                }

                //Comprobar si son gemelos
                if (esPrimo) {
                    if (i-anteriorPrimo==2) {
                        System.out.printf("(%d, %d)\n", anteriorPrimo, i);
                    }
                    //Actualizar primo anterior
                    anteriorPrimo = i;
                }
            }
        }
    }

