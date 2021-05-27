//LUCAS ALEXANDRE - CB3007626 | ELESON OLIVEIRA CB3007235

package produtos;

public class Produtos {
	
	private long id;
	private String nome;
	private int unidadeCompra;
	private String descricao;
	private double qtdPrevistoMes;
	private double precoMaxComprado;
	
	public long setId(long id) {
		return this.id = id;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setUnidadeCompra(int unidadeCompra) {
		this.unidadeCompra = unidadeCompra;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setQtdPrevistoMes(double qtdPrevistoMes) {
		this.qtdPrevistoMes = qtdPrevistoMes;
	}

	public void setPrecoMaxComprado(double precoMaxComprado) {
		this.precoMaxComprado = precoMaxComprado;
	}
	
	public long getId() {
		return this.id;
	};

	public String getNome() {
		return this.nome;
	}
	
	public int getUnidadeCompra() {
		return this.unidadeCompra;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public double getQtdPrevistoMes() {
		return this.qtdPrevistoMes;
	}
	
	public double getPrecoMaxComprado() {
		return this.precoMaxComprado;
	}
}
