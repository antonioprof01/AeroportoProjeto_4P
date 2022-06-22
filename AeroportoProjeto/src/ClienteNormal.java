import java.util.Random;
public class ClienteNormal extends Cliente implements ComprarPassagem{
    
    Random gerador = new Random(19700621);

	public ClienteNormal(String id, String nome, int idade, String sexo) {
		super(id, nome, idade, sexo);
		//TODO Auto-generated constructor stub
        
	}

	@Override
	public void cadastrarPassageiro(Cliente passageiro, Voucher passagem) {
		// TODO Auto-generated method stub
        
        
		
	}

	@Override
	public int gerarNumeroReserva() {
		// TODO Auto-generated method stub
		return gerador.nextInt(11);
	}

	@Override
	public void gerarComprovante() {
		// TODO Auto-generated method stub
		
	}
    
    
}