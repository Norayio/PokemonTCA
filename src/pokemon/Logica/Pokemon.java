package pokemon.Logica;

/**
 *
 * @author Norayio
 */

// clase abstracta para que los pokemones que hereden tengan sus atributos
public abstract class Pokemon {
    
    // protected para que solo las clases hijas de "Pokemon" puedan heredar los atributos
    
    protected int numPokedex;
    protected  String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
    
    /**
     *  metodos de ataque.
     *  lleva "abstract" porque es una clase abstracta y no una interfaz.
     *  esto obligará a implementar estos metodos en sus clases hijas.
     */
    protected abstract void atacarPlacaje( );
    protected abstract void atacarAraniazo( );
    protected abstract void atacarMordisco( );
    
    
    
}
