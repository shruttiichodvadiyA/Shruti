package com.example.bankdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    ImageButton callsbi,callhdfc,callkotak,callvarrachha,callbob,callyes,callindus,callicici,callaxis,callunion,  /*for call*/
            visitsbi,visithdfc,visitkotak,visitvarrachha,visitbob,visitindus,visiticici,visitaxis,visitunion,visityes, /*for visit*/
            sharesbi,sharehdfc,sharekotak,sharevarrachha,sharebob,shareyes,shareindus,shareicici,shareaxis,shareunion; /*for share*/

    ImageView imgsbi,imgbob,imghdfc,imgkotak,imgvarrachha,imgyes,imgindus,imgicici,imgaxis,imgunion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SBI();
        BOB();
        KOTAK();
        HDFC();
        YES();
        ICICI();
        VARRACHHA();
        UNION();
        AXIS();
        INDUSLND();
    }

    /* BANK INDUSLND */
    private void INDUSLND() {

        callindus=findViewById(R.id.callindus);
        visitindus=findViewById(R.id.visitindus);
        shareindus=findViewById(R.id.shareindus);
        imgindus=findViewById(R.id.imgindus);

        callindus.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1860 267 7777\n"));
            startActivity(intent);
        });

        visitindus.setOnClickListener(view -> {

            String url = "https://www.indusind.com/in/en/personal.html";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        shareindus.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.indusind.com/in/en/personal.html");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgindus.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.indusind.com/in/en/personal.html");
            startActivity(start);
        });
    }


    /*   BANK AXIS   */
    private void AXIS() {

        callaxis=findViewById(R.id.callaxis);
        visitaxis=findViewById(R.id.visitaxis);
        shareaxis=findViewById(R.id.shareaxis);
        imgaxis=findViewById(R.id.imgaxis);

        callaxis.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1860 419 5555\n"));
            startActivity(intent);
        });

        visitaxis.setOnClickListener(view -> {

            String url ="https://www.axisbank.com/ ";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        shareaxis.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.axisbank.com/");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgaxis.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.axisbank.com/");
            startActivity(start);
        });

    }

    /*   BANK UNION  */
    private void UNION() {

        callunion=findViewById(R.id.callunion);
        visitunion=findViewById(R.id.visitunion);
        shareunion=findViewById(R.id.shareunion);
        imgunion=findViewById(R.id.imgunion);

        callunion.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1800 22 2244\n"));
            startActivity(intent);
        });

        visitunion.setOnClickListener(view -> {

            String url = "https://www.unionbankofindia.co.in/english/home.aspx";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        shareunion.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.unionbankofindia.co.in/english/home.aspx");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgunion.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.unionbankofindia.co.in/english/home.aspx");
            startActivity(start);
        });
    }


    /*  BANK VARRACHHA  */
    private void VARRACHHA() {

        callvarrachha=findViewById(R.id.callvarrachha);
        visitvarrachha=findViewById(R.id.visitvarrachha);
        sharevarrachha=findViewById(R.id.sharevarrachha);
        imgvarrachha=findViewById(R.id.imgvarrachha);

        callvarrachha.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1800 258 7750\n"));
            startActivity(intent);
        });

        visitvarrachha.setOnClickListener(view -> {

            String url = "https://www.varachhabank.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        sharevarrachha.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.varachhabank.com/");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgvarrachha.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.varachhabank.com/");
            startActivity(start);
        });
    }

    /*  BANK ICICI  */

    private void ICICI() {

        callicici=findViewById(R.id.callicici);
        visiticici=findViewById(R.id.visiticici);
        shareicici=findViewById(R.id.shareicici);
        imgicici=findViewById(R.id.imgicici);

        callicici.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1800 1080\n"));
            startActivity(intent);
        });

        visiticici.setOnClickListener(view -> {

            String url = "https://www.icicibank.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        shareicici.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.icicibank.com/");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgicici.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.icicibank.com/");
            startActivity(start);
        });
    }

    /* YES BANK */

    private void YES() {

        callyes=findViewById(R.id.callyes);
        visityes=findViewById(R.id.visityes);
        shareyes=findViewById(R.id.shareyes);
        imgyes=findViewById(R.id.imgyes);

        callyes.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1800 1200\n"));
            startActivity(intent);
        });

        visityes.setOnClickListener(view -> {

            String url = "https://www.yesbank.in/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        shareyes.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.yesbank.in/ ");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgyes.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.yesbank.in/");
            startActivity(start);
        });
    }

    /* BANK HDFC */
    private void HDFC() {

        callhdfc=findViewById(R.id.callhdfc);
        visithdfc=findViewById(R.id.visithdfc);
        sharehdfc=findViewById(R.id.sharehdfc);
        imghdfc=findViewById(R.id.imghdfc);

        callhdfc.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1800 202 6161\n"));
            startActivity(intent);
        });

        visithdfc.setOnClickListener(view -> {

            String url = "https://www.hdfcbank.com/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        sharehdfc.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.hdfcbank.com/");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imghdfc.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.hdfcbank.com/");
            startActivity(start);
        });
    }

    /* KOTAK BANK */
    private void KOTAK() {

        callkotak=findViewById(R.id.callkotak);
        visitkotak=findViewById(R.id.visitkotak);
        sharekotak=findViewById(R.id.sharekotak);
        imgkotak=findViewById(R.id.imgkotak);

        callkotak.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1860 266 2666\n"));
            startActivity(intent);
        });

        visitkotak.setOnClickListener(view -> {

            String url = "https://www.kotak.com/en/home.html";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        sharekotak.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.kotak.com/en/home.html");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgkotak.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.kotak.com/en/home.html");
            startActivity(start);
        });
    }

    /* BANK OF BARODA */
    private void BOB() {

        callbob=findViewById(R.id.callbob);
        visitbob=findViewById(R.id.visitbob);
        sharebob=findViewById(R.id.sharebob);
        imgbob=findViewById(R.id.imgbob);

        callbob.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1800 102 4455\n"));
            startActivity(intent);
        });

        visitbob.setOnClickListener(view -> {

            String url = "https://www.bankofbaroda.in/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        sharebob.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.bankofbaroda.in/");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgbob.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.bankofbaroda.in/");
            startActivity(start);
        });
    }

    /* SBI */

    private void SBI() {

        callsbi=findViewById(R.id.callsbi);
        visitsbi=findViewById(R.id.visitsbi);
        sharesbi=findViewById(R.id.sharesbi);
        imgsbi=findViewById(R.id.imgsbi);

        callsbi.setOnClickListener(view -> {

            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:1800 1234\n"));
            startActivity(intent);
        });

        visitsbi.setOnClickListener(view -> {

            String url = "https://www.onlinesbi.sbi/";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        });

        sharesbi.setOnClickListener(view -> {

            Intent a=new Intent(Intent.ACTION_SEND);
            a.setType("text/plain");
            a.putExtra(Intent.EXTRA_SUBJECT,"Sharing URL");
            a.putExtra(Intent.EXTRA_TEXT,"https://www.onlinesbi.sbi/");
            startActivity(Intent.createChooser(a,"Share URL"));
        });

        imgsbi.setOnClickListener(view -> {
            Intent start=new Intent(MainActivity.this,webviewActivity.class);
            start.putExtra("url","https://www.onlinesbi.sbi/");
            startActivity(start);
        });
    }
}