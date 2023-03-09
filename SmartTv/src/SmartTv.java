/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author leonardo
 */
public class SmartTv { 
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    
    //Métodos para ligar e desligar a Tv.
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    //Métodos para aumentar e diminuir o volume
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }
    //Métodos para trocar de canal
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
