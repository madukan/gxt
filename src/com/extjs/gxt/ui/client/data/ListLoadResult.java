/*
 * Sencha GXT 2.3.1 - Sencha for GWT
 * Copyright(c) 2007-2013, Sencha, Inc.
 * licensing@sencha.com
 * 
 * http://www.sencha.com/products/gxt/license/
 */
 package com.extjs.gxt.ui.client.data;

import java.util.List;

/**
 * Load result interface for list based load results.
 * 
 * @param <Data> the result data type
 */
public interface ListLoadResult<Data> {

  /**
   * Returns the remote data.
   * 
   * @return the data
   */
  public List<Data> getData();

}
