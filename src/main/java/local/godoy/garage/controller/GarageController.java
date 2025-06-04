/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.godoy.garage.controller;

import java.util.List;
import local.godoy.garage.DTO.GarageMinDTO;
import local.godoy.garage.entities.Veículo;
import local.godoy.garage.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ppjatb
 */
@RestController
public class GarageController {
    
    @Autowired
    private GarageService garageService;
    
    @GetMapping("/forsale")
     public ResponseEntity<List<GarageMinDTO>> findAll() {
        List<GarageMinDTO> result = garageService.findAll();
        
        if (result == null) {
            return ResponseEntity.notFound().build();
            
        } else {
            return ResponseEntity.ok(result);
        }    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<List<Veículo>> findById(@PathVariable long id){
        List<Veículo> result = garageService.findById(id);
        
        if (result == null) {
            return ResponseEntity.notFound().build();
            
        } else {
            return ResponseEntity.ok(result);
        }
    }
    
    @GetMapping("/cor/{cor}")
    public ResponseEntity<List<GarageMinDTO>> findByCorIgnoreCase(@PathVariable String cor){
        List<GarageMinDTO> result = garageService.findByCorIgnoreCase(cor);
        
        if (result == null) {
            return ResponseEntity.notFound().build();
            
        } else {
            return ResponseEntity.ok(result);
        }
    
    }
    
    @GetMapping("/ano/{ano}")
    public ResponseEntity<List<GarageMinDTO>> findByAno(@PathVariable int ano){
        List<GarageMinDTO> result = garageService.findByAno(ano);
        
        if (result == null) {
            return ResponseEntity.notFound().build();
            
        } else {
            return ResponseEntity.ok(result);
        }
    
    }
}
 

