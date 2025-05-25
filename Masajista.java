public class Masajista extends Persona {
    private String especialidad;

    public Masajista(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void descripcionRol() {
        System.out.println(getNombre() + " es masajista. Especialidad: " + especialidad);
    }
}
