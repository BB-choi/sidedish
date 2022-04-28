package com.sidedish.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@Getter
@Table("sidedish")
public class SideDish {

    @Id
    private Integer id;
    private Integer eventCategoryId;
    private Integer menuCategoryId;
    private String name;
    private String description;
    private boolean dawnDeliveryFlag;
    private boolean wholeNationDeliveryFlag;
    private Integer price;
    private Integer discountRate;
    private String discountType;
    private LocalDateTime createdDateTime;
    private LocalDateTime modifiedDateTime;

    @MappedCollection(idColumn = "sidedish_id", keyColumn = "id")
    private List<ImageFile> imageFiles;

    public String getMainImage() {
        String saveFileName = null;
        for (ImageFile imageFile : imageFiles) {
            if (imageFile.isMainImageType()) {
                saveFileName = imageFile.getSaveFileName();
            }
        }

        return saveFileName;
    }

    public List<String> getSaveFileNames() {
        List<String> saveFileNames = new ArrayList<>();
        for (ImageFile imageFile : imageFiles) {
            saveFileNames.add(imageFile.getSaveFileName());
        }

        return saveFileNames;
    }
}
