
package br.edu.ifpb.dac.cenario1.domain.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Edilva
 */
@Embeddable
public class Endereco implements Serializable{
    
    @Column(nullable=false, length = 80)
    private String uf;
    @Column(nullable=false, length = 80)
    private String cidade;
    @Column(nullable=false, length = 80)
    private String bairro;
    @Column(nullable=false, length = 80)
    private String rua;
    @Column(nullable=false, length = 80)
    private String numero;

    public Endereco() {
    }

    public Endereco(String uf, String cidade, String bairro, String rua, String numero) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Endereco{" + "uf=" + uf + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + '}';
    }
    
}
