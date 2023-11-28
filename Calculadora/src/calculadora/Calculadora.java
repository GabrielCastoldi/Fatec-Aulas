package calculadora;
import java.util.Scanner;

public class Calculadora {
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
      
      double a, b, result;
      char operador;
      
      do{
          System.out.println("\nMenu\n"
                            + "+\n"
                            + "-\n"
                            + "*\n"
                            + "/\n"
                            + "s para sair\n"
                            + "Digite a operação: ");
          operador = scan.next().charAt(0);
          
          System.out.println("Digite o primeiro número: ");
          a = scan.nextDouble();
          System.out.println("Digite o segundo número: ");
          b = scan.nextDouble();
          
          switch(operador) {
              case '+':
//                  result = a + b;
//                  System.out.println("Soma: " + result);
                  
//                  somar1(); /lê, processa e exibe
                  //void e não possui parâmetro
                  
//                  result = somar2(); /lê e processa
                  //não void e não possui parâmetros
//                  System.out.println("Somar: " + result);
                  
//                  somar3(a, b); /processa e exibe
                  //void e possui parâmetros
                  
                  result = somar4(a, b); //processa
                  //não void e possui parâmetros
                  System.out.println("Soma: " + result);
                  
                  break;
                  
                  
              case '-':
//                  result = a - b;
//                  System.out.println("Subtração: " + result);
                  
//                  subtrair1(); /lê, processa e exibe
                  //void e não possui parâmetro
                  
//                  result = subtrair2(); /lê e processa
                  //não void e não possui parâmetros
//                  System.out.println("Subtração: " + result);
                  
//                  subtrair3(a, b); /processa e exibe
                  //void e possui parâmetros
                  
                  result = subtrair4(a, b); //processa
                  //não void e possui parâmetros
                  System.out.println("Subtração: " + result);
                  
                  
                  break;
                  
              case '/':
                  
                  
                  break;
                  
              
          }
      } while (operador != 's');
          
    } 
    
  public static boolean eZero(double y){
      return y == 0;
  }
    
  public static void somar1(){
        double a,b, result;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = scan.nextDouble();
        result = a + b;
        System.out.println("Soma: " + result);
    }
    
  public static double somar2() {
        double a,b, result;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = scan.nextDouble();
        result = a + b;
        return result;
  }
  
  public static void somar3(double x, double y) {
      double result;
      result = x + y;
      System.out.println("Soma: " + result);
  }
  
  public static double somar4(double x, double y) {
      double result;
      result = x + y;
      return result;
  }
  
  public static void subtrair1(){
      double a,b, result;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = scan.nextDouble();
        result = a - b;
        System.out.println("Subtração: " + result);
      
  }
  
  public static double subtrair2() {
        double a,b, result;
        System.out.println("Digite o primeiro número: ");
        a = scan.nextDouble();
        System.out.println("Digite o segundo número: ");
        b = scan.nextDouble();
        result = a - b;
        return result;
  }
  
  public static void subtrair3(double x, double y) {
      double result;
      result = x - y;
      System.out.println("Subtração: " + result);
}
  
  public static double subtrair4(double x, double y) {
      double result;
      result = x - y;
      return result;
  }
}
