package beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PageCouponTemplateInfo {
    public List<CouponTemplateInfo> templateInfos;

    public int page;

    public long total;
}
