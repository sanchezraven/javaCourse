package src.nested_classes.local_inner_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }
}

class Math {
    public void getResult() {
        class Dividing {

            int divident;
            int divider;

            public int getDivident() {
                return divident;
            }

            public void setDivident(int divident) {
                this.divident = divident;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int getQuotient () {
                return divident/divider;
            }

            public int getRemainder () {
                return divident%divider;
            }
        }

        Dividing dividing = new Dividing();
        dividing.setDivident(21);
        dividing.setDivider(4);
        System.out.println("divident = " + dividing.getDivident());
        System.out.println("divider = " + dividing.getDivider());
        System.out.println("quotient = " + dividing.getQuotient());
        System.out.println("remainder = " + dividing.getRemainder());
    }
}
