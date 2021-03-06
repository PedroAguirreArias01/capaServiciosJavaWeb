/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Matricula;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author PEDRO
 */
@Path("ServicioMatricula")
public class ServicioMatricula {
    @GET
    public ArrayList<Matricula> getMatricula(){
        return Almacenamiento.getInstance().getListMatriculas();
    }
    
    @POST
    public Matricula guardarMatricula(Matricula matricula) {
        Almacenamiento.getInstance().getListMatriculas().add(matricula);
        return matricula;
    }
}
