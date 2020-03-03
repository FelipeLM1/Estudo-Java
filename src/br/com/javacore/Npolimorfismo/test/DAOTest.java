package br.com.javacore.Npolimorfismo.test;

import br.com.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
import br.com.javacore.Npolimorfismo.classes.DatabaseDAOImpl;
import br.com.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        GenericDAO DadoDAO = new DatabaseDAOImpl();
        DadoDAO.save();
    }
}
