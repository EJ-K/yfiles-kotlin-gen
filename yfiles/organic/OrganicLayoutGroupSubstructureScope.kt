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
 * @see [OrganicLayout.groupSubstructureScope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutGroupSubstructureScope">Online Documentation</a>
 */
external sealed class OrganicLayoutGroupSubstructureScope: YEnum<OrganicLayoutGroupSubstructureScope> {
   companion object: EnumMetadata<OrganicLayoutGroupSubstructureScope> {
       /**
 * Scope specifier for group substructures indicating that no group substructures are handled in the layout process.
 * 
 * Value - `0`
 * @see [OrganicLayout.groupSubstructureScope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutGroupSubstructureScope%23NO_GROUPS">Online Documentation</a>
 */
val NO_GROUPS: OrganicLayoutGroupSubstructureScope

/**
 * Scope specifier for group substructures indicating that a group substructure is handled in the layout process if no of its child nodes has edges.
 * 
 * Value - `1`
 * @see [OrganicLayout.groupSubstructureScope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutGroupSubstructureScope%23GROUPS_WITHOUT_EDGES">Online Documentation</a>
 */
val GROUPS_WITHOUT_EDGES: OrganicLayoutGroupSubstructureScope

/**
 * Scope specifier for group substructures indicating that a group substructure is handled in the layout process if no of its child nodes has edges to nodes that do not belong to the group.
 * 
 * Value - `2`
 * @see [OrganicLayout.groupSubstructureScope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutGroupSubstructureScope%23GROUPS_WITHOUT_INTER_EDGES">Online Documentation</a>
 */
val GROUPS_WITHOUT_INTER_EDGES: OrganicLayoutGroupSubstructureScope

/**
 * Scope specifier for group substructures indicating that any group substructure is handled in the layout process.
 * 
 * Value - `3`
 * @see [OrganicLayout.groupSubstructureScope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutGroupSubstructureScope%23ALL_GROUPS">Online Documentation</a>
 */
val ALL_GROUPS: OrganicLayoutGroupSubstructureScope
   }
}
