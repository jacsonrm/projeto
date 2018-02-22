package br.com.projeto.financas.model;

import br.com.projeto.financas.model.enums.FormaDePagamento;
import br.com.projeto.financas.model.enums.Grupo;
import br.com.projeto.financas.model.enums.Mes;
import br.com.projeto.financas.model.enums.Status;
import br.com.projeto.financas.model.enums.TipoDespesa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Temporal;

@Entity
public class Despesa implements Serializable {
    
    //@OneToMany
    //private List<>...
    //@ManyToMany
    //private Prod prod;
    //
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDespesa;

    @Column
    @Enumerated(EnumType.STRING)
    private FormaDePagamento formaDePagamento; 

    @Column
    @Enumerated(EnumType.STRING)
    private Grupo grupo; 

    @Column
    @Enumerated(EnumType.STRING)
    private Mes mes; 

    @Column
    @Enumerated(EnumType.STRING)
    private Status status; 
    
    @Column
    @Enumerated(EnumType.STRING)
    private TipoDespesa tipoDespesa; 
   
    @Column
    private String beneficiario; 
   
    @Column
    private double valor;

    @Column
    private int diaVencimento;
    
    @Column
    private int codigoDocumento;

    @Column
    private String mesCompra;

    @Column
    private String descricao;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataVencimento;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataPagamento;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @OrderColumn(name = "indice")
    @JoinTable(name = "despesa_arquivo", joinColumns = {
        @JoinColumn(name = "iddespesa")}, inverseJoinColumns = {
        @JoinColumn(name = "idarquivo")})
    List<Arquivo> arquivos;

    public Integer getIdDespesa() {
        return idDespesa;
    }

    public void setIdDespesa(Integer idDespesa) {
        this.idDespesa = idDespesa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void addArquivo(Arquivo arquivo) {
        if (this.arquivos == null) {
            this.arquivos = new ArrayList<>();
        }

        this.arquivos.add(arquivo);
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public int getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(int codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public String getMesCompra() {
        return mesCompra;
    }

    public void setMesCompra(String mesCompra) {
        this.mesCompra = mesCompra;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    public Mes getMes() {
        return mes;
    }

    public void setMes(Mes mes) {
        this.mes = mes;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TipoDespesa getTipoDespesa() {
        return tipoDespesa;
    }

    public void setTipoDespesa(TipoDespesa tipoDespesa) {
        this.tipoDespesa = tipoDespesa;
    }
    
}
