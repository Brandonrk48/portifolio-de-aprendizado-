import java.util.Scanner;

public class MetodosDeFluxo{
    Scanner in = new Scanner(System.in);
    int interesse;

    public int validarObjetivo(int escolha){
        
        while(interesse < 1 || interesse > 6){
            System.out.println("As opções vão do 1 ao 6.");
            System.out.println("Escolha novamente: ");
            System.out.println("1-Depositar dinheiro\n2-Ver saldo dispovível\n3-Ver empréstimo disponível\n4-Solicitar emprestimo\n5-Sacar dinheiro\n6-Sair");
            interesse = in.nextInt();

            if(interesse >= 1 && interesse <= 6){
                escolha = interesse;
            }
        }
        return escolha;
        //método para validar opção que anteriormente foi digitado errado
    }

    public double diminuindoSaldo(double valor1, double valor2){
        double sacandoSaldo;
        sacandoSaldo = valor1 - valor2; 
        return sacandoSaldo;
        //retornando diretamente a subtração  
    }

    public double subtraindoCredito(double val1, double val2){
        double subtraido = val1 - val2;
        return subtraido;
        //retornando a subtração do crédito
    }


}