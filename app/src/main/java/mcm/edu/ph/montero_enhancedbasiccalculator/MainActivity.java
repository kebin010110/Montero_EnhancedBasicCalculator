package mcm.edu.ph.montero_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd, btnSub, btnDiv, btnMul, btnMod;


        btnAdd = findViewById(R.id.btnAddition);
        btnDiv = findViewById(R.id.btnDivision);
        btnSub = findViewById(R.id.btnSubtraction);
        btnMul = findViewById(R.id.btnMultiplication);
        btnMod = findViewById(R.id.btnModulo);


        btnAdd.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMul.setOnClickListener(this);
        btnMod.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        EditText txtOperand1, txtOperand2;
        TextView txtAnswer;

        txtOperand1 = findViewById(R.id.txtOperand1);
        txtOperand2 = findViewById(R.id.txtOperand2);
        txtAnswer = findViewById(R.id.txtAnswer);

        Double operand1 = 0.0;
        Double operand2 = 0.0;
        Double answer = 0.0;

        operand1 = Double.parseDouble(txtOperand1.getText().toString());
        operand2 = Double.parseDouble(txtOperand2.getText().toString());

        switch(v.getId()) {
            case R.id.btnAddition:
                txtAnswer.setText(Double.toString(doAddition(operand1,operand2)));

                break;
            case R.id.btnDivision:
                txtAnswer.setText(Double.toString(doDivision(operand1,operand2)));

                break;
            case R.id.btnSubtraction:
                txtAnswer.setText(Double.toString(doSubtraction(operand1,operand2)));

                break;
            case R.id.btnMultiplication:
                txtAnswer.setText(Double.toString(doMultiplication(operand1,operand2)));

                break;
            case R.id.btnModulo:
                txtAnswer.setText(Double.toString(doModulo(operand1,operand2)));

                break;

        }
    }

    public static double doAddition(double operand1, double operand2) {
        return operand1 + operand2;

    }
    public static double doSubtraction(double operand1, double operand2) {
        return operand1 - operand2;

    }
    public static double doMultiplication(double operand1, double operand2) {
        return operand1 * operand2;

    }
    public static double doDivision(double operand1, double operand2) {
        return operand1 / operand2;

    }
    public static double doModulo(double operand1, double operand2) {
        return operand1 % operand2;
    }

}