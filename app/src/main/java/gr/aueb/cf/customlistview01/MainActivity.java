package gr.aueb.cf.customlistview01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        String[] friends = {
                "Panagiotis",
                "Thanasis",
                "Andreas",
                "Orestis",
                "Eleni",
                "Anna",
                "Panagiotis2",
                "Thanasis2",
                "Andreas2",
                "Orestis2",
                "Eleni2",
                "Anna2",
                "Panagiotis3",
                "Thanasis3",
                "Andreas3",
                "Orestis3",
                "Eleni3",
                "Anna3",
                "Panagiotis4",
                "Thanasis4",
                "Andreas4",
                "Orestis4",
                "Eleni4",
                "Anna4"
        };

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(
                this,
                R.layout.item_view,
                R.id.myItemTV,
                friends
        );

        listView.setAdapter(arrayAdapter);
    }
}