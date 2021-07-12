package com.bg.util;

import javafx.scene.Node;
import javafx.scene.layout.AnchorPane;

/**
 * @author XDSSWAR
 */
public final class AnchorUtil {
    private AnchorUtil(){}

    public static void setAnchor(Node node, Double left, Double top, Double right, Double bottom){
        AnchorPane.setLeftAnchor(node,left);
        AnchorPane.setTopAnchor(node,top);
        AnchorPane.setRightAnchor(node,right);
        AnchorPane.setBottomAnchor(node, bottom);
    }
}
