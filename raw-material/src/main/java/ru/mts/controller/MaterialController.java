package ru.mts.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.mts.dto.MaterialRequest;
import ru.mts.service.RawMaterialService;

@RestController
public class MaterialController {
    private RawMaterialService rawMaterialService;

    public MaterialController(@Autowired RawMaterialService rawMaterialService) {
        this.rawMaterialService = rawMaterialService;
    }

    @PostMapping("/material")
    public ResponseEntity<String> create(@RequestBody MaterialRequest request) {

        try {
            rawMaterialService.saveAll(request.getCount(), request.getType());
        } catch (InterruptedException exc) {
            //
        }
    }
}
