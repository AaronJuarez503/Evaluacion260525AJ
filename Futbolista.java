public class Futbolista extends Persona {
    private String posicion;

    public Futbolista(int id, String nombre, String apellidos, int edad, String posicion) {
        super(id, nombre, apellidos, edad);
        this.posicion = posicion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void descripcionRol() {
        System.out.println(getNombre() + " juega como " + posicion + ".");
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " (Futbolista) se está concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " (Futbolista) está viajando.");
    }

    public void jugarPartido() {
        System.out.println(getNombre() + " está jugando un partido.");
    }

    public void entrenar() {
        System.out.println(getNombre() + " está entrenando.");
    }
}
