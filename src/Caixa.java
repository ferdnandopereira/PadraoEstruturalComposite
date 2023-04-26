public class Caixa extends Funcionario{
    public Caixa(String nomeCaixa){
        this.setNomeFuncionario(nomeCaixa);
    }
    public Caixa(int idCaixa){
        this.setIdFuncionario(idCaixa);
    }
    @Override
    protected void adicionar(Funcionario funcionario) {
    }
    @Override
    protected void remover(Funcionario funcionario) {

    }
}
