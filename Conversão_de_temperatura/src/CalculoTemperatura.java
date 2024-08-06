public class CalculoTemperatura {
    public static double conversor(double temperatura, int escolha){

        double tempConvertida = 0;

        switch (escolha) {
            case 1:
                tempConvertida = temperatura + 273.15;
                System.out.println("A temperatura convertida é: " + tempConvertida);
                return tempConvertida;
            case 2:
                tempConvertida = temperatura - 273.15;
                System.out.println("A temperatura convertida é: " + tempConvertida);
                return tempConvertida;
            case 3:
                tempConvertida = (1.8 * temperatura) + 32;
                System.out.println("A temperatura convertida é: " + tempConvertida);
                return tempConvertida;
            case 4:
                tempConvertida = (temperatura - 32) / 1.8;
                System.out.println("A temperatura convertida é: " + tempConvertida);
                return tempConvertida;
            case 5:
                tempConvertida = (temperatura - 273.15) * 1.8 + 32;
                System.out.println("A temperatura convertida é: " + tempConvertida);
                return tempConvertida;
            case 6:
                tempConvertida = (temperatura - 32) * 5/9 + 273.15;
                System.out.println("A temperatura convertida é: " + tempConvertida);
                return tempConvertida;
            default:
                System.out.println("Selecione uma opção válida, erro no sistema!");
                return 0.0;
        }      
    }
}
