package br.edu.ifpb.dac.cenario1.domain.entidades;

import br.edu.ifpb.dac.cenario1.domain.enuns.TipoDeConta;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Edilva
 */
@Entity
public class Conta implements Serializable {

    @Id
    @GeneratedValue
    private int codigo;
    @Column(nullable = false)
    private long numeroConta;
    @Column(nullable = false)
    private int digitoConta;
    @Column(nullable = false)
    private long numeroAgencia;
    @Column(nullable = false)
    private int digitoAgencia;
    @Column(nullable = false)
    private double saldo;
    @Column(nullable = false)
    private String senha;
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDeConta tipoDeConta;

    public Conta() {
    }

    public Conta(long numeroConta, int digitoConta, long numeroAgencia, int digitoagencia, double saldo, String senha, TipoDeConta tipoDeConta) {
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.numeroAgencia = numeroAgencia;
        this.digitoAgencia = digitoagencia;
        this.saldo = saldo;
        this.senha = senha;
        this.tipoDeConta = tipoDeConta;
    }

    public Conta(int codigo, long numeroConta, int digitoConta, long numeroAgencia, int digitoagencia, double saldo, String senha, TipoDeConta tipoDeConta) {
        this.codigo = codigo;
        this.numeroConta = numeroConta;
        this.digitoConta = digitoConta;
        this.numeroAgencia = numeroAgencia;
        this.digitoAgencia = digitoagencia;
        this.saldo = saldo;
        this.senha = senha;
        this.tipoDeConta = tipoDeConta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getDigitoConta() {
        return digitoConta;
    }

    public void setDigitoConta(int digitoConta) {
        this.digitoConta = digitoConta;
    }

    public long getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(long numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getDigitoAgencia() {
        return digitoAgencia;
    }

    public void setDigitoAgencia(int digitoAgencia) {
        this.digitoAgencia = digitoAgencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public TipoDeConta getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(TipoDeConta tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public String sacar(double valor) {
        String resposta = null;
        if (valor > 0) {
            if (this.saldo >= valor) {
                if (this.tipoDeConta == TipoDeConta.CORRENTE) {
                    this.saldo-= (valor - 0.75);
                } else {
                    this.saldo-= valor;
                }
                resposta = "Saque realizado com sucesso!";
            } else {
                resposta = "Saldo insuficiente para realizar essa operação";
            }
        } else {
            resposta = "Por favor, informe um valor maior que 0(ZERO)";
        }
        return resposta;
    }

    public String depositar(double valor) {
        String resposta = null;
        if (valor > 0) {
            if (this.tipoDeConta == TipoDeConta.CORRENTE) {
                this.saldo+= valor;
            } else {
                this.saldo+= (valor + 0.75);
            }
            resposta = "Depósito realizado com sucesso!";
        } else {
            resposta = "Por favor, informe um valor maior que 0(ZERO)";
        }
        return resposta;
    }
    
    public void extrato(Cliente cliente){
        System.out.println("*** Extrato de Conta " + this.tipoDeConta.getDescricao() + " ***");
        System.out.println("");
        System.out.println("DATA/HORA: " + LocalDateTime.now());
        System.out.println("AGÊNCIA: " + this.numeroAgencia + "-" + this.digitoAgencia);
        System.out.println("CONTA: " + this.numeroConta + "-" + this.digitoConta);
        System.out.println("CLIENTE: " + cliente.getNome());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + this.codigo;
        hash = 67 * hash + (int) (this.numeroConta ^ (this.numeroConta >>> 32));
        hash = 67 * hash + this.digitoConta;
        hash = 67 * hash + (int) (this.numeroAgencia ^ (this.numeroAgencia >>> 32));
        hash = 67 * hash + this.digitoAgencia;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.saldo) ^ (Double.doubleToLongBits(this.saldo) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.senha);
        hash = 67 * hash + Objects.hashCode(this.tipoDeConta);
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
        final Conta other = (Conta) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.numeroConta != other.numeroConta) {
            return false;
        }
        if (this.digitoConta != other.digitoConta) {
            return false;
        }
        if (this.numeroAgencia != other.numeroAgencia) {
            return false;
        }
        if (this.digitoAgencia != other.digitoAgencia) {
            return false;
        }
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (this.tipoDeConta != other.tipoDeConta) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Conta{" + "codigo=" + codigo + ", numeroConta=" + numeroConta + ", digitoConta=" + digitoConta + ", numeroAgencia=" + numeroAgencia + ", digitoAgencia=" + digitoAgencia + ", saldo=" + saldo + ", senha=" + senha + ", tipoDeConta=" + tipoDeConta + '}';
    }

}
