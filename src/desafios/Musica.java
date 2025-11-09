/**
 * Crie uma classe Musica com atributos titulo, artista,
 * anoLancamento, avaliacao e numAvaliacoes,
 * e métodos para exibir a ficha técnica, avaliar a música
 * e calcular a média de avaliações.
 */

package desafios;

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int quantidadeDeAvaliacoes;

    public String exibeFichaTecnica() {
        return """
                |----------|Ficha Técnica|----------|
                Título: %s
                Artista: %s
                Ano de Lançamento: %d
                Avaliação: %.2f
                Quantidade de Avaliações: %d
                """.formatted(this.titulo, this.artista, this.anoDeLancamento,
                    this.avaliacao, this.quantidadeDeAvaliacoes);
    }
}
