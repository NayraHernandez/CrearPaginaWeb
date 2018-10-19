package mxl.edu.itchetumal.dadm.crearpaginaweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
Button btnVerPagina;
EditText edturl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnVerPagina = (Button) findViewById(R.id.btnVer);
        edturl = (EditText) findViewById(R.id.edtDireccion);
    }
    public void ver (View v){
                Intent i = new Intent(getBaseContext(),Main2Activity.class);
                i.putExtra("direccion", edturl.getText().toString());
                startActivity(i);
    }
}
