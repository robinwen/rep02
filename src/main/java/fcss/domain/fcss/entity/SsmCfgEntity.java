// This file is generated automatically. DO NOT modify.
package fcss.domain.fcss.entity;

import java.sql.Timestamp;
import fcss.domain.mybatisone.annotation.IdType;
import fcss.domain.mybatisone.annotation.TableField;
import fcss.domain.mybatisone.annotation.TableId;
import fcss.domain.mybatisone.annotation.TableName;

/** 參數檔 **/
@TableName("SSM_CFG")
public class SsmCfgEntity {
    private static final long serialVersionUID = 1L;

    /** 參數檔識別碼 -- VARCHAR(36) **/
    @TableId(value = "SSM_CFG_SSN", type = IdType.ASSIGN_UUID)
    public String ssm_cfg_ssn;

    /** 系統別代碼 -- VARCHAR(10) **/
    @TableField("AP_CODE")
    public String ap_code;

    /** 參數鍵 -- VARCHAR(20) **/
    @TableField("CFG_KEY")
    public String cfg_key;

    /** 參數值 -- VARCHAR(200) **/
    @TableField("CFG_VAL")
    public String cfg_val;

    /** 訊息樣板 -- VARCHAR(200) **/
    @TableField("PATTERN")
    public String pattern;

    /** 說明 -- VARCHAR(200) **/
    @TableField("DESCRIPTION")
    public String description;

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
