package service;

public class ConvertService {

    public double convertToUSA(double vnd) {
        return vnd / 23000;
    }

    public double convertToVND(double usd) {
        return usd * 23000;
    }
}
