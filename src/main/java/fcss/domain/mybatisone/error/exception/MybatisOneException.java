package fcss.domain.mybatisone.error.exception;

public class MybatisOneException extends RuntimeException {

    private static final long serialVersionUID = -8224215006256622092L;

    private Object content = null;

    public MybatisOneException() {
        super();

    }

    public MybatisOneException(String content) {

        this.content = content;
    }

    public MybatisOneException(String content, Throwable cause) {

        this.content = content;
    }

    public Object getContent() {
        return content;
    }

}
