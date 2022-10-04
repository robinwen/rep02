package fcss.domain.mybatisone.mapper;

import java.lang.reflect.Field;
import java.util.List;
import fcss.domain.mybatisone.annotation.IdType;

public class TableInfo {
    public Class<?> entity; // Entity class
    public String tableName; // DB table name
    public List<Column> columns;
    public Column pk;

    protected Column newColumn() {
        return new Column();
    }

    public class Column {
        public Field field; // Entity property
        public IdType idtype; // id type when inserting
        public String columnName; // DB column name
        public String propertyName; // Entity property name

        public Object getValue(Object ent) {
            try {
                return this.field.get(ent);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        public void setValue(Object ent, Object value) {
            try {
                this.field.set(ent, value);
            } catch (IllegalArgumentException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        public String propertyBind() {
            return "#{" + propertyName + "}";
        }

        public String propertyBind(String prefixName) {
            return String.format("#{%s." + propertyName + "}", prefixName);
        }

    }
}
