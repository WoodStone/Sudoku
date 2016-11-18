package no.vestein.sudoku.screens

import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.{Game, Gdx}
import no.vestein.sudoku.{WorldController, WorldRenderer}
import no.vestein.sudoku.eventhandler.EventBus

/**
  * Created by Vestein Dahl
  * Date: 18.11.2016
  * Time: 00.38
  */
class GameScreen(game: Game) extends AbstractScreen(game) {

  private var worldController: WorldController = _
  private var worldRenderer: WorldRenderer = _
  private var paused: Boolean = _

  val EVENT_BUS: EventBus = new EventBus
  val TAG: String = getClass.getName

  override def render(deltaTime: Float) {
    if (!paused) {
      worldController.update(deltaTime)
    }

    Gdx.gl.glClearColor(0xff/255.0f, 0xff/255.0f, 0xff/255.0f, 0xff/255.0f)
    Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)

    worldRenderer.render
  }

  override def resize(width: Int, height: Int) {
    worldRenderer.resize(width, height)
  }

  override def show() {

  }

  override def hide(): Unit = ???

  override def pause(): Unit = ???
}
