/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Region;
import Entity.User;
import Entity.Visiteur;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class FonctionMetier  implements IMetier {

    @Override
    public User GetUnUser(String login, String mdp)
            
    {
            User  user = null;
        try {
            Connection cnx = ConnexionBDD.getCnx();
            PreparedStatement ps = cnx.prepareStatement("select nom_utilisateur , mots_de_passe from utilisateur  where nom_utilisateur ='"+login+"'and mots_de_passe ='"+mdp+"'");
            System.out.println(ps);
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            user =  new User(rs.getString("nom_utilisateur"),rs.getString("mots_de_passe"));
            rs.close();
            
        } catch (SQLException ex) {
            Logger.getLogger(FonctionMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user ;
    }

    @Override
    public ArrayList<Visiteur> GetAllVisiteur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsererVisteur(String nom, String prenom, String Adresse, String Cp, String Ville, String date, String secteur, String labo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ModifierVisteur(String nom, String prenom, String Adresse, String Cp, String Ville, String date, String secteur, String labo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Region> GetAllRegions() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void InsererRegions(String Region, String Code, String nom) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ModifierRegions(String Region, String Code) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int GetLastMatricule() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
