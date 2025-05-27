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
 * Node style implementation that can show predefined shapes of type [ShapeNodeShape].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle">Online Documentation</a>
 * 
 * @constructor
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23ShapeNodeStyle-constructor-ShapeNodeStyle">Online Documentation</a>
 */
external class ShapeNodeStyle () : INodeStyle {
  /**
   * Gets or sets a CSS class that will be applied to the visualization.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23cssClass">Online Documentation</a>
   */
  final var cssClass: String
  
  /**
   * Gets or sets the [fill][ShapeNodeStyle] for this style.
   * 
   * The default value is [WHITE][yfiles.view.Color].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23fill">Online Documentation</a>
   */
  final var fill: Fill?
  
  /**
   * Gets or sets a value indicating whether to keep the intrinsic aspect ratio of the shape.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23keepIntrinsicAspectRatio">Online Documentation</a>
   */
  final var keepIntrinsicAspectRatio: Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23renderer">Online Documentation</a>
   */
  final override val renderer: INodeStyleRenderer
  
  /**
   * Gets or sets the shape for this style.
   * 
   * The default value is [RECTANGLE][ShapeNodeShape].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23shape">Online Documentation</a>
   */
  final var shape: ShapeNodeShape
  
  /**
   * Gets or sets the [stroke][ShapeNodeStyle] for this style.
   * 
   * The default value is [BLACK][Stroke].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23stroke">Online Documentation</a>
   */
  final var stroke: Stroke?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeStyle%23ShapeNodeStyle-method-clone">Online Documentation</a>
   */
  override fun clone(): ShapeNodeStyle
  
  companion object : ClassMetadata<ShapeNodeStyle> {
  }
}

inline fun ShapeNodeStyle(
    block: ShapeNodeStyle.() -> Unit
): ShapeNodeStyle {
    return ShapeNodeStyle()
        .apply(block)
}
