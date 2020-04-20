public class Euros extends Converter {

    public String dollar(double quantity) {

        return Double.toString(quantity*5.77);
    }

    public String real(double quantity) {
        return Double.toString(quantity*1.09);
    }

    public String euro(double quantity) {
        return Double.toString(quantity);
    }

}