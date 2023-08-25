import java.util.Scanner; //receber a entrada do usuário pelo teclado

public class calculatorjava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // um objeto Scanner é criado para ler a entrada do usuário a partir do teclado

        // declaração de variaveis
        // uso do double e string para especificar o tipo de entrada
        Double valorUm;
        Double valorDois;
        String operacao;
        do {System.out.println("==== Digite o primeiro valor: ====");
            valorUm = scanner.nextDouble();

            System.out.println("=== Digite a operação: (+, -, /, *): ====") ;
            operacao = scanner.next();

            System.out.println("=== Digite o valor dois: ===");
            valorDois = scanner.nextDouble();

            System.out.println("Resultado = " + realizarCalculo(valorUm, valorDois, operacao));} while(true);
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
        Double respostaCalculo = 0.0; //inicializa com um valor zerado para evitar erro no código
        //caso a declaração de variavel nao seja reconhecida corretamente

        // switch desempenha o mesmo papel do if, de uma maneira mais curta e com algumas condiçoes diferentes
        switch (operacao){
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;

                /*default lembra a mesma função do else, ele acontece caso a condição anterior
             não seja cumprida */
            default:
                System.out.println("Operação é inválida!");
        }
        // retornando o resultado da conta
        return respostaCalculo;
    }
}