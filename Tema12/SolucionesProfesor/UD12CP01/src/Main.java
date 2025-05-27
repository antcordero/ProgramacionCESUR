import model.Inventario;
import model.dao.AccesoBD;
import model.dao.InventarioDAO;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String comando="";
        InventarioDAO dao=new InventarioDAO();
        do{
            try {
                System.out.print("> ");
                comando = sc.nextLine();
                String[] comandos;
                if (comando.contains("<"))
                    comandos = comando.split("<");
                else
                    comandos = comando.split(":");
                switch (comandos[0].toLowerCase()) {
                    case "connect" -> {
                        try {
                            AccesoBD.conectarBD();
                            System.out.println("---CONECTADO A LA BASE DE DATOS---");
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "disconnect" -> {
                        try {
                            AccesoBD.cerrarBD();
                            System.out.println("---DESCONECTADO DE LA BASE DE DATOS---");
                        } catch (SQLException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    case "exit" -> {
                        System.out.println("---FINALIZACIÓN DEL PROGRAMA---");
                    }
                    case "show" -> {
                        List<Inventario> lista = dao.listarInventario();
                        for (Inventario i : lista) {
                            System.out.println(i);
                        }
                    }
                    case "search" -> {
                        String texto = comandos[1].substring(0, comandos[1].length() - 1);
                        List<Inventario> lista = dao.buscarInventario(texto);
                        for (Inventario i : lista) {
                            System.out.println(i);
                        }
                    }
                    case "insert" -> {
                        int res = dao.insertarInventario(comandos[1], Integer.parseInt(comandos[2]), comandos[3]);
                        if (res > 0) {
                            System.out.println("Datos insertados correctamente");
                        } else {
                            System.out.println("Datos no insertados");
                        }
                    }
                    case "delete" -> {
                        //delete<id>
                        String texto = comandos[1].substring(0, comandos[1].length() - 1);
                        int res = dao.eliminarInventario(Integer.parseInt(texto));
                        if (res > 0) {
                            System.out.println("Datos eliminados correctamente");
                        } else {
                            System.out.println("Datos no eliminados");
                        }
                    }
                    case "update" -> {
                        //update:id:nombre:cantidad:comentario
                        //update:10::15:
                        int res = dao.modificarInventario(Integer.parseInt(comandos[1]), comandos[2], Integer.parseInt(comandos[3]), comandos[4]);
                        if (res > 0) {
                            System.out.println("Datos modificados correctamente");
                        } else {
                            System.out.println("Datos no modificados");
                        }
                    }
                    default -> {
                        System.out.println("Opción no válida");
                    }
                }
            }catch (Exception e){
                System.out.println("Opción no válida");
            }
        } while (!comando.equalsIgnoreCase("exit"));
        sc.close();
    }
}
