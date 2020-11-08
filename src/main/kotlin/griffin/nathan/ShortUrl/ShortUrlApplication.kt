package griffin.nathan.ShortUrl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
class ShortUrlApplication

fun main(args: Array<String>) {
	runApplication<ShortUrlApplication>(*args)
}
