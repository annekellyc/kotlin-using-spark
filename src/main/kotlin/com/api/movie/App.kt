import com.api.movie.web.ApiBootstrap
import org.springframework.context.annotation.AnnotationConfigApplicationContext
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan(value = "com.api.movie" )
open class App {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            var port = extractPort(args)

            val ctx = AnnotationConfigApplicationContext(App::class.java)
            val api = ctx.getBean(ApiBootstrap::class.java)
            api.init(port)
        }

        private fun extractPort(args: Array<String>) : Int {
            if(args != null && args.size > 0) {
                return args[0].toInt()
            } else  {
                return 8080
            }
        }
    }
}