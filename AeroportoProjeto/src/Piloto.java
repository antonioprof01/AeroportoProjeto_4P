public class Piloto extends Funcionario implements ComprarPassagem{
    private int numero_registro;

    public int getNumero_registro() {
        return this.numero_registro;
    }

    public void setNumero_registro(int numero_registro) {
        this.numero_registro = numero_registro;
    }
    public void iniciarVoo(){
        System.out.println("Iniciando o vooo, caros passageiros por favor desligue seus aparelhos celular e apertem o cinto e Boa Viagem !!");
    }
    public void registrarVooCompleto(){
        System.out.println(" Vooo completoooo:");
    }
    public void cadastrarPassageiro(){
        System.out.println(" Cadastrando o passageiro:");
    }

    public void gerarNumeroReserva(){
        System.out.println(" Imforme seu numero reserva:");

    }

    public void gerarComprovante(){
        System.out.println(" Comprovante:");

    }


    
}
