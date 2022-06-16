public interface ComprarPassagem {
    
    public void cadastrarPassageiro(Cliente passageiro, Voucher passagem);

    public void gerarNumeroReserva();

    public void gerarComprovante();
}
