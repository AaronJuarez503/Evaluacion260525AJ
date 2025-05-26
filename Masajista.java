public class Masajista extends Persona {
    private String especialidad;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellidos, int edad, String especialidad, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.especialidad = especialidad;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " (Masajista) se está concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " (Masajista) está viajando.");
    }

    public void darMasaje() {
        System.out.println(getNombre() + " está dando un masaje.");
    }

    @Override
    public void descripcionRol() {
        System.out.println(getNombre() + " es masajista. Especialidad: " + especialidad);
    }
}
