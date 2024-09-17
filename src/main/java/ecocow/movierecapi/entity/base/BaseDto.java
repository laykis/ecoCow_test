package ecocow.movierecapi.entity.base;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDto implements Serializable {

    private LocalDateTime regDate;
    private LocalDateTime updDate;
}
