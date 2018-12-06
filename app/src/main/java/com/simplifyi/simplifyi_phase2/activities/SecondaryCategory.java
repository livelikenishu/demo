package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.model.Anime;
import com.simplifyi.simplifyi_phase2.model.RvAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class SecondaryCategory extends AppCompatActivity {
    private String URL_JSON = "https://gist.githubusercontent.com/aws1994/f583d54e5af8e56173492d3f60dd5ebf/raw/c7796ba51d5a0d37fc756cf0fd14e54434c547bc/anime.json";
    private JsonArrayRequest ArrayRequest ;
    private RequestQueue requestQueue ;
    private List<Anime> lstAnime = new ArrayList<>();
    private RecyclerView myrv ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondarycategory);
        myrv = findViewById(R.id.rv);
        jsoncall();

    }

    public void jsoncall() {


        ArrayRequest = new JsonArrayRequest(URL_JSON, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                JSONObject jsonObject = null;


                for (int i = 0 ; i<response.length();i++) {

                    try {

                        jsonObject = response.getJSONObject(i);
                        Anime anime = new Anime();

                        anime.setName(jsonObject.getString("name"));

                        anime.setImage_url(jsonObject.getString("img"));

                        lstAnime.add(anime);
                    }
                    catch (JSONException e) {
                        e.printStackTrace();
                    }
                }


                Toast.makeText(SecondaryCategory.this,"Size of Liste "+String.valueOf(lstAnime.size()),Toast.LENGTH_SHORT).show();
                Toast.makeText(SecondaryCategory.this,lstAnime.get(1).toString(),Toast.LENGTH_SHORT).show();

                setRvadapter(lstAnime);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        requestQueue = Volley.newRequestQueue(SecondaryCategory.this);
        requestQueue.add(ArrayRequest);
    }



    public void setRvadapter (List<Anime> lst) {

        RvAdapter myAdapter = new RvAdapter(this,lst) ;
        myrv.setLayoutManager(new LinearLayoutManager(this));
        myrv.setAdapter(myAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);

    }
    public void back(View v)
    {
        Intent in=new Intent(this,UploadQuestion.class);
        startActivity(in);
    }
}