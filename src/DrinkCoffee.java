public class DrinkCoffee {

    void drinkCoffee(Coffee coffee) throws TemperatureException, ConcentrationException {
        if(coffee.getTemp() > 65) {
            throw new TemperatureException(coffee.getTemp(), "Temperatura cafelei e prea mare!");
        } else {
            System.out.println("t: " + coffee.getTemp());
        }

        if(coffee.getConc() > 55) {
            throw new ConcentrationException(coffee.getConc(), "Concentratia cafelei e prea mare!");
        } else {
            System.out.println("c: " + coffee.getConc());
        }


    }
}
