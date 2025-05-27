// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.organic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [OrganicLayout.treeSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle">Online Documentation</a>
 */
external sealed class OrganicLayoutTreeSubstructureStyle: YEnum<OrganicLayoutTreeSubstructureStyle> {
   companion object: EnumMetadata<OrganicLayoutTreeSubstructureStyle> {
       /**
 * Substructure style specifier for tree structures that indicates that the algorithm does not handle such structures in a special way.
 * 
 * Value - `0`
 * @see [OrganicLayout.treeSubstructureStyle]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23NONE">Online Documentation</a>
 */
val NONE: OrganicLayoutTreeSubstructureStyle

/**
 * Substructure style specifier for tree structures that leads to a balloon layout style.
 * 
 * Value - `1`
 * @see [OrganicLayout.treeSubstructureStyle]
 * @see [BalloonLayout][yfiles.tree.BalloonLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23BALLOON">Online Documentation</a>
 */
val BALLOON: OrganicLayoutTreeSubstructureStyle

/**
 * Substructure style specifier for tree structures that leads to an oriented tree layout style.
 * 
 * Value - `2`
 * @see [OrganicLayout.treeSubstructureStyle]
 * @see [TreeLayout][yfiles.tree.TreeLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23ORIENTED">Online Documentation</a>
 */
val ORIENTED: OrganicLayoutTreeSubstructureStyle

/**
 * Substructure style specifier for tree structures that leads to a radial layout style.
 * 
 * Value - `3`
 * @see [OrganicLayout.treeSubstructureStyle]
 * @see [RadialLayout][yfiles.radial.RadialLayout]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutTreeSubstructureStyle%23RADIAL">Online Documentation</a>
 */
val RADIAL: OrganicLayoutTreeSubstructureStyle
   }
}
