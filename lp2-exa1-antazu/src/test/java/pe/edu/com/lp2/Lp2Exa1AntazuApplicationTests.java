package pe.edu.com.lp2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import pe.edu.com.lp2.dao.DetallePedidoDao;

@SpringBootTest
class Lp2Exa1AntazuApplicationTests {
	@Autowired
	private DetallePedidoDao dp;
	@Test
	void contextLoads() {
		System.out.println(dp.readAll());
	}

}
