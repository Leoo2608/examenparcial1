package pe.edu.com.lp2.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.com.lp2.dao.DetallePedidoDao;
import pe.edu.com.lp2.entity.DetallePedido;
import pe.edu.com.lp2.service.DetallePedidoService;
@Service
public class DetallePedidoServiceImp implements DetallePedidoService {
	@Autowired
	private DetallePedidoDao dp;
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
		// TODO Auto-generated method stub
		return dp.readAll();
	}

}
