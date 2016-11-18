package no.vestein.sudoku.screens

import com.badlogic.gdx.{Game, Screen}

/**
  * Created by Vestein Dahl
  * Date: 18.11.2016
  * Time: 00.03
  */
abstract class AbstractScreen(protected var game: Game) extends Screen {

  def render(deltaTime: Float)
  def resize(width: Int, height: Int)
  def show()
  def hide()
  def pause()

  def resume() {
    //TODO
//    Assets.instance.init(new AssetsManager())
  }

  def dispose(): Unit = {
    //TODO
//    Assets.instance.dispose()
  }

}
