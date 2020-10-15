package pe.edu.com.lp2.dao;

import java.util.List;
import java.util.Map;

import pe.edu.com.lp2.entity.Usuario;

public interface UsuarioDao {
	int create(Usuario u);
	int update(Usuario u);
	int delete(int id);
	Usuario read(int id);
	List<Map<String,Object>> readAll();
	public Usuario read(String nomuser);
}
