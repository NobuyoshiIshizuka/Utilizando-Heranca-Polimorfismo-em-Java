package java_classes;

public class Aluno extends Pessoa {

	private String DataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private String disciplina;
	
	/*Inicio Getters e Setters*/
	public String getDataMatricula() {
		return DataMatricula;
	}
	public void setDataMatricula(String dataMatricula) {
		DataMatricula = dataMatricula;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	public String getSerieMatriculado() {
		return serieMatriculado;
	}
	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	/*Fim Getters e Setters*/
	
	/*Inicio ToString*/
	@Override
	public String toString() {
		return "Aluno [DataMatricula=" + DataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + ", nome=" + nome + ", idade=" + idade
				+ ", dataNascimento=" + dataNascimento + ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
	/*Fim ToString*/
	
	@Override/*Identifica metodo sobreescrito*/
	public boolean pessoaMaiorIdade() {
		
		return idade >= 21;
	}
	
	
	
	
}

