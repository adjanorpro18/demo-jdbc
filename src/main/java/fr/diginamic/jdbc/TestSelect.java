package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import org.mariadb.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class TestSelect {
    public static void main(String[] args) {

        ArrayList<Fournisseur> listeFournisseurs = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            //Acceder à la classe driver pour pouvoir se connecter
            DriverManager.registerDriver(new Driver());

            //Connecter à la base de donnees compta
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:8889/compta", "root", "root");

            //Selectionner la liste des fournisseurs de la table Fournisseur
            stmt = conn.createStatement();
            rs = stmt.executeQuery("SELECT * FROM FOURNISSEUR");
            //Itérer sur les chacuns des champs du résultat à afficher
            while (rs.next()) {
               Integer id = rs.getInt("ID_FOUR");
               String nom = rs.getString("NOM");

                Fournisseur fournisseur = new Fournisseur(id, nom);
                listeFournisseurs.add(fournisseur);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {//Fermer les ressources après usage

            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }

        }
        //Une boucle sur la liste des fournisseurs pour les afficher
        for (Fournisseur fournisseur :listeFournisseurs
             ) {
            System.out.println(fournisseur.getId() + " " + fournisseur.getNom());
        }
    }
}
