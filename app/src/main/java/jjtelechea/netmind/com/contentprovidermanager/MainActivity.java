package jjtelechea.netmind.com.contentprovidermanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = MainActivity.class.getSimpleName(); //Para debugar

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnQueryDb = (Button) findViewById(R.id.btnQueryDB);
        btnQueryDb.setOnClickListener(this);
        final Button btnAddDb = (Button) findViewById(R.id.btnAddDB);
        btnQueryDb.setOnClickListener(this);
        final Button btnDeleteDb = (Button) findViewById(R.id.btnDeleteDB);
        btnQueryDb.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.btnQueryDB:

                break;

            case R.id.btnAddDB:

                break;

            case R.id.btnDeleteDB:

                break;
        }
    }
}
