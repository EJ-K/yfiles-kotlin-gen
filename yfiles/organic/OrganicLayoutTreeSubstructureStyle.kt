// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

/**
 * Specifies the layout style for tree structures in the [OrganicLayout].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle">Online Documentation</a>
 */

sealed external class OrganicLayoutTreeSubstructureStyle {
  /**
   * Substructure style specifier for tree structures that indicates that the algorithm does not handle such structures in a special way.
   * 
   * Value - `0`
   * @see [OrganicLayout.treeSubstructureStyle]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23NONE">Online Documentation</a>
   */
  object NONE: OrganicLayoutTreeSubstructureStyle
  
  /**
   * Substructure style specifier for tree structures that leads to a radial tree layout style.
   * 
   * Value - `1`
   * @see [OrganicLayout.treeSubstructureStyle]
   * @see [yfiles.tree.RadialTreeLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23RADIAL_TREE">Online Documentation</a>
   */
  object RADIAL_TREE: OrganicLayoutTreeSubstructureStyle
  
  /**
   * Substructure style specifier for tree structures that leads to an oriented tree layout style.
   * 
   * Value - `2`
   * @see [OrganicLayout.treeSubstructureStyle]
   * @see [yfiles.tree.TreeLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23ORIENTED">Online Documentation</a>
   */
  object ORIENTED: OrganicLayoutTreeSubstructureStyle
  
  /**
   * Substructure style specifier for tree structures that leads to a radial layout style.
   * 
   * Value - `3`
   * @see [OrganicLayout.treeSubstructureStyle]
   * @see [yfiles.radial.RadialLayout]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23RADIAL">Online Documentation</a>
   */
  object RADIAL: OrganicLayoutTreeSubstructureStyle
}
