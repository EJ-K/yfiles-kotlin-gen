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
 * Specifies the alignment policies for child nodes under the same parent in a [TreeLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildAlignmentPolicy">Online Documentation</a>
 */

sealed external class ChildAlignmentPolicy {
  /**
   * Alignment policy to align child nodes rooted at the same parent such that the border of their convex hull has the same distance to the parent node's center.
   * 
   * Value - `0`
   * @see [RadialTreeLayout.childAlignmentPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildAlignmentPolicy%23PLAIN">Online Documentation</a>
   */
  object PLAIN: ChildAlignmentPolicy
  
  /**
   * Alignment policy to align child nodes rooted at the same parent such that each child has the same center-to-center distance to the parent node.
   * 
   * Value - `1`
   * @see [RadialTreeLayout.childAlignmentPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildAlignmentPolicy%23SAME_CENTER">Online Documentation</a>
   */
  object SAME_CENTER: ChildAlignmentPolicy
  
  /**
   * Alignment policy for aligning child nodes such that the distances to their parent are kept short and drawings can potentially become more compact.
   * 
   * Value - `2`
   * @see [RadialTreeLayout.childAlignmentPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildAlignmentPolicy%23COMPACT">Online Documentation</a>
   */
  object COMPACT: ChildAlignmentPolicy
  
  /**
   * Alignment policy to align child nodes rooted at the same parent using a mixture of the other policies and aiming to achieve symmetry and compactness at the same time.
   * 
   * Value - `3`
   * @see [RadialTreeLayout.childAlignmentPolicy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/ChildAlignmentPolicy%23SMART">Online Documentation</a>
   */
  object SMART: ChildAlignmentPolicy
}
