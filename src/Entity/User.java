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
public class User {
    private int idUser;
    private String nomUser;
    private String prenomUser;
    private String statutUser;
    
    public User(int unId, String unNom,String unPrenom,String unStatut)
    {
        idUser =unId;
        nomUser = unNom;
        prenomUser = unPrenom;
        statutUser = unStatut;
    }

    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @return the nomUser
     */
    public String getNomUser() {
        return nomUser;
    }

    /**
     * @return the prenomUser
     */
    public String getPrenomUser() {
        return prenomUser;
    }

    /**
     * @return the statutUser
     */
    public String getStatutUser() {
        return statutUser;
    }
}
