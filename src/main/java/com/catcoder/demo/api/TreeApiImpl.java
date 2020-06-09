package com.catcoder.demo.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.catcoder.demo.utils.ConditionTree;
import com.catcoder.demo.vo.ConditionInput;
import com.catcoder.demo.vo.OrgTreeNode;
/*import org.mountcloud.graphql.GraphqlClient;
import org.mountcloud.graphql.request.query.DefaultGraphqlQuery;
import org.mountcloud.graphql.request.query.GraphqlQuery;
import org.mountcloud.graphql.response.GraphqlResponse;*/
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.io.IOException;
import java.util.*;

@Service
@RefreshScope
public class TreeApiImpl implements TreeApi {


    private static String DATA_URL = "http://192.168.0.78:8081/provider/api/graphql";
    private static String ROOT_ID = "root";

    @Override
    public String getOrgTree(ConditionTree conditionTree) throws IOException {
        String queryMethodName = "Dept_findBy";
        Map result = getRemoteTreeMap(queryMethodName, conditionTree);
        if(conditionTree.isTreeType()){
            List<OrgTreeNode> orgTreeNodes =  JSONObject.parseArray(JSON.toJSONString(result.get(queryMethodName)), OrgTreeNode.class);
            if(!CollectionUtils.isEmpty(orgTreeNodes)){
                return JSON.toJSONString(OrgTreeNode.listToTree(orgTreeNodes, ROOT_ID));
            }
        }
        return JSON.toJSONString(result.get(queryMethodName));
    }

    private Map getRemoteTreeMap(String queryName, ConditionTree conditionTree) throws IOException {
        Map<String, String> headers = new HashMap<>(2);
       /* headers.put("MCUBE_TENANT_CODE", "mcube");
        GraphqlClient graphqlClient = GraphqlClient.buildGraphqlClient(DATA_URL);
        graphqlClient.setHttpHeaders(headers);
        GraphqlQuery query = new DefaultGraphqlQuery(queryName);

        query.addParameter("first",null);
        query.addParameter("offset",0);

        Map<String, String> condition = new HashMap<>();
        ConditionInput codition = new ConditionInput();
        codition.setOperator("delFlag");
        codition.setProperty("EQ");
        codition.setValues(0);
        ArrayList<ConditionInput> coditions = new ArrayList<>();
        coditions.add(codition);
        query.addParameter("conditions", codition);
        query.addResultAttributes("id","name","type","parentId","sortNo");
        GraphqlResponse response = graphqlClient.doQuery(query);
        //获取数据，数据为map类型
        return response.getData();*/
        return headers;
    }
}
