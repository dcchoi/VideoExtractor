import akka.actor.ActorSystem
import akka.stream.ActorMaterializer
import akka.http.scaladsl.Http
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server._
import ch.megard.akka.http.cors.CorsDirectives._

object Main {
  def main(args: Array[String]) {

    implicit val actorSystem = ActorSystem("system")
    implicit val actorMaterializer = ActorMaterializer()


    val route :  Route = cors() {
      pathSingleSlash {
              get {
                complete {
                  "Hello world"
                }
              }
      }
    }
    Http().bindAndHandle(route, "localhost", 8080)



  }
}