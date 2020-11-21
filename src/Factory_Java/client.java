
package Factory_Java;

/**
 *
 * @author Eimy
 */
public class client {
    public static void main(String[] args) {
        String tipoMoto ="campo";
        int numRuedas = 2;
        
        Factory factoria = new FactoryIMPLE();
        Moto moto = factoria.crearMoto(tipoMoto, numRuedas);
        System.out.println("es una moto de "+moto.getRuedas()+" ruedas");
    }
   
}
