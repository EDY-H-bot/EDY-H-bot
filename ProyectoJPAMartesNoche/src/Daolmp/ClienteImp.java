package Daolmp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.Icliente;

import model.TblCliente;

public class ClienteImp implements Icliente{

	@Override
	public void RegistrarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		EntityManager em=emf.createEntityManager();
		try{
		
		em.getTransaction().begin();
		
		em.persist(cliente);
		
		em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
		
		em.close();
		}
	}

	@Override
	public void ActualizarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("ProyectoJPAMartesNoche");
		EntityManager em=emf.createEntityManager();
		try{
			
			em.getTransaction().begin();
			
			em.merge(cliente);
			
			em.getTransaction().commit();
			}catch(RuntimeException e){
				
				e.getMessage();
			}finally{
			//
				em.close();
			}
		}

	@Override
	public void EliminarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblCliente> ListadoCliente() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public TblCliente BucarCliente(TblCliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}


