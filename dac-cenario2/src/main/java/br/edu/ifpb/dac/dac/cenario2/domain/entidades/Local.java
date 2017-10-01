
package br.edu.ifpb.dac.dac.cenario2.domain.entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Edilva
 */
@Embeddable
public class Local implements Serializable{
    
    @Column(nullable=false, length=2)
    private String uf;
    @Column(nullable=false, length=80)
    private String cidade;
    @Column(nullable=false, length=80)
    private String bairro;
    @Column(nullable=false, length=80)
    private String rua;
    @Column(nullable=false, length=10)
    private String numero;
    @Column(nullable=false, length=80)
    private String pontoDeReferencia;

    public Local(String uf, String cidade, String bairro, String rua, String numero, String pontoDeReferencia) {
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.pontoDeReferencia = pontoDeReferencia;
    }

    public Local() {
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

    public String getPontoDeReferencia() {
        return pontoDeReferencia;
    }

    public void setPontoDeReferencia(String pontoDeReferencia) {
        this.pontoDeReferencia = pontoDeReferencia;
    }

    @Override
    public String toString() {
        return "Local{" + "uf=" + uf + ", cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero + ", pontoDeReferencia=" + pontoDeReferencia + '}';
    }
    
    
}
