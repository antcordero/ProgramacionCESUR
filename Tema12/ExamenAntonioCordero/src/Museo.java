import model.ArtefactoTemporal;
import model.dao.AccesoBD;
import model.dao.ArtefactoTemporalDAO;

import java.sql.SQLException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Museo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArtefactoTemporalDAO dao = null;
        try {
            dao = new ArtefactoTemporalDAO();
        } catch (SQLException e) {
            System.out.println("Error al conectar la base de datos");
        } catch (ClassNotFoundException e) {
            System.out.println("Error. Clase no encontrada");
        }

        Set<ArtefactoTemporal> artefactos = dao.listarTodos();

        int opcion = 10;

        do {
            try {
                System.out.println("\n-\n--- MUSEO DEL TIEMPO ---");
                System.out.println("========================");
                System.out.println("1. Dar de alta un artefacto");
                System.out.println("2. Eliminar un artefacto");
                System.out.println("3. Listar todos los artefactos");
                System.out.println("4. Mostrar artefactos exhibibles");
                System.out.println("5. Filtrar artefactos por tipo");
                System.out.println("6. Actualizar un artefacto");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {

                    //insertar
                    case 1 -> {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Año de descubrimiento: ");
                        int anio = Integer.parseInt(sc.nextLine());
                        System.out.print("Nivel de acceso: ");
                        String nivelAcceso = sc.nextLine();
                        System.out.print("Ubicación actual: ");
                        String ubicacion = sc.nextLine();
                        System.out.print("Tipo (fragmento|percepcion|objeto|reloj): ");
                        String tipo = sc.nextLine();
                        switch (tipo.toLowerCase()) {
                            case "fragmento" -> {
                                System.out.print("Nivel de divergencia: ");
                                double nivelDivergencia = Double.parseDouble(sc.nextLine());
                                System.out.print("Riesgo de paradoja (Sí | No): ");
                                String riesgo = sc.nextLine();
                                if (riesgo.equals("Sí")) {
                                    boolean riesgoParadoja = true;
                                } else if (riesgo.equals("No")) {
                                    boolean riesgoParadoja = false;
                                }

                            }

                            case "percepcion" -> {
                                System.out.print("Duración: ");
                                int duracion = Integer.parseInt(sc.nextLine());
                                System.out.print("Tipo Percepcion (ralentización|aceleración|bucle): ");
                                String tipoP = sc.nextLine();
                                if (tipoP.equals("ralentización")) {
                                    String tipoPercepcion = "ralentización";
                                } else if (tipoP.equals("aceleración")) {
                                    String tipoPercepcion = "aceleración";
                                } else if (tipoP.equals("bucle")) {
                                    String tipoPercepcion = "bucle";
                                }
                            }

                            case "objeto" -> {
                                System.out.print("Origen: ");
                                String civilizacion = sc.nextLine();
                                System.out.print("Autenticidad (alta|baja|media): ");
                                String autenticidad = sc.nextLine();
                            }

                            case "reloj" -> {
                                System.out.print("Evento Histórico: ");
                                String evento = sc.nextLine();

                            }
                        }

                        //Añadir objeto a la base de datos y el conjunto

                    }

                    //Eliminar objeto
                    case 2 -> {
                        System.out.print("Nombre del artefacto a eliminar: ");
                        String nombre = sc.nextLine();
                        System.out.print("Tipo (fragmento|percepcion|objeto|reloj): ");
                        String tipo = sc.nextLine();

                        //Eliminar objeto
                        if (dao.eliminar(nombre, tipo)>0) {
                            System.out.println("El producto se ha eliminado correctamente");

                            //Crear el nuevo TreeSet para recorrerlo y borrar el producto cuanto lo encuentre
                            Set<ArtefactoTemporal> aux = new TreeSet<>(artefactos);

                            //Recorrer y borrar cuando lo encuentre
                            for (ArtefactoTemporal productoAux : aux) {
                                if (productoAux.getNombre().equals(nombre)) {
                                    artefactos.remove(productoAux);
                                }
                            }

                        } else {
                            System.out.println("El producto no se ha encontrado");
                        }


                    }

                    //Listar todos los artefactos
                    case 3 -> {
                        for (ArtefactoTemporal artefacto : artefactos) {
                            System.out.println(artefacto);
                        }
                    }

                    //Mostrar solo los exhibibles
                    case 4 -> {
                        System.out.println("--EXHIBIBLES--");
                        System.out.println("---------------");

                    }

                    //Filtrar por tipo
                    case 5 -> {
                        System.out.print("Tipo (fragmento|percepcion|objeto|reloj): ");
                        String tipo = sc.nextLine();

                        
                    }

                    //Actualizar datos
                    /*
                    case 6 -> {
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Año de descubrimiento: ");
                        int anio = Integer.parseInt(sc.nextLine());
                        System.out.print("Nivel de acceso: ");
                        String nivelAcceso=sc.nextLine();
                        System.out.print("Ubicación actual: ");
                        String ubicacion=sc.nextLine();
                        System.out.print("Tipo (fragmento|percepcion|objeto|reloj): ");
                        String tipo = sc.nextLine();
                        switch (tipo.toLowerCase()) {
                            case "fragmento" -> {
                                System.out.print("Nivel de divergencia: ");
                                double nivelDivergencia = Double.parseDouble(sc.nextLine());
                                System.out.print("Riesgo de paradoja (Sí | No): ");
                                String riesgo=sc.nextLine();
                                if (riesgo.equals("Sí")) {
                                    boolean riesgoParadoja=true;
                                } else if (riesgo.equals("No")) {
                                    boolean riesgoParadoja=false;
                                }

                            }

                            case "percepcion" -> {
                                System.out.print("Duración: ");
                                int duracion = Integer.parseInt(sc.nextLine());
                                System.out.print("Tipo Percepcion (ralentización|aceleración|bucle): ");
                                String tipoP=sc.nextLine();
                                if (tipoP.equals("ralentización")) {
                                    String tipoPercepcion="ralentización";
                                } else if (tipoP.equals("aceleración")) {
                                    String tipoPercepcion="aceleración";
                                } else if (tipoP.equals("bucle")){
                                    String tipoPercepcion="bucle";
                                }
                            }

                            case "objeto" -> {
                                System.out.print("Origen: ");
                                String civilizacion = sc.nextLine();
                                System.out.print("Autenticidad (alta|baja|media): ");
                                String autenticidad=sc.nextLine();
                            }

                            case "reloj" -> {
                                System.out.print("Evento Histórico: ");
                                String evento = sc.nextLine();

                            }
                    }
                     */

                    //Salir
                    case 0 -> {
                        System.out.println("Saliendo...");
                        try {
                            AccesoBD.cerrarBD();
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }

                    default -> System.out.println("Opción no valida");
                }

            } catch (NumberFormatException e) {
                System.out.println("Debe ingresar una opción valida");
            }
        } while (opcion != 0);

        sc.close();
    }
}
