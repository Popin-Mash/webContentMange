package com.menpisey.webcontentmange.constant;

import com.menpisey.webcontentmange.models.req.ItemValue;

import java.util.ArrayList;
import java.util.List;

public abstract class Constant {
    private final String STATUS_ACT = "ACT";
    private final String STATUS_DEL = "DEL";
    //fpr edit list status
    public List<ItemValue> getAllStatus(){
        List<ItemValue> itemValues = new ArrayList<>();
        itemValues.add(new ItemValue(1,"ACT","ACT"));
        itemValues.add(new ItemValue(2,"DEL","DEL"));
        return itemValues;
    }
}
