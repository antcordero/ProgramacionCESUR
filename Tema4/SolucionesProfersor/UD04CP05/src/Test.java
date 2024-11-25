public class Test {
    public static void main(String[] args) {
        PuestoTrabajo pt1 = new PuestoTrabajo("PT01",2500,"Puesto de nivel A");
        PuestoTrabajo pt2= new PuestoTrabajo("PT02",2000,"Puesto de nivel B");
        PuestoTrabajo pt3 = new PuestoTrabajo("PT03",1500,"Puesto de nivel C");
        Empleado e = new Empleado("12345678A","Pepito","Grillo","Sucalle","10987","Lasuya",pt1);
        Administrativo a = new Administrativo("98765432Z","Juanita","Campanilla","Otracalle","87654","Otra de abajo",pt2,10);
        Consultor c = new Consultor("78934265H","Gregorio","López","Callesinsalida","65432","Estaciudad",pt3,"Jefe");
        e.getAtributos();
        System.out.println();
        a.getAtributos();
        c.getAtributos();
    }
}
