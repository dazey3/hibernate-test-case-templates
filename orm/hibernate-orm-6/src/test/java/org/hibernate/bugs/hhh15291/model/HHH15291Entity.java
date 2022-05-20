package org.hibernate.bugs.hhh15291.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HHH15291Entity {

    @Id
    @Column(name = "KEY_CHAR")
    private String KeyString;

    @Column(name = "ITEM_STRING1")
    private String itemString1;

    @Column(name = "ITEM_STRING2")
    private String itemString2;

    @Column(name = "ITEM_STRING3")
    private String itemString3;

    @Column(name = "ITEM_STRING4")
    private String itemString4;

    @Column(name = "ITEM_INTEGER1")
    private Integer itemInteger1;

    public String getKeyString() {
        return KeyString;
    }

    public void setKeyString(String keyString) {
        KeyString = keyString;
    }

    public String getItemString1() {
        return itemString1;
    }

    public void setItemString1(String itemString1) {
        this.itemString1 = itemString1;
    }

    public String getItemString2() {
        return itemString2;
    }

    public void setItemString2(String itemString2) {
        this.itemString2 = itemString2;
    }

    public String getItemString3() {
        return itemString3;
    }

    public void setItemString3(String itemString3) {
        this.itemString3 = itemString3;
    }

    public String getItemString4() {
        return itemString4;
    }

    public void setItemString4(String itemString4) {
        this.itemString4 = itemString4;
    }

    public Integer getItemInteger1() {
        return itemInteger1;
    }

    public void setItemInteger1(Integer itemInteger1) {
        this.itemInteger1 = itemInteger1;
    }
}
