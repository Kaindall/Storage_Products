package br.com.kaindall.products.infrastructure.jpa.entities;

import br.com.kaindall.products.domain.utils.enums.RegistryTypes;
import br.com.kaindall.products.domain.models.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="registries")
public class RegistryEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_product")
    private ProductEntity product;

    private RegistryTypes type;

    private int quantity;

    private LocalDateTime date;
}
