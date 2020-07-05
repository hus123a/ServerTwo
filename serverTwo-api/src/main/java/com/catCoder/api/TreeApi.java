package com.catCoder.api;




import com.catCoder.vo.ConditionTree;

import java.io.IOException;

public interface TreeApi {

    public String getOrgTree(ConditionTree conditionTree) throws IOException;
}
