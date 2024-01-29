package pokemon.Logica;

/**
 *
 * @author Norayio
 */

public class Charmander extends Pokemon implements IFuego{

    /**
     * metodos heredados de la clase abstracta Pokemon
     */
    
    @Override
    protected void atacarPlacaje() {
         System.out.println("Soy Charmander y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
         System.out.println("Soy Charmander y estoy atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
         System.out.println("Soy Charmander y estoy atacando con placaje");
    }
    
    
     /**
     * metodos de la interfaz IPlanta
     */

    @Override
    public void atacarPunioFuego() {
         System.out.println("Soy Charmander y estoy atacando con puño fuego");
    }
    
    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy Charmander y estoy atacando con lanza llamas");
    }

    @Override
    public void atacarAscuas() {
         System.out.println("Soy Charmander y estoy atacando con ascuas");
    }
    
}
