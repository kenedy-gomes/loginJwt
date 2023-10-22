package Domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.io.Serializable;



@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_usuarios;
	private String name;
	private String email;
	private String password;

	public Usuarios() {
	}

	public Usuarios(Long id_usuarios, String name, String email, String password) {
		this.id_usuarios = id_usuarios;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Long getId_usuarios() {
		return id_usuarios;
	}

	public void setId_usuarios(Long id_usuarios) {
		this.id_usuarios = id_usuarios;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
