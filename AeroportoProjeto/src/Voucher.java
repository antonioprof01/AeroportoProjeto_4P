public class Voucher {
    private Cliente cliente;
    private String numero_voo;
    private String saida_aeroporto;
    private String chegada_aeroporto;
    private String horario_chegada;
    private String original_saida;
    private String portao;



    public Voucher(String numero_voo, String saida_aeroporto, String chegada_aeroporto, String horario_chegada, String original_saida, String portao) {
        this.numero_voo = numero_voo;
        this.saida_aeroporto = saida_aeroporto;
        this.chegada_aeroporto = chegada_aeroporto;
        this.horario_chegada = horario_chegada;
        this.original_saida = original_saida;
        this.portao = portao;
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public String getNumero_voo() {
        return this.numero_voo;
    }

    public void setNumero_voo(String numero_voo) {
        this.numero_voo = numero_voo;
    }

    public String getSaida_aeroporto() {
        return this.saida_aeroporto;
    }

    public void setSaida_aeroporto(String saida_aeroporto) {
        this.saida_aeroporto = saida_aeroporto;
    }

    public String getChegada_aeroporto() {
        return this.chegada_aeroporto;
    }

    public void setChegada_aeroporto(String chegada_aeroporto) {
        this.chegada_aeroporto = chegada_aeroporto;
    }

    public String getHorario_chegada() {
        return this.horario_chegada;
    }

    public void setHorario_chegada(String horario_chegada) {
        this.horario_chegada = horario_chegada;
    }

    public String getOriginal_saida() {
        return this.original_saida;
    }

    public void setOriginal_saida(String original_saida) {
        this.original_saida = original_saida;
    }

    public String getPortao() {
        return this.portao;
    }

    public void setPortao(String portao) {
        this.portao = portao;
    }

    @Override
    public String toString() {
        return "{" +
            "Passageiro" + cliente.getNome() +
            " numero_voo='" + getNumero_voo() + "'" +
            ", saida_aeroporto='" + getSaida_aeroporto() + "'" +
            ", chegada_aeroporto='" + getChegada_aeroporto() + "'" +
            ", horario_chegada='" + getHorario_chegada() + "'" +
            ", original_saida='" + getOriginal_saida() + "'" +
            ", portao='" + getPortao() + "'" +
            "}";
    }




}
