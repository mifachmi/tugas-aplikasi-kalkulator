package com.example.kalkulator_mockup;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView _tvResult;
    EditText _etFirstNumber;
    EditText _etSecondNumber;
    Double firstNumber;
    Double secondNumber;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _tvResult = findViewById(R.id.tvResult);
        _etFirstNumber = findViewById(R.id.etAngkaPertama);
        _etSecondNumber = findViewById(R.id.etAngkaKedua);

        _etFirstNumber.setShowSoftInputOnFocus(false);
        _etSecondNumber.setShowSoftInputOnFocus(false);
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnZero(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "0");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "0");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnZeroThree(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "000");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "000");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnDot(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + ".");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + ".");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnOne(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "1");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "1");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnTwo(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "2");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "2");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnThree(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "3");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "3");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnFour(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "4");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "4");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnFive(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "5");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "5");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnSix(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "6");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "6");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnSeven(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "7");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "7");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnEight(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "8");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "8");
        }
    }

    @SuppressLint("SetTextI18n")
    public void clickBtnNine(View view) {
        if(_etFirstNumber.isFocused()) {
            _etFirstNumber.setText(_etFirstNumber.getText() + "9");
        }
        if (_etSecondNumber.isFocused()) {
            _etSecondNumber.setText(_etSecondNumber.getText() + "9");
        }
    }

    public void clickBtnC(View view) {
        _etFirstNumber.setText(null);
        _etSecondNumber.setText(null);
        _tvResult.setText(R.string.result);
    }

    public void clickBtnDel(View view) {
        if (_etFirstNumber.isFocused()) {
            StringBuffer sbFirstNumber = new StringBuffer(_etFirstNumber.getText());
            _etFirstNumber.setText("");
            if (sbFirstNumber.length() > 0) {
                sbFirstNumber.deleteCharAt(sbFirstNumber.length()-1);
            }
            _etFirstNumber.setText(String.valueOf(sbFirstNumber));
        }
        if (_etSecondNumber.isFocused()) {
            StringBuffer sbSecondNumber = new StringBuffer(_etSecondNumber.getText());
            _etSecondNumber.setText("");
            if (sbSecondNumber.length() > 0) {
                sbSecondNumber.deleteCharAt(sbSecondNumber.length()-1);
            }
            _etSecondNumber.setText(String.valueOf(sbSecondNumber));
        }
    }

    public void clickBtnPercent(View view) {
        String inputFirstNumber = _etFirstNumber.getText().toString().trim();
        String inputSecondNumber = _etSecondNumber.getText().toString().trim();
        boolean isEmptyFields = false;

        if (TextUtils.isEmpty(inputFirstNumber)) {
            isEmptyFields = true;
            _etFirstNumber.setError("Field ini tidak boleh kosong");
        }
        if (TextUtils.isEmpty(inputSecondNumber)) {
            isEmptyFields = true;
            _etSecondNumber.setError("Field ini tidak boleh kosong");
        }
        if (!isEmptyFields) {
            firstNumber = Double.parseDouble(_etFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(_etSecondNumber.getText().toString());
            result = (firstNumber / 100) * secondNumber;
            _tvResult.setText(String.valueOf(result));
        }
    }

    public void clickBtnKali(View view) {
        String inputFirstNumber = _etFirstNumber.getText().toString().trim();
        String inputSecondNumber = _etSecondNumber.getText().toString().trim();
        boolean isEmptyFields = false;

        if (TextUtils.isEmpty(inputFirstNumber)) {
            isEmptyFields = true;
            _etFirstNumber.setError("Field ini tidak boleh kosong");
        }
        if (TextUtils.isEmpty(inputSecondNumber)) {
            isEmptyFields = true;
            _etSecondNumber.setError("Field ini tidak boleh kosong");
        }
        if (!isEmptyFields) {
            firstNumber = Double.parseDouble(_etFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(_etSecondNumber.getText().toString());
            result = firstNumber * secondNumber;
            _tvResult.setText(String.valueOf(result));
        }
    }

    public void clickBtnMinus(View view) {
        String inputFirstNumber = _etFirstNumber.getText().toString().trim();
        String inputSecondNumber = _etSecondNumber.getText().toString().trim();
        boolean isEmptyFields = false;

        if (TextUtils.isEmpty(inputFirstNumber)) {
            isEmptyFields = true;
            _etFirstNumber.setError("Field ini tidak boleh kosong");
        }
        if (TextUtils.isEmpty(inputSecondNumber)) {
            isEmptyFields = true;
            _etSecondNumber.setError("Field ini tidak boleh kosong");
        }
        if (!isEmptyFields) {
            firstNumber = Double.parseDouble(_etFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(_etSecondNumber.getText().toString());
            result = firstNumber - secondNumber;
            _tvResult.setText(String.valueOf(result));
        }
    }

    public void clickBtnPlus(View view) {
        String inputFirstNumber = _etFirstNumber.getText().toString().trim();
        String inputSecondNumber = _etSecondNumber.getText().toString().trim();
        boolean isEmptyFields = false;

        if (TextUtils.isEmpty(inputFirstNumber)) {
            isEmptyFields = true;
            _etFirstNumber.setError("Field ini tidak boleh kosong");
        }
        if (TextUtils.isEmpty(inputSecondNumber)) {
            isEmptyFields = true;
            _etSecondNumber.setError("Field ini tidak boleh kosong");
        }
        if (!isEmptyFields) {
            firstNumber = Double.parseDouble(_etFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(_etSecondNumber.getText().toString());
            result = firstNumber + secondNumber;
            _tvResult.setText(String.valueOf(result));
        }
    }

    public void clickBtnBagi(View view) {
        String inputFirstNumber = _etFirstNumber.getText().toString().trim();
        String inputSecondNumber = _etSecondNumber.getText().toString().trim();
        boolean isEmptyFields = false;

        if (TextUtils.isEmpty(inputFirstNumber)) {
            isEmptyFields = true;
            _etFirstNumber.setError("Field ini tidak boleh kosong");
        }
        if (TextUtils.isEmpty(inputSecondNumber)) {
            isEmptyFields = true;
            _etSecondNumber.setError("Field ini tidak boleh kosong");
        }
        if (!isEmptyFields) {
            firstNumber = Double.parseDouble(_etFirstNumber.getText().toString());
            secondNumber = Double.parseDouble(_etSecondNumber.getText().toString());
            result = firstNumber / secondNumber;
            _tvResult.setText(String.valueOf(result));
        }
    }

    public void clickBtnEquals(View view) {

    }

    public void clickLayout(View view) {
        InputMethodManager imm =(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

}