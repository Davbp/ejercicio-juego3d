package com.mygdx3d29bpdj.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import ej1.UD4_3_Cam3dModAnim;
import ej2.UD4_2_ColFue;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new UD4_2_ColFue(), config);
	}
}
