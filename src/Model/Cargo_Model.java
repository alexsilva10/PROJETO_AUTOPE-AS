/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ALEX DIAS
 */
public class Cargo_Model {
    private int ID;
    private String Nomecargo;

    public Cargo_Model(int ID, String Nomecargo) {
        this.ID = ID;
        this.Nomecargo = Nomecargo;
    }

    public Cargo_Model() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomecargo() {
        return Nomecargo;
    }

    public void setNomecargo(String Nomecargo) {
        this.Nomecargo = Nomecargo;
    }
    
    
}
