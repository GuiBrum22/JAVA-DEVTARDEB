package EstruturaDecisaoIfElse;

import java.util.Scanner;

public class DecisaoIfElse {
    Scanner sc = new Scanner(System.in);
    //If Desencdeado
    public void decisaoIf(){
        System.out.println("Informe o Preço do Poduto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        //se precoProduto>100 <200 então sdeconto=5
        if(precoProduto>=100 && precoProduto<200){
            desconto = 5.0;
        }
        //se precoProduto>200 <300 então desconto=10
        if(precoProduto>=200 && precoProduto<300){
            desconto = 10.0;
        }
         //se precoProduto>300 então desconto=15
         if(precoProduto>=300){
            desconto = 15.0;
        }

        //realizar a Conta
        double valorDesconto = precoProduto*desconto/100;
        double precoFinal = precoProduto-valorDesconto;
        System.out.println("O valor do Produto é r$" +precoFinal); 
        
    }
   //If Encadeado(If-Else)
   public void decisaoIfElse(){
    System.out.println("Informe o Preço do Poduto");
        double precoProduto = sc.nextDouble();
        double desconto = 0.0;
        //Estrutura de decisão encadeada  if-else
        if(precoProduto>=300){ // 1° condição
            desconto = 15;
        }else if(precoProduto>=200){ // 2° condição
            desconto = 10;
        }else if(precoProduto>=100){ // 3° condição
            desconto = 5;
        }else{
            desconto=0;
        }
        //realizar conta
        double valorDesconto = precoProduto*desconto/100;
        double precoFinal = precoProduto-valorDesconto;
        System.out.println("O valor do Produto é r$" +precoFinal); 
   }

}
