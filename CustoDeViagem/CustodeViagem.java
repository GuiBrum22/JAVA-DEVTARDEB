package CustoDeViagem;

public class CustodeViagem {
//Escrever o Programa Aqui
  public static void main(String[] args) {
    System.out.println("Calcular Custo De Viagem");
    double distânciaPercorrida = 5711;
    System.out.println("A Distancia é "+distânciaPercorrida+"KM");
    double valorDoCombústivel = 5;
    System.out.println("O Valor de Combustivel foi de "+valorDoCombústivel+"reais");
    double consumoDoCarro = 12;
    System.out.println("Concumo do Carro foi de "+consumoDoCarro+"KM");
    double quilometroPorLitro = consumoDoCarro/distânciaPercorrida;
    System.out.println("O Carro Gasta "+quilometroPorLitro+"KM");
    double totalGasto = quilometroPorLitro/distânciaPercorrida;
    System.out.println("O Total Gasto foi de "+totalGasto+"reais");

    
  }  
}
