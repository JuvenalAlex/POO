import java.util.Date;

public class Emprestimo{

    //Atributos

    private Date dataDeEmprestimo;
    private Date dataPrevistaDeDevolucao;
    private Date DataDeEntregaReal;
    private int Situacao;
    //construtor

    public Emprestimo(Date dataDeEmprestimo,Date dataPrevistaDeDevolucao,Date DataDeEntregaReal,int Situacao){
        this.dataDeEmprestimo = dataDeEmprestimo ;
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao ;
        this.DataDeEntregaReal = DataDeEntregaReal ;
        this.Situacao = Situacao;
    }
    
    public Date getdataDeEmprestimo(){
        return dataDeEmprestimo;
    }

    public void setdataDeEmprestimo(Date dataDeEmprestimo){
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public Date getdataPrevistaDeDevolucao(){
        return dataPrevistaDeDevolucao;
    }

    public void setdataPrevistaDeDevolucao(Date dataPrevistaDeDevolucao){
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }

    public Date getDataDeEntregaReal(){
        return DataDeEntregaReal;
    }

    public void setDataDeEntregaReal(Date DataDeEntregaReal){
        this.DataDeEntregaReal = DataDeEntregaReal;
    }

    public int getSituacao(){
        return Situacao;
    }

    public void setSituacao(int Situacao){
        this.Situacao = Situacao ;
    }

    @Override
    public String toString() {
        return "{" +
                " dataDeEmprestimo='" + getdataDeEmprestimo() + "'" +
                ", dataPrevistaDeDevolucao='" + getdataPrevistaDeDevolucao() + "'" +
                ", dataDeEntregaReal='" + getDataDeEntregaReal() + "'" +
                ", situacao='" + getSituacao() + "'" +
                "}";
    }
}