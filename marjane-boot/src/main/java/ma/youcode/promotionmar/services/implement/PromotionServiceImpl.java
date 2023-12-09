package ma.youcode.promotionmar.services.implement;

import ma.youcode.promotionmar.dto.PromotionDto;
import ma.youcode.promotionmar.entities.AdminCenter;
import ma.youcode.promotionmar.entities.Product;
import ma.youcode.promotionmar.entities.Promotion;
import ma.youcode.promotionmar.mapper.AdminCenterDtoMapper;
import ma.youcode.promotionmar.mapper.ProductDtoMapper;
import ma.youcode.promotionmar.mapper.PromotionDtoMapper;
import ma.youcode.promotionmar.repositories.PromotionRepository;
import ma.youcode.promotionmar.services.AdminCenterService;
import ma.youcode.promotionmar.services.ProductService;
import ma.youcode.promotionmar.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PromotionServiceImpl implements PromotionService {

    @Autowired
    private PromotionRepository promotionRepository;
    @Autowired
    private PromotionDtoMapper promotionDtoMapper;
    @Autowired
    private ProductDtoMapper productDtoMapper;
    @Autowired
    private AdminCenterDtoMapper adminCenterDtoMapper;
    @Autowired
    private ProductService productService;
    @Autowired
    private AdminCenterService adminCenterService;

    Product product = new Product();
    AdminCenter adminCenter = new AdminCenter();


    @Override
    public String savePromotion(PromotionDto promotionDto) {

//        product = productService.saveProduct(productDtoMapper.apply(promotionDto.getProduct()));
//        adminCenter = adminCenterService.saveAdminCenter(adminCenterDtoMapper.apply(promotionDto.getAdminCenter()));
//
//
//        Promotion promotion = promotionDtoMapper.apply(promotionDto);
//        promotion.setProduct(product);
//        promotion.setAdminCenter(adminCenter);
//
//        return promotionRepository.save(promotion);
        Promotion promotion = promotionDtoMapper.apply(promotionDto);
        promotionRepository.save(promotion);
        return "promotion saved successfully";
    }

    @Override
    public List<PromotionDto> findAllPromotions() {
        return promotionRepository.findAll()
                .stream().map(promotionDtoMapper)
                .collect(Collectors.toList());
    }
}
