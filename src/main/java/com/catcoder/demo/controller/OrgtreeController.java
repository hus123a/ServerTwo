package com.catcoder.demo.controller;

import com.catcoder.demo.api.TreeApi;
import com.catcoder.demo.utils.ConditionTree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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
