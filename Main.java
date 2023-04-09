public class Main {

    public static void main(String[] args) {
        SmartKitchen myKitchen = new SmartKitchen();

        myKitchen.getDishWasher().setHasWorkToDo(true);
        myKitchen.getIceBox().setHasWorkToDo(true);
        myKitchen.getBrewMaster().setHasWorkToDo(true);

        myKitchen.getDishWasher().doDishes();
        myKitchen.getIceBox().orderFood();
        myKitchen.getBrewMaster().brewCofee();
    }

}
