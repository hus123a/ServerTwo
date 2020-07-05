package com.catCoder.vo;




import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrgTreeNode {
    private String id;
    private String parentId;
    private String name;
    private int type;
    private int sortNo;
    private List<OrgTreeNode> childs = new ArrayList<>();



    public static List<OrgTreeNode> listToTree(List<OrgTreeNode> list, String pid) {
        //用递归找子。
        List<OrgTreeNode> treeList = new ArrayList<>();
        for (OrgTreeNode tree : list) {
            if (StringUtils.equals(tree.getParentId(), pid)) {
                treeList.add(findChildren(tree, list));
            }
        }
        return treeList;
    }

    private static OrgTreeNode findChildren(OrgTreeNode tree, List<OrgTreeNode> list) {
        for (OrgTreeNode node : list) {
            if (node.getParentId().equals(tree.getId())) {
                if (tree.getChilds() == null) {
                    tree.setChilds(new ArrayList<>());
                }
                tree.getChilds().add(findChildren(node, list));
            }
        }
        return tree;
    }

}
