public class Cliente extends Pessoa{

    private Voucher passagem;
    private float numAssento;
    private float preco_passagem;


    public Cliente(Voucher passagem, float numAssento, float preco_passagem) {
        this.passagem = passagem;
        this.numAssento = numAssento;
        this.preco_passagem = preco_passagem;
    }


    public Voucher getPassagem() {
        return this.passagem;
    }

    public void setPassagem(Voucher passagem) {
        this.passagem = passagem;
    }

    public float getNumAssento() {
        return this.numAssento;
    }

    public void setNumAssento(float numAssento) {
        this.numAssento = numAssento;
    }

    public float getPreco_passagem() {
        return this.preco_passagem;
    }

    public void setPreco_passagem(float preco_passagem) {
        this.preco_passagem = preco_passagem;
    }


    @Override
    public String toString() {
        return "{" +
            " passagem='" + getPassagem() + "'" +
            ", numAssento='" + getNumAssento() + "'" +
            ", preco_passagem='" + getPreco_passagem() + "'" +
            "}";
    }




}
