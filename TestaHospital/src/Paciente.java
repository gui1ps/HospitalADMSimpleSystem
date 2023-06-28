public class Paciente extends Pessoa{
    private String id;
    private String sick;

    Paciente(String n, String cpf, String id,String s){
        super(n, cpf);
        this.setOcup("Paciente");
        setId(id);
        setSick(s);
    }

    public void setId(String id){
        this.id=id;
    }
    public void setSick(String s){
        this.sick=s;
    }

    String getId(){return this.id;}
    String getSick(){return this.sick;}
    @Override

    public String toString(){return super.toString()+"\nID: "+this.id+"\nTIPO DE DOENÇA: "+this.sick;}
}