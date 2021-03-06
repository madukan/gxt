/*
 * Sencha GXT 2.3.1 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
 package com.extjs.gxt.ui.client.event;

import com.extjs.gxt.ui.client.fx.Effect;
import com.extjs.gxt.ui.client.fx.Fx;

/**
 * Fx event type.
 * 
 * @see Fx
 */
public class FxEvent extends BaseEvent {

  private Effect effect;
  private Fx fx;

  public FxEvent(Fx fx, Effect effect) {
    super(fx);
    this.fx = fx;
    this.effect = effect;
  }

  /**
   * Returns the effect.
   * 
   * @return the effect
   */
  public Effect getEffect() {
    return effect;
  }

  /**
   * Returns the source fx.
   * 
   * @return the fx
   */
  public Fx getFx() {
    return fx;
  }

  /**
   * Sets the effect.
   * 
   * @param effect the effect
   */
  public void setEffect(Effect effect) {
    this.effect = effect;
  }

  /**
   * Sets the fx.
   * 
   * @param fx the fx
   */
  public void setFx(Fx fx) {
    this.fx = fx;
  }

}
