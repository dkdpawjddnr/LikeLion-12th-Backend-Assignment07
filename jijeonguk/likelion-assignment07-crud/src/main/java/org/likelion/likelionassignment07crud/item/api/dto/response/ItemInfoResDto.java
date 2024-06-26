package org.likelion.likelionassignment07crud.item.api.dto.response;

import lombok.Builder;
import org.likelion.likelionassignment07crud.item.domain.Item;

@Builder
public record ItemInfoResDto(
        String name,
        int price,
        int stockQuantity
) {
    public static ItemInfoResDto from(Item item) {
        return ItemInfoResDto.builder()
                .name(item.getName())
                .price(item.getPrice())
                .stockQuantity(item.getStockQuantity())
                .build();
    }
}
