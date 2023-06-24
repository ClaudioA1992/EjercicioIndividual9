package cl.awakelab.ejercicioindividual9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int imagen1 = R.drawable.baseline_collections_24;
    int imagen2 = R.drawable.baseline_data_thresholding_24;
    int imagen3 = R.drawable.baseline_description_24;
    int imagen4 = R.drawable.baseline_grid_view_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
    }

    private void initListeners() {
        ImageButton iButton1 = findViewById(R.id.imageButton1);
        ImageButton iButton2 = findViewById(R.id.imageButton2);
        ImageButton iButton3 = findViewById(R.id.imageButton3);
        ImageButton iButton4 = findViewById(R.id.imageButton4);

        iButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeToSecondActivity(imagen1);
            }
        });

        iButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeToSecondActivity(imagen2);
            }
        });

        iButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeToSecondActivity(imagen3);
            }
        });

        iButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                changeToSecondActivity(imagen4);
            }
        });

    }

    public void changeToSecondActivity(int imagen) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("imagen", imagen);
        startActivity(intent);
    }

}
