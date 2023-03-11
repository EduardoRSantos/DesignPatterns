package facade;

import entities.Cpu;
import entities.MemoriaRam;
import entities.PlacaDeVideo;

public class FacadeComputer {
    private Cpu cpu;
    private MemoriaRam memoriaRam;
    private PlacaDeVideo placaDeVideo;

    
    public FacadeComputer() {
        this.cpu = new Cpu();
        this.memoriaRam = new MemoriaRam();
        this.placaDeVideo = new PlacaDeVideo();
    }
    
    
    
    public void ligarComputer(){
        cpu.start();
        memoriaRam.armazenar();
        placaDeVideo.render();
        cpu.process();
    }
    
    
    
    
}
