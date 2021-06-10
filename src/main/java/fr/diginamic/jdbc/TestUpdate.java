package fr.diginamic.jdbc;

import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc2;
import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestUpdate {
    public static void main(String[] args) {


        //FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();
        //fournisseurDaoJdbc.update("La maison de la Peinture", "La maison des Peintures");

        FournisseurDaoJdbc2 fournisseurDaoJdbc2 = new FournisseurDaoJdbc2();
        fournisseurDaoJdbc2.update("France Materiaux", "France des Materiaux");

    }
}
