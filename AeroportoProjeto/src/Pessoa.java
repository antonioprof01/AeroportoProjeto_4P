import javax.management.loading.PrivateClassLoader;

public class Pessoa {
    private String id;
    private String nome;
    private int idade;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getSexo() {
        return this.sexo;
    }

    public void setSexo(Endereco sexo) {
        this.sexo = sexo;
    }
    private Endereco sexo; 


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", sexo='" + getSexo() + "'" +
            "}";
    }

}
