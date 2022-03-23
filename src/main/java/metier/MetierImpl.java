package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(IDao dao){
        this.dao=dao;
    }

    @Override
    public double calcul() {
        double temp =dao.getData();
        double res =temp*10;
        return res;
    }


    public void setDao(IDao dao) {
        this.dao=dao;
    }
}
