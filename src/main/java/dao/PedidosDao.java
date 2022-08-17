package dao;
import java.util.List;

import model.Pedido;


public interface PedidosDao {
	public List<Pedido> devolverPedidos ();
	public List<Pedido> devolverPedidosOlvidados ();
	public List<Pedido> devolverPedidosPendientes ();
	
}
