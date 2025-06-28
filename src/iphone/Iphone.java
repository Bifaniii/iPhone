package iphone;

public class Iphone implements Sistema.ReprodutorMusical, Sistema.AparelhoTelefonico, Sistema.NavegadorInternet {

    // Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando: " + musica);
    }

    // Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarVivaVoz() {
        System.out.println("Viva-voz ativado.");
    }

    // Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método main para teste
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Teste Reprodutor Musical
        iphone.tocar();
        iphone.selecionarMusica("Veigh - Mônaco");
        iphone.pausar();

        // Teste Aparelho Telefônico
        iphone.ligar("123456789");
        iphone.atender();
        iphone.iniciarVivaVoz();

        // Teste Navegador
        iphone.exibirPagina("https://www.linkedin.com/in/guilhermebifani/");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}
