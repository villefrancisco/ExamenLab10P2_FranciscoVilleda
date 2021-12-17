
package examenlab10p2_franciscovilleda_12111170;
import java.util.Random;

public class Belico extends Carro{
    Random rng = new Random();

    public Belico() {
    }

    public Belico(int velocidad, int ataque, int vida, String nombre, double derrape) {
        super(velocidad, ataque, vida, nombre, derrape);
        double vidaExtra = (50 + rng.nextInt(100))/100;
        super.setVida((int)(vida * vidaExtra));
    }
    
}
