public abstract class Funcionario {

    private String nomeFuncionario;
    private int idFuncionario;

    public String getNomeFuncionario(){
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario){
        this.nomeFuncionario = nomeFuncionario;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    protected abstract void adicionar(Funcionario funcionario);
    protected abstract void remover(Funcionario funcionario);
}
