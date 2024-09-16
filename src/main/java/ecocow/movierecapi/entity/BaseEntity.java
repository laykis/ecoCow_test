package ecocow.movierecapi.entity;

import javax.persistence.Column;
import java.time.LocalDateTime;

public class BaseEntity {

    @Column(name = "REG_DATE")
    private LocalDateTime regDate;

    @Column(name = "UPD_DATE")
    private LocalDateTime updDate;
}
