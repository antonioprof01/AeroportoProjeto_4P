

public interface ComprarPassagem {
    
    public void cadastrarPassageiro(Cliente passageiro, Voucher passagem);

    public int gerarNumeroReserva();

    public void gerarComprovante();
}
