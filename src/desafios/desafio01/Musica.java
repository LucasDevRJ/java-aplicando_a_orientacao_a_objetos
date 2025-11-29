/**
 * 3. Crie uma classe Musica com atributos titulo, artista,
 * anoLancamento, avaliacao e numAvaliacoes,
 * e métodos para exibir a ficha técnica, avaliar a música
 * e calcular a média de avaliações.
 */

package desafios.desafio01;

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int quantidadeDeAvaliacoes;

    public String exibeFichaTecnica(double avalicao) {
        return """
                |----------|Ficha Técnica|----------|
                Título: %s
                Artista: %s
                Ano de Lançamento: %d
                Avaliação: %.2f
                Quantidade de Avaliações: %d
                """.formatted(this.titulo, this.artista, this.anoDeLancamento, avalicao, this.quantidadeDeAvaliacoes);
    }

    public void avaliarMusica(double avaliacao) {
        this.quantidadeDeAvaliacoes++;
        this.avaliacao += avaliacao;
        System.out.println("Avaliação realizada com sucesso!");
    }

    public double calcularMediaDeAvaliacoes() {
        return this.avaliacao / this.quantidadeDeAvaliacoes;
    }
}
