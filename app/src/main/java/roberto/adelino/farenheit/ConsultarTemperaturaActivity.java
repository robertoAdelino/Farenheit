package roberto.adelino.farenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class ConsultarTemperaturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_temperatura);

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

      // Intent intent= getIntent();
      // double temperatura = intent.getDoubleExtra(MainActivity.TEMPERATURA,0.0);
       TextView textViewCelsius=  findViewById(R.id.textViewCelsius);
       textViewCelsius.setText(decimalFormat.format(DadosApp.temperatura.getCelsius()));

        TextView textViewFahenheit=  findViewById(R.id.textViewFahrenheit);
        textViewFahenheit.setText(decimalFormat.format(DadosApp.temperatura.getFahrenheit()));


    }
}