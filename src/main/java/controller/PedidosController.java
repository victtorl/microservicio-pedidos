package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Pedido;
import service.ServicePedidos;


@CrossOrigin(origins="*")
@RestController
public class PedidosController {
	@Autowired
	ServicePedidos service;
	
	@GetMapping (value ="/api/pedidosatendidos", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> devolverPedidos () {
		return service.devolverPedidosDisponibles();
	}
	
	@GetMapping (value ="/api/pedidosolvidados", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> devolverPedidosOlvidados () {
		return service.devolverPedidosOlvidadosService();
	}
	
	@GetMapping (value ="/api/pedidospendientes", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Pedido> devolverPedidosPendientes () {
		return service.devolverPedidosPendientesService();
	}
	
}
