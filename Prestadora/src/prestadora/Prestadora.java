package prestadora;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prestadora {

    public static void main(String[] args) throws FileNotFoundException {
        
        Servico serv[] = lerDados();

    }
    
    public static Servico[] lerDados() throws FileNotFoundException {
        Servico serv[] = new Servico[9];
        File arq = new File("Dados");
        Scanner scan = new Scanner(arq);
        
        for (int i = 0; i < serv.length; i++) {
            serv[i] = new Servico(scan.nextInt(), scan.next(), scan.next(), scan.nextInt());
            
            System.out.printf("%10d %10s %10s %10d\n", serv[i].getCodServico(), serv[i].getCliente(), serv[i].getCodServico(), serv[i].getQtdHoras());
            
        }
        
        return serv;
        
    }
}