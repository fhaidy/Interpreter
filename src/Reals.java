public class Reals extends Converter {

    public String dollar(double quantity) {

        return Double.toString(quantity*0.19);
    }

    public String real(double quantity) {
        return Double.toString(quantity);
    }

    public String euro(double quantity) {
        return Double.toString(quantity*0.17);
    }

}