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
 * Provides constants for shapes that [ShapeNodeStyle] instances can render.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape">Online Documentation</a>
 */

sealed external class ShapeNodeShape {
  /**
   * A rectangular shape.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23RECTANGLE">Online Documentation</a>
   */
  object RECTANGLE: ShapeNodeShape
  
  /**
   * A rectangular shape with rounded corners.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23ROUND_RECTANGLE">Online Documentation</a>
   */
  object ROUND_RECTANGLE: ShapeNodeShape
  
  /**
   * An elliptical shape.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23ELLIPSE">Online Documentation</a>
   */
  object ELLIPSE: ShapeNodeShape
  
  /**
   * A triangular shape that points to the top.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23TRIANGLE">Online Documentation</a>
   */
  object TRIANGLE: ShapeNodeShape
  
  /**
   * A triangular shape that points to the right.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23TRIANGLE_POINTING_RIGHT">Online Documentation</a>
   */
  object TRIANGLE_POINTING_RIGHT: ShapeNodeShape
  
  /**
   * A triangular shape that points to the bottom.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23TRIANGLE_POINTING_DOWN">Online Documentation</a>
   */
  object TRIANGLE_POINTING_DOWN: ShapeNodeShape
  
  /**
   * A triangular shape that points to the left.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23TRIANGLE_POINTING_LEFT">Online Documentation</a>
   */
  object TRIANGLE_POINTING_LEFT: ShapeNodeShape
  
  /**
   * A 5-pointed star with one tip that points to the top.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23STAR5">Online Documentation</a>
   */
  object STAR5: ShapeNodeShape
  
  /**
   * A 6-pointed star.
   * 
   * Value - `8`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23STAR6">Online Documentation</a>
   */
  object STAR6: ShapeNodeShape
  
  /**
   * An 8-pointed star.
   * 
   * Value - `9`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23STAR8">Online Documentation</a>
   */
  object STAR8: ShapeNodeShape
  
  /**
   * A symmetric parallelogram shape that has sloped edges.
   * 
   * Value - `10`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23DIAMOND">Online Documentation</a>
   */
  object DIAMOND: ShapeNodeShape
  
  /**
   * An 8-sided polygon where the edges are aligned with the edges of the bounding box.
   * 
   * Value - `11`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23OCTAGON">Online Documentation</a>
   */
  object OCTAGON: ShapeNodeShape
  
  /**
   * An 8-sided polygon with the tips touching the edges of the bounding box.
   * 
   * Value - `12`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23OCTAGON_STANDING">Online Documentation</a>
   */
  object OCTAGON_STANDING: ShapeNodeShape
  
  /**
   * A 5-sided polygon with the tip at the top.
   * 
   * Value - `13`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23PENTAGON">Online Documentation</a>
   */
  object PENTAGON: ShapeNodeShape
  
  /**
   * A 6-sided polygon where the top and bottom edges are aligned with the top and bottom edges of the bounding box.
   * 
   * Value - `14`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23HEXAGON">Online Documentation</a>
   */
  object HEXAGON: ShapeNodeShape
  
  /**
   * A 6-sided polygon where the left and right edges are aligned with the left and right edges of the bounding box.
   * 
   * Value - `15`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23HEXAGON_STANDING">Online Documentation</a>
   */
  object HEXAGON_STANDING: ShapeNodeShape
  
  /**
   * A stadium shape with the shorter sides rounded.
   * 
   * Value - `16`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeNodeShape%23PILL">Online Documentation</a>
   */
  object PILL: ShapeNodeShape
}
