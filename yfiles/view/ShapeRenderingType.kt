// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

/**
 * This enumeration contains the valid values for the `shape-rendering` property of SVG shape elements.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeRenderingType">Online Documentation</a>
 */

sealed external class ShapeRenderingType {
  /**
   * Indicates that the rendering engine should use a balanced setup with a slight preference of geometric precision.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeRenderingType%23AUTO">Online Documentation</a>
   */
  object AUTO: ShapeRenderingType
  
  /**
   * Indicates that the rendering speed should be optimized.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeRenderingType%23OPTIMIZE_SPEED">Online Documentation</a>
   */
  object OPTIMIZE_SPEED: ShapeRenderingType
  
  /**
   * Indicates that the rendering should be optimized for crisp edges.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeRenderingType%23CRISP_EDGES">Online Documentation</a>
   */
  object CRISP_EDGES: ShapeRenderingType
  
  /**
   * Indicates that the rendering should be optimized for geometric precision.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeRenderingType%23GEOMETRIC_PRECISION">Online Documentation</a>
   */
  object GEOMETRIC_PRECISION: ShapeRenderingType
  
  /**
   * Indicates that the setting for the rendering quality should be inherited from the parent.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ShapeRenderingType%23INHERIT">Online Documentation</a>
   */
  object INHERIT: ShapeRenderingType
}
