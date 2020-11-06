package roberto.adelino.farenheit;

public class TemperaturaCelsius extends  Temperatura {

    public TemperaturaCelsius (double valor){
        this.valor = valor;
    }
    @Override
    public double getFahrenheit() {
        return (valor*1.8) + 32.0 ;
    }

    @Override
    public double getCelsius() {
        return valor;
    }
}
