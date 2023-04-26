import java.util.ArrayList;

public class Supervisor extends Funcionario{
    ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    public Supervisor(String nomeSupervisor){
        this.setNomeFuncionario(nomeSupervisor);
    }
    public Supervisor(int idSupervisor) {
        this.setIdFuncionario(idSupervisor);
    }
    @Override
    protected void adicionar(Funcionario funcionario) {
    }
    @Override
    protected void remover(Funcionario funcionario) {

    }
}
