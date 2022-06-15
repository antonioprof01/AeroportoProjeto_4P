public class Administrativo extends Funcionario implements ComprarPassagem {

    public void realizarCompra(){
        System.out.println("Compra realizada.");
    }
    
    public void cancelarCompra(){
        System.out.println("Compra cancelada");
    }

    public void editarPassagem(){
        System.out.println("Passagem Modificada");
    }

    public void cadastrarDesconto(){
        System.out.println("Cadastro de desconto realizado");
    }

    
    public void cadastrarPassageiro(){
        System.out.println("Cadastro de passageiro realizado");
    }

    public void gerarNumeroReserva(){
        System.out.println("Numero reserva gerado.");
    }

    public void gerarComprovante(){
        System.out.println("Comprovante gerado");
    }
}
