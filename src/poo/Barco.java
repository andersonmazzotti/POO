/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author anderson.mazzotti
 */
public class Barco {
    
    
    String Modelo;
    String Cor;
    double Tamanho;
    int ano;
    
    
    
    
     void imprimeBarco() {

        System.out.println("---------Barco-------");
        System.out.println("Modelo : " +Modelo);
        System.out.println("Cor : " + Cor);
        System.out.println("Tamanho : " + Tamanho);
        System.out.println("Ano : " + ano);
    }
    
    
    
    public String getModelo(){
        return Modelo;
    }
    
    
    public void setModelo(String Modelo){
    
    this.Modelo=Modelo;
    
    }
    
     public String getCor(){
        return Cor;
    }
    
    public void setCor(String Cor){
    
    this.Cor=Cor;
    
    }
    
    
    public Double getTamanho(){
        return Tamanho;
    }
    
    public void setTamanho(Double Tamanho){
    
    this.Tamanho=Tamanho;
    
    }
    
    public int getAno(){
    return ano;
    }
    
    public void setAno(int ano){
    
    this.ano=ano;
    
    }
    
    
    
}
