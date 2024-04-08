package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("metier")
public class MetierImpl implements IMetier {
    private IDao dao;

    //public MetierImpl() {}

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        double rest = data * 54;
        return rest;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
