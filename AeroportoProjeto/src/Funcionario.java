public abstract class Funcionario extends Pessoa {
    

    private int Cadastro;

    public int getCadastro() {
        return this.Cadastro;
    }

    public void setCadastro(int Cadastro) {
        this.Cadastro = Cadastro;
    }

    public abstract void Registrar_Ponto();


}
