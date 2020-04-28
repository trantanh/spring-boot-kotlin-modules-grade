package cz.trantanh.service

import cz.trantanh.common.CommonConfig
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

/**
 * @author Tran Tuan Anh, tran.t.anh(@)email.cz
 * 28.04.2020
 */
@Configuration
@Import(CommonConfig::class)
class ServiceConfig