package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl() {}

    public MetierImpl(IDao dao) {
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
