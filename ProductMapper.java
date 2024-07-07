package FinalProject.OnlineMarket.mapper;

import FinalProject.OnlineMarket.dto.ProductDTO;
import FinalProject.OnlineMarket.model.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO productDTO);
}
