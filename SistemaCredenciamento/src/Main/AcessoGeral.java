package Main;

public abstract class AcessoGeral {
	
	private String nome;
	private String cpf;
	private String telefone;
	private String cor;
	private String tipoDeAcesso;
	
   public AcessoGeral(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
       			this.cpf = cpf;
	}
    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	

	public String getTipoDeAcesso() {
		return tipoDeAcesso;
	}
	

	public void setTipoDeAcesso(String tipoDeAcesso) {
		this.tipoDeAcesso = tipoDeAcesso;
	}
	
}