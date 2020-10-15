package pe.edu.com.lp2.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.com.lp2.dao.DetallePedidoDao;
import pe.edu.com.lp2.entity.DetallePedido;
@Repository
public class DetallePedidoDaoImp implements DetallePedidoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(DetallePedido dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DetallePedido dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DetallePedido read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		String SQL = "select * from detalle_pedido";
		return jdbcTemplate.queryForList(SQL);
	}

}
