package pe.edu.com.lp2.service;

import java.util.List;
import java.util.Map;

import pe.edu.com.lp2.entity.DetallePedido;

public interface DetallePedidoService {
	int create(DetallePedido dp);
	int update(DetallePedido dp);
	int delete(int id);
	DetallePedido read(int id);
	List<Map<String,Object>> readAll();
}
