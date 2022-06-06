/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danielvrp.DAO;

import com.mycompany.danielvrp.Conexao;
import com.mycompany.danielvrp.model.Consulta;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class ConsultaDAO extends Conexao {

    public String cadastrarConsulta(Consulta consulta) {
        try{
            String sentenca;
            sentenca = "INSERT INTO CONSULTA VALUES (NULL,'"+
                    consulta.getConvenio()+"',"+consulta.getId_medico()+
                    ","+consulta.getId_paciente()+")";
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

    public String atualizarConsulta(Consulta consulta) {
        try{
            String sentenca;
            sentenca = "UPDATE CONSULTA SET CONVENIO = '"+
                    consulta.getConvenio()+"', ID_MEDICO = "+consulta.getId_medico()+", ID_PACIENTE = "+consulta.getId_paciente()+" WHERE IDCONSULTA = "+ consulta.getIdconsulta();
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e){
            return e.getMessage();
        }
    }
    
    public String excluirConsulta(String id){
        try{
            String sentenca;
            sentenca = "DELETE FROM CONSULTA WHERE IDCONSULTA = "+ id;
            return this.atualizarBanco(sentenca);
        }
        catch(Exception e){
            return e.getMessage();
        }
    }

    public ArrayList listarConsultas() {
        try{
            ArrayList consultas = new ArrayList();
            String sentenca = "SELECT CONSULTA.* ,MEDICO.NOME AS NOME_MEDICO, PACIENTE.NOME AS NOME_PACIENTE FROM CONSULTA LEFT JOIN MEDICO ON CONSULTA.ID_MEDICO = MEDICO.IDMEDICO LEFT JOIN PACIENTE ON CONSULTA.ID_PACIENTE = PACIENTE.IDPACIENTE ORDER BY CONVENIO";
            ResultSet rs = this.getResultSet(sentenca);
            while (rs.next()){
                Consulta consulta = new Consulta();
                consulta.setIdconsulta(rs.getInt("IDCONSULTA"));
                consulta.setId_medico(rs.getInt("ID_MEDICO"));
                consulta.setId_paciente(rs.getInt("ID_PACIENTE"));
                consulta.setConvenio(rs.getString("CONVENIO"));
                consulta.setNome_medico(rs.getString("NOME_MEDICO"));
                consulta.setNome_paciente(rs.getString("NOME_PACIENTE"));
                consultas.add(consulta);
            }
            return consultas;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
