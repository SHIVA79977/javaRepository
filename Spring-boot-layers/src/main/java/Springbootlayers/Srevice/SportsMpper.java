package Springbootlayers.Srevice;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.boot.context.properties.PropertyMapper.Source;

import Springbootlayers.Entity.SportsDTO;
import Springbootlayers.Entity.SportsMan;

@Mapper
    public interface SportsMpper {
	
	@Mappings({@Mapping(source="sid", target="id"),
	              @Mapping(source="sname", target="name"),
	              @Mapping(source="sage", target="age"),
	              @Mapping(source="sjerseyNo", target="jerseyNo")})
         public SportsMan saveSportsMan( SportsDTO man);

        public SportsDTO saveSportsMan( Integer id);

        @Mappings({@Mapping(source="id", target="sid"),
                  @Mapping(source="name", target="sname"),
                  @Mapping(source="age", target="sage"),
                  @Mapping(source="jerseyNo", target="sjerseyNo")})
     public List<SportsDTO> sportsMansToSportsDTOs(List<SportsMan> sportsMan );

      @Mappings({@Mapping(source="id", target="sid"),
                 @Mapping(source="name", target="sname"),
                @Mapping(source="age", target="sage"),
                @Mapping(source="jerseyNo", target="sjerseyNo")})
     public SportsDTO getById(SportsMan man);
}
