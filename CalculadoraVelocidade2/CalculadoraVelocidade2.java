package CalculadoraVelocidade2;

import java.util.Scanner;

public class CalculadoraVelocidade2 {
    Scanner sc = new Scanner(System.in);
public void calcular(){
    System.out.println("Informe a distância Percorrida");
double distanciaPercorrida = sc.nextDouble();
System.out.println("Informe o tempo gasto");
double tempoGasto = sc.nextDouble();
double velocidadeMedia = distanciaPercorrida/tempoGasto;
System.out.println("A distância percorrida é"+velocidadeMedia+"km/h");


}
public void destino(){
    System.out.println("Informe o Ponto de Partida");
    String origem = sc.nextLine();
    System.out.println("Informe o Ponto de Destino");
    String destino = sc.nextLine();
    System.out.println("Sua viajem é de " +origem+ " a "+destino);
}
}