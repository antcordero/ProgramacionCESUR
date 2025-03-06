package TipoCEjercicio2;

public class Parking {
    private Vehiculos[] vehiculos;
    private int numVehiculos;
    private final int CAPACIDAD_MAXIMA;

    public Parking(int capacidadMaxima) {
        this.CAPACIDAD_MAXIMA = capacidadMaxima;
        this.vehiculos = new Vehiculos[CAPACIDAD_MAXIMA];
        this.numVehiculos = 0;
    }

    public int getNumVehiculos() {
        return numVehiculos;
    }

    public void setNumVehiculos(int numVehiculos) {
        this.numVehiculos = numVehiculos;
    }

    //Métodos

    public void ingresarVehiculo(String matricula) throws ParkingLlenoException, VehiculoDuplicadoException {
        //lleno?
        if (numVehiculos >= CAPACIDAD_MAXIMA) {
            throw new ParkingLlenoException("parking lleno");
        }

        //misma matricula?
        for (int i = 0; i < numVehiculos; i++) {
            if (vehiculos[i].getMatricula().equals(matricula)) {
                throw new VehiculoDuplicadoException("Ya existe un vehículo con la matrícula: " + matricula);
            }
        }


        Vehiculos nuevoVehiculo = new Vehiculos(matricula);
        vehiculos[numVehiculos] = nuevoVehiculo;

        System.out.println("Vehículo con matrícula: " + matricula +" añadido corretamente");

        numVehiculos++;
    }


    public void salirVehiculo(String matricula) throws VehiculoNoEncontradoException {

        boolean encontrado = false;
        int i = 0;

        while (encontrado==false) {

            if (vehiculos[i].getMatricula().equals(matricula)){

                vehiculos[i]=null;
                encontrado = true;
                System.out.println("Vehículo con matrícula: " + matricula +" borrado correctamente");

                i--;

            } else {
                throw new VehiculoNoEncontradoException("No está el vehículo con matrícula: " + matricula);
            }

            i++;
        }

    }

    public void mostrarVehiculos() {

        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i]!=null) {
                System.out.print("Vehículo: ");
                System.out.printf("Matrícula %s - ", vehiculos[i].getMatricula());
                System.out.println("Hora de entrada: " + vehiculos[i].getHoraEntrada() + ".");
            }
        }
    }

}
