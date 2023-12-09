package ma.youcode.promotionmar.controllers;

import ma.youcode.promotionmar.dto.PromotionDto;
import ma.youcode.promotionmar.entities.Promotion;
import ma.youcode.promotionmar.mapper.PromotionDtoMapper;
import ma.youcode.promotionmar.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/promotion")
public class PromotionController {
    @Autowired
    private PromotionService promotionService;
    @Autowired
    private PromotionDtoMapper promotionDtoMapper;

    @PostMapping
    public String savePromotion(@RequestBody PromotionDto promotionDto){

         promotionService.savePromotion(promotionDto);
         return "promotion saved successfully";
//        try {
//            Promotion savedPromotion = promotionService.savePromotion(promotionDto);
//            PromotionDto savedPromotionDto = promotionDtoMapper.apply(savedPromotion);
//            return new ResponseEntity<>(savedPromotionDto, HttpStatus.CREATED);
//        } catch (Exception e){
//            e.printStackTrace();
//            return  new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
    }
    @GetMapping
    public List<PromotionDto> findAllUsers(){
        return promotionService.findAllPromotions();
    }
}
