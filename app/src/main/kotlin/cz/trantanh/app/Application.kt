package cz.trantanh.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * @author Tran Tuan Anh, tran.t.anh(@)email.cz
 * 28.04.2020
 */
@SpringBootApplication
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
