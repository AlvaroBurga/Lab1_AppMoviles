package lab1appocalipsis;


import lab1appocalipsis.Usuario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alvaro
 */
public class Docente extends Usuario{
    private int año;
    private int cursos;

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the cursos
     */
    public int getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(int cursos) {
        this.cursos = cursos;
    }
    
}
