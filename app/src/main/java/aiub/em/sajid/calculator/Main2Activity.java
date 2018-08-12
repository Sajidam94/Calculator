package aiub.em.sajid.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main2Activity extends AppCompatActivity {
    String line = null;
    List<String> lines = new ArrayList<String>();

    private String set,record;
    TextView textView;
    Button btnBck,btnClr;
    String write;



    public void readFile(){
        try {
            String log;
            FileInputStream fileInputStream=openFileInput("calcLog");
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream);

            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
            StringBuffer stringBuffer=new StringBuffer();
            while ((log=bufferedReader.readLine())!=null) {
                stringBuffer.append(log+"\n");
            }set=stringBuffer.toString();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        textView.setText(set);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);




        textView=(TextView) findViewById(R.id.tv_log);
        textView.setMovementMethod(new ScrollingMovementMethod());


        readFile();







    }



}
