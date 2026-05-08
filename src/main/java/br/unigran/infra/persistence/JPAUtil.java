package br.unigran.infra.persistence;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class JPAUtil {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    private static JPAUtil jpa = new JPAUtil();
    private JPAUtil(){
        emf = Persistence.createEntityManagerFactory("br.unigran_P2-Pablo_jar_1.0-SNAPSHOTPU");
        em = emf.createEntityManager();
    }    
    public static JPAUtil getInstace(){
        return jpa;
    }
    public void salvar(Object o){
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
    }
        public void remover(Object o){
        em.getTransaction().begin();
        em.remove(o);
        em.getTransaction().commit();
    }
    public List listar(String query,String[]parametros){
        Query q = em.createQuery(query);
        if(parametros!=null)
        for (int i = 0; i < parametros.length; i++) {
            q.setParameter(i, parametros[i]);
        }
       return q.getResultList();
    }
    public Object findById(Integer id,Class c){
        return em.find(c, id);
    }
        
}
