package interfaces;

import java.util.List;

import model.TblCliente;

public interface Icliente {
	//declaramos los metodos
	void RegistrarCliente (TblCliente cliente);
	void ActualizarCliente (TblCliente cliente);
	void EliminarCliente (TblCliente cliente);
	List<TblCliente> ListadoCliente();
	TblCliente BucarCliente (TblCliente cliente);

}
