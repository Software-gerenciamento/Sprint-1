/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author THIAGO-PC
 */
public class Cadastrar {
        protected static Connection conectaBanco() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        Connection Conec;
        Conec = DriverManager.getConnection("jdbc:postgresql://localhost/ClienteBanco",
                "postgres", "123456");
        return Conec;
    }
      public static void Insere(Cliente cli) throws SQLException, ClassNotFoundException{
          try (Connection c = Cadastrar.conectaBanco()) {
            PreparedStatement p = c.prepareStatement("insert into Cliente (cpf, endereco, nome, sexo, telefone)values (?, ?, ?, ?, ?)");
            p.setString(1, cli.getCPF());
            p.setString(2, cli.getEndereco());
            p.setString(3, cli.getNome());
            p.setString(4, cli.getSexo());
            p.setString(5, cli.getTelefone());
            p.executeUpdate();
           
        }
      }
      public void Remover(String nome) throws SQLException, ClassNotFoundException {
        try (Connection c = Cadastrar.conectaBanco()) {
            PreparedStatement p = c.prepareStatement("delete from Livro where nome like ? ");
            p.setString(1, nome);
            p.executeUpdate();
        }
      }
      public void RemoverCat(String nome) throws SQLException, ClassNotFoundException {
        try (Connection c = Cadastrar.conectaBanco()) {
            PreparedStatement p = c.prepareStatement("delete from Categoria where nome like ? ");
            p.setString(1, nome);
            p.executeUpdate();
        }
     }
     
        public static List<Cliente> listaNome() throws SQLException, ClassNotFoundException{
          List<Cliente> lista = new ArrayList<Cliente>();       
       
          
            Connection c = Cadastrar.conectaBanco();
            PreparedStatement p = c.prepareStatement("select * from Cliente");
            ResultSet r = p.executeQuery();
              while (r.next()) {
                  Cliente cliente = new Cliente();
                  cliente.setCPF(r.getString("cpf"));
                  cliente.setEndereco(r.getString("endereco"));
                  cliente.setNome(r.getString("nome"));
                  cliente.setSexo(r.getString("sexo"));
                  cliente.setTelefone(r.getString("telefone"));
                  
                  lista.add(cliente);
              }
                              
              
              return lista;
        
      
}}

    /**
     * @param args the command line arguments
     */
    
    

