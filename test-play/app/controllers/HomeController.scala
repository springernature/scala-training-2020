package controllers

import java.util.Date

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.ConfigLoader.stringLoader

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(val controllerComponents: ControllerComponents, config: Configuration) extends BaseController {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index("Piyush", new Date()))
    //val name = "Piyush"
    //Ok("<html><body> <b> dummy html = " + name + " </b> </body></html>")
  }


  def home() = Action { implicit request: Request[AnyContent] =>
    val inputName = request.getQueryString("name")
    Ok(views.html.home( List("Piyush", "Raghav", "Anis", inputName.getOrElse("NotFound")), new Date()))

    //val name = "Piyush"
    //Ok("<html><body> <b> dummy html = " + name + " </b> </body></html>")
  }

  def newhome(inputName:String) = Action {
    val appName = config.get("APP_NAME")
    val appDate = config.get("APP_DATE")
    Ok(views.html.home( List("Piyush", "Raghav", "Anis", inputName, appName, appDate), new Date()))

    //val name = "Piyush"
    //Ok("<html><body> <b> dummy html = " + name + " </b> </body></html>")
  }

}
