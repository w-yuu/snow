package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok("start Snow Project!")
  }
  
  def initEntry = Action {
    Ok(views.html.entry("Users"))
  }
  def login = Action {
    Ok(views.html.home("home"))
  }
  
  def reissuePassword = Action {
    Ok(views.html.pwreissue("pwreissue"))
  }
  
  def completeReissued = Action {
    Ok(views.html.pwreissueComplete("pwreissueComplete"))
  }
}