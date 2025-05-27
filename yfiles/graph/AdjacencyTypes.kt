// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.lang.YFlags

/**
 * Enumeration type for the different types of adjacency.
 * @see [IGraph.edgesAt]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyTypes">Online Documentation</a>
 */

external class AdjacencyTypes private constructor(): YFlags<AdjacencyTypes> {
  companion object {
    /**
     * Neither [INCOMING][AdjacencyTypes] nor [OUTGOING][AdjacencyTypes]
     * 
     * Value - `0`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyTypes%23NONE">Online Documentation</a>
     */
    val NONE: AdjacencyTypes
    
    /**
     * The constant for incoming edges.
     * 
     * Value - `1`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyTypes%23INCOMING">Online Documentation</a>
     */
    val INCOMING: AdjacencyTypes
    
    /**
     * The constant for outgoing edges.
     * 
     * Value - `2`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyTypes%23OUTGOING">Online Documentation</a>
     */
    val OUTGOING: AdjacencyTypes
    
    /**
     * Both [INCOMING][AdjacencyTypes] and [OUTGOING][AdjacencyTypes]
     * 
     * Value - `3`
     * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyTypes%23ALL">Online Documentation</a>
     */
    val ALL: AdjacencyTypes
  }
}
