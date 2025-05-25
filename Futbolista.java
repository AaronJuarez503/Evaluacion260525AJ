public class Futbolista extends Persona {
    private String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        super(nombre, edad);
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
}
