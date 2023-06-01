package ProjetoCurso;

public class Professor {
private int id_cpf_professor;
private int endereço_professor;
private int id_turma;
private int id_disciplina;


public int getId_turma() {
	return id_turma;
}
public void setId_turma(int id_turma) {
	this.id_turma = id_turma;
}
public int getId_disciplina() {
	return id_disciplina;
}
public void setId_disciplina(int id_disciplina) {
	this.id_disciplina = id_disciplina;
}
public int getId_cpf_professor() {
	return id_cpf_professor;
}
public void setId_cpf_professor(int id_cpf_professor) {
	this.id_cpf_professor = id_cpf_professor;
}
public int getEndereço_professor() {
	return endereço_professor;
}
public void setEndereço_professor(int endereço_professor) {
	this.endereço_professor = endereço_professor;
}
}
