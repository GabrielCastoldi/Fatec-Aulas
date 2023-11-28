package prestadora;

public class Servico {

    private int codServico;
    private String cliente;
    private String descricao;
    private int qtdHoras;

    public Servico(int codServico, String cliente, String descricao, int qtdHoras) {
        this.codServico = codServico;
        this.cliente = cliente;
        this.descricao = descricao;
        this.qtdHoras = qtdHoras;
    }

    public int getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(int qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public int getCodServico() {
        return codServico;
    }

    public void setCodServico(int codServico) {
        this.codServico = codServico;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double calcularValor() {

        double valorPorHora = 0;

        switch (descricao) {
            case "pintura":
                valorPorHora = 30;
                break;
            case "faxina":
                valorPorHora = 20;
                break;
            case "jardinagem":
                valorPorHora = 10;
                break;
            default:
                System.out.println("Descrição de serviço inválida.");
        }
        return valorPorHora * qtdHoras;
    }
}
