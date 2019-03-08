package util;/*
 *@ClassName  ConfigManager
 *@Description
 *@Date 2019/2/11 10:42
 */

//import java.io.IOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {
    static Properties properties=null;
    public  String getProperties(String key){
        return properties.getProperty( key);
    }

    //ConfigManager configManager=new ConfigManager();
    static{
        InputStream inputStream=null;
        inputStream=ConfigManager.class.getClassLoader().getResourceAsStream("database.properties");
        if(inputStream==null) throw new RuntimeException("获取文件失败");

    //     ConfigManager.class.getClassLoader().getResourceAsStream("database.properties");
     //   if(inputStream==null) throw new RuntimeException("获取文件失败");


        properties=new Properties();
        try {
            properties.load(inputStream);
        } catch (
    IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                throw new RuntimeException("关闭文件流失败");
            }
        }

    }

}
