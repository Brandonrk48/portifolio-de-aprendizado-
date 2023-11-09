import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        String senha;
        String cadastrar = "SIM";
        double emprestimoDisponivel = 1500;
        double saldo = 0;
        
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

            while(opcao < 1 || opcao > 6){
                System.out.println("As opções vão do 1 ao 6.");
                System.out.println("Escolha novamente: ");
                System.out.println("1-Depositar dinheiro\n2-Ver saldo dispovível\n3-Ver empréstimo disponível\n4-Solicitar emprestimo\n5-Sacar dinheiro\n6-Sair");
                opcao = in.nextInt();
            } 
                
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
 */
