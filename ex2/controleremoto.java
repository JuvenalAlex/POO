public class controleremoto {
    private int canal ;
    private int volume ;
    private boolean ligado;
    private televisor televisor ;

    public controleremoto(int canal,int volume,boolean ligado,televisor televisor){
        this.setCanal(canal);
        this.setVolume(volume) ;
        this.setLigado(ligado);
        this.setTelevisor(televisor);
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public televisor getTelevisor() {
        return televisor;
    }

    public void setTelevisor(televisor televisor) {
        this.televisor = televisor;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString(){
        return
                "Canal:" + getCanal() +
                    "\nVolume:"+ getVolume()+
                    "\nLigado:"+getLigado()+
                    "\n"+ getTelevisor();
                    
    }

}

