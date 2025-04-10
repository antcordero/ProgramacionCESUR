public class MovilRadio extends  Movil implements Radio{
    public MovilRadio(String numero, String marca, String modelo, String operador) {
        super(numero, marca, modelo, operador);
    }

    @Override
    public void escucharSintonia(String sintonia) {
        System.out.println(" escuchando sintonia con el móvil");
    }
}
