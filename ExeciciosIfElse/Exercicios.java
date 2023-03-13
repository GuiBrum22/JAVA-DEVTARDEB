package ExeciciosIfElse;

import java.util.Scanner;

public class Exercicios {
    Scanner sc = new  Scanner(System.in);
    public void exercicio1(){
        System.out.println("Informe o Primeiro Valor");
        int valor1 = sc.nextInt();
        System.out.print("Informe o segundo Valor");
        int valor2 = sc.nextInt();
        if(valor1>valor2) {
            System.out.println("O 1° valor é maior" +valor1);
        }else if(valor1<valor2){
            System.out.println("O 2° valor é maior" +valor2);
        } else { 
            System.out.println("Os valores são iguais");
        }
    }
    public void exercicio2(){
        System.out.println("Qual é sua data de nascimento?");
        int anoNascimento =sc.nextInt();
        int anoVotar=2007;
        if(anoNascimento>anoVotar){
            System.out.println("Você ainda não pode votar");
        }else if(anoNascimento<anoVotar){
            System.out.println("Você ja pode votar");
        } else {
            System.out.println("Você ja pode votar");
        }

    }
    public void exercicio3(){
         System.out.println("Digite a senha");

       int senhaSecreta2= 1234;
       int senhaSecreta0 = sc.nextInt();
        if(senhaSecreta2 == senhaSecreta0){
          
            System.out.println("ACESSO PERMITIDO");
        } else{
            System.out.println("ACESSO NEGADO");
        }

    }
    public void exercicio4(){
       System.out.println("Quantas maçãs foram compradas?");
       double macasCompradas = sc.nextDouble();
       double macasPreco = 0.30;
       double macasDesconto = 0.25;
       double precoTotal;
       if(macasCompradas>12){
       precoTotal= macasDesconto*macasCompradas;
       System.out.println("O preço total foi de R$"+precoTotal);
    }else if (macasCompradas<12){
       precoTotal = macasPreco*macasCompradas;
       System.out.println("O preço total foi de R$"+precoTotal);
    }

    }
    public void exercicio5(){
        int maior, menor, meio;
        System.out.println("Digite o valor 1 ");
        int v1= sc.nextInt();
        System.out.println("Digite o valor 2 ");
        int v2 = sc.nextInt();
        System.out.println("Digite o valor 3 ");
        int v3 = sc.nextInt();
        if((v1>v2) && (v1>v3)) {
        maior = v1;
    
       }if(v2<v3){
        maior = v1;
        meio = v3;
        menor = v2;
        System.out.println("A ordem é"+maior+meio+menor);
       } else{
        maior = v1;
        meio = v2;
        menor = v3;
        System.out.println("A ordem é"+maior+meio+menor); 
    }if((v2>v1)&&(v2>v3)){
        maior=v2;


    }if(v1<v3){
        maior= v2;
        meio = v3;
        menor = v1;
        System.out.println("A ordem é"+maior+meio+menor); 
    } else{
        maior = v2;
        meio =v1;
        menor = v3;
        System.out.println("A ordem é"+maior+meio+menor); 

    }if((v3>v2) && (v3>v1)){
        maior=v3;

    }if(v1>v2){
        maior = v3;
        meio = v1;
        menor = v2;
        System.out.println("A ordem é"+maior+meio+menor); 
    }else {
        maior = v3;
        meio = v2;
        menor =v1;
        System.out.println("A ordem é"+maior+meio+menor); 
    }
    }
    public void exercicio6(){
        System.out.println("Você é homem digite 1 e se for Mulher digite 2");
        int sexo = sc.nextInt();
        System.out.println("Qual sua altura");
        double altura = sc.nextDouble();
        double resultado;

        if (sexo == 1) {
            resultado = 72.7 * altura - 58;
        } else if (sexo == 2)
            ;
        {
            resultado = 62.1 * altura - 44.7;

        }
        System.out.println("o seu resultado é de " + resultado);
    }

    public void exercicio7() {
        System.out.println("Qual foi a primeira nota do aluno");
        double nota1 = sc.nextDouble();
        System.out.println("Qual foi a segunda nota do aluno?");
        double nota2 = sc.nextDouble();
        System.out.println("Qual foi a frenquência do aluno?");
        double frequencia = sc.nextDouble();
        double resultado = (nota1 + nota2) / 2;
        if (resultado > 5 && frequencia > 75) {
            System.out.println("O aluno foi aprovado");
        } else {
            System.out.println("O aluno foi reprovado");
        }
    }
     // Lista extra

     public void extra1() {
        System.out.println("Digite o valor e descubra se é impar ou par");
        int valor = sc.nextInt();
        int valor1 = valor % 2;
        if (valor1 == 0) {
            System.out.println("o valor é par ");

        } else {
            System.out.println("o valor é ímpar ");

        }
    }

    public void extra2() {
        System.out.println("Qual foi a nota recebida? ");
        int nota = sc.nextInt();
        if (nota > 7) {
            System.out.println("O aluno foi aprovado");
        } else if (nota >= 5 && nota <= 7) {
            System.out.println("O aluno tem direito a fazer a recuperação");
        } else {
            System.out.println("O aluno foi reprovado direto");
        }

    }

public void extra3(){
    System.out.println("Digite uma letra");
    String letra= sc.next();

    if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")|| letra.equalsIgnoreCase("o")|| letra.equalsIgnoreCase("u")){
        System.out.println("a letra é uma vogal");
    }
    else{
        System.out.println("é uma consoante");
    }
}
public void extra4(){
    System.out.println("Digite o seu salário");
    double salarioTotal = sc.nextDouble();
        double aumento = 0.0;
        if(salarioTotal<=1280){
            aumento = 20;
        }else
        if(salarioTotal>1280 && salarioTotal<1700){
            aumento = 15;
        }
        if(salarioTotal>=1700 && salarioTotal<2500){
            aumento = 10;
        }
        if(salarioTotal>=2500){
            aumento = 5;
        }
        
        double aumentou = salarioTotal*aumento/100;
        double salarioNovo = salarioTotal + aumentou;
        System.out.println("O salario aumentou" +salarioNovo);
        System.out.println("O salario anterior era" +salarioTotal);
        System.out.println("A porcentagem do aumento foi de" +aumento);
        System.out.println("O aumento foi de" +aumentou);



    
}
public void extra5(){   
    System.out.println("Digite quanto ganha por hora");
    double horaDia = sc.nextDouble();
    System.out.println("Digite quantas horas trabalhou no mês");
    double horaTotal = sc.nextDouble();
    double salarioBruto =horaDia*horaTotal;
    System.out.println("O salario bruto é de:" +salarioBruto);
        double desconto = 0.0;
        if(salarioBruto<=900){
            desconto = 0;
        }else
        if(salarioBruto>900 && salarioBruto <=1500){
            desconto = 5;
        }
        if(salarioBruto>1500 && salarioBruto<=2500){
            desconto = 10;
        }
        if(salarioBruto>2500){
            desconto = 20;
        }
        
        double ir = salarioBruto*desconto/100;
        System.out.println("Desconto de IR foi de:" +ir);
        double inss = salarioBruto*10/100;
        System.out.println("Desconto do INSS foi de:" +inss);
        double fgts = salarioBruto*11/100;
        System.out.println("Desconto do FGTS foi de:" +fgts);
        double sindicato = salarioBruto*3/100;
        System.out.println("Desconto do Sindicato foi de:" +sindicato);
        double descontoTotal = ir+inss+fgts+sindicato;
        System.out.println("Desconto total foi de:" +descontoTotal);
        double salarioLiquido = salarioBruto - descontoTotal;
        System.out.println("Salario Liquido é de:" +salarioLiquido);

}

}
