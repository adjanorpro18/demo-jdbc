package fr.diginamic;

import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnexionJdbc {
    public static void main(String[] args) {
        Connection conn = null;


        try {
            // Recupérer la classe Driver
            DriverManager.registerDriver(new Driver());

            // Se connecter à ma base de données grâce à url de connection
            conn = DriverManager.getConnection("jdbc:mariadb://localhost:8889/compta", "root", "root");
            System.out.println(conn);

            // Fermer la connection
            conn.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
