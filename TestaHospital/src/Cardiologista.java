public class Cardiologista extends Medico{

    Cardiologista( String n, String cpf, String crm){
        super(n,cpf,crm,"Cardiologista");
    }
    @Override

    public String operar(){return "Operando coração";}

    public void inserePaciente(Paciente paciente){

        int cont=0;
        for(Paciente p: this.listaPacientes){
            if(p.getCPF().equals(paciente.getCPF())){cont++;break;}
        }
        if(cont!=0){
            System.out.println("JÁ EXISTE UM PACIENTE COM O CPF"+paciente.getCPF());
        }
        else{listaPacientes.add(paciente);System.out.println("PACIENTE CADASTRADO COM SUCESSO");}
        
    }
}