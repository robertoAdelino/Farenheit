package roberto.adelino.farenheit;

public class TemperaturaFahrenheit extends Temperatura{

    public TemperaturaFahrenheit(double valor){
        this.valor=valor;
    }

    @Override
    public double getFahrenheit() {

        return valor;
    }

    @Override
    public double getCelsius() {

        return (valor - 32.0) * 5.0 / 9.0 ;

    }
}
