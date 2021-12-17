
package examenlab10p2_franciscovilleda_12111170;

import java.util.Random;

public class Malvado extends Carro{
    Random rng = new Random();
    
    public Malvado() {
    }

    public Malvado(int velocidad, int ataque, int vida, String nombre, double derrape) {
        super(velocidad, ataque, vida, nombre, derrape);
        super.setVida(1000 + rng.nextInt(4000));
        super.setAtaque(300 + rng.nextInt(400));
    }
    
}
