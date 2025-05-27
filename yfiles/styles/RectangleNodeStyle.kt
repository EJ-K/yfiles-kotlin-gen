// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

import yfiles.lang.ClassMetadata
import yfiles.view.Fill
import yfiles.view.Stroke

/**
 * Node style that uses a rectangular shape as a basis and supports configurable round or diagonal corners.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23RectangleNodeStyle-constructor-RectangleNodeStyle">Online Documentation</a>
 */
external class RectangleNodeStyle () : INodeStyle {
  /**
   * Gets or sets the size of the corners.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23cornerSize">Online Documentation</a>
   */
  final var cornerSize: Double
  
  /**
   * Gets or sets the [RectangleCornerStyle] that defines how the affected [corners][RectangleNodeStyle] are drawn.
   * 
   * The default value is [ROUND][RectangleCornerStyle].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23cornerStyle">Online Documentation</a>
   */
  final var cornerStyle: RectangleCornerStyle
  
  /**
   * Gets or sets which corners are drawn with the chosen [cornerStyle][RectangleNodeStyle].
   * 
   * The default value is [ALL][RectangleCorners].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23corners">Online Documentation</a>
   */
  final var corners: RectangleCorners
  
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets the [Fill] for filling the interior of the shape.
   * 
   * The default value is [WHITE][yfiles.view.Color].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23fill">Online Documentation</a>
   */
  final var fill: Fill?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * Gets or sets whether the [cornerSize][RectangleNodeStyle] property is interpreted as absolute or scaled by the node size.
   * 
   * The default value is `false`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23scaleCornerSize">Online Documentation</a>
   */
  final var scaleCornerSize: Boolean
  
  /**
   * Gets or sets the [Stroke] used for drawing the outline of the shape.
   * 
   * The default value is [BLACK][Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23stroke">Online Documentation</a>
   */
  final var stroke: Stroke?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RectangleNodeStyle%23RectangleNodeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): RectangleNodeStyle
  
  companion object : ClassMetadata<RectangleNodeStyle> {
  }
}

inline fun RectangleNodeStyle(
    block: RectangleNodeStyle.() -> Unit
): RectangleNodeStyle {
    return RectangleNodeStyle()
        .apply(block)
}
