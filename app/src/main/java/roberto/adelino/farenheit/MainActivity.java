package roberto.adelino.farenheit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static  final String TEMPERATURA = "TEMPERATURA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mostraTemperatura(View view){
        EditText editTextTemperatura= findViewById(R.id.editTextTemperatura);
        String s = editTextTemperatura.getText().toString();

    double temperatura ;

        try {
           temperatura= Double.parseDouble(s);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return;
        }



        Intent intent= new Intent(this, ConsultarTemperaturaActivity.class);
        intent.putExtra(TEMPERATURA,temperatura);
        startActivity(intent);
    }
}