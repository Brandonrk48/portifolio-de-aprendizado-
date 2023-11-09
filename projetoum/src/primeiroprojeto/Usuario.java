import java.util.Scanner;
public class Usuario {
    String nome;
    String senha;

    Scanner in = new Scanner(System.in);

    public void nomearUsuario(){
        System.out.println("Informe o seu nome:");
        nome = in.nextLine();
    }
    //método para criar cadastrar nome


    public String cadastrSenha(String senhaEscolhida){
        do{
            System.out.println("Sua senha deve conter mais que 8 digitos :");
            System.out.println("Digite novamente a sua senha: ");
            senha = in.nextLine();

            if(senha.length() > 8){
            senhaEscolhida = senha;
        }
        }while(senhaEscolhida.length() <= 8);

        return senhaEscolhida;
        //método para validar senha que anteriormente não atendeu ao requisito de mais de 8 caracteres
    }
    
    public int validarObjetivo(int escolha){

        return escolha;
        //método para validar opção que anteriormente foi digitado errado
    }


}


/* 
public int digitarVolume(int volumeDigitado){
        volume =  volumeDigitado;
        return volumeDigitado;
    }

    smartTv.digitarVolume(30);
        System.out.println("Volume digitado : " + smartTv.volume);
        */


    


