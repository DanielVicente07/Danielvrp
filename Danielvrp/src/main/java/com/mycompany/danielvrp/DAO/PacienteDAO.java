/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danielvrp.DAO;

import com.mycompany.danielvrp.Conexao;
import com.mycompany.danielvrp.model.Paciente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Daniel
 */
public class PacienteDAO extends Conexao {

    public String cadastrarPaciente(Paciente paciente) {
        try{
            String sentenca;
            sentenca = "INSERT INTO PACIENTE VALUES (NULL,'"+
                    paciente.getNome()+"','"+paciente.getCpf()+
                    "',"+paciente.getIdade()+")";
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

    public String atualizarPaciente(Paciente paciente) {
        try{
            String sentenca;
            sentenca = "UPDATE PACIENTE SET NOME = '"+
                    paciente.getNome()+"',IDADE = "+paciente.getIdade()+
                    ", CPF = '"+paciente.getCpf()+"' WHERE IDPACIENTE = "+ paciente.getIdpaciente();
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e){
            return e.getMessage();
        }
    }
    
    public String excluirPaciente(String matricula){
        try{
            String sentenca;
            sentenca = "DELETE FROM PACIENTE WHERE IDPACIENTE = "+ matricula;
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

    public ArrayList listarPacientes() {
        try{
            ArrayList pacientes = new ArrayList();
            String sentenca = "SELECT * FROM PACIENTE ORDER BY NOME";
            ResultSet rs = this.getResultSet(sentenca);
            while (rs.next()){
                Paciente paciente = new Paciente();
                paciente.setIdpaciente(rs.getInt("IDPACIENTE"));
                paciente.setNome(rs.getString("NOME"));
                paciente.setIdade(rs.getInt("IDADE"));
                paciente.setCpf(rs.getString("CPF"));
                pacientes.add(paciente);
            }
            return pacientes;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
