package roberto.adelino.farenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    public static  final String TEMPERATURA = "TEMPERATURA";
    private Snackbar snackbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraTemperatura(View view) {
        EditText editTextTemperatura = findViewById(R.id.editTextTemperatura);
        String s = editTextTemperatura.getText().toString();

        double temperatura;
        try {
            temperatura = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            editTextTemperatura.setError("Introduza uma temperatura válida");
            editTextTemperatura.requestFocus();
            return;
        }

        RadioButton radioButtonCelcius = findViewById(R.id.radioButtonCelsius);
        RadioButton radioButtonFahrenheit = findViewById(R.id.radioButtonFahrenheit);

        boolean especificouUnidades;
        if (radioButtonCelcius.isChecked()) {
            DadosApp.temperatura = new TemperaturaCelsius(temperatura);
            especificouUnidades = true;
        } else if (radioButtonFahrenheit.isChecked()) {
            DadosApp.temperatura = new TemperaturaFahrenheit(temperatura);
            especificouUnidades = true;
        } else {
            especificouUnidades = false;
        }

        if (especificouUnidades) {
            if (snackbar != null) {
                snackbar.dismiss();
                snackbar = null;
            }
        } else {
            radioButtonCelcius.setError("Indique as unidades da temperatura");
            radioButtonFahrenheit.setError("Indique as unidades da temperatura");

            if (snackbar == null) {
                snackbar = Snackbar.make(radioButtonCelcius, "Indique as unidades da temperatura", Snackbar.LENGTH_INDEFINITE);
            }
            snackbar.show();

            return;
        }

        Intent intent = new Intent(this, ConsultarTemperaturaActivity.class);
        startActivity(intent);
    }
}