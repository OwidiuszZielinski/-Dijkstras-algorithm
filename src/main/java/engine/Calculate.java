package engine;

public class Calculate {

    // nie moge niestatycznej metody  z metody  statyczej
    //statyczne metody wywolujemy z klasy bezposrednio a nie z obiektu
    private static double square(int x){
        return x*x;

    }


    public static double calculateLength (Cities citiesOne ,Cities citiesTwo) {
        double result = Math.sqrt(square(citiesTwo.getX() - citiesOne.getX()) + square(citiesTwo.getY() - citiesOne.getY()));

    return result;
    }
}
