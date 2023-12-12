public class Main {
    public static void main(String[] args) {
        ActionCounter actionCounter = new ActionCounter();
        actionCounter.call(1);
        actionCounter.call(2);
        actionCounter.call(3);
        actionCounter.call(5);
        actionCounter.call(5);
        actionCounter.call(7);
        actionCounter.call(9);
        actionCounter.call(19);
        actionCounter.call(19);
        actionCounter.call(19);
        actionCounter.call(19);
        actionCounter.call(36);
        actionCounter.call(39);
        actionCounter.call(40);
        actionCounter.call(40);
        actionCounter.call(40);
        actionCounter.call(40);
        actionCounter.call(40);
        actionCounter.call(40);
        actionCounter.call(50);
        actionCounter.call(50);
        actionCounter.call(150);
        actionCounter.call(150);
        actionCounter.call(200);
        actionCounter.call(300);
        actionCounter.call(300);
        actionCounter.call(339);
        actionCounter.call(340);
        actionCounter.call(340);


        System.out.println(actionCounter.getActions(340));

    }
}