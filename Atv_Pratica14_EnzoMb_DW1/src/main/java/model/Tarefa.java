package model;

import java.sql.Timestamp;

public class Tarefa {
	private int id_tarefa;
	private int id_usuario;
	private String titulo;
	private String descricao;
	private Timestamp data_criacao;
	private Timestamp data_conclusao;
	private boolean status;
	
	public int getId_tarefa() {
		return id_tarefa;
	}
	
	public void setId_tarefa(int id_tarefa) {
		this.id_tarefa = id_tarefa;
	}
	
	public int getId_usuario() {
		return id_usuario;
	}
	
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Timestamp getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(Timestamp data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Timestamp getData_conclusao() {
		return data_conclusao;
	}

	public void setData_conclusao(Timestamp data_conclusao) {
		this.data_conclusao = data_conclusao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
