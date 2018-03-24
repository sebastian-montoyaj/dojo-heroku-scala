package controllers

import javax.inject._
import play.api._
import play.api.mvc._

import javax.measure.unit.SI.KILOGRAM
import javax.measure.quantity.Mass
import org.jscience.physics.model.RelativisticModel
import org.jscience.physics.amount.Amount

/**
 * Autores:
 * Sebastian Montoya J.
 * Juan Diego Goez
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc)
{
  def index() = Action { implicit request: Request[AnyContent] =>
    RelativisticModel.select()
    val m = Amount.valueOf("12 GeV").to(KILOGRAM)
    val testRelativity = s"E=mc^2: 12 GeV = $m"
    Ok(views.html.index())
  }

  def mostrarClima()
  {
    println("Hola mundo")
  }
}
