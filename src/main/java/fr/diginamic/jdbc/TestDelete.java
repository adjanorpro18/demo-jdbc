package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
    public static void main(String[] args) {

        FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();
        Fournisseur f1 = new Fournisseur(5, null);
        fournisseurDaoJdbc.delete(f1);


    }
}
