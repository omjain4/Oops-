package Interfaces;

public class Nicecar {
    private Engine engine;
    private Media Player = new CDPLAYER();
    public Nicecar(){
        engine = new PowerEngine();
    }
    public Nicecar(Engine engine){
        this.engine = engine;
    }

    public void start() {
    engine.start();
    }
    public void stop() {
        engine.stop();
    }
    public void startMusic() {
        Player.start();
    }
    public void stopmusic(){
        Player.stop();
    }
    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
