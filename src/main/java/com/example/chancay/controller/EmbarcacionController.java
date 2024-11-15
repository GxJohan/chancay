package com.example.chancay.controller;

import com.example.chancay.service.EmbarcacionService;
import com.example.chancay.model.Embarcacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/embarcaciones")
public class EmbarcacionController {

    @Autowired
    private EmbarcacionService embarcacionService;

    //Obtener la lista de todas las embarcaciones
    @GetMapping
    public List <Embarcacion> getEmbarcaciones(){
        return embarcacionService.getEmbarcaciones();
    }
    
    //Obtener una embarcacion por su id
    @GetMapping("/{id}")
    public ResponseEntity<Embarcacion> getEmbarcacionById(@PathVariable Integer id){
        Embarcacion embarcacionActual  = embarcacionService.getEmbarcacionById(id);
        if (embarcacionActual!=null){
            return ResponseEntity.ok(embarcacionActual);
        }
        return ResponseEntity.notFound().build();
    }

    //Crear una embarcacion
    @PostMapping
    public Embarcacion creatEmbarcacion(@RequestBody Embarcacion embarcacion){
        return embarcacionService.createEmbarcacion(embarcacion);
    }

    //Actualizar embarcacion necesitamos el id
    @PutMapping("/{id}")
    public ResponseEntity<Embarcacion> updateEmbarcacion(@RequestBody Embarcacion embarcacion, @PathVariable Integer id){

        Embarcacion embarcacionActual = embarcacionService.getEmbarcacionById(id);
        if (embarcacionActual != null){
            return ResponseEntity.ok(embarcacionActual);
        }
        return ResponseEntity.notFound().build();

    }

    //Eliminar mejor forma
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmbarcacion(@PathVariable Integer id){
        Embarcacion embarcacionActual = embarcacionService.getEmbarcacionById(id);
        if (embarcacionActual != null){
            embarcacionService.deleteEmbarcacion(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    //otra forma mas simple de eliminar

    // @DeleteMapping("/{id}")
    // public void deleteEmbarcacion(@PathVariable Integer id){
    //     embarcacionService.deleteEmbarcacion(id);
    //     return ResponseEntity.noContent().build();
    // }




}
