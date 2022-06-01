package Task_seven;

public class Airplane {
    public static class Wing{
        private Double wingWeight;

        public Wing(Double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public void showWing(){
            System.out.println(wingWeight);
        }
    }
}
