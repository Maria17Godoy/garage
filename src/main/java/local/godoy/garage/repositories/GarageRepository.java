/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.godoy.garage.repositories;

import java.util.List;
import local.godoy.garage.entities.Veículo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ppjatb
 */
public interface GarageRepository extends JpaRepository<Veículo, Long> {
    
    List<Veículo> findById(long id);
    List<Veículo> findByCorIgnoreCase(String cor);
    List<Veículo> findByAno(int ano);
    
}
