package Bin;

public class Produto {

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getEstoqueMin() {
		return estoqueMin;
	}

	public void setEstoqueMin(float estoqueMin) {
		this.estoqueMin = estoqueMin;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float getCusto() {
		return custo;
	}

	public void setCusto(float custo) {
		this.custo = custo;
	}

	public float getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Integer localizacao) {
		this.localizacao = localizacao;
	}

	public Integer getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Integer classificacao) {
		this.classificacao = classificacao;
	}

	private Integer id;

	private String descricao;

	private float estoqueMin;

	private float preco;

	private float custo;

	private float quantidade;

	private Integer localizacao;

	private Integer classificacao;

	


}