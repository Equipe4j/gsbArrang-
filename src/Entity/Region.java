/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author PC
 */
public class Region {
    private String codReg;
    private String secReg;
    private String regNom;
    
    public Region(String reg,String sec,String nom){
        codReg=reg;
        secReg=sec;
        regNom=nom;
     
        
    }

    /**
     * @return the codReg
     */
    public String getCodReg() {
        return codReg;
    }

    /**
     * @return the secReg
     */
    public String getSecReg() {
        return secReg;
    }

    /**
     * @return the regNom
     */
    public String getRegNom() {
        return regNom;
    }
    
}
