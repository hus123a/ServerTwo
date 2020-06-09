package com.catcoder.demo.api;


import com.catcoder.demo.utils.ConditionTree;

import java.io.IOException;

public interface TreeApi {

    public String getOrgTree(ConditionTree conditionTree) throws IOException;
}
