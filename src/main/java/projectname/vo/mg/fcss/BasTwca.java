package projectname.vo.mg.fcss;

import java.util.Date;

public class BasTwca {
    private Long basTwcaId;

    private Long basOrgId;

    private String tokenType;

    private String twcaNo;

    private String twcaDes;

    private String isEnabled;

    private Long createdBy;

    private Date createdAt;

    private Long updatedBy;

    private Date updatedAt;

    public Long getBasTwcaId() {
        return basTwcaId;
    }

    public void setBasTwcaId(Long basTwcaId) {
        this.basTwcaId = basTwcaId;
    }

    public Long getBasOrgId() {
        return basOrgId;
    }

    public void setBasOrgId(Long basOrgId) {
        this.basOrgId = basOrgId;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType == null ? null : tokenType.trim();
    }

    public String getTwcaNo() {
        return twcaNo;
    }

    public void setTwcaNo(String twcaNo) {
        this.twcaNo = twcaNo == null ? null : twcaNo.trim();
    }

    public String getTwcaDes() {
        return twcaDes;
    }

    public void setTwcaDes(String twcaDes) {
        this.twcaDes = twcaDes == null ? null : twcaDes.trim();
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled == null ? null : isEnabled.trim();
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}