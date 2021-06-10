package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc2;
import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {
    public static void main(String[] args) {

        //FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();
       // Fournisseur f1 = new Fournisseur(7, null);
       // fournisseurDaoJdbc.delete(f1);

        FournisseurDaoJdbc2 fournisseurDaoJdbc2 = new FournisseurDaoJdbc2();
        Fournisseur f2 = new Fournisseur(8, null);
        fournisseurDaoJdbc2.delete(f2);



    }
}
