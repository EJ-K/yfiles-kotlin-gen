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
 * Enum constants that specify the scope for the [OrganicLayout] and [ClassicOrganicLayout].
 * @see [ClassicOrganicLayout.scope]
 * @see [OrganicLayout.scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutScope">Online Documentation</a>
 */
@JsName("OrganicLayoutScope")
external sealed class Scope: YEnum<Scope> {
   companion object: EnumMetadata<Scope> {
       /**
 * Scope mode indicating that the algorithm should place *all* nodes of the graph.
 * 
 * Value - `0`
 * @see [ClassicOrganicLayout.scope]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutScope%23ALL">Online Documentation</a>
 */
val ALL: Scope

/**
 * Scope mode indicating that the algorithm should place a subset of nodes but may to a certain degree also move nodes that are structurally close to a node from the subset.
 * 
 * Value - `1`
 * @see [ClassicOrganicLayout.scope]
 * @see [ClassicOrganicLayout.AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutScope%23MAINLY_SUBSET">Online Documentation</a>
 */
val MAINLY_SUBSET: Scope

/**
 * Scope mode indicating that the algorithm should *only* place a subset of nodes.
 * 
 * Value - `2`
 * @see [ClassicOrganicLayout.scope]
 * @see [ClassicOrganicLayout.AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutScope%23SUBSET">Online Documentation</a>
 */
val SUBSET: Scope

/**
 * Scope mode indicating that the algorithm should place a subset of nodes but may to a certain degree also move nodes that are geometrically close to a node from the subset.
 * 
 * Value - `3`
 * @see [ClassicOrganicLayout.scope]
 * @see [ClassicOrganicLayout.AFFECTED_NODES_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/OrganicLayoutScope%23MAINLY_SUBSET_GEOMETRIC">Online Documentation</a>
 */
val MAINLY_SUBSET_GEOMETRIC: Scope
   }
}
