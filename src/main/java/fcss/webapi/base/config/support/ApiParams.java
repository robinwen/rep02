package fcss.webapi.base.config.support;

import java.util.Locale;

public class ApiParams {

    private String locale;
    private Long locale_id;
    private Locale localeObj;
    private String country_code;
    private String language_code;

    private int offset;
    private int limit;

    private int pageno;
    private String acceptImage;

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public Long getLocale_id() {
        return locale_id;
    }

    public void setLocale_id(Long locale_id) {
        this.locale_id = locale_id;
    }

    public Locale getLocaleObj() {
        return localeObj;
    }

    public void setLocaleObj(Locale localeObj) {
        this.localeObj = localeObj;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getLanguage_code() {
        return language_code;
    }

    public void setLanguage_code(String language_code) {
        this.language_code = language_code;
    }

    /**
     * 資料位移量, 預設0
     *
     * @return
     */
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    /**
     * 資料數上限/每頁筆數, 預設10
     *
     * @return
     */
    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    /**
     * 頁碼, 預設1
     *
     * @return
     */
    public int getPageno() {
        return pageno;
    }

    public void setPageno(int pageno) {
        this.pageno = pageno;
    }

    public String getAcceptImage() {
        return acceptImage;
    }

    public void setAcceptImage(String acceptImage) {
        this.acceptImage = acceptImage;
    }

}
