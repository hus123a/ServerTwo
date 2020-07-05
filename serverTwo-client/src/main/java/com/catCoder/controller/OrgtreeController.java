package com.catCoder.controller;


import com.catCoder.api.TreeApi;
import com.catCoder.vo.ConditionTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
@RequestMapping("/api/tree")
public class OrgtreeController {

    @Autowired
    private TreeApi treeApi;

    @RequestMapping(value = "/getOrgTree",method = RequestMethod.POST)
    @ResponseBody
    public String getOrgTree(ConditionTree conditionTree) throws IOException {
        String tree = "";
        tree = treeApi.getOrgTree(conditionTree);
        return tree;
    }
}
