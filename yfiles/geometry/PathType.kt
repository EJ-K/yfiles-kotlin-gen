// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.geometry

/**
 * An enumeration of all possible types that make up a [GeneralPath]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathType">Online Documentation</a>
 */

sealed external class PathType {
  /**
   * The type that is used to move the [yfiles.view.Stroke] to the next position.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathType%23MOVE_TO">Online Documentation</a>
   */
  object MOVE_TO: PathType
  
  /**
   * The type that is used to add a line from the current position to the next position.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathType%23LINE_TO">Online Documentation</a>
   */
  object LINE_TO: PathType
  
  /**
   * The type that is used to add a quadratic Bézier curve from the current position to the next position using one control point.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathType%23QUAD_TO">Online Documentation</a>
   */
  object QUAD_TO: PathType
  
  /**
   * The type that is used to add a cubic Bézier curve from the current position to the next position using two intermediate control points.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathType%23CUBIC_TO">Online Documentation</a>
   */
  object CUBIC_TO: PathType
  
  /**
   * The type that is used to add a line from the current position to the last [MOVE_TO][PathType] position.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/PathType%23CLOSE">Online Documentation</a>
   */
  object CLOSE: PathType
}
