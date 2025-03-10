public class Main {
    public static void main(String[] args) {
        ReprodutorMusical reprodutor = new MeuReprodutorMusical();
        AparelhoTelefonico telefone = new MeuAparelhoTelefonico();
        NavegadorInternet navegador = new MeuNavegadorInternet();

        iPhone meuIPhone = new iPhone(reprodutor, telefone, navegador);

        meuIPhone.tocarMusica("Bohemian Rhapsody");
        meuIPhone.fazerChamada("123-456-7890");
        meuIPhone.abrirPagina("www.google.com");
    }
}