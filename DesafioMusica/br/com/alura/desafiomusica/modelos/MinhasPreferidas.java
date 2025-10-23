package DesafioMusica.br.com.alura.desafiomusica.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 10) {
            System.out.println(audio.getTitulo() + " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println(audio.getTitulo() + " é um dos que todo mundo está curtindo!");
        }
    }

}
