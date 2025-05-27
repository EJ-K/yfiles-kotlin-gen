// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.hierarchic

import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.EdgeList
import yfiles.algorithms.Graph
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.INodeMap
import yfiles.lang.ClassMetadata
import yfiles.layout.LayoutGraph

/**
 * This class implements the layering phase of the [HierarchicLayout] (i.e., the assignment of the nodes to layers).
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer">Online Documentation</a>
 * 
 * @constructor Creates an instance of [WeightedLayerer] with the given key that provides access to the [IDataProvider] that holds the edge weights and unlimited maximum duration for the [WeightedLayerer].
 * @param [key] the key to access the [IDataProvider] that holds the edge weights
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23WeightedLayerer-constructor-WeightedLayerer">Online Documentation</a>
 */
external open class WeightedLayerer  ( key: EdgeDpKey<Int>?  = definedExternally) : ILayerer {

/**
 * The key to access the [IDataProvider] that holds the edge weights.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23key">Online Documentation</a>
 */
protected final var key: EdgeDpKey<Int>
/**
 * Gets or sets the time limit in milliseconds set for the layout algorithm.
 * 
 * Default value - `<code>0x7FFFFFFF</code>`. The layout algorithm runs unrestricted.
 * @throws ArgumentError if the maximum duration is negative
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23maximumDuration">Online Documentation</a>
 */
open var maximumDuration: Int
/**
 * This is a [IDataProvider] that holds for each [Edge] an integer value representing its weight.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23weight">Online Documentation</a>
 */
protected final var weight: IDataProvider<Edge, Int>
/**
 * Gets or sets whether or not the edges that need to be reversed are determined using an edge weight based heuristic or using a depth first search based approach.
 * 
 * Default value - `false`. The DFS based approach is used.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23weightedCycleRemoval">Online Documentation</a>
 */
open var weightedCycleRemoval: Boolean
/**
 * Assigns all nodes of the graph to layers and adds them to the [ILayers] instance.
 * @param [graph] the input graph
 * @param [layers] the [ILayers] instance that will be filled with the results of the calculation
 * @param [ldp] the [ILayoutDataProvider] used for querying information about the nodes and edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23WeightedLayerer-method-assignLayers">Online Documentation</a>
 */
 override   fun assignLayers( graph: LayoutGraph ,
 layers: ILayers ,
 ldp: ILayoutDataProvider )
/**
 * Assigns all nodes of the graph to layers.
 * ### Postconditions
 * - For all `(v,w)` in `E: layer(v) < layer(w)`
 * @param [graph] the graph for which the layers are determined
 * @param [layerID] the [INodeMap] that will be filled by the layout algorithm and returns a zero-based layer index for each node
 * @return the number of layers
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23WeightedLayerer-method-assignLayersFast">Online Documentation</a>
 */
 open   fun assignLayersFast( graph: Graph ,
 layerID: INodeMap<Int> ):Int
/**
 * Assigns all nodes of the graph to layers.
 * ### Postconditions
 * - For all `(v,w)` in `E: layer(v) < layer(w)`
 * @param [graph] the graph for which the layers are determined
 * @param [layerID] the [INodeMap] that will be filled by the layout algorithm and returns the zero-based index of the layer to which each node belongs
 * @return the number of layers
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23WeightedLayerer-method-assignLayersToMap">Online Documentation</a>
 */
 open   fun assignLayersToMap( graph: Graph ,
 layerID: INodeMap<Int> ):Int
/**
 * Assigns all nodes of the graph to layers.
 * ### Postconditions
 * - For all `(v,w)` in `E: layer(v) < layer(w)`
 * @param [graph] the graph for which the layers are determined
 * @param [layerID] the [INodeMap] that will be filled by the layout algorithm and returns a zero-based layer index for each node
 * @param [reversedEdges] an [EdgeList] containing the edges which had been reversed
 * @param [weight] the [IDataProvider] that returns an integer value (weight) for each edge
 * @return the number of layers
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23WeightedLayerer-method-assignNodeLayerWithDataProvider">Online Documentation</a>
 */
 open   fun assignNodeLayerWithDataProvider( graph: LayoutGraph ,
 layerID: INodeMap<Int> ,
 reversedEdges: EdgeList ,
 weight: IDataProvider<Edge, Int> ):Int
/**
 * Returns the edge weight of the given edge using the weight based cycle removal heuristic.
 * @param [edge] given edge
 * @return the edge weight of the specified edge
 * @see [weightedCycleRemoval]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23WeightedLayerer-method-getWeight">Online Documentation</a>
 */
 open protected   fun getWeight( edge: Edge ):Double
/**
 * Removes cycles from the graph using a depth first search.
 * @param [graph] the graph
 * @param [reversedEdges] an [EdgeList] containing the edges which will be reversed
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/WeightedLayerer%23WeightedLayerer-method-makeDFSAcyclic">Online Documentation</a>
 */
 open   fun makeDFSAcyclic( graph: Graph ,
 reversedEdges: EdgeList )

companion object : ClassMetadata<WeightedLayerer> {
}
}

inline fun WeightedLayerer(
    block: WeightedLayerer.() -> Unit
): WeightedLayerer {
    return WeightedLayerer()
        .apply(block)
}
