package beans;

import beans.rules.TemplateRule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CouponTemplateInfo {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String desc;
    @NotNull
    private String type;

    private Long shopId;
    @NotNull
    private TemplateRule rule;

    private Boolean available;

}
