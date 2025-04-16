package br.com.imjb777.music;

public class Audio {
 private  String titulo;
 private String duracao;
 private int totalReproducao;
 private double curtidas;
 private double classificacao;


        public void curte(){
            this.curtidas++;

        }

        public void reproducao(){
            this.totalReproducao++;
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public double getCurtidas() {
        return curtidas;
    }

    public int getTotalReproducao() {
        return totalReproducao;
    }

    public String getDuracao() {
        return duracao;
    }


}
