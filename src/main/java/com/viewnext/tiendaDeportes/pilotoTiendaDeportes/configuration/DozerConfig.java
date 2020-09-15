package com.viewnext.tiendaDeportes.pilotoTiendaDeportes.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DozerConfig {
	
	@Bean
    public Mapper getMapper() {
        
		//List<String> mappingFiles = Arrays.asList("dozer-configuration-mapping.xml");
		//DozerBeanMapper dozerBean = new DozerBeanMapper();
		//dozerBean.setMappingFiles(mappingFiles);
		//return dozerBean;
		List<String> conf = new ArrayList<String>();
		conf.add("dozer-configuration-mapping.xml");
		Mapper mapper = new DozerBeanMapper(conf);
        return mapper;
        
        
        
        
    }

}
