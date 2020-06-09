package com.catcoder.demo.vo;

import lombok.Data;

@Data
public class ConditionInput {
    private String property;
    private String operator;
    private Object values;
}
