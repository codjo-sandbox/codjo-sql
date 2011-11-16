/*
 * Team : AGF AM / OSI / SI / BO
 *
 * Copyright (c) 2001 AGF Asset Management.
 */
package net.codjo.sql.builder;
import java.util.ArrayList;
import java.util.List;
/**
 * Implantation par d�faut d'un FieldInfoList.
 */
public class DefaultFieldInfoList implements FieldInfoList {
    private List<FieldInfo> content = new ArrayList<FieldInfo>();


    public int size() {
        return content.size();
    }


    public FieldInfo getFieldInfo(int idx) {
        return content.get(idx);
    }


    public void add(FieldInfo info) {
        if (!known(info)) {
            content.add(info);
        }
    }


    private boolean known(FieldInfo newInfo) {
        for (FieldInfo fieldInfo : content) {
            if (newInfo.getAlias().equals(fieldInfo.getAlias())) {
                if (newInfo.getFullDBName().equals(fieldInfo.getFullDBName())) {
                    return true;
                }
                else {
                    throw new IllegalArgumentException("Alias >" + newInfo.getAlias()
                                                       + "< d�j� pr�sent dans la liste " + this.toString());
                }
            }
        }
        return false;
    }
}
