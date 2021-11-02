public class Octopus extends Animal {

    // implement an activity method that when given a number from 1-6
    // returns a string of an activity that it does
    // you can make it repeat certain activities that it does more frequently

    @Override
    public String move() {
        return "Swish Swosh";
    }

    public String activity(int x) {
        String activity;
        int activityNumber = 1;
        switch (activityNumber) {
            case 1: activity = "Mate";
            break;
            case 2: activity = "Eat";
            break;
            case 3: activity = "Sleep";
            break;
            case 4, 5: activity = "Jet Ink";
            break;
            default: activity = move();
        }
        return "Not a number";
    }

}
