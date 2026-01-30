package com.empresa.app;
import com.empresa.core.service.OrderService;
import java.io.InputStream;
import java.util.Properties;
public class Main {
    public static void main(String[] args) {
        System.out.println("Iniciando aplicación de pedidos...");

        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("app.properties")) {
            Properties prop = new Properties();
            if (input != null) {
                prop.load(input);
                System.out.println("ENTORNO ACTUAL: " + prop.getProperty("app.environment"));
            } else {
                System.out.println("No se encontró app.properties");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        OrderService service = new OrderService();
        service.createOrder("001", "Laptop Developer");
    }
}
