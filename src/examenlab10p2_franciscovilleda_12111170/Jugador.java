
package examenlab10p2_franciscovilleda_12111170;


public class Jugador {
    private String nombre;
    private int ataque, velocidad;

    public Jugador(String nombre, int ataque, int velocidad) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.velocidad = velocidad;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
