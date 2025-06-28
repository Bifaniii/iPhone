package iphone;

public class Sistema {
    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    public interface AparelhoTelefonico {
        void ligar(String numero);
        void atender();
        void iniciarVivaVoz();
    }

    public interface NavegadorInternet {
        void exibirPagina(String url);
        void adicionarNovaAba();
        void atualizarPagina();
    }
}
