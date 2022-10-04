// This file is generated automatically. DO NOT modify.
package fcss.domain.fcss.entity;

import java.sql.Timestamp;
import fcss.domain.mybatisone.annotation.IdType;
import fcss.domain.mybatisone.annotation.TableField;
import fcss.domain.mybatisone.annotation.TableId;
import fcss.domain.mybatisone.annotation.TableName;

/** 代碼檔 **/
@TableName("SSM_CODEMAP")
public class SsmCodemapEntity {
    private static final long serialVersionUID = 1L;

    /** 代碼檔識別碼 -- VARCHAR(36) **/
    @TableId(value = "SSM_CODEMAP_SSN", type = IdType.INPUT)
    public String ssm_codemap_ssn;

    /** 系統別代碼 -- VARCHAR(10) **/
    @TableField("AP_CODE")
    public String ap_code;

    /** 代碼類別 -- VARCHAR(20) **/
    @TableField("CODE_CATEGORY")
    public String code_category;

    /** 代碼鍵 -- VARCHAR(20) **/
    @TableField("CODE_KEY")
    public String code_key;

    /** 中文代碼值 -- VARCHAR(200) **/
    @TableField("CODE_VAL")
    public String code_val;

    /** 上層代碼鍵(沒有填#) -- VARCHAR(20) **/
    @TableField("PARENT_CODE_KEY")
    public String parent_code_key;

    /** 群組 -- INTEGER(10) **/
    @TableField("GROUP_NO")
    public Integer group_no;

    /** 備註 -- VARCHAR(200) **/
    @TableField("REMARK")
    public String remark;

    /** 排序 -- INTEGER(10) **/
    @TableField("SORT_NO")
    public Integer sort_no;

    /** 是否啟用 -- VARCHAR(1) **/
    @TableField("IS_ENABLED")
    public String is_enabled;

    /** 建立者識別碼 -- VARCHAR(36) **/
    @TableField("CREATED_BY")
    public String created_by;

    /** 建立時間 -- TIMESTAMP **/
    @TableField("CREATED_AT")
    public Timestamp created_at;

    /** 異動者識別碼 -- VARCHAR(36) **/
    @TableField("UPDATED_BY")
    public String updated_by;

    /** 異動時間 -- TIMESTAMP **/
    @TableField("UPDATED_AT")
    public Timestamp updated_at;

}
