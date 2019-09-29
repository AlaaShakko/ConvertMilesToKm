package location.a.convertmilestokm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonConvMilesToKm = (Button) findViewById(R.id.buttonConvMilesToKm);
        buttonConvMilesToKm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextMiles = (EditText) findViewById(R.id.Miles);
                EditText TextKm = (EditText) findViewById(R.id.Km);
                double vMiles = Double.valueOf(TextMiles.getText().toString());
                double vKm = vMiles / 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextKm.setText(formatVal.format(vKm));
            }
        });
        Button buttonConvKmToMiles = (Button) findViewById(R.id.buttonConvKmToMiles);
        buttonConvKmToMiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText TextKm = (EditText) findViewById(R.id.Km);
                EditText TextMiles = (EditText) findViewById(R.id.Miles);
                double vMiles = Double.valueOf(TextKm.getText().toString());
                double vKm = vMiles * 0.62137;
                DecimalFormat formatVal = new DecimalFormat("##.##");
                TextMiles.setText(formatVal.format(vKm));
            }
        });
    }
}
