class TemperatureTask {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = 77;

        double f = (celsius * 9 / 5) + 32;
        double c = (fahrenheit - 32) * 5 / 9;

        System.out.println("Celsius to Fahrenheit: " + f);
        System.out.println("Fahrenheit to Celsius: " + c);
    }
}
