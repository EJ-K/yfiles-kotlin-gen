// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

/**
 * Group layering alignment strategies used to compute the layering in grouped graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy">Online Documentation</a>
 */

sealed external class GroupAlignmentPolicy {
  /**
   * A group layering alignment strategy which aligns groups and normal nodes that occupy the same layer to the top with respect to their inner layers.
   * 
   * Value - `18`
   * @see [HierarchicalLayout.groupAlignmentPolicy]
   * @see [HierarchicalLayout.groupLayeringPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy%23TOP">Online Documentation</a>
   */
  object TOP: GroupAlignmentPolicy
  
  /**
   * A group layering alignment strategy which aligns groups and normal nodes that occupy the same layer to the bottom with respect to their inner layers.
   * 
   * Value - `34`
   * @see [HierarchicalLayout.groupAlignmentPolicy]
   * @see [HierarchicalLayout.groupLayeringPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy%23BOTTOM">Online Documentation</a>
   */
  object BOTTOM: GroupAlignmentPolicy
  
  /**
   * A group layering alignment strategy which aligns groups and normal nodes that occupy the same layer to the center with respect to their inner layers.
   * 
   * Value - `66`
   * @see [HierarchicalLayout.groupAlignmentPolicy]
   * @see [HierarchicalLayout.groupLayeringPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GroupAlignmentPolicy%23CENTER">Online Documentation</a>
   */
  object CENTER: GroupAlignmentPolicy
}
