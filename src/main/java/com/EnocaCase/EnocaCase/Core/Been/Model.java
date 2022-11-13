package com.EnocaCase.EnocaCase.Core.Been;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Model {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
