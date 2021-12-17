
package examenlab10p2_franciscovilleda_12111170;

import java.util.Random;

public class Ataque extends Carro{
    Random rng = new Random();

    public Ataque() {
    }

    public Ataque(int velocidad, int ataque, int vida, String nombre, double derrape) {
        super(velocidad, ataque, vida, nombre, derrape);
        double porcentaje = (50 + rng.nextInt(50))/100;
        super.setAtaque((int)(ataque * porcentaje));
    }
    
    
}
