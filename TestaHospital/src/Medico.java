import java.util.ArrayList;

abstract public class Medico extends Pessoa {
    private String crm;
    private String tipo;
    ArrayList<Paciente> listaPacientes;

    Medico(String n, String cpf, String crms, String tipo){
        super(n, cpf);
        this.setOcup("Médico");
        setCrm(crms);
        setTipo(tipo);
        listaPacientes=new ArrayList<>();
    }

    public void setCrm(String crms){
        this.crm=crms;
    }
    public void setTipo(String t){
        this.tipo=t;
    }
    public String getCrm(){return this.crm;}

    public abstract String operar();
    public abstract void inserePaciente(Paciente p);

    @Override
    public String toString(){return super.toString()+"\nCRM: "+this.crm+"\nATUAÇÃO: "+this.tipo;}
}
