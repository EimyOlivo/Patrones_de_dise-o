
package Adacter_Java;

public class PianoAcusticoAdacter extends Piano {
    PianoAcustico acustica = new PianoAcustico();
    
    public void encender(){
        acustica.tocar();
    }
    public void apagar(){
        acustica.noTocar();
    }
    
}
