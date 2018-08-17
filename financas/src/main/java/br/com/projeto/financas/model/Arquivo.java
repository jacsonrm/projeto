package br.com.projeto.financas.model;

import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import javax.persistence.*;
import java.io.ByteArrayInputStream;
import java.io.Serializable;

@Entity
public class Arquivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idArquivo;

    @Column
    private String nome;

    @Column(length = 255)
    private String mime;

    @Lob
    @Basic(fetch = javax.persistence.FetchType.LAZY)
    @Column
    private byte[] conteudo;

    public Integer getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(Integer idArquivo) {
        this.idArquivo = idArquivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public byte[] getConteudo() {
        return conteudo;
    }

    public void setConteudo(byte[] conteudo) {
        this.conteudo = conteudo;
    }

    public StreamedContent getStreamedContent() {

        StreamedContent saida = new DefaultStreamedContent(new ByteArrayInputStream(conteudo), mime, nome);
        return saida;
    }


}
