package pokemon.Logica;

/**
 *
 * @author Norayio
 */

public class Main {
    
    public static void main(String[] args) {
        
        Squirtle squirtle = new Squirtle( );
        Charmander charmander = new Charmander( );
        Bulbasor bulbasor = new Bulbasor( );
        Pikachu pikachu = new Pikachu( );
        
        
        squirtle.atacarAraniazo( );
        squirtle.atacarHidrobomba( );
        
        System.out.println("-----");
        
        charmander.atacarAraniazo( );
        charmander.atacarLanzaLlamas( );
        
       System.out.println("-----");
        
        bulbasor.atacarAraniazo( );
        bulbasor.atacarDrenaje( );
        
        System.out.println("-----");
        
        pikachu.atacarAraniazo( );
        pikachu.atacarImpactTrueno( );
        
        System.out.println("");
        
        
    }
    
    
    
    
    
}
