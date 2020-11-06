package roberto.adelino.farenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConsultarTemperaturaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultar_temperatura);

       Intent intent= getIntent();
       double temperatura = intent.getDoubleExtra(MainActivity.TEMPERATURA,0.0);
       TextView textViewCelsius=  findViewById(R.id.textViewCelsius);

       textViewCelsius.setText(String.valueOf(temperatura));
    }
}