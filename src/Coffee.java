public class Coffee {
    // props
    private int temp;
    private int conc;

    //constructor (init)
    public Coffee(int t, int c) {
        temp = t;
        conc = c;
    }

    // getters
    public int getTemp() {
        return temp;
    }

    public int getConc() {
        return conc;
    }

    // toString()
    @Override
    public String toString() {
        return "Coffee{" +
                "temperature=" + temp +
                ", concentration=" + conc +
                '}';
    }
}
