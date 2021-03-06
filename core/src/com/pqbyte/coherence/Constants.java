package com.pqbyte.coherence;

public final class Constants {
  private static final boolean DEBUG = false;

  public static boolean isDebug() {
    return DEBUG;
  }

  public static final int WORLD_WIDTH = 100;
  public static final int WORLD_HEIGHT = 100;

  /* Mask flags for Box2D filters. */
  public static final short PLAYER_ENTITY = 0x1;
  public static final short BULLET_ENTITY = 0x2;
  public static final short WORLD_ENTITY = 0x3;
}
