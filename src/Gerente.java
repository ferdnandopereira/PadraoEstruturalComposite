public class Gerente extends Supervisor{
    public Gerente(String nomeSupervisor) {
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
