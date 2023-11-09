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
}