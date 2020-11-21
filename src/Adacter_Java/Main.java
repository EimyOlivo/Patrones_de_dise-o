
package Adacter_Java;

public class Main {
    public static void main(String[] args) {
        Guitarra guitarraElectrica = new GuitarraElectrica();
        guitarraElectrica.encender();
        guitarraElectrica.apagar();
        
        Guitarra guitarraAcustica = new GuitarraAcusticaAdacter();
        guitarraAcustica.encender();
        guitarraAcustica.apagar();
    } 
}
