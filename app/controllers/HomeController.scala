package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * Autores:
 * Sebastian Montoya J.
 * Juan Diego Goez
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc)
{
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  
}
