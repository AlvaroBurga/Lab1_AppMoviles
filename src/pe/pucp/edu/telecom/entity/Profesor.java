/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.pucp.edu.telecom.entity;

import pe.pucp.edu.telecom.entity.base.Docente;

/**
 *
 * @author Alvaro
 */
public class Profesor extends Docente{
    private String facultad;

    /**
     * @return the facultad
     */
    public String getFacultad() {
        return facultad;
    }

    /**
     * @param facultad the facultad to set
     */
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
}
