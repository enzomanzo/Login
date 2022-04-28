package br.com.fiap.login.login85311.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Getter // getter
@Setter //lombok
@AllArgsConstructor // construtor sem argumentos
@NoArgsConstructor // construtor sem argumentos
@Entity // indica que a classe é uma entidade
public class Login {

@Id // indica que o atributo é o id
@GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id
private long id;

@Column(nullable = false) // indica que o atributo não pode ser nulo
private String login;
private String senha;
}
