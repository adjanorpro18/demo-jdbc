package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import org.mariadb.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestInsertion {


    public static void main(String[] args) {

        FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();
        //Fournisseur f1 = new Fournisseur(4, "La maison de la Peinture");
        //fournisseurDaoJdbc.insert(f1);

        // Insertion du nom d'un forunissseur avec les simples quotes
        Fournisseur f2 = new Fournisseur(0, "  L'Espace Creation ");
        fournisseurDaoJdbc.insert(f2);

    }
}
