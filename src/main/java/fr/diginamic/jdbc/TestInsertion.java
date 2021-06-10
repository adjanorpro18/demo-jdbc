package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc2;
import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertion {


    public static void main(String[] args) {

       /* FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();
        Fournisseur f1 = new Fournisseur(4, "La maison de la Peinture");
        fournisseurDaoJdbc.insert(f1);

        // Insertion du nom d'un forunissseur avec les simples quotes
        Fournisseur f2 = new Fournisseur(0,"L'Espace Creation");
        fournisseurDaoJdbc.insert(f2);*/

        FournisseurDaoJdbc2 fournisseurDaoJdbc2 = new FournisseurDaoJdbc2();
        Fournisseur f3 = new Fournisseur(5, "France Materiaux");
        Fournisseur f4 = new Fournisseur(6, "Lafarge");
        fournisseurDaoJdbc2.insert(f3);
        fournisseurDaoJdbc2.insert(f4);

    }
}
