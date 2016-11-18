package no.vestein.sudoku

import com.badlogic.gdx.assets.AssetManager
import com.badlogic.gdx.{Application, Game, Gdx}
import no.vestein.sudoku.assets.Assets
import no.vestein.sudoku.screens.MenuScreen

/**
  * Created by Vestein Dahl
  * Date: 17.11.2016
  * Time: 23.57
  */
object Sudoku extends Game {

  override def create() {
    Gdx.app.setLogLevel(Application.LOG_DEBUG)

    Assets.init(new AssetManager())

    setScreen(new MenuScreen(this))
  }

}
