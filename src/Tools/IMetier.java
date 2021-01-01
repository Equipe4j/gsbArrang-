/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tools;

import Entity.Region;
import Entity.User;
import Entity.Visiteur;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public interface IMetier {
    public User GetUnUser(String login, String mdp);
    public ArrayList<Visiteur> GetAllVisiteur();
    public void InsererVisteur(String nom, String prenom,String Adresse, String Cp, String Ville,String date,String secteur,String labo);
    public void ModifierVisteur(String nom, String prenom,String Adresse, String Cp, String Ville,String date,String secteur,String labo);
    public ArrayList<Region> GetAllRegions();
    public void InsererRegions(String Region, String Code,String nom);
    public void ModifierRegions(String Region, String Code);
    public int GetLastMatricule();
    
    
}
