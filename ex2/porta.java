public class porta {

    private String cor ;
    private int altura;
    private int largura;
    private boolean estaAberta;

    public porta (String cor, int altura, int largura, boolean estaAberta){
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.estaAberta = estaAberta;
    }

    public String getcor(){
        return cor;
    }

    public void setcor(String cor){
        this.cor =  cor;
    }

    public int getaltura(){
        return altura;
    }
    
    public void setaltura(int altura){
        this.altura = altura;
    }

    public int getlargura(){
        return largura;
    }

    public void setlargura(int largura){
        this.largura = largura;
    }

    public boolean getestaAberta(){
        return estaAberta;
    }

    public void setestaAberta(boolean estaAberta){
        this.estaAberta = estaAberta;
    }

    @Override
    public String toString(){
        return
                "Cor:" + getcor() +
                    "\naltura(cm):"+ getaltura()+
                    "\nlargura(cm):" + getlargura()+
                    "\nAberta:" + getestaAberta();
    }



}
