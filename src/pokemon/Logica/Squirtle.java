package pokemon.Logica;

/**
 *
 * @author Norayio
 */

public class Squirtle extends Pokemon implements IAgua{

    /**
     * metodos heredados de la clase abstracta Pokemon
     */
    
    @Override
    protected void atacarPlacaje() {
         System.out.println("Soy Squirtle y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Squirtle y estoy atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Soy Squirtle y estoy atacando con placaje");
    }
    
       /**
     * metodos de la interfaz IPlanta
     */

    @Override
    public void atacarHidrobomba() {
       System.out.println("Soy Squirtle y estoy atacando con hidrobomba");
    }
    

    @Override
    public void atacarBurbuja() {
       System.out.println("Soy Squirtle y estoy atacando con burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle y estoy atacando con pistola de agua");
    }
    
}
