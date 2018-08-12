package aiub.em.sajid.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button btnClear, btnBack, btnLog;
    TextView tvProcessor, tvResult;
    Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero;
    Button btnPlus, btnMinus, btnMultiply, btnDivide, btnDecimal, btnBracket, btnEqual;
    String processor, writeLog, resultLog;
    Boolean isSmallBracketOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        isSmallBracketOpen = false;

        btnBracket = (Button) findViewById(R.id.btn_small_bracket);

        btnClear = (Button) findViewById(R.id.btn_delete);
        tvProcessor = (TextView) findViewById(R.id.tv_process);
        tvResult = (TextView) findViewById(R.id.tv_result);

        /*******************************************************
         * Number Button Initiate
         *******************************************************/

        btnOne = (Button) findViewById(R.id.btn_one);
        btnTwo = (Button) findViewById(R.id.btn_two);
        btnThree = (Button) findViewById(R.id.btn_three);
        btnFour = (Button) findViewById(R.id.btn_four);
        btnFive = (Button) findViewById(R.id.btn_five);
        btnSix = (Button) findViewById(R.id.btn_six);
        btnSeven = (Button) findViewById(R.id.btn_seven);
        btnEight = (Button) findViewById(R.id.btn_eight);
        btnNine = (Button) findViewById(R.id.btn_nine);
        btnZero = (Button) findViewById(R.id.btn_zero);


        /*****************************************************
         * Functional Button Initiate
         *****************************************************/

        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnMultiply = (Button) findViewById(R.id.btn_multiply);
        btnDivide = (Button) findViewById(R.id.btn_divide);


        btnDecimal = (Button) findViewById(R.id.btn_dot);
        btnBack = (Button) findViewById(R.id.btn_back);
        btnBracket = (Button) findViewById(R.id.btn_small_bracket);


        btnEqual = (Button) findViewById(R.id.btn_equal);


        btnLog = (Button) findViewById(R.id.btn_log);


        /******************************************************
         * Clear Button On-Click
         */

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvProcessor.setText("");
                tvResult.setText("");
            }
        });


        /*******************************************************
         * Number Button On-Click
         *******************************************************/


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "1");
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "3");
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "4");
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "5");
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "6");
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "7");
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "8");
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "9");
            }
        });

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "0");
            }
        });


        /*****************************************************
         * Functional Button Initiate
         *****************************************************/

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "-");
            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "X");
            }
        });


        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + "/");
            }
        });


        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                tvProcessor.setText(processor + ".");
            }
        });


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                if (processor.length() > 0) {
                    processor = processor.substring(0, processor.length() - 1);
                    tvProcessor.setText(processor);

                }
            }
        });


        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isSmallBracketOpen) {

                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + ")");
                    isSmallBracketOpen = false;

                } else {
                    processor = tvProcessor.getText().toString();
                    tvProcessor.setText(processor + "(");
                    isSmallBracketOpen = true;
                }
            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                processor = tvProcessor.getText().toString();
                if (processor != "") {

                    processor = processor.replaceAll("X", "*");

                    Context rhino = Context.enter();
                    rhino.setOptimizationLevel(-1);
                    String result = "";

                    try {

                        Scriptable scope = rhino.initStandardObjects();
                        result = rhino.evaluateString(scope, processor, "JavaScript", 1, null).toString();

                    } catch (Exception e) {
                        result = "error";
                    }
                    tvResult.setText(result);
                } else {

                    tvResult.setText("Empty");
                    processor=tvResult.getText().toString();
                }
                resultLog = tvResult.getText().toString();
                Log(processor, resultLog);


            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                startActivity(intent);
            }
        });


    }

    private void Log(String processor, String resultLog) {

        //System.out.println(processor);
        if (processor != "Empty") {

            writeLog = processor + "=" + resultLog + "\n";
            //System.out.println(processor);

            String file_name = "calcLog";

            try {
                FileOutputStream fileOutputStream = openFileOutput(file_name, MODE_APPEND);
                fileOutputStream.write(writeLog.getBytes());
                fileOutputStream.close();
                Toast.makeText(getApplicationContext(), "Log Saved", Toast.LENGTH_LONG).show();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            Toast.makeText(getApplicationContext(), "Log is not Saved", Toast.LENGTH_LONG).show();
        }
    }


}
