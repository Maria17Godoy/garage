/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.godoy.garage.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author ppjatb
 */
@Entity
@Table(name = "veiculos")
public class Veículo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double km;
    
    @Column(name = "linkimagem")
    private String linkimagem;
    
    @Column(name = "descricaocompleta")
    private String descricaocompleta;
    private String avarias;
    
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
        
        public String getMarca() {
            return marca;
        }

        public void setMarca(String Marca) {
            this.marca = Marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String Modelo) {
            this.modelo = Modelo;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String Cor) {
            this.cor = Cor;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int Ano) {
            this.ano = Ano;
        }

        public double getKM() {
            return km;
        }

        public void setKM(double KM) {
            this.km = KM;
        }

        public String getLinkImagem() {
            return linkimagem;
        }

        public void setLinkImagem(String LinkImagem) {
            this.linkimagem = LinkImagem;
        }

        public String getDescricaoCompleta() {
            return descricaocompleta;
        }

        public void setDescricaoCompleta(String DescricaoCompleta) {
            this.descricaocompleta = DescricaoCompleta;
        }

        public String getAvarias() {
            return avarias;
        }

        public void setAvarias(String Avarias) {
            this.avarias = Avarias;
        }

    
}
