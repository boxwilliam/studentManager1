package util;
import util.ConfigManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 *@ClassName  Database
 *@Description
 *@Date 2019/2/11 11:09
 */

public class Database {
    //连接
    ConfigManager configManager=new ConfigManager();
    private String driver= configManager.getProperties("driverClass");
    private String user=configManager.getProperties("user");
    private String password=configManager.getProperties("password");
    private String url=configManager.getProperties("url");
    private Connection connection;
    //开始构造器
    public Database(){
        try {
            Class.forName(driver);
            connection= DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //因为都是private变量，所以需要创建publide的方法来获取
    public Connection getConnection(){
        return connection;
    }
    public void close(){
        if (connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
