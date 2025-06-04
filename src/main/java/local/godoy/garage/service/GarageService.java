/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.godoy.garage.service;

import java.util.List;
import local.godoy.garage.DTO.GarageMinDTO;
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
    
    public List<GarageMinDTO> findAll() {
        List<Veículo> resultGarage = garageRepository.findAll();
        
        List<GarageMinDTO> resultDTO = resultGarage.stream().map(x -> new GarageMinDTO(x)).toList();
        return resultDTO;
    }
    
    public List<Veículo> findById(long id) {
        List<Veículo> result = garageRepository.findById(id);   
        return result;
    }   
    
    public List<GarageMinDTO> findByCorIgnoreCase(String cor) {
        List<Veículo> resultGarage = garageRepository.findByCorIgnoreCase(cor);
        
        List<GarageMinDTO> resultDTO = resultGarage.stream().map(x -> new GarageMinDTO(x)).toList();
        return resultDTO;
    }
    
    public List<GarageMinDTO> findByAno(int ano) {
        List<Veículo> resultGarage = garageRepository.findByAno(ano);
        
        List<GarageMinDTO> resultDTO = resultGarage.stream().map(x -> new GarageMinDTO(x)).toList();
        return resultDTO;
    }
}
    
    
    

