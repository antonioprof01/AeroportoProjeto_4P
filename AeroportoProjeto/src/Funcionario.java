public abstract class Funcionario extends Pessoa {
    

    public Funcionario(String id, String nome, int idade, String sexo) {
        super(id, nome, idade, sexo);
        //TODO Auto-generated constructor stub
    }

    private int Cadastro;

    public int getCadastro() {
        return this.Cadastro;
    }

    public void setCadastro(int Cadastro) {
        this.Cadastro = Cadastro;
    }

    public abstract void Registrar_Ponto();


}
