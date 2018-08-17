package br.com.projeto.financas.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class MovimentoCartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMovimentoCartao;

    @Column
    private BigDecimal valor;

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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
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
