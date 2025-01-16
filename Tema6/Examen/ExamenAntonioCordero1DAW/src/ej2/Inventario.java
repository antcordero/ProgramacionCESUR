package ej2;

import java.util.Arrays;

public class Inventario {
    private Producto[] productos;

    //
    public Inventario(int max) {
        this.productos = new Producto[max];
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "productos=" + Arrays.toString(productos) +
                '}';
    }

    //métodos

    /*
     *  agregar Producto al array
     */
    public void agregarProducto(int id, Producto pr) {
        int i = 0;
        boolean encontrado = false;
        while (i<productos.length && encontrado==false) {
            if (productos[i]!=null) {
                productos[i] = pr;
                encontrado = true;
            }
            i++;
            if (encontrado==true)
                System.out.println("Producto añadido");
            else {
                System.out.println("Sin espacio");
            }
        }
    }

    /*
     *  calcular precio final de todos los productos
     */
    private double calcularPrecioFinal(){
        double resultado = 0;

        for (int i = 0; i < productos.length; i++) {

            //descuento si hay stock
            if (productos[i].getCantidadEnStock()!=0){
                resultado = resultado + (productos[i].getPrecio())*Producto.getDescuentoGlobal();
                //precio por stock
                resultado = resultado * productos[i].getCantidadEnStock();
            } else {
                resultado =resultado + (productos[i].getPrecio());
                //precio por stock
                resultado = resultado * productos[i].getCantidadEnStock();
            }

        }

        return resultado;
    }

    /*
     * precio unitario segun categoria
     */
    private double precioUnitario() {
        double resultado = 0 ;

        for (int i = 0; i < productos.length; i++) {
            if(productos[i]!=null) {
                if (productos[i].getNombre().equals("Laptop")) {
                    resultado += productos[i].getPrecio()*0.95;
                } else if (productos[i].getNombre().equals("Camiseta")) {
                    resultado += productos[i].getPrecio()*0.90;
                } else if (productos[i].getNombre().equals("Manzanas")) {
                    resultado += productos[i].getPrecio()*0.85;
                }
            }
        }



        return resultado;
    }

    /*
     * mostrar info
     */
    public void mostrarInventario() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i]!= null) {
                System.out.printf("Prodcuto: %s - Precio Unitario: %.2f - Stock: %d - Precio final: %.2f\n"
                                    , productos[i].getNombre(), precioUnitario(), productos[i].getCantidadEnStock(), calcularPrecioFinal() );
            }
        }
    }

}
