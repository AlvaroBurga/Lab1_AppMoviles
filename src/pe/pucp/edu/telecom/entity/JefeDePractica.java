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
public class JefeDePractica extends Docente{
    private int egreso;

    /**
     * @return the egreso
     */
    public int getEgreso() {
        return egreso;
    }

    /**
     * @param egreso the egreso to set
     */
    public void setEgreso(int egreso) {
        this.egreso = egreso;
    }
    
}
