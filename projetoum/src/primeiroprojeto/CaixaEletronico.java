import java.util.Locale;
import java.util.Scanner;


public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        String senha;
        String cadastrar = "SIM";
        double emprestimoDisponivel = 1500;
        double saldo = 0;
        double saldoAtual = 0;
        double valorSaqueCredito = 0;
        double valorSaque = 0; 
        
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        //entrada de dados
        Usuario pass = new Usuario();
        //criando objeto para usar os métodos

        System.out.println("Realizar novo cadastro?\nDigite sim ou não");
        String desejoInicial = in.nextLine();
        if(desejoInicial.toUpperCase().equals(cadastrar)){
        //realizar ou não o cadastro
            
            pass.nomearUsuario();    
            //chando método para digitar o nome

            System.out.println("Sr." + pass.nome + ", digite uma senha maior que 8 digitos: ");
            senha = in.nextLine();

            if((senha.length() <= 8)){
                pass.cadastrSenha(senha);
                //validando senha menor que 8 por meio do método cadastrarSenha
            }
               
            System.out.println("Qual operação deseja realizar:");
            System.out.println("OBS: Digite apenar o número");
            System.out.println("1-Depositar dinheiro\n2-Ver saldo dispovível\n3-Ver empréstimo disponível\n4-Solicitar emprestimo\n5-Sacar dinheiro\n6-Sair");
            int opcao = in.nextInt();

            if(opcao < 1 || opcao > 6){
                MetodosDeFluxo validando = new MetodosDeFluxo();
                validando.validarObjetivo(opcao);
                //validando opção de fluxo, até a opção estar no intervalo de 1 a 6.
            }


            do{
                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor que deseja depositar: ");
                        saldo = in.nextDouble();
                        saldoAtual = saldoAtual + saldo;
                        System.out.println("Valor depositado com sucesso!");
                        System.out.printf("seu saldo atual é de: R$%.2f",saldoAtual);
                        System.out.println("\nRealizar outra operaçõa ou sair?\nDigite apenas o número:");
                        opcao = in.nextInt();
                            break;
                            //depositando dinheiro
                    case 2:
                        System.out.printf("seu saldo atual é de: R$%.2f", saldoAtual);
                        System.out.println("\nRealizar outra operaçõa ou sair?\nDigite apenas o número:");
                        opcao = in.nextInt();
                            break;
                            //expondo saldo
                            // ñ precisa de metodo
                    case 3:
                        System.out.printf("O valor de empréstimo disponível é: R$%.2f", emprestimoDisponivel);
                        System.out.println("\nRealizar outra operaçõa ou sair?\nDigite apenas o número:");
                        opcao = in.nextInt();
                            break;
                            //expondo empréstimo disponível
                            //ñ precisa de metodo
                    case 4:
                        MetodosDeFluxo funcao = new MetodosDeFluxo();

                        System.out.println("Valor de empresto?");
                        valorSaqueCredito = in.nextDouble();
                        
                        funcao.subtraindoCredito(emprestimoDisponivel,valorSaqueCredito);
                        emprestimoDisponivel = funcao.subtraindoCredito(emprestimoDisponivel,valorSaqueCredito);

                        System.out.printf("Emprestimo efetuado com sucesso!");
                        System.out.printf("Você sacou R$" + valorSaqueCredito +"\nCrédito disponível: %.2f",emprestimoDisponivel);

                        

                        System.out.println("\nRealizar outra operaçõa ou sair?\nDigite apenas o número:");
                        opcao = in.nextInt();
                        break;
                        //solicitando emprestimo
                        //metodo de subtração
                        //mudar nome do objeto
                    case 5:
                    //chamar metodo
                    MetodosDeFluxo sacando = new MetodosDeFluxo();

                        System.out.println("Quanto você deseja sacar");
                        valorSaque = in.nextDouble();

                        sacando.diminuindoSaldo(saldoAtual, valorSaque);
                        saldoAtual = sacando.diminuindoSaldo(saldoAtual, valorSaque);

                        System.out.println("Saque efetuado com sucesso!");
                        System.out.printf("\nSaldo restante disponivel:%.2f", saldoAtual);

                        System.out.println("\nRealizar outra operaçõa ou sair?\nDigite apenas o número:");
                        opcao = in.nextInt();
                        break;
                        //sacando dinheiro
                        //metodo de subtração
                    case 6:
                        System.out.println("Até logo!");
                        System.out.println("\nRealizar outra operaçõa ou sair?\nDigite apenas o número:");
                        opcao = in.nextInt();
                        break;                    
                        //encerrando operação
                    default:
                        break;
                        //adicionar metodo de investimento, contendo três modalidades de investimento
                }

            }while(opcao >= 1 && opcao <= 5);

        }  else {
            System.out.println("fim da aplicação.");
        }
    
        
    }
}


/*
 * cadastro usuário
 * emprestimo disponível no valor de = 1.500,00
 * débito = 0
 * OPÇÕES DE:
 * depositar
 * sacar emprestimo
 * verificar saldo
 * verificar valor de emprestimo disponível
 * todas as operações solicitam verificação de senha
 * investimento 0,8 % ao mês
 * parcelas a pagar após solicitar emprestimo
 * 
 * em todos os cases, adicionar estruturas de "prevenção"
 * adicionar confirmação de senha em todos os interesses
 */
