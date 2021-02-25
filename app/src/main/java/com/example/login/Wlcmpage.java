package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spannable;
import android.text.util.Linkify;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.widget.EditText;
import android.widget.Button;

import static android.R.attr.textSize;

public class Wlcmpage extends AppCompatActivity {

    TextView mail,website,phone;
    ImageView imageView1,imageView2, imageView3, imageView4;

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);



        website = (TextView)findViewById(R.id.website);
        website.setText("Website - " + "https://saketlakhotia17.github.io");
        Linkify.addLinks(website,Linkify.WEB_URLS);


        phone = (TextView)findViewById(R.id.phone);
        phone.setText("Mobile   - " + "9403192635");
        Linkify.addLinks(phone,Linkify.PHONE_NUMBERS);

        mail = (TextView)findViewById(R.id.mail);
        mail.setText("Gmail    - " + "saket.lakhotia17@gmail.com");
        Linkify.addLinks(mail,Linkify.EMAIL_ADDRESSES);

        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://github.com/saketlakhotia17"));
                startActivity(intent);
            }
        });

        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://instagram.com/saketlakhotia17"));
                startActivity(intent);
            }
        });

        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.linkedin.com/in/saket-lakhotia-428a57168/"));
                startActivity(intent);
            }
        });

        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.facebook.com/saketlakhotia17/"));
                startActivity(intent);
            }
        });





        //LinearLayout llMain = findViewById(R.id.rlMain);
        //TextView textView = new TextView(this);
        //textView.setTextAppearance(this, textSize);
        //textView.setTextAppearance(this, android.R.attr.textStyle);
        //textView.setText("Hey Saket !!!");
        //LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
        //        LinearLayout.LayoutParams.MATCH_PARENT,
        //        LinearLayout.LayoutParams.MATCH_PARENT
        //);
        //textView.setLayoutParams(params);
        //llMain.addView(textView);

    }
}
