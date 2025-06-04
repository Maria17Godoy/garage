/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.godoy.garage.DTO;

import local.godoy.garage.entities.Veículo;

/**
 *
 * @author ppjatb
 */
public class GarageMinDTO {
    
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double km;
    private String linkimagem;

    public GarageMinDTO() {
    }

    public GarageMinDTO(Veículo veículo) {
        this.id = veículo.getId();
        this.marca = veículo.getMarca();
        this.modelo = veículo.getModelo();
        this.cor = veículo.getCor();
        this.ano = veículo.getAno();
        this.km = veículo.getKM();
        this.linkimagem = veículo.getLinkImagem();
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getKm() {
        return km;
    }

    public String getLinkimagem() {
        return linkimagem;
    }
    
    
}
