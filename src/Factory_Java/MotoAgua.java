/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory_Java;

/**
 *
 * @author Eimy
 */
public class MotoAgua implements Moto{
    int ruedas;
    public MotoAgua(int ruedas){
        this.ruedas = ruedas;
        
    }
    public int getRuedas(){
        return this.ruedas;
    }
}
