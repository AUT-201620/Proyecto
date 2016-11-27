package persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author am.osorio
 * Enum para Manejador de Persistencia
 */
public enum PersistenceManager {
	  INSTANCE;
	  private EntityManagerFactory emFactory;
	  
	  private PersistenceManager() {
	    emFactory = Persistence.createEntityManagerFactory("my-app");
	  }
	  
	  public EntityManager getEntityManager() {
	    return emFactory.createEntityManager();
	  }
	  
	  public void close() {
	    emFactory.close();
	  }
}