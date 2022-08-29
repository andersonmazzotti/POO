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
public class Pessoa {
    
    String Nome;
    String bioTipo;
    String corCabelo;
    int idade;
    
    
    public String getNome(){
        return Nome;
    }
    
    
    public void setNome(String Nome){
    
    this.Nome=Nome;
    
    }
    
     public String getbioTipo(){
        return bioTipo;
    }
    
    public void setbioTipo(String cor){
    
    this.bioTipo=bioTipo;
    
    }
    
    
    public String getcorCabelo(){
        return corCabelo;
    }
    
    public void setPlaca(String Cabelo){
    
    this.corCabelo=corCabelo;
    
    }
    
    
     public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
    
    this.idade=idade;
    
    }
    
    
    
    
    
}
