package fcss.webapi.features.common.model.dto;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Range;

public class PagingRequest {
    /**
     * 頁碼, 從1開始.
     * 傳入值<=0: 自動以1開始
     */
    @NotNull
    public Integer pageno;

    /**
     * 每頁筆數.
     * 傳入-1: 不分頁
     */
    @NotNull
    public Integer size;

    /**
     * 排序
     */
    @Valid
    public Sort[] sort;

    public static class Sort {
        /**
         * SQL的欄位名
         */
        @NotBlank
        public String field;

        /**
         * 1: 升冪, 0或-1: 降冪
         */
        @Range(min = -1, max = 1)
        public Integer order;
    }

}
