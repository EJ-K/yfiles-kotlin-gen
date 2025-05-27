// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.lang.EnumMetadata
import yfiles.lang.YEnum

/**
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy">Online Documentation</a>
 */
@JsName("HierarchicLayoutLayeringStrategy")
external sealed class LayeringStrategy: YEnum<LayeringStrategy> {
   companion object: EnumMetadata<LayeringStrategy> {
       /**
 * A dummy layering strategy which describes a strategy that is not part of the default strategies.
 * 
 * Value - `-1`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23UNKNOWN">Online Documentation</a>
 */
val UNKNOWN: LayeringStrategy

/**
 * A layering strategy which places each node in the highest possible layer without passing its predecessor in the topological order of nodes.
 * 
 * Value - `0`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23HIERARCHICAL_TOPMOST">Online Documentation</a>
 */
val HIERARCHICAL_TOPMOST: LayeringStrategy

/**
 * A layering strategy which places each node in the optimal layer to minimize the layer distances.
 * 
 * Value - `1`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23HIERARCHICAL_OPTIMAL">Online Documentation</a>
 */
val HIERARCHICAL_OPTIMAL: LayeringStrategy

/**
 * A layering strategy which applies a heuristic to approximate the [optimal layering][HIERARCHICAL_OPTIMAL].
 * 
 * Value - `2`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23HIERARCHICAL_TIGHT_TREE">Online Documentation</a>
 */
val HIERARCHICAL_TIGHT_TREE: LayeringStrategy

/**
 * A layering strategy which applies a fast heuristic that improves the layering done by [HIERARCHICAL_TOPMOST] by shifting some nodes down.
 * 
 * Value - `3`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23HIERARCHICAL_DOWNSHIFT">Online Documentation</a>
 */
val HIERARCHICAL_DOWNSHIFT: LayeringStrategy

/**
 * A layering strategy based on a breadth first search (BFS).
 * 
 * Value - `4`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23BFS">Online Documentation</a>
 */
val BFS: LayeringStrategy

/**
 * A layering strategy which derives the layers from the initial coordinates of the nodes.
 * 
 * Value - `5`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23FROM_SKETCH">Online Documentation</a>
 */
val FROM_SKETCH: LayeringStrategy

/**
 * A layering strategy which uses a layer assignment specified by the user.
 * 
 * Value - `6`
 * @see [HierarchicLayout.fromScratchLayeringStrategy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/HierarchicLayoutLayeringStrategy%23USER_DEFINED">Online Documentation</a>
 */
val USER_DEFINED: LayeringStrategy
   }
}
