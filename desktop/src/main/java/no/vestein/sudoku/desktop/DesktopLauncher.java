package no.vestein.sudoku.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import no.vestein.sudoku.Reference;
import no.vestein.sudoku.Sudoku$;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = Reference.WIDTH();
		config.height = Reference.HEIGHT();
		config.samples = 0;
		new LwjglApplication(Sudoku$.MODULE$, config);
	}
}
