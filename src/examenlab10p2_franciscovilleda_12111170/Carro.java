
package examenlab10p2_franciscovilleda_12111170;

public class Carro {
    private int velocidad, ataque, vida;
    private String nombre;
    private double derrape;

    public Carro() {
    }

    public Carro(int velocidad, int ataque, int vida, String nombre, double derrape) {
        this.velocidad = velocidad;
        this.ataque = ataque;
        this.vida = vida;
        this.nombre = nombre;
        this.derrape = derrape;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDerrape() {
        return derrape;
    }

    public void setDerrape(double derrape) {
        this.derrape = derrape;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
