/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2018 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

package com.chrisrm.idea.themes.themes;

import com.chrisrm.idea.MTConfig;
import com.chrisrm.idea.MTCustomThemeConfig;
import com.chrisrm.idea.utils.MTColorUtils;
import org.jetbrains.annotations.NotNull;

import javax.swing.plaf.ColorUIResource;

@SuppressWarnings("DesignForExtension")
public class MTLightCustomTheme extends MTAbstractTheme {
  @NotNull
  @Override
  public String getThemeId() {
    return "mt.light_custom";
  }

  @Override
  public ColorUIResource getBackgroundColorResource() {
    return MTCustomThemeConfig.getInstance().getBackgroundColorString();
  }

  @Override
  public ColorUIResource getForegroundColorResource() {
    return MTCustomThemeConfig.getInstance().getForegroundColorString();
  }

  @Override
  public ColorUIResource getTextColorResource() {
    return MTCustomThemeConfig.getInstance().getTextColorString();
  }

  @Override
  public ColorUIResource getSelectionBackgroundColorResource() {
    return MTCustomThemeConfig.getInstance().getSelectionBackgroundColorString();
  }

  @Override
  public ColorUIResource getSelectionForegroundColorResource() {
    return MTCustomThemeConfig.getInstance().getSelectionForegroundColorString();
  }

  @Override
  public ColorUIResource getButtonColorResource() {
    return MTCustomThemeConfig.getInstance().getButtonColorString();
  }

  @Override
  public ColorUIResource getSecondaryBackgroundColorResource() {
    return MTCustomThemeConfig.getInstance().getSecondaryBackgroundColorString();
  }

  @Override
  public ColorUIResource getDisabledColorResource() {
    return MTCustomThemeConfig.getInstance().getDisabledColorString();
  }

  @Override
  public ColorUIResource getContrastColorResource() {
    return MTCustomThemeConfig.getInstance().getContrastColorString();
  }

  @Override
  public ColorUIResource getTableSelectedColorResource() {
    return MTCustomThemeConfig.getInstance().getTableSelectedColorString();
  }

  @Override
  public ColorUIResource getSecondBorderColorResource() {
    return MTCustomThemeConfig.getInstance().getSecondBorderColorString();
  }

  @Override
  public ColorUIResource getHighlightColorResource() {
    return MTCustomThemeConfig.getInstance().getHighlightColorString();
  }

  @Override
  public ColorUIResource getTreeSelectionColorResource() {
    return MTCustomThemeConfig.getInstance().getTreeSelectionColorString();
  }

  @Override
  public ColorUIResource getNotificationsColorResource() {
    return MTCustomThemeConfig.getInstance().getNotificationsColorString();
  }

  @Override
  public ColorUIResource getAccentColorResource() {
    return MTColorUtils.parseColor(MTConfig.getInstance().getAccentColor());
  }

  @Override
  public ColorUIResource getExcludedColorResource() {
    // todo use contrastify
    return new ColorUIResource(0xeae8e8);
  }

  @Override
  public boolean isCustom() {
    return true;
  }
}
