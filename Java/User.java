public class User{

    private String nome;
    private int CPF;
    private String phone;
    private String take;

    public User(String nome, int CPF, String phone, String take){
        this.nome = nome ;
        this.CPF = CPF ;
        this.phone = phone ;
        this.take = take ;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTake() {
        return take;
    }

    public void setTake(String take) {
        this.take = take;
    }

    @Override
    public String toString() {
        return
                "Nome: " + getNome() +
                        "\nphone: " + getPhone() +
                        "\nRegistration: " + getTake() +
                        "\nCPF: " + getCPF();
    }
    


}