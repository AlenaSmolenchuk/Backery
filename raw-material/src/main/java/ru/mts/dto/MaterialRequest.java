package ru.mts.dto;

import ru.mts.entity.MaterialType;

public class MaterialRequest {
    private Integer count;
    private MaterialType type;

    public void setCount(Integer count) {
        this.count = count;
    }

    public void setType(MaterialType type) {
        this.type = type;
    }

    public Integer getCount() {
        return count;
    }

    public MaterialType getType() {
        return type;
    }

    public MaterialRequest(Integer count, MaterialType type) {
        this.count = count;
        this.type = type;
    }
}
