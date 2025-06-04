/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.godoy.garage.service;

import java.util.List;
import local.godoy.garage.entities.Veículo;
import local.godoy.garage.repositories.GarageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ppjatb
 */
@Service
public class GarageService {
    
    @Autowired
    private GarageRepository garageRepository;
    
    public List<Veículo> findAll() {
        List<Veículo> result = garageRepository.findAll();
        return result;
    }
    
    public List<Veículo> findById(long id) {
        List<Veículo> result = garageRepository.findById(id);   
        return result;
    }   
}
    
    
    

