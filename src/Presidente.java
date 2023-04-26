public class Presidente extends Supervisor{
    public Presidente(String nomeSupervisor) {
        super(nomeSupervisor);
    this.setNomeFuncionario(nomeSupervisor);
    }
    @Override
    public void adicionar(Funcionario funcionario){
    }
    @Override
    public void remover(Funcionario funcionario){
    }
}
