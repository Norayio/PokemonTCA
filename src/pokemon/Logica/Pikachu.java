package pokemon.Logica;

/**
 *
 * @author Norayio
 */

public class Pikachu extends Pokemon implements IElectrico {
    
    /**
     * metodos heredados de la clase abstracta Pokemon
     */
    

    @Override
    protected void atacarPlacaje() {
       System.out.println("Soy Pikachu y estoy atacando con placaje");
    }

    @Override
    protected void atacarAraniazo() {
       System.out.println("Soy Pikachu y estoy atacando con placaje");
    }

    @Override
    protected void atacarMordisco() {
      System.out.println("Soy Pikachu y estoy atacando con placaje");
    }
    
     /**
     * metodos de la interfaz IPlanta
     */

    @Override
    public void atacarImpactTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con impact trueno");
    }

    @Override
    public void atacarpunioTrueno() {
        System.out.println("Soy Pikachu y estoy atacando con puño de trueno");
    }
    
}
