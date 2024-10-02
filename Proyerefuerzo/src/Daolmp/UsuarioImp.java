package Daolmp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import interfaces.IUsuario;
import model.TblUsuario;

public class UsuarioImp implements IUsuario {

	@Override
	public void RegistarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Proyerefuerzo");
		EntityManager em=emf.createEntityManager();
		try{
		
		em.getTransaction().begin();
		
		em.persist(usuario);
		
		em.getTransaction().commit();
		}catch(RuntimeException e){
			e.getMessage();
		}finally{
		
		em.close();
		}
	}
		
	

	@Override
	public void ActualizarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EliminarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TblUsuario> ListadoUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TblUsuario BucarUsuario(TblUsuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

}
