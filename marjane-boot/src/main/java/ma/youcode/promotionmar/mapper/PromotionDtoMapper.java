package ma.youcode.promotionmar.mapper;

import ma.youcode.promotionmar.dto.PromotionDto;
import ma.youcode.promotionmar.entities.AdminCenter;
import ma.youcode.promotionmar.entities.Product;
import ma.youcode.promotionmar.entities.Promotion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.Function;

@Component
public class PromotionDtoMapper implements Function<Promotion, PromotionDto> {
    private final ProductDtoMapper productDtoMapper;

    private final AdminCenterDtoMapper adminCenterDtoMapper;

    public PromotionDtoMapper(ProductDtoMapper productDtoMapper, AdminCenterDtoMapper adminCenterDtoMapper) {
        this.productDtoMapper = productDtoMapper;
        this.adminCenterDtoMapper = adminCenterDtoMapper;
    }

    @Override
    public PromotionDto apply(Promotion promotion) {
        return new PromotionDto(
                promotion.getId(),
                promotion.getCreatedDate(),
                promotion.getStartDate(),
                promotion.getEndDate(),
                promotion.getDiscountPercentage(),
                promotion.getPromotionDescription(),
                promotion.isActive(),
                promotion.getPromotionType(),
                productDtoMapper.apply(promotion.getProduct()),
                adminCenterDtoMapper.apply(promotion.getAdminCenter())

        );
    }

    public Promotion apply(PromotionDto promotionDto) {
        return new Promotion(
                promotionDto.getId(),
                promotionDto.getCreatedDate(),
                promotionDto.getStartDate(),
                promotionDto.getEndDate(),
                promotionDto.getDiscountPercentage(),
                promotionDto.getPromotionDescription(),
                promotionDto.isActive()

        );
    }
}
