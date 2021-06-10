package fr.diginamic.jdbc;

import fr.diginamic.entites.Fournisseur;
import fr.diginamic.jdbc.dao.FournisseurDao;
import fr.diginamic.jdbc.dao.FournisseurDaoJdbc;
import org.mariadb.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class TestSelect {
    public static void main(String[] args) {

        FournisseurDaoJdbc fournisseurDaoJdbc = new FournisseurDaoJdbc();

        fournisseurDaoJdbc.extraire();


    }
}
