package fr.diginamic.jdbc;

import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {


        FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();
        fournisseurDaoJdbc.update("La maison de la Peinture", "La maison des Peintures");

    }
}
