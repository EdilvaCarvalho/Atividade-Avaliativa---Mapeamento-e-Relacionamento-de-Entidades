
package br.edu.ifpb.dac.dac.cenario2.domain.enums;

import java.io.Serializable;

/**
 *
 * @author Edilva
 */
public enum Sexo implements Serializable{
    
    FEMININO("Feminino"), MASCULINO("Masculino");
    
    private final String descricao;
    
    Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    } 
}
