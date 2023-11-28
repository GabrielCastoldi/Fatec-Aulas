
package livia1710;


public class produto {
    private int codigo;
    private String descricao;
    private int estoque;
    private int estoqueMinimo;
    private double precoUnit;

    public produto(int codigo, String descricao, int estoque, int estoqueMinimo, double precoUnit) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.estoque = estoque;
        this.estoqueMinimo = estoqueMinimo;
        this.precoUnit = precoUnit;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }
    
//    2) Implemente um método para verificar se há estoque: este método recebe a quantidade a ser vendida e retorna true se o estoque for suficiente ou false, caso contrário
    
    public boolean haEstoque(int qtd){
        return estoque >= qtd;
    }
//    3) Implemente um método para método para realizar uma venda: este método recebe a quantidade a ser vendida, dá baixa no estoque, calcula e retorna o valor a ser pago pelo cliente.
    public double calcValor(int qtd){
        estoque -= qtd; //dá baixa no estoque
        return qtd * precoUnit; //valor a ser pago
    }    
        
//        4) Implemente um método para verificar a situação do estoque: este método retorna uma das seguintes mensagens: “Estoque normal” se o estoque for maior que o estoque mínimo, “Estoque crítico” se o estoque for igual ao estoque mínimo ou “Estoquebaixo” se o estoque for menor que o estoque mínimo. 
 
    public String situacaoEstoque(){
        if (estoque > estoqueMinimo){
            return "Estoque normal";
        } else if(estoque == estoqueMinimo){
            return "Estoque crítico";
        } else{
            return "Estoque baixo";
        }
    }
}
