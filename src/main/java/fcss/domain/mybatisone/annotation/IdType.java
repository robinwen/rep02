package fcss.domain.mybatisone.annotation;

public enum IdType {

    AUTO(0),

    // NONE(1),

    INPUT(2),

    // ASSIGN_ID(3),

    ASSIGN_UUID(4);

    private final int key;

    IdType(int key) {
        this.key = key;
    }
}
