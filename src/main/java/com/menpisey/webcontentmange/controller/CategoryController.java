package com.menpisey.webcontentmange.controller;

import com.menpisey.webcontentmange.models.req.BaseReponse;
import com.menpisey.webcontentmange.repository.CategoryRepository;
import com.menpisey.webcontentmange.service.CategoryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "http://localhost:5173")
public class CategoryController {
    private final CategoryService categoryService;
    private BaseReponse baseRespone;
    @GetMapping("/api/categories")
    public ResponseEntity<Object> getAllCategories() {
        log.info("getAllCategories");
        try {
            var list = categoryService.getAllCategories();
            baseRespone = new BaseReponse();
            baseRespone.setMessage("Success");
            baseRespone.setMessageKh("ជោគជ័យ");
            baseRespone.setStatus("200");
            baseRespone.setData(list);

            return new  ResponseEntity<>(baseRespone, HttpStatus.OK);
        }catch (Throwable e){
            return new ResponseEntity<>(baseRespone, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
}
