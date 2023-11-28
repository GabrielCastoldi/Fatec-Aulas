package livia1710;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Livia1710 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
//        6) 
        produto prod[] = lerDados();

        int opcao;

        do {
            System.out.println("Menu\n"
                    + "1 - Efetuar venda\n"
                    + "2 - Verificar estoque\n"
                    + "3 - Sair\n"
                    + "Digite a opção desejada");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
//               7)
                    System.out.println("Digite o código do produto:");
                    int codDig = scan.nextInt();

                    int ind = -1; //Ind é igual a -1 
                    for (int i = 0; i < prod.length; i++) {
                        if (codDig == prod[i].getCodigo()) { //se o cod digitigado for igual a um código existente, o indicador vira o código
                            ind = i;
                            break;
                        }

                    }
                    if (ind == -1) { //se o código continuar -1 é pq não existe o cod digitado
                        System.out.println("Código imexistente");
                    } else {
                        System.out.println("Digite a quantidade:"); //senão faz os processos
                        int qtd = scan.nextInt();
                        if (prod[ind].haEstoque(qtd)) {
                            System.out.println("Valor compra: " + prod[ind].calcValor(qtd));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Situação do estoque: ");
                    for(produto p: prod){ //Tipo - nome para variavel - 
                        System.out.println(p.getDescricao() + "   " + p.situacaoEstoque());
                    }
                    break;
                case 3:
                    System.out.println("Encerrando o sistema");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }  while(opcao  != 3);     
    
    }
    
    
//    5) Na classe principal, implemente um método para ler os dados dos produtos em um arquivo de texto, armazenar em um vetor de produtos e exibir na tela
    public static produto[] lerDados() throws FileNotFoundException{
        produto prod[] = new produto[8];
        File arq = new File("dados"); 
        Scanner scan = new Scanner(arq);
        
        for (int i = 0; i < prod.length; i++) {
            prod[i]= new produto(scan.nextInt(), scan.next(), scan.nextInt(), scan.nextInt(), scan.nextDouble());
            
            System.out.printf("%10d %10s %10d %10d %10.2f\n", prod[i].getCodigo(), prod[i].getDescricao(), prod[i].getEstoqueMinimo(), prod[i].getEstoque(), prod[i].getPrecoUnit());            
        }
        return prod;
    }
    
}
