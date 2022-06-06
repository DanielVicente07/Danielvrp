/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.danielvrp.model;

/**
 *
 * @author Daniel
 */
public class Consulta {
    private int idconsulta;
    private int id_medico;
    private int id_paciente;
    private String convenio;
    private String nome_medico;
    private String nome_paciente;

    /**
     * @return the idconsulta
     */
    public int getIdconsulta() {
        return idconsulta;
    }

    /**
     * @param idconsulta the idconsulta to set
     */
    public void setIdconsulta(int idconsulta) {
        this.idconsulta = idconsulta;
    }

    /**
     * @return the id_medico
     */
    public int getId_medico() {
        return id_medico;
    }

    /**
     * @param id_medico the id_medico to set
     */
    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    /**
     * @return the id_paciente
     */
    public int getId_paciente() {
        return id_paciente;
    }

    /**
     * @param id_paciente the id_paciente to set
     */
    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    /**
     * @return the convenio
     */
    public String getConvenio() {
        return convenio;
    }

    /**
     * @param convenio the convenio to set
     */
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    /**
     * @return the nome_medico
     */
    public String getNome_medico() {
        return nome_medico;
    }

    /**
     * @param nome_medico the nome_medico to set
     */
    public void setNome_medico(String nome_medico) {
        this.nome_medico = nome_medico;
    }

    /**
     * @return the nome_paciente
     */
    public String getNome_paciente() {
        return nome_paciente;
    }

    /**
     * @param nome_paciente the nome_paciente to set
     */
    public void setNome_paciente(String nome_paciente) {
        this.nome_paciente = nome_paciente;
    }
}
