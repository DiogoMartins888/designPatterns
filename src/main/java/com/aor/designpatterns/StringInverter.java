package com.aor.designpatterns;

public class StringInverter implements StringTransformer {
    public StringInverter() {
    }

    @Override
    public void execute(StringDrink drink) {
        StringBuilder result = new StringBuilder(drink.getText());
        result.reverse();
        drink.setText(String.valueOf(result));
    }
}
