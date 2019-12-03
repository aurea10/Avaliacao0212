package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.endpoint = new Retrofit.Builder().baseUrl("http://172.16.58.22:9085/api/swagger-ui.html")
                .addConverterFactory(JacksonConverterFactory.create())
                .build()
                .create(ProjetoAPIEndpoint.class);


    }
}
