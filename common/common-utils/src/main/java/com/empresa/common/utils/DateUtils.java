package com.empresa.common.utils;
import com.empresa.common.api.IOrder;
import java.time.LocalDateTime;
public class DateUtils {
    public static String getTimestampedMessage(IOrder order) {
        return "[" + LocalDateTime.now() + "] Procesando orden ID: " + order.getId();
    }
}
