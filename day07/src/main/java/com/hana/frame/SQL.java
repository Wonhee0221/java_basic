package com.hana.frame;

public class SQL {
    public static String insertCust = "INSERT INTO db_cust VALUES(?,?,?)";
    public static String updateCust = "UPDATE db_cust SET pwd = ? , name = ? WHERE id = ?";
    public static String deleteCust = "DELETE FROM db_cust WHERE id = ?";
    public static String selectCust = "SELECT * FROM db_cust WHERE id=?";
    public static String selectallCust = "SELECT * FROM db_cust";
}
