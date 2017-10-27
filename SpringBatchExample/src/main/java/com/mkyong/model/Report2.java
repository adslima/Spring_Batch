package com.mkyong.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:33:00
 */
@XmlRootElement(name = "record")
public class Report2 {

	private Long id;
	private String nome;
	private String sobrenome;
	private String email;
	private String cpf;
	private List<Endereco> endereco;

	/**
	 * @return retorna o valor de {@link #id}
	 */
	@XmlAttribute(name = "id")
	public Long getId() {
		return this.id;
	}

	/**
	 * seta o valor do parametro id no atributo {@link #id}
	 *
	 * @param id
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @return retorna o valor de {@link #nome}
	 */
	@XmlAttribute(name = "nome")
	public String getNome() {
		return this.nome;
	}

	/**
	 * seta o valor do parametro nome no atributo {@link #nome}
	 *
	 * @param nome
	 */
	public void setNome(final String nome) {
		this.nome = nome;
	}

	/**
	 * @return retorna o valor de {@link #sobrenome}
	 */
	@XmlAttribute(name = "sobrenome")
	public String getSobrenome() {
		return this.sobrenome;
	}

	/**
	 * seta o valor do parametro sobrenome no atributo {@link #sobrenome}
	 *
	 * @param sobrenome
	 */
	public void setSobrenome(final String sobrenome) {
		this.sobrenome = sobrenome;
	}

	/**
	 * @return retorna o valor de {@link #email}
	 */
	@XmlAttribute(name = "email")
	public String getEmail() {
		return this.email;
	}

	/**
	 * seta o valor do parametro email no atributo {@link #email}
	 *
	 * @param email
	 */
	public void setEmail(final String email) {
		this.email = email;
	}

	/**
	 * @return retorna o valor de {@link #cpf}
	 */
	@XmlAttribute(name = "cpf")
	public String getCpf() {
		return this.cpf;
	}

	/**
	 * seta o valor do parametro cpf no atributo {@link #cpf}
	 *
	 * @param cpf
	 */
	public void setCpf(final String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @return retorna o valor de {@link #endereco}
	 */
	@XmlAttribute(name = "endereco")
	public List<Endereco> getEndereco() {
		return this.endereco;
	}

	/**
	 * seta o valor do parametro endereco no atributo {@link #endereco}
	 *
	 * @param endereco
	 */
	public void setEndereco(final List<Endereco> endereco) {
		this.endereco = endereco;
	}

	/* (non-Javadoc)
	 *
	 * @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return "Report2 [id=" + this.id + ", nome=" + this.nome + ", sobrenome=" + this.sobrenome + ", email=" + this.email
				+ ", cpf=" + this.cpf + ", endereco=" + this.endereco + "]";
	}

}
