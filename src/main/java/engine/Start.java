package engine;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Start {
    public ArrayList<Cities> start() {
        Random random = new Random();
        ArrayList<Cities> cities  = new ArrayList<>();
        ArrayList<Cities> finalorder = new ArrayList<>();


        for (int i = 0 ;i <=150 ;i++ ){
            int x = random.nextInt(151);
            int y = random.nextInt(151);

            cities.add(new Cities(x,y));

        }
        Cities firstCities = cities.get(0);
        cities.remove(firstCities);
        finalorder.add(firstCities);
        while (cities.size() >0) {
            ArrayList<Result> calc = new ArrayList<>();

            for (Cities x :cities) {
                Calculate.calculateLength(firstCities,x);

                calc.add(new Result(Calculate.calculateLength(firstCities,x),x));

            }

            calc.sort(Comparator.comparing((Result::getLength)));
            Cities  shortest = calc.get(0).getCities();
            finalorder.add(shortest);
            cities.remove(shortest);
            firstCities = shortest;


        }
        //System.out.println(finalorder);
        return finalorder;
    }
}