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
public class Contato {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idContato;

	private String nome;
	private String email;
	private String telefone;
}
