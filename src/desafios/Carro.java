/**
 * 4. Crie uma classe Carro com atributos modelo, ano, cor
 * e métodos para exibir a ficha técnica e calcular a idade do carro.
 */

package desafios;

import java.time.LocalDate;

public class Carro {

    String modelo;
    int anoDeLancamento;
    String cor;

    public int calcularIdadeDoCarro() {
        int anoAtual = LocalDate.now().getYear();
        int idadeDoCarro = anoAtual - this.anoDeLancamento;
        return idadeDoCarro;
    }

    public String exibeFichaTecnica() {
        return """
                ----------|Ficha Ténica|----------
                Modelo: %s
                Ano de Lançamento: %d
                Cor: %s
                Idade: %d
                """.formatted(modelo, anoDeLancamento, cor, calcularIdadeDoCarro());
    }
}
