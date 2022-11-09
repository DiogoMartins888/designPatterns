package com.aor.designpatterns;

import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    private final List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }
}
