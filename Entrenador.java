public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(int id, String nombre, String apellidos, int edad, String estrategia) {
        super(id, nombre, apellidos, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void descripcionRol() {
        System.out.println(getNombre() + " es el entrenador. Estrategia: " + estrategia);
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " (Entrenador) se está concentrando.");
    }

    @Override
    public void viajar() {
        System.out.println(getNombre() + " (Entrenador) está viajando.");
    }

    public void dirigirPartido() {
        System.out.println(getNombre() + " está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(getNombre() + " está dirigiendo un entrenamiento.");
    }
}
