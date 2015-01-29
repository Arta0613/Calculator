package rushlimit.com.calculator;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText input1, input2;
    Button plus, minus, multiply, divide, clear;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect views
        input1 = (EditText) findViewById(R.id.input1);
        input2 = (EditText) findViewById(R.id.input2);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        clear = (Button) findViewById(R.id.clear);

        result = (TextView) findViewById(R.id.result);

        // Handle input
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float oper1 = Float.parseFloat(input1.getText().toString());
                float oper2 = Float.parseFloat(input2.getText().toString());

                float opResult = oper1 + oper2;

                result.setText(Float.toString(opResult));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float oper1 = Float.parseFloat(input1.getText().toString());
                float oper2 = Float.parseFloat(input2.getText().toString());

                float opResult = oper1 - oper2;

                result.setText(Float.toString(opResult));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float oper1 = Float.parseFloat(input1.getText().toString());
                float oper2 = Float.parseFloat(input2.getText().toString());

                float opResult = oper1 * oper2;

                result.setText(Float.toString(opResult));
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float oper1 = Float.parseFloat(input1.getText().toString());
                float oper2 = Float.parseFloat(input2.getText().toString());

                if(oper2 != 0) {
                    float opResult = oper1 / oper2;
                    result.setText(Float.toString(opResult));
                } else {
                    Toast.makeText(MainActivity.this, "Please enter number other than 0 for input 2!",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input1.setText("");
                input2.setText("");
                result.setText(Float.toString(0.00f));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
