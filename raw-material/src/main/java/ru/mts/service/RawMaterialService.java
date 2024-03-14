package ru.mts.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.mts.entity.MaterialType;
import ru.mts.entity.RawMaterial;
import ru.mts.repository.RawMaterialRepository;

import java.util.List;

public class RawMaterialService {
    private final RawMaterialRepository rawMaterialRepository;

    public RawMaterialService(@Autowired RawMaterialRepository rawMaterialRepository) {
        this.rawMaterialRepository = rawMaterialRepository;
    }

    public void saveAll(Integer count, MaterialType type) throws InterruptedException {
        for (int i = 0; i < count; i++) {
            switch (type) {
                case TEA:
                    Thread.sleep(MaterialType.TEA.getProducingTime());
                case COFFEE:
                    Thread.sleep(MaterialType.COFFEE.getProducingTime());
                case BERRY:
                    Thread.sleep(MaterialType.BERRY.getProducingTime());
                case FISH:
                    Thread.sleep(MaterialType.FISH.getProducingTime());
                case CABBAGE:
                    Thread.sleep(MaterialType.CABBAGE.getProducingTime());
                case MEAT:
                    Thread.sleep(MaterialType.MEAT.getProducingTime());
                case DOUGH:
                    Thread.sleep(MaterialType.DOUGH.getProducingTime());
            }
            rawMaterialRepository.save(new RawMaterial(type));
        }
    }
}
