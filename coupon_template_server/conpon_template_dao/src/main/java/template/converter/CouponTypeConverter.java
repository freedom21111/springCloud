package template.converter;

import enums.CouponType;

import javax.persistence.AttributeConverter;

public class CouponTypeConverter implements AttributeConverter<CouponType,String> {

    @Override
    public String convertToDatabaseColumn(CouponType couponType) {
        return couponType.getCode();
    }

    @Override
    public CouponType convertToEntityAttribute(String s) {
        return CouponType.convert(s);
    }
}
