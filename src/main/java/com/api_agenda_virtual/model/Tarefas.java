package com.api_agenda_virtual.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tarefas {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idTarefa;
	
	private String nome;
	private String decricao;
	private String dataEntrega;

}
