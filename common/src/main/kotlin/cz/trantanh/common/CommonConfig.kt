package cz.trantanh.common

import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * @author Tran Tuan Anh, tran.t.anh(@)email.cz
 * 28.04.2020
 */
@Configuration
class CommonConfig {

    @Bean
    fun jsonMapper(): ObjectMapper {
        return ObjectMapper()
            .registerModule(KotlinModule(nullisSameAsDefault = true))
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
    }

}