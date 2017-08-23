package br.com.grupo3.casainteligente.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Localization {

    private Long longitude;
    private Long latitute;

}
