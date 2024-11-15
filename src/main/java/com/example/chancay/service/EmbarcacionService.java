package com.example.chancay.service;

import com.example.chancay.model.Embarcacion;
import com.example.chancay.repository.EmbarcacionRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class EmbarcacionService {

    @Autowired
    private EmbarcacionRepository embarcacionRepository;

    //método para listar las embarcaciones existentes
    public List <Embarcacion> getEmbarcaciones(){
        return embarcacionRepository.findAll();
    }

    //método para obtener una embarcacion por su id
    public Embarcacion getEmbarcacionById(Integer id){
        return embarcacionRepository.findById(id).orElse(null);
    }

    //Método para crear una embarcacion 
    public Embarcacion createEmbarcacion(Embarcacion embarcacion){
        return embarcacionRepository.save(embarcacion);
    }

    //Método para actualizar o editar una embarcación según su id
    public Embarcacion updateEmbarcacion(Embarcacion embarcacion, Integer id){
        
        Embarcacion embarcacionActual=embarcacionRepository.findById(id).orElse(null);
        if(embarcacion!=null){
            embarcacionActual.setNombre(embarcacion.getNombre());
            embarcacionActual.setCapacidad(embarcacion.getCapacidad());
            embarcacionActual.setDescipcion(embarcacion.getDescipcion());
            return embarcacionRepository.save(embarcacionActual);
        }
        return null;

    }

    //Método para eliminar una embarcacion según su id
    public void deleteEmbarcacion(Integer id){
        embarcacionRepository.deleteById(id);
    }


    
}
