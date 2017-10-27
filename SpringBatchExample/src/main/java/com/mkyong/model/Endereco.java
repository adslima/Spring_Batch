package com.mkyong.model;

public class Endereco {

	private String rua;
	private Long numero;
	private String complemento;

	/**
	 * @return retorna o valor de {@link #rua}
	 */
	public String getRua() {
		return this.rua;
	}

	/**
	 * seta o valor do parametro rua no atributo {@link #rua}
	 *
	 * @param rua
	 */
	public void setRua(final String rua) {
		this.rua = rua;
	}

	/**
	 * @return retorna o valor de {@link #numero}
	 */
	public Long getNumero() {
		return this.numero;
	}

	/**
	 * seta o valor do parametro numero no atributo {@link #numero}
	 *
	 * @param numero
	 */
	public void setNumero(final Long numero) {
		this.numero = numero;
	}

	/**
	 * @return retorna o valor de {@link #complemento}
	 */
	public String getComplemento() {
		return this.complemento;
	}

	/**
	 * seta o valor do parametro complemento no atributo {@link #complemento}
	 *
	 * @param complemento
	 */
	public void setComplemento(final String complemento) {
		this.complemento = complemento;
	}

}
