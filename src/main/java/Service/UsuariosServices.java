package Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Domain.Usuarios;
import Repository.UsuariosRepositories;

@Service
public class UsuariosServices {
	
	@Autowired
	private UsuariosRepositories usuariosRepositories;
	
	
	
	public List<Usuarios> findall(){
		return usuariosRepositories.findAll();
	}
	
	
	public Optional<Usuarios> findById(Long id){
		return usuariosRepositories.findById(id);
	}
	
	
	public Usuarios CreateAccount(Usuarios usuarios) {
		return usuariosRepositories.save(usuarios);
	}
	

	 public Usuarios AtualizarUsurios(Usuarios usuarios) {
		 return usuariosRepositories.save(usuarios);
	 }
	 
	 public void  DeleteUsuarios (Long id) {
		 usuariosRepositories.deleteById(id);
	 }
	 
}
