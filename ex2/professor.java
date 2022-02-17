public class professor {

    private int matricula;
    private String nome;
    private String departamento;

    public professor (int matricula, String nome, String departamento){
        this.matricula  = matricula ;
        this.nome = nome;
        this.departamento = departamento;
    }
    public int getmatricula(){
        return matricula ;
    }

    public void setmatricula (int matricula){
        this.matricula = matricula;
    }

    public String getnome(){
        return nome;
    }

    public void setnome(String nome){
        this.nome = nome;
    }

    public String getdepartamento (){
        return departamento;
    }
    public void setdepartamento(String departamento){
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        return
                "Professor:" + getnome() +
                    "\nMatricula:"+ getmatricula()+
                    "\nDepartamento:" + getdepartamento();
                    
    }

}