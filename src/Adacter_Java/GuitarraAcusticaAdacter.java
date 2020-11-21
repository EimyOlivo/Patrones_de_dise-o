
package Adacter_Java;

public class GuitarraAcusticaAdacter extends Guitarra {
    GuitarraAcustica acustica = new GuitarraAcustica();
    
    public void encender(){
        acustica.tocar();
    }
    public void apagar(){
        acustica.noTocar();
    }
    
}
