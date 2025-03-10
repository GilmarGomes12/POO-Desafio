public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone(ReprodutorMusical reprodutorMusical, AparelhoTelefonico aparelhoTelefonico, NavegadorInternet navegadorInternet) {
        this.reprodutorMusical = reprodutorMusical;
        this.aparelhoTelefonico = aparelhoTelefonico;
        this.navegadorInternet = navegadorInternet;
    }


    public void tocarMusica(String musica) {
        reprodutorMusical.selecionarMusica(musica);
        reprodutorMusical.tocar();
    }

    public void fazerChamada(String numero) {
        aparelhoTelefonico.ligar(numero);
    }

    public void abrirPagina(String url) {
        navegadorInternet.exibirPagina(url);
    }

    // Getters (opcionais, mas úteis)
    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public AparelhoTelefonico getAparelhoTelefonico() {
        return aparelhoTelefonico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }
}
