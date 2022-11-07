public class Main {
    static double celsiuToFarenheit(double temp){
        return (temp * 1.8) + 32;
    }

    static double celsiuToKelvin(double temp){
        return temp+273.15;
    }

    static double fahreToCelsiu(double temp){
        return (temp -31) * 1.8;
    }

    static  double fahreToKelvin(double temp){
        return (temp + 459.67) * 5/9;
    }

    static double kelvinToCelsjusz(double temp){
        return temp - 273.15;
    }
    static double kelvinToFahre(double kelvin){
        return kelvin * (9.0 / 5.0) - 459.67;
    }
    public static void main(String[] args) {
        System.out.println(celsiuToKelvin(25.0));
        System.out.println(celsiuToFarenheit(25.0));
        System.out.println(fahreToCelsiu(100.0));
        System.out.println(fahreToKelvin(100.0));
        System.out.println(kelvinToCelsjusz(0));
        System.out.println(kelvinToFahre(0));
    }
}