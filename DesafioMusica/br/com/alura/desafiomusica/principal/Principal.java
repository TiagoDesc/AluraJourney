package DesafioMusica.br.com.alura.desafiomusica.principal;

import DesafioMusica.br.com.alura.desafiomusica.modelos.MinhasPreferidas;
import DesafioMusica.br.com.alura.desafiomusica.modelos.Musica;
import DesafioMusica.br.com.alura.desafiomusica.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Sem Coração");
        minhaMusica.setCantor("Mc Kako");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Ponto de vista");
        meuPodcast.setApresentador("Joel Jota");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }

}
