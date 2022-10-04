package fcss.domain.mybatisone.toolkit;

import java.util.UUID;

public class UUIDGenerator {

    public static String getUUID() {
        Long msb = System.currentTimeMillis();
        Long lsb = System.currentTimeMillis();
        UUID uuid = new UUID(msb, lsb);

        return uuid.toString();
    }
}
