package pe.edu.com.lp2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.lp2.dao.UsuarioDao;
import pe.edu.com.lp2.entity.Usuario;
import pe.edu.com.lp2.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService {
	@Autowired
	private UsuarioDao ud;
	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario read(String nomuser) {
		return ud.read(nomuser);
	}

}
