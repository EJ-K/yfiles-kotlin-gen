// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.input

/**
 * The policy constants used by [IGridConstraintProvider]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy">Online Documentation</a>
 */

sealed external class SnapPolicy {
  /**
   * Don't perform snapping.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23NO_SNAPPING">Online Documentation</a>
   */
  object NO_SNAPPING: SnapPolicy
  
  /**
   * Snap to the nearest grid coordinate.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23TO_NEAREST">Online Documentation</a>
   */
  object TO_NEAREST: SnapPolicy
  
  /**
   * Snap to the nearest grid coordinate whose value is not less than the current coordinate.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23TO_GREATER">Online Documentation</a>
   */
  object TO_GREATER: SnapPolicy
  
  /**
   * Snap to the nearest grid coordinate whose value is not greater than the current coordinate.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SnapPolicy%23TO_SMALLER">Online Documentation</a>
   */
  object TO_SMALLER: SnapPolicy
}
