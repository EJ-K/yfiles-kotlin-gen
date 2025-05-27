// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.geometry.Insets
import yfiles.geometry.Size
import yfiles.graph.ILabelModelParameter
import yfiles.lang.ClassMetadata
import yfiles.view.Fill
import yfiles.view.Stroke

/**
 * A label style that [wraps][IconLabelStyle] another [ILabelStyle] and draws an icon in addition to the text.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle">Online Documentation</a>
 * 
 * @constructor Creates a new instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23IconLabelStyle-constructor-IconLabelStyle">Online Documentation</a>
 */
open external class IconLabelStyle () : ILabelStyle {
  /**
   * Gets a value indicating whether to automatically flip the rendering should the [layout][yfiles.graph.ILabel]'s [up vector][yfiles.geometry.IOrientedRectangle] point downwards.
   * 
   * The default value is `true`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23autoFlip">Online Documentation</a>
   */
  final var autoFlip: Boolean
  
  /**
   * Gets or sets the [Fill] of the icon [backgroundShape][IconLabelStyle] for this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23backgroundFill">Online Documentation</a>
   */
  final var backgroundFill: Fill?
  
  /**
   * Gets or sets the icon background shape for this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23backgroundShape">Online Documentation</a>
   */
  final var backgroundShape: ShapeNodeShape
  
  /**
   * Gets or sets the [Stroke] of the icon [backgroundShape][IconLabelStyle] for this style.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23backgroundStroke">Online Documentation</a>
   */
  final var backgroundStroke: Stroke?
  
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets the [href][IconLabelStyle] of the icon.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23href">Online Documentation</a>
   */
  final var href: String
  
  /**
   * Gets or sets the parameter that specifies the icon placement.
   * @throws ArgumentError `value` is null.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23iconPlacement">Online Documentation</a>
   */
  final var iconPlacement: ILabelModelParameter
  
  /**
   * Gets or sets the size of the icon to render for the label.
   * 
   * The default value is 24 x 24.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23iconSize">Online Documentation</a>
   */
  final var iconSize: Size
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: ILabelStyleRenderer
  
  /**
   * Gets or sets the style that renders the text of the label and possibly its background.
   * @throws ArgumentError `value` is null.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23wrappedStyle">Online Documentation</a>
   */
  final var wrappedStyle: ILabelStyle
  
  /**
   * Gets or sets the padding that should be applied for the [layout][yfiles.graph.ILabel] of the [wrappedStyle][IconLabelStyle] style rendering.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23wrappedStylePadding">Online Documentation</a>
   */
  final var wrappedStylePadding: Insets
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/IconLabelStyle%23IconLabelStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): IconLabelStyle
  
  companion object : ClassMetadata<IconLabelStyle> {
  }
}

inline fun IconLabelStyle(
    block: IconLabelStyle.() -> Unit
): IconLabelStyle {
    return IconLabelStyle()
        .apply(block)
}
