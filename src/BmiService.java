public class BmiService {
        public double calculate(double weight, double height) {

        double imp = weight / (height * height);
        return imp;
    }
}
