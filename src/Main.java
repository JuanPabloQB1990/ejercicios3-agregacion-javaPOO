// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Oxford");

        Estudiante e1 = new Estudiante("Pedrito", 18, 123456);
        Estudiante e2 = new Estudiante("Maria", 22, 789456);

        universidad.agregarEstudiante(e1);
        universidad.agregarEstudiante(e2);
        System.out.println("nombre de la universidad: " + universidad.getNombre());


        if(universidad.getContadorEstudiantes() > 0) {
            for (int i = 0; i < universidad.getContadorEstudiantes(); i++) {
                System.out.println(universidad.getEstudiantes()[i].getEstudiante());
            }
        } else {
            System.out.println("no hay estudiantes registrados");
        }

    }
}