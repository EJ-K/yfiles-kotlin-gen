// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.styles

/**
 * Provides constants for shapes that [LabelStyle] can wrap text into.
 * @see [LabelStyle.textWrappingShape]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape">Online Documentation</a>
 */

sealed external class TextWrappingShape {
  /**
   * A rectangular shape.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23RECTANGLE">Online Documentation</a>
   */
  object RECTANGLE: TextWrappingShape
  
  /**
   * A rectangular shape with rounded corners.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23ROUND_RECTANGLE">Online Documentation</a>
   */
  object ROUND_RECTANGLE: TextWrappingShape
  
  /**
   * An elliptical shape.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23ELLIPSE">Online Documentation</a>
   */
  object ELLIPSE: TextWrappingShape
  
  /**
   * A triangular shape that points to the top.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRIANGLE">Online Documentation</a>
   */
  object TRIANGLE: TextWrappingShape
  
  /**
   * A triangular shape that points to the bottom.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRIANGLE_POINTING_DOWN">Online Documentation</a>
   */
  object TRIANGLE_POINTING_DOWN: TextWrappingShape
  
  /**
   * A triangular shape that points to the left.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRIANGLE_POINTING_LEFT">Online Documentation</a>
   */
  object TRIANGLE_POINTING_LEFT: TextWrappingShape
  
  /**
   * A triangular shape that points to the right.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23TRIANGLE_POINTING_RIGHT">Online Documentation</a>
   */
  object TRIANGLE_POINTING_RIGHT: TextWrappingShape
  
  /**
   * A symmetric parallelogram shape that has sloped edges.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23DIAMOND">Online Documentation</a>
   */
  object DIAMOND: TextWrappingShape
  
  /**
   * A 5-sided polygon with a tip at the top.
   * 
   * Value - `8`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23PENTAGON">Online Documentation</a>
   */
  object PENTAGON: TextWrappingShape
  
  /**
   * An 8-sided polygon where the edges are aligned with the edges of the bounding box.
   * 
   * Value - `9`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23OCTAGON">Online Documentation</a>
   */
  object OCTAGON: TextWrappingShape
  
  /**
   * An 8-sided polygon with the tips touching the edges of the bounding box.
   * 
   * Value - `10`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23OCTAGON_STANDING">Online Documentation</a>
   */
  object OCTAGON_STANDING: TextWrappingShape
  
  /**
   * A 6-sided polygon where the top and bottom edges are aligned with the top and bottom edges of the bounding box.
   * 
   * Value - `11`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23HEXAGON">Online Documentation</a>
   */
  object HEXAGON: TextWrappingShape
  
  /**
   * A 6-sided polygon where the left and right edges are aligned with the left and right edges of the bounding box.
   * 
   * Value - `12`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23HEXAGON_STANDING">Online Documentation</a>
   */
  object HEXAGON_STANDING: TextWrappingShape
  
  /**
   * A stadium shape with the shorter sides rounded.
   * 
   * Value - `13`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23PILL">Online Documentation</a>
   */
  object PILL: TextWrappingShape
  
  /**
   * The [LabelShape] set as [shape][LabelStyle].
   * 
   * Value - `14`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TextWrappingShape%23LABEL_SHAPE">Online Documentation</a>
   */
  object LABEL_SHAPE: TextWrappingShape
}
