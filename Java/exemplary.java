public class exemplary{

    //Attributes

    private int Code;
    private boolean Captive;
    private boolean Loan;
 
    //constructor

    public exemplary(int Code,boolean Captive,boolean Loan){
        this.Code = Code ;
        this.Captive = Captive ;
        this.Loan = Loan ;
   

    }
    
    public int getCode(){
        return Code;
    }

    public void setCode(int Code){
        this.Code = Code;
    }

    public boolean getCaptive(){
        return Captive;
    }

    public void setCaptive(boolean Captive){
        this.Captive = Captive;
    }

    public boolean getLoan(){
        return Loan;
    }

    public void setLoan(boolean Loan){
        this.Loan = Loan;
    }

    @Override
    public String toString() {
        return "{" +
                " code='" + getCode() + "'" +
                ", captive='" + getCaptive() + "'" +
                ", Loan='" + getLoan() + "'" +
                "}";
    }
}