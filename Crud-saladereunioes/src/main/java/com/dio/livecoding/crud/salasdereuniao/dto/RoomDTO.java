package com.dio.livecoding.crud.salasdereuniao.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RoomDTO {

    private long id;

    @NotEmpty
    @Size(min = 2, max = 50)
    private String name;

    @NotEmpty
    @Size(min = 5, max = 9)
    private String date;

    @NotEmpty
    @Size(min = 5, max = 5)
    private String startHour;

    @NotEmpty
    @Size(min = 5, max = 5)
    private String endHour;

}
