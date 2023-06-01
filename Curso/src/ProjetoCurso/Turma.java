package ProjetoCurso;

import java.util.Date;

public class Turma {
private int id_turma;
private int numero_turma;
private Date data_aula_turma;
private int id_aluno;


public int getId_turma() {
	return id_turma;
}
public void setId_turma(int id_turma) {
	this.id_turma = id_turma;
}
public int getNumero_turma() {
	return numero_turma;
}
public void setNumero_turma(int numero_turma) {
	this.numero_turma = numero_turma;
}
public Date getData_aula_turma() {
	return data_aula_turma;
}
public void setData_aula_turma(Date data_aula_turma) {
	this.data_aula_turma = data_aula_turma;
}
public int getId_aluno() {
	return id_aluno;
}
public void setId_aluno(int id_aluno) {
	this.id_aluno = id_aluno;
}
}
