/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.pucp.edu.telecom.manager;

import java.util.ArrayList;
import pe.pucp.edu.telecom.entity.base.Usuario;

/**
 *
 * @author Alvaro
 */
public class DirectorioTelefonico {
    private ArrayList<Usuario> lista= new ArrayList<>();
    
    public void agregar(Usuario usuario)
    {
        this.getLista().add(usuario);
    }

    /**
     * @return the lista
     */
    public ArrayList<Usuario> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<Usuario> lista) {
        this.lista = lista;
    }
    
}
