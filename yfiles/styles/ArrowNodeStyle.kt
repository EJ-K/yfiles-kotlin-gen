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
 * Node style that supports different kinds of arrow shapes with configurable arrow tip angle and arrow shaft thickness.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23ArrowNodeStyle-constructor-ArrowNodeStyle">Online Documentation</a>
 */
external class ArrowNodeStyle () : INodeStyle {
  /**
   * Gets or sets the angle of the angled sides in radians.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23angle">Online Documentation</a>
   */
  final var angle: Double
  
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets the direction the shape points to.
   * 
   * The default value is [RIGHT][ArrowNodeDirection].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23direction">Online Documentation</a>
   */
  final var direction: ArrowNodeDirection
  
  /**
   * Gets or sets the [Fill] for filling the interior of the shape.
   * 
   * The default value is [WHITE][yfiles.view.Color].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23fill">Online Documentation</a>
   */
  final var fill: Fill?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * Gets or sets the thickness of the arrow shaft as a ratio of the node size.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23shaftRatio">Online Documentation</a>
   */
  final var shaftRatio: Double
  
  /**
   * Gets or sets the basic shape.
   * 
   * The default value is [ARROW][ArrowStyleShape].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23shape">Online Documentation</a>
   */
  final var shape: ArrowStyleShape
  
  /**
   * Gets or sets the [Stroke] used for drawing the outline of the shape.
   * 
   * The default value is [BLACK][Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23stroke">Online Documentation</a>
   */
  final var stroke: Stroke?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ArrowNodeStyle%23ArrowNodeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): ArrowNodeStyle
  
  companion object : ClassMetadata<ArrowNodeStyle> {
  }
}

inline fun ArrowNodeStyle(
    block: ArrowNodeStyle.() -> Unit
): ArrowNodeStyle {
    return ArrowNodeStyle()
        .apply(block)
}
