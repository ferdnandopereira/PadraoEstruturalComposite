public class Atendente extends Funcionario{
    public Atendente(String nomeAtendente){
        this.setNomeFuncionario(nomeAtendente);
    }
    public Atendente(int idAtendente) {
        this.setIdFuncionario(idAtendente);
    }
    @Override
    protected void adicionar(Funcionario funcionario) {
    }
    @Override
    protected void remover(Funcionario funcionario) {
    }
}
