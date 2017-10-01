
package br.edu.ifpb.dac.cenario1.domain.enuns;

/**
 *
 * @author Edilva
 */
public enum TipoDeConta {
    
    POUPANCA("Poupança"), CORRENTE("Corrente");
    
    private final String descricao;
    
    TipoDeConta(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    } 
}
