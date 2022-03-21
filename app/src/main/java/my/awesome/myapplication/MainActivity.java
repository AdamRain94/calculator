package my.awesome.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {

    private EditText input;
    private TextView answer;
    private final DecimalFormat decimalFormat = new DecimalFormat("#.############");
    private String one = "";
    private String two = "";
    private int count = 0;
    private Button equals;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        input.setShowSoftInputOnFocus(false);
        input.setCursorVisible(false);
        answer = findViewById(R.id.answer);
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        Button number_1 = findViewById(R.id.number_1);
        Button number_2 = findViewById(R.id.number_2);
        Button number_3 = findViewById(R.id.number_3);
        Button number_4 = findViewById(R.id.number_4);
        Button number_5 = findViewById(R.id.number_5);
        Button number_6 = findViewById(R.id.number_6);
        Button number_7 = findViewById(R.id.number_7);
        Button number_8 = findViewById(R.id.number_8);
        Button number_9 = findViewById(R.id.number_9);
        Button number_0 = findViewById(R.id.number_0);
        Button minus = findViewById(R.id.minus);
        Button plus = findViewById(R.id.plus);
        Button divide = findViewById(R.id.divide);
        Button multiply = findViewById(R.id.multiply);
        equals = findViewById(R.id.equals);
        Button clear = findViewById(R.id.clear);
        Button erase = findViewById(R.id.erase);
        Button dot = findViewById(R.id.dot);


        clear.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.setText("");
                answer.setText("");
                v.vibrate(20);
                buttonUnlock();
                getAnswer();
                clear.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                clear.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        erase.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                Editable text = input.getText();
                if (text.length() > 0) {
                    text.delete(text.length() - 1, text.length());
                    input.setText(text);
                }
                if (!answer.getText().toString().equals("Деление на 0!")) {
                    buttonUnlock();
                }
                v.vibrate(20);
                getAnswer();
                erase.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                erase.setBackgroundColor(Color.BLACK);
            }
            return false;
        });


        number_0.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("0");
                v.vibrate(20);
                getAnswer();
                number_0.setBackgroundColor(Color.argb(150, 150, 150, 150));

            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_0.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_1.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("1");
                v.vibrate(20);
                getAnswer();
                number_1.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_1.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_2.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("2");
                v.vibrate(20);
                getAnswer();
                number_2.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_2.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_3.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("3");
                v.vibrate(20);
                getAnswer();
                number_3.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_3.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_4.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("4");
                v.vibrate(20);
                getAnswer();
                number_4.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_4.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_5.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("5");
                v.vibrate(20);
                getAnswer();
                number_5.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_5.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_6.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("6");
                v.vibrate(20);
                getAnswer();
                number_6.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_6.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_7.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("7");
                v.vibrate(20);
                getAnswer();
                number_7.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_7.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_8.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("8");
                v.vibrate(20);
                getAnswer();
                number_8.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_8.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        number_9.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                input.append("9");
                v.vibrate(20);
                getAnswer();
                number_9.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                number_9.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        minus.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                if (input.getText().toString().length() > 0) {
                    String lastCharacter = input.getText().toString().substring(input.getText().toString().length() - 1);
                    if (!(lastCharacter.equals("-") || lastCharacter.equals(".")))
                        input.append("-");
                } else {
                    input.append("-");
                }
                v.vibrate(20);
                getAnswer();
                minus.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                minus.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        plus.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                if (lastSymbol()) input.append("+");
                v.vibrate(20);
                getAnswer();
                plus.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                plus.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        multiply.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                if (lastSymbol()) input.append("*");
                v.vibrate(20);
                getAnswer();
                multiply.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                multiply.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        divide.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                if (lastSymbol()) input.append(":");
                v.vibrate(20);
                getAnswer();
                divide.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                divide.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        dot.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                if (lastSymbol()) {
                    if (!one.contains(".") && count == 0) {
                        input.append(".");
                    }
                    if (!two.contains(".") && count == 1) {
                        input.append(".");
                    }
                }
                v.vibrate(20);
                getAnswer();
                dot.setBackgroundColor(Color.argb(150, 150, 150, 150));
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                dot.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        equals.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                v.vibrate(20);
                getAnswer();
                equals.setBackgroundColor(Color.argb(150, 150, 150, 150));
                if (!input.getText().toString().equals("")) {
                    if (!input.getText().toString().substring(input.getText().toString().length() - 1).matches("[*+:-]+")) {
                        input.setText(answer.getText().toString());
                    }
                }
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                equals.setBackgroundColor(Color.BLACK);
            }
            return false;
        });

        answer.setOnTouchListener((view, motionEvent) -> {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                v.vibrate(20);
                input.setText(answer.getText().toString());
            }
            return false;
        });
    }


    private boolean lastSymbol() {
        if (input.getText().toString().length() > 0) {
            String lastCharacter = input.getText().toString().substring(input.getText().toString().length() - 1);
            return !(lastCharacter.equals("-") || lastCharacter.equals("+") || lastCharacter.equals("*") || lastCharacter.equals(":") || lastCharacter.equals("."));
        }
        return false;
    }

    private void getAnswer() {
        String[] numbers = input.getText().toString().split("");
        String regexNum = "[0-9.]+";
        String regexSyb = "[*+:-]+";

        one = "";
        two = "";
        String three = "";
        String symbol = "";
        count = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i].equals("-") && one.equals("")) {
                one = "-";
            }

            if (numbers[i].matches(regexSyb) && i >= 1) {
                symbol = numbers[i];
                count++;
                if (numbers[i].matches(regexSyb) && numbers[i - 1].matches(regexSyb)) {
                    symbol = numbers[i - 1];
                    two = "-";
                    count--;
                }
                if (count == 2) {
                    one = three;
                    count = 1;
                    two = "";
                }
            }
            if (numbers[i].matches(regexNum) && count == 0) {
                if (numbers[i].equals(".") && !one.contains(".")) {
                    one += numbers[i];
                } else if (!numbers[i].equals(".")) {
                    one += numbers[i];
                }
            }

            if (numbers[i].matches(regexNum) && count >= 1) {
                if (numbers[i].equals(".") && !two.contains(".")) {
                    two += numbers[i];
                } else if (!numbers[i].equals(".")) {
                    two += numbers[i];
                }
            }

            if(one.matches("-?0+[.][0-9]+")){
                if (one.charAt(0) == '-'){
                    one = "-" + one.substring(one.indexOf('.') - 1);
                } else one = one.substring(one.indexOf('.') - 1);
            }

            if(two.matches("-?0+[.][0-9]+")){
                if (two.charAt(0) == '-'){
                    two = "-" + two.substring(two.indexOf('.') - 1);
                } else two = two.substring(two.indexOf('.') - 1);
            }

            if (!one.equals("") && !two.equals("") && !two.equals("-")) {
                if (symbol.equals("+")) {
                    three = decimalFormat.format(plus(one, two)).replace(',', '.');
                }
                if (symbol.equals("-")) {
                    three = decimalFormat.format(minus(one, two)).replace(',', '.');
                }
                if (symbol.equals("*")) {
                    three = decimalFormat.format(multiply(one, two)).replace(',', '.');
                }
                if (symbol.equals(":")) {
                    System.out.println(two);
                    three = decimalFormat.format(divide(one, two)).replace(',', '.');
                    if (three.equals("0") && two.matches("-?0+.?0*")) {
                        answer.setText("Деление на 0!");
                        buttonLock();
                        continue;
                    }
                }
                if (three.matches("-?[0-9]+[.][0]+")) {
                    answer.setText(three.substring(0, three.indexOf('.')));
                } else {
                    answer.setText(three);
                }
            }
        }
        if (two.equals("")) {
            answer.setText(one);
        }
        if (answer.getText().toString().length() > 26) {
            answer.setTextSize(30);
            if (answer.getText().toString().length() > 57) {
                answer.setTextSize(20);
            }
        } else answer.setTextSize(40);

        if (input.getText().toString().length() > 56) {
            input.setTextSize(35);
            if (input.getText().toString().length() > 85) {
                input.setTextSize(30);
            }
        } else input.setTextSize(40);

    }

    private BigDecimal plus(String a, String b) {
        return new BigDecimal(a).add(new BigDecimal(b));
    }

    private BigDecimal minus(String a, String b) {
        return new BigDecimal(a).subtract(new BigDecimal(b));
    }

    private BigDecimal multiply(String a, String b) {
        return new BigDecimal(a).multiply(new BigDecimal(b));
    }

    private BigDecimal divide(String a, String b) {
        if (new BigDecimal(b).equals(new BigDecimal(0)) || b.matches("-?[0][.][0]+")) {
            return new BigDecimal(0);
        } else {
            buttonUnlock();
            return new BigDecimal(a).divide(new BigDecimal(b), 12, RoundingMode.HALF_UP);
        }

    }

    private void buttonLock() {
        answer.setEnabled(false);
        equals.setEnabled(false);
    }

    private void buttonUnlock() {
        answer.setEnabled(true);
        equals.setEnabled(true);
    }
}