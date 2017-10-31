package com.saneebsalam.www.my;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.saneebsalam.www.mylibrary.MyView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View v = new MyView(this);
        setContentView(v);

    }

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        textView= (TextView)findViewById(R.id.text);
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        Random r = new Random();
//
//        for (int i = 0; i < 15; i++) {
//            numbers.add(r.nextInt(7)+1);
//        }
//
//        double mean = CentralTendency.arithmeticMean(numbers).doubleValue();
//        double median = CentralTendency.median(numbers);
//        ArrayList<Integer> mode = CentralTendency.mode(numbers);
//
//        Collections.sort(numbers);
//
//        String res = String.format("Numbers:\n\n%s\nMean: %.1f\nMedian: %.1f\nMode: %s\n",
//                numbers, mean, median, mode);
//
//
//        textView.setText(res);
//    }
}
