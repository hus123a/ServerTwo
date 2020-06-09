package com.catcoder.demo.utils;

import lombok.Data;

@Data
public class ConditionTree {
    private Integer id;
    private boolean treeType = false;
    private boolean withUser = false;
    private boolean sync = false;
}
