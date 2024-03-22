package ma.enset.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    Calculate calculate = new Calculate();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        Button button3 = findViewById(R.id.button3);
        Button buttonDiv = findViewById(R.id.buttonDiv);
        Button button4 = findViewById(R.id.button4);
        Button button5 = findViewById(R.id.button5);
        Button button6 = findViewById(R.id.button6);
        Button buttonX = findViewById(R.id.buttonX);
        Button button7 = findViewById(R.id.button7);
        Button button8 = findViewById(R.id.button8);
        Button button9 = findViewById(R.id.button9);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button button0 = findViewById(R.id.button0);
        Button buttonEqual = findViewById(R.id.buttonEqual);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonClear = findViewById(R.id.buttonClear);
        ListView listView = findViewById(R.id.listResult);
        TextView textView = findViewById(R.id.editTextNumber);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        listView.setAdapter(stringArrayAdapter);
        List<String> stringNumbers = new ArrayList<>();
        button1.setOnClickListener(v -> textView.append("1"));
        button2.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("2");
        });
        button3.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("3");
        });
        button4.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("4");
        });
        button5.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("5");
        });
        button6.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("6");
        });
        button7.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("7");
        });
        button8.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("8");
        });
        button9.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("9");
        });
        button0.setOnClickListener(v -> {
            textView.clearComposingText();
            textView.append("0");
        });
        buttonPlus.setOnClickListener(v -> {
            stringNumbers.add(textView.getText().toString());
            stringNumbers.add("+");
            textView.setText("");
        });
        buttonX.setOnClickListener(v -> {
            stringNumbers.add(textView.getText().toString());
            stringNumbers.add("x");
            textView.setText("");
        });
        buttonDiv.setOnClickListener(v -> {
            stringNumbers.add(textView.getText().toString());
            stringNumbers.add("/");
            textView.setText("");
        });
        buttonMinus.setOnClickListener(v -> {
            stringNumbers.add(textView.getText().toString());
            stringNumbers.add("-");
            textView.setText("");
        });
        buttonEqual.setOnClickListener(v->{
            stringNumbers.add(textView.getText().toString());

            String result=String.valueOf(calculate.calculer(stringNumbers));
            stringArrayAdapter.add(stringNumbers.toString() +" = "+ result);
            stringArrayAdapter.notifyDataSetChanged();
            stringNumbers.clear();
            textView.setText(result);
        });
        buttonClear.setOnClickListener(v->{
            stringNumbers.clear();
            textView.setText("");
        });


    }

}
