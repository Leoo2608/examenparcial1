package pe.edu.com.lp2.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.com.lp2.dao.UsuarioDao;
import pe.edu.com.lp2.entity.Usuario;

@Repository
public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
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
		String SQL = "select * from usuario";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public Usuario read(String nomuser) {
		String SQL = "select * from usuario where nomuser=?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
