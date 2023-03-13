package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void letra() {
        System.out.println("Digite uma letra:");
        String letra = sc.nextLine();
        switch (letra) {
            case "a":
                System.out.println(letra + "é uma vogal");
                break;
            case "e":
                System.out.println(letra + "é uma vogal");
                break;
            case "i":
                System.out.println(letra + "é uma vogal");
                break;
            case "o":
                System.out.println(letra + "é uma vogal");
                break;
            case "u":
                System.out.println(letra + "é uma vogal");
                break;
            default:
                System.out.println(letra + "é uma consoante");
                break;

        }
    }
    public void mes(){
        System.out.println("Digite uma letra:");
        String mes = sc.nextLine();
        switch (mes) {
            case "1":
                System.out.println(mes + "");
                break;
            case "2":
                System.out.println(mes + "é uma vogal");
                break;
            case "3":
                System.out.println(mes + "é uma vogal");
                break;
            case "4":
                System.out.println(mes + "é uma vogal");
                break;
            case "5":
                System.out.println(mes + "é uma vogal");
                break;
            case "6":
                System.out.println(mes + "é uma consoante");
                break;
            case "7":
                System.out.println(mes + "é uma consoante");
                break;
            case "8":
                System.out.println(mes + "é uma consoante");
                break;
            case "9":
                System.out.println(mes + "é uma consoante");
                break;
            case "10":
                System.out.println(mes + "é uma consoante");
                break;
            case "11":
                System.out.println(mes + "é uma consoante");
                break;
            case "12":
                System.out.println(mes + "é uma consoante");
                break;
        }
    }
}


