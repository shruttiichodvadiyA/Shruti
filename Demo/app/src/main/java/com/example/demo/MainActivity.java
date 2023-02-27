package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("TAG", "***************  ");
        Log.e("TAG", "student1:-");
        Log.e("TAG", "***************  ");
        studentDetails details1 = new studentDetails();
        details1.setId(1);
        details1.setName("shruti");
        details1.setPr(89.5F);

        int id1 = details1.getId();
        Log.e("TAG", "id: " + id1);
        String name1 = details1.getName();
        Log.e("TAG", "name: " + name1);
        float pr1 = details1.getPr();
        Log.e("TAG", "pr: " + pr1);


        Log.e("TAG", "***************  ");
        Log.e("TAG", "student2:-");
        Log.e("TAG", "***************  ");
        studentDetails details2 = new studentDetails();
        details2.setId(2);
        details2.setName("vensi");
        details2.setPr(88.56F);

        int id2 = details2.getId();
        Log.e("TAG", "id: " + id2);
        String name2 = details2.getName();
        Log.e("TAG", "name: " + name2);
        float pr2 = details2.getPr();
        Log.e("TAG", "pr: " + pr2);

        Log.e("TAG", "***************  ");
        Log.e("TAG", "student3:-");
        Log.e("TAG", "***************  ");
        studentDetails details3 = new studentDetails();
        details3.setId(3);
        details3.setName("him..");
        details3.setPr(50.60F);

        int id3 = details3.getId();
        Log.e("TAG", "id: " + id3);
        String name3 = details3.getName();
        Log.e("TAG", "name: " + name3);
        float pr3 = details3.getPr();
        Log.e("TAG", "pr: " + pr3);


        Log.e("TAG", "***************  ");
        Log.e("TAG", "student4:-");
        Log.e("TAG", "***************  ");
        studentDetails details4 = new studentDetails();
        details4.setId(4);
        details4.setName("sanjay");
        details4.setPr(60.00F);

        int id4 = details4.getId();
        Log.e("TAG", "id: " + id4);
        String name4 = details4.getName();
        Log.e("TAG", "name: " + name4);
        float pr4 = details4.getPr();
        Log.e("TAG", "pr: " + pr4);

        Log.e("TAG", "***************  ");
        Log.e("TAG", "student5:-");
        Log.e("TAG", "***************  ");
        studentDetails details5 = new studentDetails();
        details5.setId(5);
        details5.setName("purvish");
        details5.setPr(40.00F);

        int id5 = details5.getId();
        Log.e("TAG", "id: " + id5);
        String name5 = details5.getName();
        Log.e("TAG", "name: " + name5);
        float pr5 = details5.getPr();
        Log.e("TAG", "pr: " + pr5);

        Log.e("TAG", "***************  ");
        Log.e("TAG", "student6:-");
        Log.e("TAG", "***************  ");
        studentDetails details6 = new studentDetails();
        details6.setId(5);
        details6.setName("dixit");
        details6.setPr(70.65F);

        int id6 = details6.getId();
        Log.e("TAG", "id: " + id6);
        String name6 = details6.getName();
        Log.e("TAG", "name: " + name6);
        float pr6 = details6.getPr();
        Log.e("TAG", "pr: " + pr6);

        Log.e("TAG", "***************  ");
        Log.e("TAG", "student7:-");
        Log.e("TAG", "***************  ");
        studentDetails details7 = new studentDetails();
        details7.setId(5);
        details7.setName("ridhhi");
        details7.setPr(90.56F);

        int id7 = details7.getId();
        Log.e("TAG", "id: " + id7);
        String name7 = details7.getName();
        Log.e("TAG", "name: " + name7);
        float pr7 = details7.getPr();
        Log.e("TAG", "pr: " + pr7);

        Log.e("TAG", "***************  ");
        Log.e("TAG", "student8:-");
        Log.e("TAG", "***************  ");
        studentDetails details8 = new studentDetails();
        details8.setId(5);
        details8.setName("ridhhi");
        details8.setPr(90.56F);

        int id8 = details8.getId();
        Log.e("TAG", "id: " + id8);
        String name8 = details8.getName();
        Log.e("TAG", "name: " + name8);
        float pr8 = details8.getPr();
        Log.e("TAG", "pr: " + pr8);


        Log.e("TAG", "***************  ");
        Log.e("TAG", "student9:-");
        Log.e("TAG", "***************  ");
        studentDetails details9 = new studentDetails();
        details9.setId(5);
        details9.setName("piyush");
        details9.setPr(89.00F);

        int id9 = details9.getId();
        Log.e("TAG", "id: " + id9);
        String name9 = details9.getName();
        Log.e("TAG", "name: " + name9);
        float pr9 = details9.getPr();
        Log.e("TAG", "pr: " + pr9);

        Log.e("TAG", "***************  ");
        Log.e("TAG", "student10:-");
        Log.e("TAG", "***************  ");

        studentDetails details10 = new studentDetails();
        details10.setId(5);
        details10.setName("nandini");
        details10.setPr(91.67F);

        int id10 = details10.getId();
        Log.e("TAG", "id: " + id10);
        String name10 = details10.getName();
        Log.e("TAG", "name: " + name10);
        float pr10 = details10.getPr();
        Log.e("TAG", "pr: " + pr10);


        Log.e("TAG", "                  ");
        Log.e("TAG", "                  ");
        Log.e("TAG", "                  ");
        Log.e("TAG", "                  ");
        Log.e("TAG", "     product1: ");
        productDetails productDetails1 = new productDetails();
        productDetails1.setProductname("pc");
        productDetails1.setProductprize(40000);

        String productname1 = productDetails1.getProductname();
        Log.e("TAG", "productname: " + productname1);
        int productprize1 = productDetails1.getProductprize();
        Log.e("TAG", "productprize: " + productprize1);

        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product2: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails2 = new productDetails();
        productdetails2.setProductname("laptop");
        productdetails2.setProductprize(60000);

        String productname2 = productdetails2.getProductname();
        Log.e("TAG", "productname: " + productname2);
        int productprize2 = productdetails2.getProductprize();
        Log.e("TAG", "productprize: " + productprize2);

        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product3: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails3 = new productDetails();
        productdetails3.setProductname("harddisk");
        productdetails3.setProductprize(15000);

        String productname3 = productdetails3.getProductname();
        Log.e("TAG", "productname: " + productname3);
        int productprize3 = productdetails3.getProductprize();
        Log.e("TAG", "productprize: " + productprize3);


        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product4: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails4 = new productDetails();
        productdetails4.setProductname("mouse");
        productdetails4.setProductprize(1000);

        String productname4 = productdetails4.getProductname();
        Log.e("TAG", "productname: " + productname4);
        int productprize4 = productdetails4.getProductprize();
        Log.e("TAG", "productprize: " + productprize4);


        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product5: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails5 = new productDetails();
        productdetails5.setProductname("cabel");
        productdetails5.setProductprize(500);

        String productname5 = productdetails5.getProductname();
        Log.e("TAG", "productname: " + productname5);
        int productprize5 = productdetails5.getProductprize();
        Log.e("TAG", "productprize: " + productprize5);


        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product6: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails6 = new productDetails();
        productdetails6.setProductname("ram");
        productdetails6.setProductprize(1800);

        String productname6 = productdetails6.getProductname();
        Log.e("TAG", "productname: " + productname6);
        int productprize6 = productdetails6.getProductprize();
        Log.e("TAG", "productprize: " + productprize6);

        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product7: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails7 = new productDetails();
        productdetails7.setProductname("ssd");
        productdetails7.setProductprize(20000);

        String productname7 = productdetails7.getProductname();
        Log.e("TAG", "productname: " + productname7);
        int productprize7 = productdetails7.getProductprize();
        Log.e("TAG", "productprize: " + productprize7);

        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product8: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails8 = new productDetails();
        productdetails8.setProductname("adapter");
        productdetails8.setProductprize(30000);

        String productname8 = productdetails8.getProductname();
        Log.e("TAG", "productname: " + productname8);
        int productprize8 = productdetails8.getProductprize();
        Log.e("TAG", "productprize: " + productprize8);


        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product9: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails9 = new productDetails();
        productdetails9.setProductname("led");
        productdetails9.setProductprize(10000);

        String productname9 = productdetails9.getProductname();
        Log.e("TAG", "productname: " + productname9);
        int productprize9 = productdetails9.getProductprize();
        Log.e("TAG", "productprize: " + productprize9);

        Log.e("TAG", "........*************...........");
        Log.e("TAG", "        product10: ");
        Log.e("TAG", "........*************...........");
        productDetails productdetails10 = new productDetails();
        productdetails10.setProductname("lcd");
        productdetails10.setProductprize(70000);

        String productname10 = productdetails10.getProductname();
        Log.e("TAG", "productname: " + productname10);
        int productprize10 = productdetails10.getProductprize();
        Log.e("TAG", "productprize: " + productprize10);




    }

}