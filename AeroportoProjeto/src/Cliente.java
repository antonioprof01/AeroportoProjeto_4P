public class Cliente extends Pessoa{
    private int numPassagem;
    private float numAssento;
    private float preco_passagem;

    public Cliente(int numPassagem, float numAssento, float preco_passagem) {
        this.numPassagem = numPassagem;
        this.numAssento = numAssento;
        this.preco_passagem = preco_passagem;

        
    }

    public void fazerCheckin() {

        System.out.println("Fazendo checkin!..");
            
    }
    public void compraPoltrona() {

        System.out.println("Comprando Poltrona!..");
            
    }
    public void reserva() {

        System.out.println("Reserva Efetuada!..");
                    
    }
    public void cancelarReserva() {

        System.out.println("Reserva Cancelada!..");
            
    }

    public int getNumPassagem() {
        return this.numPassagem;
    }

    public void setNumPassagem(int numPassagem) {
        this.numPassagem = numPassagem;
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
            " numPassagem='" + getNumPassagem() + "'" +
            ", numAssento='" + getNumAssento() + "'" +
            ", preco_passagem='" + getPreco_passagem() + "'" +
            "}";
    }

    
}
