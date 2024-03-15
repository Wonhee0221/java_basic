package com.hana.frame;

public class SQLcart {
    public static String insertItem = "INSERT INTO db_item (name, price) VALUES (?, ?)";
    public static String updateItem = "UPDATE db_item SET price = ? , name = ? WHERE id = ?";
    public static String deleteItem = "DELETE FROM db_item WHERE id = ?";
    public static String selectItem = "SELECT * FROM db_item WHERE id=?";
    public static String selectallItem = "SELECT * FROM db_item";
}
