package pe.edu.com.lp2.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.com.lp2.service.DetallePedidoService;

@RestController
@RequestMapping("/detallepedido")
public class DetallePedidoController {
	@Autowired
	private DetallePedidoService dps;
	@GetMapping("/lista")
	public List<Map<String,Object>> listar(){
		return dps.readAll();
	}
	
}
