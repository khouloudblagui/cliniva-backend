package com.example.parameterization.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_ky", unique = true)
    private Integer ingredientKy;

    @Column(name = "ingredient_name", nullable = false)
    private String ingredientName;

    @Column(name = "ingredient_desc", nullable = false)
    private String ingredientDesc;

    @OneToMany(mappedBy = "ing")
    private List<MedicIngredientLink> MedicIngredientLinks;

}



