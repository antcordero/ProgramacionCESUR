package TipoCEjercicio2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehiculos {
    private String matricula;
    private LocalDateTime horaEntrada;

    public Vehiculos(String matricula) {
        this.matricula = matricula;
        this.horaEntrada = LocalDateTime.now();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return "Vehículo> " + " Matricula: " + matricula + ", Hora de entrada:" + horaEntrada.format(formatter) + "\n";
    }
}
