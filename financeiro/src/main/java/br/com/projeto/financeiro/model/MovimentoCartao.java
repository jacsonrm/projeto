package br.com.projeto.financas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;

@Entity
public class MovimentoCartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimentoCartao;

    @Column
    private double valor;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataCompra;

    @Column
    private String descricao;

    public Integer getIdMovimentoCartao() {
        return idMovimentoCartao;
    }

    public void setIdMovimentoCartao(Integer idMovimentoCartao) {
        this.idMovimentoCartao = idMovimentoCartao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

        
}
