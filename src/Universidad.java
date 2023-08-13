public class Universidad {
    private String nombre;
    private Estudiante[] estudiantes;
    private int contadorEstudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.contadorEstudiantes = 0;
        this.estudiantes = new Estudiante[100];

    }

    public String getNombre() {
        return nombre;
    }

    public void agregarEstudiante(Estudiante e) {
        if(contadorEstudiantes < 100){
            this.estudiantes[contadorEstudiantes] = e;
            contadorEstudiantes++;
        }
    }

    public Estudiante[] getEstudiantes() {
        return this.estudiantes;
    }

    public int getContadorEstudiantes() {
        return contadorEstudiantes;
    }
}
