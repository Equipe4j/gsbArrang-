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
public class Exerce {
    private String matri;
    private String Periode;
    private String codReg;
    private String travCod;
    
    public Exerce(String mat,String Per,String Reg,String role){
        matri=mat;
        Periode=Per;
        codReg=Reg;
        travCod=role;
        
    }

    /**
     * @return the matri
     */
    public String getMatri() {
        return matri;
    }

    /**
     * @return the Periode
     */
    public String getPeriode() {
        return Periode;
    }

    /**
     * @return the codReg
     */
    public String getCodReg() {
        return codReg;
    }

    /**
     * @return the travCod
     */
    public String getTravCod() {
        return travCod;
    }
}
