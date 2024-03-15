package org.example;

import lombok.extern.slf4j.Slf4j;

import java.sql.SQLException;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectionPool cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}