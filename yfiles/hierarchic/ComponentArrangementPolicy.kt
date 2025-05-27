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
 * Specifies policies for arranging components in a [HierarchicalLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementPolicy">Online Documentation</a>
 */

sealed external class ComponentArrangementPolicy {
  /**
   * A component arrangement policy that achieves a `1:1` aspect ratio for the graph.
   * 
   * Value - `0`
   * @see [HierarchicalLayout.componentArrangementPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementPolicy%23COMPACT">Online Documentation</a>
   */
  object COMPACT: ComponentArrangementPolicy
  
  /**
   * A component arrangement policy that aligns the components with their topmost layer.
   * 
   * Value - `1`
   * @see [HierarchicalLayout.componentArrangementPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ComponentArrangementPolicy%23TOPMOST">Online Documentation</a>
   */
  object TOPMOST: ComponentArrangementPolicy
}
