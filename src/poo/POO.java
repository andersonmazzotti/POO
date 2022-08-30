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
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Carro meuCarro = new Carro();
        
        meuCarro.setCor("Vermelho");
        meuCarro.setPlaca("AMZ");
        meuCarro.setTipo("Gol");
        meuCarro.setnumPortas(4);

        /*
        
        System.out.println("---------Carro-------");
        System.out.println("Cor: "+meuCarro.getCor());
        System.out.println("Placa: "+meuCarro.getPlaca());
        System.out.println("Modelo: "+meuCarro.getTipo());
        System.out.println("Portas: "+meuCarro.getnumPortas());
        */
        
        
        
        Pessoa minhaPessoa = new Pessoa();
        
        minhaPessoa.setNome("Anderson");
        minhaPessoa.setIdade(25);
        minhaPessoa.setPlaca("Castanho");
        minhaPessoa.setbioTipo("Ectomorfo");
        
        
        Barco meuBarco = new Barco();
        
        meuBarco.setModelo("Titanic");
        meuBarco.setCor("Marrom");
        meuBarco.setAno(1940);
        meuBarco.setTamanho(1.000);
        
        
        
        
        /*METODO IMPRIMIR
        
        meuCarro.imprimeDadosCarro();
        minhaPessoa.imprimePessoa();
        meuBarco.imprimeBarco();
        */
        
        
        double a = 3, b=2;
        
        
        System.out.println("Resultado é: "+Calculo.elevar(b, a));
     
    }
    
    
}
