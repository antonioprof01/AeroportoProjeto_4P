public class Piloto extends Funcionario implements ComprarPassagem{
    private int numero_registro;

    public int getNumero_registro() {
        return this.numero_registro;
    }

    public void setNumero_registro(int numero_registro) {
        this.numero_registro = numero_registro;
    }
    public void iniciarVoo(){
        System.out.println("Iniciando o vooo:");
    }
    public void registrarVooCompleto(){
        System.out.println("Iniciando o vooo completo:");
    }


    
}
