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
 * Enumeration used by [NavigationInputMode] to determine which point (if any) of a group or folder node should be kept fixed when toggling the group node state.
 * @see [NavigationInputMode]
 * @see [NavigationInputMode.expandGroup]
 * @see [NavigationInputMode.collapseGroup]
 * @see [NavigationInputMode.toggleExpansionState]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy">Online Documentation</a>
 */

sealed external class NodeAlignmentPolicy {
  /**
   * Don't fix any specific point, only use the layout from the target state.
   * 
   * Value - `0`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23NONE">Online Documentation</a>
   */
  object NONE: NodeAlignmentPolicy
  
  /**
   * Fix the center point.
   * 
   * Value - `1`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23CENTER">Online Documentation</a>
   */
  object CENTER: NodeAlignmentPolicy
  
  /**
   * Fix the upper-left corner.
   * 
   * Value - `2`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23TOP_LEFT">Online Documentation</a>
   */
  object TOP_LEFT: NodeAlignmentPolicy
  
  /**
   * Fix the lower-left corner.
   * 
   * Value - `3`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23BOTTOM_LEFT">Online Documentation</a>
   */
  object BOTTOM_LEFT: NodeAlignmentPolicy
  
  /**
   * Fix the upper right corner.
   * 
   * Value - `4`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23TOP_RIGHT">Online Documentation</a>
   */
  object TOP_RIGHT: NodeAlignmentPolicy
  
  /**
   * Fix the lower right corner.
   * 
   * Value - `5`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23BOTTOM_RIGHT">Online Documentation</a>
   */
  object BOTTOM_RIGHT: NodeAlignmentPolicy
  
  /**
   * Fix the uppermost center.
   * 
   * Value - `6`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23TOP_CENTER">Online Documentation</a>
   */
  object TOP_CENTER: NodeAlignmentPolicy
  
  /**
   * Fix the lowermost center.
   * 
   * Value - `7`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23BOTTOM_CENTER">Online Documentation</a>
   */
  object BOTTOM_CENTER: NodeAlignmentPolicy
  
  /**
   * Fix the center left.
   * 
   * Value - `8`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23CENTER_LEFT">Online Documentation</a>
   */
  object CENTER_LEFT: NodeAlignmentPolicy
  
  /**
   * Fix the center right.
   * 
   * Value - `9`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/NodeAlignmentPolicy%23CENTER_RIGHT">Online Documentation</a>
   */
  object CENTER_RIGHT: NodeAlignmentPolicy
}
