package com.example.new_demo_238;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rvMain);

        RequestQueue  requestQueue;
        requestQueue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonobjectRequest = new JsonObjectRequest(Request.Method.GET,
                "https://patoliyaitsolution.com/demo/Applist.txt",
                null,
                new com.android.volley.Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {



                        AdsAdapter adapter = new AdsAdapter(MainActivity.this,response);
                        LinearLayoutManager manager = new LinearLayoutManager(MainActivity.this);
                        recyclerView.setLayoutManager(manager);
                        recyclerView.setAdapter(adapter);


                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d("TTT", "onErrorResponse: error = "+error);
            }
        });

        requestQueue.add(jsonobjectRequest);


    }

}