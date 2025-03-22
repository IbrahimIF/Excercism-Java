public class CarsAssemble {

    public static void main(String[] args) {

        int speed = 6;

        CarsAssemble carsAssemble = new CarsAssemble();

        System.out.println("Production rate per hour: " + carsAssemble.productionRatePerHour(speed));
        System.out.println("Number of working items produced per minute: " + carsAssemble.workingItemsPerMinute(speed));
    }

    /*
     * The assembly line's speed can range from 0 (off) to 10 (maximum).
     *
     * At its lowest speed (1), 221 cars are produced each hour. The production increases linearly with the speed.
     * So with the speed set to 4, it should produce 4 * 221 = 884 cars per hour. However, higher speeds increase
     * the likelihood that faulty cars are produced, which then have to be discarded. The following table shows
     * how speed influences the success rate:
     *
     * 1 to 4: 100% success rate.
     * 5 to 8: 90% success rate.
     * 9: 80% success rate.
     * 10: 7

     */
    
    public double productionRatePerHour(int speed) {
        int cars = 221;
        double production;
        if (speed <= 4) {
            production = speed * cars;
            return production;
        } else if ( speed <= 8 ){
            production = (speed * cars) * 0.9;
            return production;
        } else if ( speed == 9 ){
            production = (speed * cars) * 0.8;
            return production;
        } else if ( speed == 10 ){
            production = (speed * cars) * 0.77;
            return production;
        } else {
            production = 0;
            return production;
        }

    }

    public int workingItemsPerMinute(int speed) {
        double carsPerMinute = 3.68333333333;
        double production;
        if (speed <= 4) {
            production = speed * carsPerMinute;
            int myInt = (int) production;
            return myInt;
        } else if ( speed <= 8 ){
            production = (speed * carsPerMinute) * 0.9;
            int myInt = (int) production;
            return myInt;
        } else if ( speed == 9 ){
            production = (speed * carsPerMinute) * 0.8;
            int myInt = (int) production;
            return myInt;
        } else if ( speed == 10 ){
            production = (speed * carsPerMinute) * 0.77;
            int myInt = (int) production;
            return myInt;
        } else {
            production = 0;
            int myInt = (int) production;
            return myInt;
        }
    }

}
