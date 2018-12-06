package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.simplifyi.simplifyi_phase2.R;
import com.simplifyi.simplifyi_phase2.fragment.add;
import com.simplifyi.simplifyi_phase2.model.Anime;
import com.simplifyi.simplifyi_phase2.model.RvAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class PrimaryCategory extends AppCompatActivity {
    public EditText search;
    private String URL_JSON = "http://www.mocky.io/v2/5bf16a3e300000bb0656f274";
    private JsonArrayRequest ArrayRequest ;
    private RequestQueue requestQueue ;
    private List<Anime> lstAnime = new ArrayList<>();
    private RecyclerView myrv ;

    public static add newInstance() {
        return new add();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.primarycategory);
        init();
        myrv = findViewById(R.id.rv);
        jsoncall();

    }

    private void init() {
        search=(EditText)findViewById(R.id.txtsearch);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrimaryCategory.this, Searchbar.class);
                startActivity(intent);
            }
        });

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
                        //Toast.makeText(MainActivity.this,anime.toString(),Toast.LENGTH_SHORT).show();
                        lstAnime.add(anime);
                    }
                    catch (JSONException e) {
                        e.printStackTrace();
                    }
                }


                Toast.makeText(PrimaryCategory.this,"Size of Liste "+String.valueOf(lstAnime.size()),Toast.LENGTH_SHORT).show();
                Toast.makeText(PrimaryCategory.this,lstAnime.get(1).toString(),Toast.LENGTH_SHORT).show();

                setRvadapter(lstAnime);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });


        requestQueue = Volley.newRequestQueue(PrimaryCategory.this);
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
        Intent in=new Intent(this,SecondaryCategory.class);
        startActivity(in);
    }
    public void backpage(View view)
    {
        Intent intent = new Intent(PrimaryCategory.this, DashBoardNavigationActivity.class);
        startActivity(intent);

    }

}