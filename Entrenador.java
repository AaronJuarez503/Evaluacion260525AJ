public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String nombre, int edad, String estrategia) {
        super(nombre, edad);
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
}
public class Entrenador extends Persona {
    private String estrategia;

    public Entrenador(String nombre, int edad, String estrategia) {
        super(nombre, edad);
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
}