package com.menpisey.webcontentmange.models;

import com.menpisey.webcontentmange.models.req.ItemValue;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "categories")
@Getter
@Setter
@ToString
@Entity
public class Category {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nameKh;
    private String status;
    transient
    private ItemValue statusList;
}
