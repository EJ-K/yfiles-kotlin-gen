// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Graph
import yfiles.algorithms.IDataAcceptor
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.Node
import yfiles.algorithms.NodeDpKey
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This layering algorithm implementation assigns nodes to layers given a mapping of nodes to layer IDs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenLayersLayerer">Online Documentation</a>
 * 
 * @constructor Creates an instance of [GivenLayersLayerer].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenLayersLayerer%23GivenLayersLayerer-constructor-GivenLayersLayerer">Online Documentation</a>
 */
external open class GivenLayersLayerer  () : ILayerer {

/**
 * Assigns all nodes of the graph to layers and adds them to the [ILayers] instance.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for querying information about the nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenLayersLayerer%23GivenLayersLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Convenience method that removes empty layers and ensures that the smallest layer has value `0`.
 * @param [graph] the graph
 * @param [layerId] the [IDataProvider] that returns an integer value (layer) for each node; the first layer has the number `0`
 * @param [normalizedLayerId] the [IDataAcceptor] that will be filled by the layout algorithm and holds an integer value (layer ID after normalization) for each node
 * @return the number of layers after the removal of empty layers
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenLayersLayerer%23GivenLayersLayerer-method-normalize">Online Documentation</a>
 */
 open   fun normalize( graph: Graph ,
 layerId: IDataProvider<Node, Int> ,
 normalizedLayerId: IDataAcceptor<Node, Int> ):Int

companion object : ClassMetadata<GivenLayersLayerer> {
/**
 * A data provider key for storing the layer IDs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GivenLayersLayerer%23LAYER_ID_DP_KEY">Online Documentation</a>
 */
 val LAYER_ID_DP_KEY: NodeDpKey<Int>
}
}
