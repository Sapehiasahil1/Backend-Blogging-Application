package com.sahilsapehia.blog.blogappapis.payloads;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
    
    private Integer categoryId;

    @NotBlank
    @Size(min = 4, message = "The title should contain min of 4 characters")
    private String categoryTitle;

    @NotBlank
    @Size(min =4, message = "The description should contain min of 4 characters")
    private String categoryDescription;
}
