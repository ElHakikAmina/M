package ma.youcode.promotionmar.services;

import ma.youcode.promotionmar.dto.PromotionDto;

import java.util.List;

public interface PromotionService {
    String savePromotion(PromotionDto promotionDto);
    List<PromotionDto> findAllPromotions();

}
