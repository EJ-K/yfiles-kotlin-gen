// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.radial

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [RadialLayout.layeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutLayeringStrategy">Online Documentation</a>
 */
@JsName("RadialLayoutLayeringStrategy")
external sealed class LayeringStrategy: YEnum<LayeringStrategy> {
   companion object: EnumMetadata<LayeringStrategy> {
       /**
 * Specifier for a layering strategy that uses an optimal hierarchical layering strategy.
 * 
 * Value - `1`
 * @see [RadialLayout.layeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutLayeringStrategy%23HIERARCHICAL">Online Documentation</a>
 */
val HIERARCHICAL: LayeringStrategy

/**
 * Specifier for a layering strategy that uses breadth first search (BFS) to determine a layering for the graph.
 * 
 * Value - `4`
 * @see [RadialLayout.layeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutLayeringStrategy%23BFS">Online Documentation</a>
 */
val BFS: LayeringStrategy

/**
 * Specifier for a layering strategy that uses a custom, user-defined layer/circle assignment.
 * 
 * Value - `6`
 * @see [RadialLayout.layeringStrategy]
 * @see [RadialLayout.LAYER_ID_DP_KEY]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutLayeringStrategy%23USER_DEFINED">Online Documentation</a>
 */
val USER_DEFINED: LayeringStrategy

/**
 * Specifier for a layering strategy using a dendrogram layering strategy.
 * 
 * Value - `7`
 * @see [RadialLayout.layeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/RadialLayoutLayeringStrategy%23DENDROGRAM">Online Documentation</a>
 */
val DENDROGRAM: LayeringStrategy
   }
}
