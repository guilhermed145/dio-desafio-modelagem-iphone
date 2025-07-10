
import java.util.Scanner;

public class App {
    
    public static Scanner scanner = new Scanner(System.in);
    public static Iphone iphone = new Iphone();
    public static int respostaUsuario = -1;

    public static void main(String[] args) throws Exception {
        do { 
            abrirMenu();
            processarResposta(respostaUsuario);
        } while (respostaUsuario != 0);
    }

    public static void abrirMenu() {
        do { 
            System.out.println("\n==========Bem-vindo ao iPhone!==========");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Selecionar musica.");
            System.out.println("2 - Tocar musica.");
            System.out.println("3 - Parar de tocar musica.");
            System.out.println("4 - Ligar para um numero.");
            System.out.println("5 - Atender ligacao.");
            System.out.println("6 - Iniciar correio de voz.");
            System.out.println("7 - Exibir pagina no navegador.");
            System.out.println("8 - Adicionar nova aba do navegador.");
            System.out.println("9 - Atualizar pagina no navegador.");
            System.out.println("0 - Sair.");
            respostaUsuario = scanner.nextInt();
        } while (respostaUsuario < 0 || respostaUsuario > 9);
    }

    public static void processarResposta(int resposta) {
        switch (resposta) {
            case 1 -> {
                System.out.println("Digite o nome da musica que deseja selecionar:");
                iphone.selecionarMusica(scanner.next());
            }
            case 2 -> iphone.tocar();
            case 3 -> iphone.pausar();
            case 4 -> {
                System.out.println("Digite o numero para o qual deseja ligar:");
                iphone.ligar(scanner.next());
            }
            case 5 -> iphone.atender();
            case 6 -> iphone.iniciarCorreioVoz();
            case 7 -> {
                System.out.println("Digite a url da pagina que quer exibir:");
                iphone.exibirPagina(scanner.next());
            }
            case 8 -> iphone.adicionarNovaAba();
            case 9 -> iphone.atualizarPagina();
        }
    }

}
