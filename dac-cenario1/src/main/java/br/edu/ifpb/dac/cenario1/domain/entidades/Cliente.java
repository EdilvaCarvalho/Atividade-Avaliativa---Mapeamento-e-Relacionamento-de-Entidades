
package br.edu.ifpb.dac.cenario1.domain.entidades;

import br.edu.ifpb.dac.cenario1.domain.util.ConvertLocalDate;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Edilva
 */
@Entity
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue
    private int codigo;
    @Column(nullable=false, length=80)
    private String nome;
    @Column(nullable=false, length=15)
    private String cpf;
    @Column(nullable=false, length=15)
    private String rg;
    @Column(nullable=false)
    @Convert(converter = ConvertLocalDate.class)
    private LocalDate dataNascimento;
    @Column(nullable=false, length=15)
    private String telefone;
    @Column(nullable=false, length=80)
    private String email;
    @Column(nullable=false, length=30)
    private String senha;
    @Embedded
    private Endereco endereco;
    @OneToOne
    private Conta conta;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String rg, LocalDate dataNascimento, String telefone, String email, String senha, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
    }

    public Cliente(int codigo, String nome, String cpf, String rg, LocalDate dataNascimento, String telefone, String email, String senha, Endereco endereco, Conta conta) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.conta = conta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + this.codigo;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cpf);
        hash = 47 * hash + Objects.hashCode(this.rg);
        hash = 47 * hash + Objects.hashCode(this.dataNascimento);
        hash = 47 * hash + Objects.hashCode(this.telefone);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.senha);
        hash = 47 * hash + Objects.hashCode(this.endereco);
        hash = 47 * hash + Objects.hashCode(this.conta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.dataNascimento, other.dataNascimento)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.conta, other.conta)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento=" + dataNascimento + ", telefone=" + telefone + ", email=" + email + ", senha=" + senha + ", endereco=" + endereco + ", conta=" + conta + '}';
    }
    
}
