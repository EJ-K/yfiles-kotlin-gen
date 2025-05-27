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
 * The possible policies for calculating the size of the tab of a [GroupNodeStyle] instance.
 * @see [GroupNodeStyle.tabSizePolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabSizePolicy">Online Documentation</a>
 */

sealed external class GroupNodeStyleTabSizePolicy {
  /**
   * The effective tab size depends on [GroupNodeStyle] properties and the size of the node.
   * 
   * Value - `0`
   * @see [GroupNodeStyle.tabWidth]
   * @see [GroupNodeStyle.tabHeight]
   * @see [GroupNodeStyle.tabSlope]
   * @see [GroupNodeStyle.cornerRadius]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabSizePolicy%23FIXED">Online Documentation</a>
   */
  object FIXED: GroupNodeStyleTabSizePolicy
  
  /**
   * The effective tab width depends on [GroupNodeStyle] properties, the size of the node, and the preferred width of tab or tab background labels.
   * 
   * Value - `1`
   * @see [yfiles.graph.GroupNodeLabelModel]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupNodeStyleTabSizePolicy%23ADJUST_TO_LABEL">Online Documentation</a>
   */
  object ADJUST_TO_LABEL: GroupNodeStyleTabSizePolicy
}
