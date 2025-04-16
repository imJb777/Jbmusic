package br.com.imjb777.music;

public class Preferidas {
    public void incluir(Audio audio) {
        if (audio.getClassificacao() > 9) {
            System.out.println(audio.getClassificacao() + "  sucesso, a queridinha da galera");
        } else{
            System.out.println(audio.getClassificacao() + "O pessoal ate que curte");
        }
    }

}
