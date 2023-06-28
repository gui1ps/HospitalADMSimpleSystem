public abstract class Pessoa{
    private String nome;
    private String cpf;
    private String ocupacao;

    Pessoa(String n, String cpf){
        setNome(n);
        setCPF(cpf);
    }

    public void setNome(String n){
        this.nome=n;
    }
    public void setCPF(String cpfset){
        this.cpf=cpfset;
    }
    public void setOcup(String ocup){
        this.ocupacao=ocup;
    }

    String getNome(){return this.nome;}
    String getCPF(){return this.cpf;}

    @Override
    public String toString(){return "Nome: "+this.nome+"\nCPF: "+this.cpf+"\nOCUPAÇÃO: "+this.ocupacao;}
}