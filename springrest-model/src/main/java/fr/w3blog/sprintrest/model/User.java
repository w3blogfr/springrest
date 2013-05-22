package fr.w3blog.sprintrest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity//Permet d'indiquer qu'il s'agit d'une classe que l'on souhaite persister
@Table(name="user")//Indique le nom de la table dans la base de données
public class User {
	
	@Id//Indique qu'il s'agit de la clé primaire
	@GeneratedValue(strategy=GenerationType.AUTO)//Indique comment la clé doit être généré
	@Column(name="id")//Colonne Sql à utiliser
	private Integer id;

	@Column(name="email")
	@NotEmpty//On indique que ca ne doit pas être vide
	@Email(message="Email is invalid")//Indique que l'on souhaite une adresse mail
	private String email;

	@Column(name="pseudo")
	@NotEmpty
	private String pseudo;
	
	@Column(name="password")
	private String password;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the pseudo
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * @param pseudo the pseudo to set
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
