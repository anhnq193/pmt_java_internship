package com.tokuda.pmt.controller;

import com.tokuda.pmt.entity.MakerEntity;
import com.tokuda.pmt.entity.api.ApiEntity;
import com.tokuda.pmt.service.model.MakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/maker")
public class MakerApiController {

    private final MakerService makerService;

    @Autowired
    public MakerApiController(MakerService makerService) {
        this.makerService = makerService;
    }

    @GetMapping
    public ResponseEntity<ApiEntity> index(@RequestParam(name = "page_number", defaultValue = "1") int pageNumber, @RequestParam(name = "page_size", defaultValue = "30") int pageSize){
        Page<MakerEntity> page = makerService.getPage(pageNumber, pageSize);
        ApiEntity<Page> apiEntity = new ApiEntity<>("ok", page);
        return ResponseEntity.ok(apiEntity);
    }

    @PostMapping
    public ResponseEntity<ApiEntity> store(RequestEntity<MakerEntity> makerRequestEntity){
        MakerEntity makerEntity = makerRequestEntity.getBody();
        // validate??
        Optional<MakerEntity> optionalMakerEntity = makerService.findById(makerEntity.getId());
        if(optionalMakerEntity.isPresent()){
            ApiEntity<Void> apiEntity = new ApiEntity<>("exist", "manufacturer is exist");
            return ResponseEntity.ok(apiEntity);
        }
        makerService.save(makerEntity);
        ApiEntity<Void> apiEntity = new ApiEntity<>("ok", "manufacturer was saved");
        return ResponseEntity.ok(apiEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiEntity> show(@PathVariable("id") int id){
        Optional<MakerEntity> optionalMakerEntity = makerService.findById(id);
        if(!optionalMakerEntity.isPresent()){
            ApiEntity<Void> apiEntity = new ApiEntity<>("not found", "manufacturer not found");
            return ResponseEntity.ok(apiEntity);
        }
        ApiEntity<MakerEntity> apiEntity = new ApiEntity<>("ok", optionalMakerEntity.get());
        return ResponseEntity.ok(apiEntity);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiEntity> update(@PathVariable("id") int id, RequestEntity<MakerEntity> makerRequestEntity){
        MakerEntity makerEntity = makerRequestEntity.getBody();
        // validate??
        makerService.update(makerEntity);
        ApiEntity<Void> apiEntity = new ApiEntity<>("ok","manufacturer was updated");
        return ResponseEntity.ok(apiEntity);
    }
}
