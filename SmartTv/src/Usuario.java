/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author leonardo
 */
public class Usuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        
        SmartTv smartTv = new SmartTv();
        
        //Visualização do estado da TV
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);
        
        //Mudando a configuração da TV
        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarCanal();
        
        //Visualização do estado da TV
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);
        
        //
        smartTv.desligar();
        smartTv.mudarCanal(55);
        smartTv.diminuirVolume();
        
        //Visualização do estado da TV
        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual? " + smartTv.canal);
        System.out.println("Volume Atual " + smartTv.volume);
        
    }
    
}
