package model.dao;

import model.Prestamo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PrestamoDAO {

    public Set<Prestamo> cargarPrestamos() {
        Set<Prestamo> prestamos = new HashSet<>();
        String sql = "select * from prestamos";
        ResultSet rs=null;
        try{
            rs = AccesoBD.consultaBD(sql);
            while(rs.next()){
                String dni = rs.getString("dni");
                String codigo = rs.getString("codigo");
                LocalDate fechaprestamo = rs.getDate("fechaprestamo").toLocalDate();
                LocalDate fechadevolucion = rs.getDate("fechadevolucion").toLocalDate();
                Prestamo prestamo = new Prestamo(dni,codigo);
                prestamo.setFechaPrestamo(fechaprestamo);
                prestamo.setFechaDevolucion(fechadevolucion);
                prestamos.add(prestamo);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return prestamos;
    }

    public int eliminarPrestamo(String dni, String codigo) {
        int res=0;
        String sql = "delete from prestamos where dni ='"+dni+"' and codigo='"+codigo+"';";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public int insertarPrestamo(Prestamo elPrestamo) {
        int res=0;
        String sql="insert into prestamos values('"+elPrestamo.getDni()+"','"+elPrestamo.getCodigo()+"','"+elPrestamo.getFechaPrestamo().toString()+"','"+elPrestamo.getFechaDevolucion().toString()+"')";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    public int insertarPrestamoFinalizado(Prestamo elPrestamo) {
        int res=0;
        String sql="insert into prestamos_finalizados values('"+elPrestamo.getDni()+"','"+elPrestamo.getCodigo()+"','"+elPrestamo.getFechaPrestamo()+"','"+elPrestamo.getFechaDevolucion()+"')";
        try{
            res=AccesoBD.actualizaBD(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return res;
    }
}
