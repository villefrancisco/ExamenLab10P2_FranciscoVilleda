
package examenlab10p2_franciscovilleda_12111170;

import java.util.Random;

public class Salto extends Carro{
    Random rng = new Random();
    
    private int metros;

    public Salto() {
    }

    public Salto(int velocidad, int ataque, int vida, String nombre, double derrape) {
        super(velocidad, ataque, vida, nombre, derrape);
        this.metros = rng.nextInt(500);
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
}
