 package edu.tectii.exameniiiparteuno;

 import android.os.Bundle;
 import android.support.v7.app.AppCompatActivity;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText edt, edt2, edt3, edt4, edt5;
     String indiceLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.btn);
        edt = (EditText)findViewById(R.id.edt);
        edt2 = (EditText)findViewById(R.id.edt2);
        edt3 = (EditText)findViewById(R.id.edt3);
        edt4 = (EditText)findViewById(R.id.edt4);
        edt5 = (EditText)findViewById(R.id.edt5);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarModificar();
            }
        });


        try {
            indiceLista = getIntent().getExtras().getString("id");
            edt.setText(getIntent().getExtras().getString("Cantidad"));
            edt2.setText(getIntent().getExtras().getString("Nombre"));
            edt3.setText(getIntent().getExtras().getString("Proveedor"));
            edt4.setText(getIntent().getExtras().getString("Existencia"));
            edt5.setText(getIntent().getExtras().getString("Tipo"));
        } catch (Exception e) { }


    }

}
