package com.aor.designpatterns;

public class StringCaseChanger implements StringTransformer {
    public StringCaseChanger() {
    }

    @Override
    public void execute(StringDrink drink) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < drink.getText().length(); i++) {
            if (Character.isLowerCase(drink.getText().charAt(i)))
                result.append(Character.toUpperCase(drink.getText().charAt(i)));
            else
                result.append(Character.toLowerCase(drink.getText().charAt(i)));
        }
        drink.setText(String.valueOf(result));
    }
}
