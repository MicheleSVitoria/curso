package ProjetoCurso;

public class Disciplina {
private int id_disciplina;
private int nome_disciplina;
private double carga_horaria_disciplina;
private int turma;
private int professor;


public int getId_disciplina() {
	return id_disciplina;
}
public void setId_disciplina(int id_disciplina) {
	this.id_disciplina = id_disciplina;
}
public int getNome_disciplina() {
	return nome_disciplina;
}
public void setNome_disciplina(int nome_disciplina) {
	this.nome_disciplina = nome_disciplina;
}
public double getCarga_horaria_disciplina() {
	return carga_horaria_disciplina;
}
public void setCarga_horaria_disciplina(double carga_horaria_disciplina) {
	this.carga_horaria_disciplina = carga_horaria_disciplina;
}
public int getTurma() {
	return turma;
}
public void setTurma(int turma) {
	this.turma = turma;
}
public int getProfessor() {
	return professor;
}
public void setProfessor(int professor) {
	this.professor = professor;
}

}
