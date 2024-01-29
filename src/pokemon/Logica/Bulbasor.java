package pokemon.Logica;

/**
 *
 * @author Norayio
 */

public class Bulbasor extends Pokemon implements IPlanta {

    public Bulbasor( ) {
    }
    

    
    /**
     * metodos heredados de la clase abstracta Pokemon
     */
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Bulbasor y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Soy Bulbasor y estoy atacando con arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Soy Bulbasor y estoy atacando con mordisco");
    }

    
    /**
     * metodos de la interfaz IPlanta
     */
    
    @Override
    public void atacarDrenaje() {
        System.out.println("Soy Bulbasor y estoy atacando con drenaje");
    }

    @Override
    public void atacarParalizar() {
       System.out.println("Soy Bulbasor y estoy atacando con paralizar");
    }
    
    
    
    
    
}
