package Tutorial;

public class Main {
    public static void main(String[] args) {
        SandWich sw = new SandWich();
        sw.setMainIngredient("tuna");
        sw.setBreadType("wheat");
        sw.setCost(4.99);

        System.out.println(sw.getMainIngredient());
        System.out.println(sw.getBreadType());
        System.out.println(sw.getCost());
        System.out.println("////////////////////////////////////////");
        Lease l = new Lease();
        l.addPetFee();
        System.out.println("////////////////////////////////////////");
        FitnessTracker ft = new FitnessTracker();
        ft.setMinutesPent(5);
        System.out.println(ft.getExerciseName());
        System.out.println(ft.getMinutesPent());
        System.out.println(ft.getDate());

    }
}
