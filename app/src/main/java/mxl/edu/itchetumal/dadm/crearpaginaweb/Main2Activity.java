package mxl.edu.itchetumal.dadm.crearpaginaweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

       WebView web1=(WebView)findViewById(R.id.web1);

        Bundle bundle = getIntent().getExtras();
        String dato=bundle.getString("direccion");
        web1.loadUrl("http://" + dato);

    }

    public void finalizar(View v) {
        finish();
    }
}