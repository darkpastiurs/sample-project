package sv.com.sample.ejbs;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import sv.com.sample.entities.Sample;

@Stateless
public class SampleEJBImpl implements SampleEJB {

    @PersistenceContext(unitName = "SAMPLE-PU")
    private EntityManager em;

    @Override
    public List<Sample> findAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Sample> cq = cb.createQuery(Sample.class);
        Root<Sample> root = cq.from(Sample.class);
        cq.select(root);
        TypedQuery<Sample> query = em.createQuery(cq);
        return query.getResultList();
    }

}
