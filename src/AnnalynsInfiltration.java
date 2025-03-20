public class AnnalynsInfiltration {

    public static void main(String[] args) {
        // Define the state of the characters
        boolean knightIsAwake = true;
        boolean archerIsAwake = false;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = false;

        // Test the methods
        System.out.println("Can a fast attack be made: " + canFastAttack(knightIsAwake));
        System.out.println("Can the group be spied on: " + canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
        System.out.println("Can the prisoner be signaled: " + canSignalPrisoner(archerIsAwake, prisonerIsAwake));
        System.out.println("Can the prisoner be freed: " + canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
    }

    /**
     * Fast attack: Can be made if the knight is sleeping.
     */
    public static boolean canFastAttack(boolean knightIsAwake) {
        return !knightIsAwake;
    }

    /**
     * Spy: The group can be spied on if at least one of them is awake.
     */
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    /**
     * Signal prisoner: Can be signaled if the prisoner is awake and the archer is sleeping.
     */
    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    /**
     * Free prisoner: Can be freed if:
     * - The dog is present and the archer is sleeping, or
     * - The prisoner is awake and both the knight and archer are sleeping.
     */
    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake) || (prisonerIsAwake && !petDogIsPresent && !knightIsAwake && !archerIsAwake);
    }
}
