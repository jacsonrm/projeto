package br.com.projeto.financas.model;

import java.math.BigDecimal;
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
public class NotaFiscal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCodigoNotaFiscal;

    @Column
    private String cnpj;

    @Column
    private String estabelecimentoComercial;

    @Column
    private String NumeroNotaFiscal;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataEmissao;
    
    @Column
    private BigDecimal valor;

    @Column
    private String observacoes;

    public Integer getIdCodigoNotaFiscal() {
        return idCodigoNotaFiscal;
    }

    public void setIdCodigoNotaFiscal(Integer idCodigoNotaFiscal) {
        this.idCodigoNotaFiscal = idCodigoNotaFiscal;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEstabelecimentoComercial() {
        return estabelecimentoComercial;
    }

    public void setEstabelecimentoComercial(String estabelecimentoComercial) {
        this.estabelecimentoComercial = estabelecimentoComercial;
    }

    public String getNumeroNotaFiscal() {
        return NumeroNotaFiscal;
    }

    public void setNumeroNotaFiscal(String NumeroNotaFiscal) {
        this.NumeroNotaFiscal = NumeroNotaFiscal;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
   
}
