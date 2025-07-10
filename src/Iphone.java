public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void tocar() {
        System.out.println("Reproduzindo musica!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionou a musica " + musica + "!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero " + numero + "...");
        System.out.println("Sem sinal!");
    }

    @Override
    public void atender() {
       System.out.println("Atendendo ligacao.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
        System.out.println("Nao ha mensagens de voz disponiveis.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina de url " + url + "!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }

}
