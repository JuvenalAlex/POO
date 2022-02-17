public class televisor {
    
    private int canal ;
    private int volume ;
    private boolean ligar, desligar, aumentarVolume, diminuirVolume, trocarCanal ;
    
    public televisor(int canal , int volume,boolean ligar,Boolean desligar,Boolean aumentarVolume,Boolean diminuirVolume,Boolean trocarCanal){
        this.canal = canal;
        this.volume = volume ;
        this.ligar = ligar;
        this.desligar = desligar ; 
        this.aumentarVolume = aumentarVolume ;
        this.diminuirVolume = diminuirVolume;
        this.trocarCanal = trocarCanal;
    }
    



    
    public int getCanal() {
        return canal;
    }
    public boolean getTrocarCanal() {
        return trocarCanal;
    }
    public void setTrocarCanal(boolean trocarCanal) {
        this.trocarCanal = trocarCanal;
    }
    public boolean getDiminuirVolume() {
        return diminuirVolume;
    }
    public void setDiminuirVolume(boolean diminuirVolume) {
        this.diminuirVolume = diminuirVolume;
    }
    public boolean getAumentarVolume() {
        return aumentarVolume;
    }
    public void setAumentarVolume(boolean aumentarVolume) {
        this.aumentarVolume = aumentarVolume;
    }
    public boolean getDesligar() {
        return desligar;
    }
    public void setDesligar(boolean desligar) {
        this.desligar = desligar;
    }
    public boolean getLigar() {
        return ligar;
    }
    public void setLigar(boolean ligar) {
        this.ligar = ligar;
    }
    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString(){
        return
                "Canal:" + getCanal() +
                    "\nVolume:"+ getVolume()+
                    "\nLigar:" + getLigar()+
                    "\nDesligar:"+ getDesligar()+
                    "\nAumentar:" + getAumentarVolume()+
                    "\ndiminuirVolume:"+ getDiminuirVolume()+
                    "\ntrocarCanal:" + getTrocarCanal();
                    
    }

}
