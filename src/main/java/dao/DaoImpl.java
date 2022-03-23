package dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl implements IDao {
    @Override
    public double getData(){
        double temp=Math.random()*40;
        System.out.println("version 1 ");
        return temp;
        }
}

