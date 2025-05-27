// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.tree

/**
 * Specifies the ordering policies for child nodes under the same parent in a [TreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildOrderingPolicy">Online Documentation</a>
 */

sealed external class ChildOrderingPolicy {
  /**
   * Child ordering policy which orders child nodes depending on their subtree size such that large subtrees are placed next to small ones in order to save space.
   * 
   * Value - `0`
   * @see [RadialTreeLayout.childOrderingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildOrderingPolicy%23COMPACT">Online Documentation</a>
   */
  object COMPACT: ChildOrderingPolicy
  
  /**
   * Child ordering policy which sorts the child nodes according to their wedge angles.
   * 
   * Value - `1`
   * @see [RadialTreeLayout.childOrderingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildOrderingPolicy%23SYMMETRIC">Online Documentation</a>
   */
  object SYMMETRIC: ChildOrderingPolicy
  
  /**
   * Child ordering policy which preserves the initial order of child nodes around their parent.
   * 
   * Value - `2`
   * @see [RadialTreeLayout.childOrderingPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildOrderingPolicy%23FROM_SKETCH">Online Documentation</a>
   */
  object FROM_SKETCH: ChildOrderingPolicy
}
