import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Instanciando o Scanner
        Scanner sc = new Scanner(System.in);

        //Interface para definição do cálculo
        System.out.println("tempConvert - O conversor de temperatura");
        System.out.println("Olá, seja bem vindo(a) ao Temp convert!");
        System.out.println("Informe, com base nos itens a baixo, qual conversão você ira fazer:");
        System.out.println("1 - Celsius para Kelvin");
        System.out.println("2 - Kelvin para Celsius");
        System.out.println("3 - Celsius para Farenheit");
        System.out.println("4 - Farenheit para Celsius");
        System.out.println("5 - Kelvin para Farenheit");
        System.out.println("6 - Farenheit para Kelvin");
        System.out.println("--------------------------------------");
        System.out.print("Escolha: ");

        //Entrada de valor para parametro de fórmula para cálculo
        int escolha = sc.nextInt();

        //Condicional para sair do sistema, caso a resposta seja invalida
        if (escolha >= 1 && escolha <=6){
        System.out.println("Agora informe o valor da temperatura para ser convertida");
        System.out.print("Temperatura: ");

        //Recebendo o valor da temperatura para cálculo
        double temperatura = sc.nextDouble();

        //Chamando método para conversão
        CalculoTemperatura.conversor(temperatura, escolha);
        }else{
            System.out.println("Opção invlida, erro no sistema!");
        }

        //fechando o scanner
        sc.close();
    }
}
