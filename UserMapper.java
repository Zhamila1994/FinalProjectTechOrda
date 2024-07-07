package FinalProject.OnlineMarket.mapper;

import FinalProject.OnlineMarket.dto.UserDTO;
import FinalProject.OnlineMarket.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO toDTO(User user);
    User toEntity(UserDTO userDTO);
}
