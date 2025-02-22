import dao.ClenOddiluDAO;
import dao.PredmetDAO;
import dao.VedouciDAO;
import entity.ClenOddiluEntity;
import entity.PredmetEntity;
import entity.VedouciEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import service.ClenOddiluService;
import service.PredmetService;
import service.VedouciService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ApplicationPU");
        EntityManager em = emf.createEntityManager();

        PredmetDAO predmetDAO = new PredmetService();
        ClenOddiluDAO clenOddiluDAO = new ClenOddiluService();
        VedouciDAO vedouciDAO = new VedouciService();

        VedouciEntity v1 = new VedouciEntity();
        v1.setJmeno("vaclav");
        v1.setPrijmeni("novak");
        v1.setHeslo("hesloheslo");
        v1.setLogin("jkl");
        v1.setEmail("novak@email.cz");

        vedouciDAO.save(em, v1);

        PredmetEntity p1 = new PredmetEntity();
        p1.setCena(20);
        p1.setNazevPredmetu("nuz");
        p1.setUrl("nuz.cz");

        predmetDAO.save(em, p1);
        predmetDAO.createExemplar(em, p1);
        predmetDAO.createExemplar(em, p1);


        // big number of columns in predmet table, takes a while
        List<PredmetEntity> drahePredmety = predmetDAO.findAllWithGreaterCost(em, 4000);

        for (PredmetEntity pe : drahePredmety) {
            System.out.println(pe.getNazevPredmetu() + " " + pe.getCena());
        }

        List<ClenOddiluEntity> clenOddiluEntities = clenOddiluDAO.getAllClenOddilu(em);
        for (ClenOddiluEntity co : clenOddiluEntities) {
            System.out.println(co.getJmeno() + " " + co.getPrijmeni());
        }

        em.close();
        emf.close();
    }
}
