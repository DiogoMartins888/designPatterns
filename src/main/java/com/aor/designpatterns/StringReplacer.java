package com.aor.designpatterns;

public class StringReplacer implements StringTransformer {
    private final char from;
    private final char to;

    public StringReplacer(char from, char to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void execute(StringDrink drink) {
        drink.setText(drink.getText().replace(from, to));
    }
}
