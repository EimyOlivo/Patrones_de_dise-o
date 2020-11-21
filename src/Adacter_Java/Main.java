
package Adacter_Java;

public class Main {
    public static void main(String[] args) {
        Piano teclado = new Teclado();
        teclado.encender();
        teclado.apagar();
        
        Piano pianoAcustica = new PianoAcusticoAdacter();
        pianoAcustica.encender();
        pianoAcustica.apagar();
    } 
}
