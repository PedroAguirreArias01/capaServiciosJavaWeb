/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uptc.sw2.servicios;

import c.edu.uptc.sw2.persistencia.Almacenamiento;
import co.edu.uptc.sw2.entidades.Horario;
import co.edu.uptc.sw2.entidades.Municipio;
import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 *
 * @author PEDRO
 */
@Path("ServicioHorario")
public class ServicioHorario {
    @GET
    public ArrayList<Horario> getHorario(){
        return Almacenamiento.getInstance().getListHorarios();
    }
    
    @POST
    public Horario guardarHorario(Horario horario) {
        Almacenamiento.getInstance().getListHorarios().add(horario);
        return horario;
    }
}
