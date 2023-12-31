package com.youcode.marjanv2.Services;

import com.youcode.marjanv2.Models.Dto.PromotionDto;
import com.youcode.marjanv2.Models.Entity.Promotion;
import com.youcode.marjanv2.Repositories.PromotionRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PromotionService {
    private final PromotionRepository promotionRepository;
    private final ModelMapper modelMapper;
    @Autowired
    public PromotionService(PromotionRepository promotionRepository, ModelMapper modelMapper) {
        this.promotionRepository = promotionRepository;
        this.modelMapper = modelMapper;
    }

    public List<PromotionDto> getPromotions() {
        List<Promotion> promotions = promotionRepository.findAll();
        return promotions.stream().
                map(promotion -> modelMapper.map(promotion, PromotionDto.class))
                .collect(Collectors.toList());
    }

    public PromotionDto getPromotionById(Long id) {
        Optional<Promotion> promotion = promotionRepository.findById(id);
        return promotion.map(promo -> modelMapper.map(promo,PromotionDto.class)).orElse(null);
    }

    public Promotion createPromotion(PromotionDto promotionDto) {
        Promotion promotion = modelMapper.map(promotionDto, Promotion.class);
        return promotionRepository.save(promotion);
    }
}
