package modelo.entidades;


public abstract class Pessoa {  
	

    private String nome = "";
    private int idade = 0;
    private String cpf = ""; 
    private String sexo = "";
    

    public void atualizarIdade(){
        this.idade++;
    }
    

    public String montaCadastro(){
            return "Nome: "+this.nome+
                    "\nIdade: "+this.idade+
                    "\nCPF: "+this.cpf;
    }
   
    
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
 
    public int getIdade() {
        return idade;
    }
    

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}    

    
    
}
