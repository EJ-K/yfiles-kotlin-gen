// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.view

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * Policy to determine whether and how the [GraphModelManager] should nest the [canvas objects][ICanvasObject] of nodes and edges if the graph is grouped.
 * @see [GraphModelManager.hierarchicNestingPolicy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicNestingPolicy">Online Documentation</a>
 */
external sealed class HierarchicNestingPolicy: YEnum<HierarchicNestingPolicy> {
   companion object: EnumMetadata<HierarchicNestingPolicy> {
       /**
 * The [canvas objects][ICanvasObject] of nodes and edges are not nested.
 * 
 * Value - `0`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicNestingPolicy%23NONE">Online Documentation</a>
 */
val NONE: HierarchicNestingPolicy

/**
 * The [canvas objects][ICanvasObject] of nodes are nested according to their location in the node hierarchy.
 * 
 * Value - `1`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicNestingPolicy%23NODES">Online Documentation</a>
 */
val NODES: HierarchicNestingPolicy

/**
 * The [canvas objects][ICanvasObject] of nodes and edges are nested according to their location in the node hierarchy.
 * 
 * Value - `2`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicNestingPolicy%23NODES_AND_EDGES">Online Documentation</a>
 */
val NODES_AND_EDGES: HierarchicNestingPolicy

/**
 * Only the [canvas objects][ICanvasObject] of [group nodes][yfiles.graph.IGraph.isGroupNode] are nested according to their depth in the node hierarchy.
 * 
 * Value - `3`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicNestingPolicy%23GROUP_NODES">Online Documentation</a>
 */
val GROUP_NODES: HierarchicNestingPolicy
   }
}
