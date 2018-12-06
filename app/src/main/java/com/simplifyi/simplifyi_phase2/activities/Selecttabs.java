package com.simplifyi.simplifyi_phase2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.simplifyi.simplifyi_phase2.R;


public class Selecttabs extends AppCompatActivity {
    String f = "hiii";
    String x = "";
    Button b1,b2,b3,b4,b5,b6;
    int x1=2,x2=2,x3=2,x4=2,x5=2,x6=2;
    int counterOfButtons=0;
    private Button btnContinue;
    Button toggle1,toggle2,toggle3,toggle4,toggle5,toggle6,toggle7,toggle8,toggle9,toggle10,toggle11,toggle12,toggle13,toggle14,toggle15,toggle16,toggle17,toggle18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecttabs);
        init();

        Spinner spin = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> adapt = new ArrayAdapter<String>(Selecttabs.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.languages));
        adapt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(adapt);
        b1=(Button)findViewById(R.id.button11);
        b2=(Button)findViewById(R.id.button12);
        b3=(Button)findViewById(R.id.button13);
        b4=(Button)findViewById(R.id.button14);
        b5=(Button)findViewById(R.id.button15);
        b6=(Button)findViewById(R.id.button16);

        toggle1=(Button)findViewById(R.id.one);
        toggle2=(Button)findViewById(R.id.two);
        toggle3=(Button)findViewById(R.id.three);
        toggle4=(Button)findViewById(R.id.four);
        toggle5=(Button)findViewById(R.id.five);
        toggle6=(Button)findViewById(R.id.six);
        toggle7=(Button)findViewById(R.id.seven);
        toggle8=(Button)findViewById(R.id.eight);
        toggle9=(Button)findViewById(R.id.nine);
        toggle10=(Button)findViewById(R.id.ten);
        toggle11=(Button)findViewById(R.id.eleven);
        toggle12=(Button)findViewById(R.id.twelve);
        toggle13=(Button)findViewById(R.id.thirteen);
        toggle14=(Button)findViewById(R.id.fourteen);
        toggle15=(Button)findViewById(R.id.fifteen);
        toggle16=(Button)findViewById(R.id.sixteen);
        toggle17=(Button)findViewById(R.id.Seventeen);
        toggle18=(Button)findViewById(R.id.Eighteen);

    }
    public void caller(View view) {
        Spinner spin = (Spinner) findViewById(R.id.spinner);
        int pos = spin.getSelectedItemPosition();
        if (pos == 0) {
            f = "English";
        }
        if (pos == 1) {
            f = "Kannada";
        }

        if (pos == 2) {
            f = "Malayalam";
        }
        if (pos == 3) {
            f = "Hindi";
        }
        if (pos == 4) {
            f = "Telugu";
        }
        x = x + " , " + f;
        display(x);

        if(counterOfButtons==0) {
            b1.setVisibility(View.VISIBLE);
            b1.setText(f);
            counterOfButtons++;
        }
        else if(counterOfButtons==1)
        {
            b2.setVisibility(View.VISIBLE);
            b2.setText(f);
            counterOfButtons++;
        }
        else if(counterOfButtons==2)
        {
            b3.setVisibility(View.VISIBLE);
            b3.setText(f);
            counterOfButtons++;
        }
        else if(counterOfButtons==3)
        {
            b4.setVisibility(View.VISIBLE);
            b4.setText(f);
            counterOfButtons++;
        }
        else if(counterOfButtons==4)
        {
            b5.setVisibility(View.VISIBLE);
            b5.setText(f);
            counterOfButtons++;
        }
        else if(counterOfButtons==5) {
            b6.setVisibility(View.VISIBLE);
            b6.setText(f);
            counterOfButtons++;
        }


    }
    public void colorchange1(View v)
    {

        b1=(Button)findViewById(R.id.button11);
        if(x1%2==0)
        {
            x1++;
            b1.setBackgroundResource(R.drawable.button_background_grey);
        }
        else
        {
            x1++;
            b1.setBackgroundResource(R.drawable.button_background_blue);
        }
    }
    public void colorchange2(View v)
    {

        b2=(Button)findViewById(R.id.button12);
        if(x2%2==0)
        {
            x2++;
            b2.setBackgroundResource(R.drawable.button_background_grey);
        }
        else
        {
            x2++;
            b2.setBackgroundResource(R.drawable.button_background_blue);
        }
    }public void colorchange3(View v)
    {

        b3=(Button)findViewById(R.id.button13);
        if(x3%2==0)
        {
            x3++;
            b3.setBackgroundResource(R.drawable.button_background_grey);
        }
        else
        {
            x3++;
            b3.setBackgroundResource(R.drawable.button_background_blue);
        }
    }public void colorchange4(View v)
    {

        b4=(Button)findViewById(R.id.button14);
        if(x4%2==0)
        {
            x4++;
            b4.setBackgroundResource(R.drawable.button_background_grey);
        }
        else
        {
            x4++;
            b4.setBackgroundResource(R.drawable.button_background_blue);
        }
    }public void colorchange5(View v)
    {

        b5=(Button)findViewById(R.id.button15);
        if(x5%2==0)
        {
            x5++;
            b5.setBackgroundResource(R.drawable.button_background_grey);
        }
        else
        {
            x5++;
            b5.setBackgroundResource(R.drawable.button_background_blue);
        }
    }public void colorchange6(View v)
    {

        b6=(Button)findViewById(R.id.button16);
        if(x6%2==0)
        {
            x6++;
            b6.setBackgroundResource(R.drawable.button_background_grey);
        }
        else
        {
            x6++;
            b6.setBackgroundResource(R.drawable.button_background_blue);
        }
    }
    public void xxxxx(View v)
    {
        Intent intent = new Intent(this, WaitingForOtp.class);
        startActivity(intent);
    }
    public void display(String f) {
        TextView x = (TextView) findViewById(R.id.textView);
        x.setText("the selected languages are:"+f);
    }


    private void init() {
        btnContinue = findViewById(R.id.btn_continue);

        btnContinue = (Button) findViewById(R.id.btn_continue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Selecttabs.this, DashBoardNavigationActivity.class);
                startActivity(intent);
            }
        });
    }


    int cond=2,cond1=2,cond2=2,cond3=2,cond4=2,cond5=2,cond6=2,cond7=2,cond8=2,cond9=2,cond10=2,cond11=2,cond12=2,cond13=2,cond14=2,cond15=2,cond16=2,cond17=2,cond18=2;
    public void changecolour1(View v)
    {
        if(cond%2==0) {
            cond++;
            toggle1.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond++;

            toggle1.setBackgroundResource(R.drawable.button_background_bluecorners);
        }
    }
    public void changecolour2(View v)
    {

        if(cond1%2==0) {
            cond1++;
            toggle2.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond1++;
            toggle2.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }

    public void changecolour3(View v)
    {

        if(cond2%2==0) {
            cond2++;
            toggle3.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond2++;
            toggle3.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour4(View v)
    {

        if(cond3%2==0) {
            cond3++;
            toggle4.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond3++;
            toggle4.setBackgroundResource(R.drawable.button_background_bluecorners);


        }
    }
    public void changecolour5(View v)
    {

        if(cond4%2==0) {
            cond4++;
            toggle5.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond4++;
            toggle5.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour6(View v)
    {

        if(cond5%2==0) {
            cond5++;
            toggle6.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond5++;
            toggle6.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour7(View v)
    {

        if(cond6%2==0) {
            cond6++;
            toggle7.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond6++;
            toggle7.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour8(View v)
    {

        if(cond7%2==0) {
            cond7++;
            toggle8.setBackgroundResource(R.drawable.button_background_grey);


        }
        else
        {
            cond7++;
            toggle8.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour9(View v)
    {

        if(cond8%2==0) {
            cond8++;
            toggle9.setBackgroundResource(R.drawable.button_background_grey);


        }
        else
        {
            cond8++;
            toggle9.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour10(View v)
    {

        if(cond9%2==0) {
            cond9++;
            toggle10.setBackgroundResource(R.drawable.button_background_grey);


        }
        else
        {
            cond9++;
            toggle10.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour11(View v)
    {

        if(cond10%2==0) {
            cond10++;
            toggle11.setBackgroundResource(R.drawable.button_background_grey);


        }
        else
        {
            cond10++;
            toggle11.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour12(View v)
    {

        if(cond11%2==0) {
            cond11++;
            toggle12.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond11++;
            toggle12.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour13(View v)
    {

        if(cond12%2==0) {
            cond12++;
            toggle13.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond12++;
            toggle13.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour14(View v)
    {

        if(cond13%2==0) {
            cond13++;
            toggle14.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond13++;
            toggle14.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour15(View v)
    {

        if(cond14%2==0) {
            cond14++;
            toggle15.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond14++;
            toggle15.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour16(View v)
    {

        if(cond15%2==0) {
            cond15++;
            toggle16.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond15++;
            toggle16.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour17(View v)
    {

        if(cond16%2==0) {
            cond16++;
            toggle17.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond16++;
            toggle17.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }
    public void changecolour18(View v)
    {

        if(cond17%2==0) {
            cond17++;
            toggle18.setBackgroundResource(R.drawable.button_background_grey);

        }
        else
        {
            cond17++;
            toggle18.setBackgroundResource(R.drawable.button_background_bluecorners);

        }
    }



}
