/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danielvrp;

import java.sql.*;

/**
 *
 * @author Daniel
 */
public class Conexao {
    String driver = "com.mysql.jdbc.Driver";
    String banco = "danielvrp";
    String host = "localhost";
    String stringDeConexao = "jdbc:mysql://"+host+":3306/"+banco+"?serverTimezone=UTC";
    String usuario = "root";
    String senha = "senha005";
    
    public Connection conexao;
            
    public Conexao(){}
    
    public Connection getConexao() {
        try{
            Class.forName(driver);
            return DriverManager.getConnection(this.stringDeConexao,usuario,senha);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return conexao;
        }
    }
    
    public ResultSet getResultSet(String sentenca){
        try{
            Statement stm = new ConexaoBanco().getInstanceStatement();
            ResultSet rs = stm.executeQuery(sentenca);
            return rs;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public String atualizarBanco(String sentenca){
        try{
            Statement stm = new ConexaoBanco().getInstanceStatement();
            stm.executeUpdate(sentenca);
            return "1";
        }
        catch(SQLException ex){
            if(ex instanceof SQLIntegrityConstraintViolationException)
                return "Impossivel deletar. Registro utilizado em um mais consultas";
            else
                return ex.getMessage(); 
        }
        catch(Exception e){
            return e.getMessage();
        }
    }
}
