// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * [BFSLayerer] uses a breadth first search for assigning layers to the nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BFSLayerer">Online Documentation</a>
 * 
 * @constructor Creates an instance of [BFSLayerer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BFSLayerer%23BFSLayerer-constructor-BFSLayerer">Online Documentation</a>
 */
external open class BFSLayerer  () : ILayerer {

/**
 * Assigns all nodes of the graph to layers and adds them to the [ILayers] instance.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for query information about the nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BFSLayerer%23BFSLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )

companion object : ClassMetadata<BFSLayerer> {
/**
 * A data provider key for identifying the core nodes of the BFS layering.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BFSLayerer%23CORE_NODES_DP_KEY">Online Documentation</a>
 */
 val CORE_NODES_DP_KEY: NodeDpKey<Boolean>
}
}
