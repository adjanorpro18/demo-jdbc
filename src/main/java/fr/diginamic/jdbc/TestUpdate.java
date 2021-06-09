package fr.diginamic.jdbc;

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;

        try {
            //Acceder à la classe driver pour pouvoir se connecter
            DriverManager.registerDriver(new Driver());

            //Connecter à la base de donnees compta
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:8889/compta", "root", "root");

            //Modification dans la table fournisseur du nom "La maison de la Peinture" en "La maison des Peintures"
            stmt = conn.createStatement();
            int nb = stmt.executeUpdate("UPDATE FOURNISSEUR SET NOM='La Maison des Peintures' WHERE NOM='La Maison de la Peinture' ");

            if(nb !=0){
                System.out.println("Le nombre de lignes modifiés est de: " + nb);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {//Fermer les ressources après usage
            if (conn != null) {
                try {
                    conn.close();
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
        }
    }
}
