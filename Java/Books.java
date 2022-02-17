
public class Books{

    //Attributes

    private String Title;
    private String author;
    private int Ano;
    private int Edict;
    private String Editors;
    private String ISBN;

    //constructor

    public Books(String Title, String author, int Ano, int Edict, String Editors, String ISBN){
        this.Title = Title ;
        this.author = author ;
        this.Ano = Ano ;
        this.Edict = Edict ;
        this.Editors = Editors ;
        this.ISBN = ISBN ;

    }
    
    public String getTitle(){
        return Title;
    }

    public void setTitle(String Title){
        this.Title = Title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getAno(){
        return Ano;
    }

    public void setAno(int Ano){
        this.Ano = Ano;
    }

    public int getEdict(){
        return Edict;
    }

    public void setEdict(int Edict){
        this.Edict = Edict;
    }
    
    public String getEditors(){
        return Editors;
    }

    public void setEditors(String Editors){
        this.Editors = Editors;
    }

    public String getISBN(){
        return ISBN;
    }

    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "{" +
                " title='" + getTitle() + "'" +
                ", author='" + getAuthor() + "'" +
                ", editors='" + getEditors() + "'" +
                ", ISBN='" + getISBN() + "'" +
                ", ano='" + getAno() + "'" +
                ", edict='" + getEdict() + "'" +
                "}";
    }
}