package engine;

public class Result {


    public Result(double length, Cities cities) {
        this.length = length;
        this.cities = cities;
    }

    public double getLength() {
        return length;
    }

    double length;

    public Cities getCities() {
        return cities;
    }

    Cities cities;


}
