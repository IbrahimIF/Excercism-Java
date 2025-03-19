public class Lasagna {
    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        // Test expectedMinutesInOven
        System.out.println("Expected minutes in oven: " + lasagna.expectedMinutesInOven());

        // Test remainingMinutesInOven
        int minutesInOven = 30;
        System.out.println("Remaining minutes in oven: " + lasagna.remainingMinutesInOven(minutesInOven));

        // Test preparationTimeInMinutes
        int layers = 4;
        System.out.println("Preparation time in minutes: " + lasagna.preparationTimeInMinutes(layers));

        // Test totalTimeInMinutes
        System.out.println("Total time in minutes: " + lasagna.totalTimeInMinutes(layers, minutesInOven));
    }

    
    public int expectedMinutesInOven(){
       int expected = 40;
       return expected;
    }
       
    public int remainingMinutesInOven(int expected){
           int remaining = 25;
           return expectedMinutesInOven() - remaining;
    }
   
   
    public int preparationTimeInMinutes(int amount){
           int layerMin = 2;
           int preparation = layerMin * amount;
           return preparation;
       }
   
       public int totalTimeInMinutes(int amount, int minutes){
           int preparation = preparationTimeInMinutes(amount);
           int calculation = preparation + minutes;
           return calculation;
           
       }
   }