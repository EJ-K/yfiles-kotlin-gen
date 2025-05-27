// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.router

import js.array.ReadonlyArray
import yfiles.algorithms.Edge
import yfiles.algorithms.EdgeDpKey
import yfiles.algorithms.EdgeList
import yfiles.algorithms.Graph
import yfiles.algorithms.IDataAcceptor
import yfiles.algorithms.IDataProvider
import yfiles.algorithms.IEdgeCursor
import yfiles.algorithms.Node
import yfiles.lang.Id
import yfiles.layout.LayoutGraph

/**
 * This class provides helper methods to convert between buses given by complete subgraphs and buses represented by specific *hub* nodes.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRepresentations">Online Documentation</a>
 */
external object BusRepresentations {
/**
 * A data acceptor key to transfer a user-defined object from each original edge to the respective newly created edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRepresentations%23SOURCE_ID_DP_KEY">Online Documentation</a>
 */
 val SOURCE_ID_DP_KEY: EdgeDpKey<Id>
/**
 * A data acceptor key to transfer a user-defined object from each original edge to the respective newly created edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRepresentations%23TARGET_ID_DP_KEY">Online Documentation</a>
 */
 val TARGET_ID_DP_KEY: EdgeDpKey<Id>
/**
 * Changes the representation of buses from hubs to complete subgraphs.
 * @receiver the graph of the bus
 * @param [hubMarker] a [IDataProvider] that marks hub nodes
 * @param [descriptorAcceptor] a [IDataAcceptor] for storing the created bus descriptors
 * @return a list of the created edges
 * @see [replaceHubsBySubgraph]
 * @see [toEdgeLists]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRepresentations%23BusRepresentations-method-replaceHubsBySubgraph(LayoutGraph,IDataProvider,IDataAcceptor)">Online Documentation</a>
 */
 final   fun LayoutGraph.replaceHubsBySubgraph( hubMarker: IDataProvider<Node, Boolean> ,
 descriptorAcceptor: IDataAcceptor<Edge, BusDescriptor> ):EdgeList
/**
 * Changes the representation of buses from hubs to complete subgraphs by creating new edges between regular nodes and removing the hubs.
 * @receiver the graph of the bus
 * @param [hubEdgesLists] an array of [EdgeList]s each containing the edges of a bus
 * @param [hubMarker] a [IDataProvider] that marks hub nodes
 * @param [fixedMarker] a [IDataProvider] that marks fixed edges
 * @param [descriptorAcceptor] a [IDataAcceptor] for storing the created bus descriptors
 * @return a list of the created edges
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRepresentations%23BusRepresentations-method-replaceHubsBySubgraph(LayoutGraph,EdgeList[],IDataProvider,IDataProvider,IDataAcceptor)">Online Documentation</a>
 */
 final   fun LayoutGraph.replaceHubsBySubgraph( hubEdgesLists: ReadonlyArray<EdgeList> ,
 hubMarker: IDataProvider<Node, Boolean> ,
 fixedMarker: IDataProvider<Edge, Boolean> ,
 descriptorAcceptor: IDataAcceptor<Edge, BusDescriptor> ):EdgeList
/**
 * Changes the representation of buses from complete subgraphs to hubs by replacing intersection points by hubs.
 * @receiver the graph where each bus is represented by a complete subgraph of the corresponding nodes
 * @param [edgeCursor] an [IEdgeCursor] of the regular edges
 * @param [descriptorProvider] a [IDataProvider] that provides a [BusDescriptor] for each edge
 * @param [busIDAcceptor] an optional [IDataAcceptor] that stores the bus ID for each new edge
 * @throws InvalidOperationError if the path of an edge is not orthogonal or if some paths form a cycle
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRepresentations%23BusRepresentations-method-replaceSubgraphByHubs">Online Documentation</a>
 */
 final   fun LayoutGraph.replaceSubgraphByHubs( edgeCursor: IEdgeCursor ,
 descriptorProvider: IDataProvider<Edge, BusDescriptor> ,
 busIDAcceptor: IDataAcceptor<Edge, Id> )
/**
 * Calculates for every bus represented by hubs a list of all of its edges.
 * @receiver the graph where buses are represented by means of hubs
 * @param [hubMarker] a [IDataProvider] which marks hub nodes
 * @return an array of [EdgeList]s where each list contains all edges of a bus
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/BusRepresentations%23BusRepresentations-method-toEdgeLists">Online Documentation</a>
 */
 final   fun Graph.toEdgeLists( hubMarker: IDataProvider<Node, Boolean> ):ReadonlyArray<EdgeList>
}
