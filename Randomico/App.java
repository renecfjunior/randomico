import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        PrintStream show = System.out;
        Scanner scanner = new Scanner(System.in);
        Random geradorDeNumero = new Random();

        Integer opcao;
        Integer escolhaComputador;
        Integer escolhaUsuario;

        show.print("Olá eu sou o jogo Randômico :). Digite o seu nome\n");
        String nome = scanner.nextLine();

        show.println("Seja bem vindo ao Randômico " + nome + "!");

        show.println("Quer iniciar o jogo? \n1 -> Sim  2 -> Não");
        opcao = scanner.nextInt();

        if (opcao == 2){
            show.println("Fica para a próxima então meu fera.");
        }else if (opcao == 1){
            show.println("Beleza, O jogo é assim...");
            show.println("Eu irei escolher um número de 0 a 10.");
            show.println("Mas não vou te falar qual número escolhi.");
            show.println("Se você acertar o numero que escolhi você ganha .");

            escolhaComputador = geradorDeNumero.nextInt(11);

            show.println("Beleza " + nome + " Eu já escolhi.");
            show.println("Agora tente adivinhar! ");
            
            do {
                escolhaUsuario = scanner.nextInt();
               if (escolhaUsuario != escolhaComputador){
                   show.println("Escolha errada!");
               }else {
                   show.println("Parabéns você acertou ");

               }
            } while (escolhaUsuario != escolhaComputador);
        }

    }
}
