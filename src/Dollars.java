public class Dollars extends Converter {

    public String dollar(double quantity) {

        return Double.toString(quantity);
    }

    public String real(double quantity) {
        return Double.toString(quantity*5.3);
    }

    public String euro(double quantity) {
        return Double.toString(quantity*0.92);
    }

}