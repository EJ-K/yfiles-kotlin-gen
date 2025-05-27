// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.orthogonal

/**
 * Specifies the orientation of substructures within an [OrthogonalLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation">Online Documentation</a>
 */

sealed external class SubstructureOrientation {
  /**
   * Specifies that substructures are oriented from top to bottom.
   * 
   * Value - `0`
   * @see [OrthogonalLayout.treeSubstructureOrientation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23TOP_TO_BOTTOM">Online Documentation</a>
   */
  object TOP_TO_BOTTOM: SubstructureOrientation
  
  /**
   * Specifies that substructures are oriented from left to right.
   * 
   * Value - `1`
   * @see [OrthogonalLayout.treeSubstructureOrientation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23LEFT_TO_RIGHT">Online Documentation</a>
   */
  object LEFT_TO_RIGHT: SubstructureOrientation
  
  /**
   * Specifies that substructures are oriented from bottom to top.
   * 
   * Value - `2`
   * @see [OrthogonalLayout.treeSubstructureOrientation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23BOTTOM_TO_TOP">Online Documentation</a>
   */
  object BOTTOM_TO_TOP: SubstructureOrientation
  
  /**
   * Specifies that substructures are oriented from right to left.
   * 
   * Value - `3`
   * @see [OrthogonalLayout.treeSubstructureOrientation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23RIGHT_TO_LEFT">Online Documentation</a>
   */
  object RIGHT_TO_LEFT: SubstructureOrientation
  
  /**
   * Automatically determines the orientation of substructures based on the layout context.
   * 
   * Value - `4`
   * @see [OrthogonalLayout.treeSubstructureOrientation]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/SubstructureOrientation%23AUTO_DETECT">Online Documentation</a>
   */
  object AUTO_DETECT: SubstructureOrientation
}
