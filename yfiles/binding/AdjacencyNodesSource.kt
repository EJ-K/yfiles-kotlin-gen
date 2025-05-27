// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import yfiles.collections.IEnumerable
import yfiles.lang.ClassMetadata

/**
 * A class that accepts a collection of objects from the [AdjacencyGraphBuilder] to build [INode][yfiles.graph.INode]s from.
 * @param [TDataItem] The type of the data items in the source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource">Online Documentation</a>
 * 
 * @constructor Creates a new source with the given `nodeCreator`.
 * @param [nodeCreator] The creator that is used to create the nodes of this source.
 * @param [idProvider] An optional function that yields an id for each element of the associated data collection in the [AdjacencyGraphBuilder].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-constructor-AdjacencyNodesSource">Online Documentation</a>
 */
open external class AdjacencyNodesSource<TDataItem> (
  nodeCreator: NodeCreator<TDataItem>,
  idProvider: IdProvider<TDataItem>  = definedExternally,
)  {
  /**
   * Gets or sets a provider that yields an id for each element of the associated data collection in the [GraphBuilder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23idProvider">Online Documentation</a>
   */
  final var idProvider: IdProvider<TDataItem>?
  
  /**
   * Gets or sets the [NodeCreator] for this source, which can be used to adjust the creation behavior.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23nodeCreator">Online Documentation</a>
   */
  final var nodeCreator: NodeCreator<TDataItem>
  
  /**
   * Gets or sets a provider that yields a parent id for each element of the associated data collection in the [GraphBuilder].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23parentIdProvider">Online Documentation</a>
   */
  final var parentIdProvider: Provider<TDataItem, Any>?
  
  /**
   * Registers a provider for outgoing edge data items from which edges are created using the provided `edgeCreator`.
   * @param [TEdgeDataItem] The type of the edge data items.
   * @param [TPredecessorDataItem] The type of the predecessor data items.
   * @param [edgeDataProvider] A function that yields the edge data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [sourceDataProvider] A function that yields the source data item for each edge data item provided by `edgeDataProvider`.
   * @param [sourceNodesSource] The nodes source for the source data items.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addInEdgesSource">Online Documentation</a>
   */
  fun <TEdgeDataItem, TPredecessorDataItem> addInEdgesSource(
    edgeDataProvider: Provider<TDataItem, Any>,
    sourceDataProvider: Provider<TEdgeDataItem, TPredecessorDataItem>,
    sourceNodesSource: AdjacencyNodesSource<TPredecessorDataItem>,
    edgeCreator: EdgeCreator<TEdgeDataItem>,
  )
  
  /**
   * Registers a provider for outgoing edge data items from which edges are created using the provided `edgeCreator`.
   * @param [TEdgeDataItem] The type of the edge data items.
   * @param [edgeDataProvider] A function that yields the edge data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [sourceIdProvider] A function that yields the source node id for each edge data item provided by `edgeDataProvider`.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addInEdgesSourceToId">Online Documentation</a>
   */
  fun <TEdgeDataItem> addInEdgesSourceToId(
    edgeDataProvider: Provider<TDataItem, Any>,
    sourceIdProvider: Provider<TEdgeDataItem, Any>,
    edgeCreator: EdgeCreator<TEdgeDataItem>,
  )
  
  /**
   * Registers a provider for outgoing edge data items from which edges are created using the provided `edgeCreator`.
   * @param [TEdgeDataItem] The type of the edge data items.
   * @param [TSuccessorDataItem] The type of the successor data items.
   * @param [edgeDataProvider] A function that yields the edge data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [targetDataProvider] A function that yields the target data item for each edge data item provided by `edgeDataProvider`.
   * @param [targetNodesSource] The nodes source for the target data items.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addOutEdgesSource">Online Documentation</a>
   */
  fun <TEdgeDataItem, TSuccessorDataItem> addOutEdgesSource(
    edgeDataProvider: Provider<TDataItem, Any>,
    targetDataProvider: Provider<TEdgeDataItem, TSuccessorDataItem>,
    targetNodesSource: AdjacencyNodesSource<TSuccessorDataItem>,
    edgeCreator: EdgeCreator<TEdgeDataItem>,
  )
  
  /**
   * Registers a provider for outgoing edge data items from which edges are created using the provided `edgeCreator`.
   * @param [TEdgeDataItem] The type of the edge data items.
   * @param [edgeDataProvider] A function that yields the edge data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [targetIdProvider] A function that yields the target node id for each edge data item provided by `edgeDataProvider`.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addOutEdgesSourceToId">Online Documentation</a>
   */
  fun <TEdgeDataItem> addOutEdgesSourceToId(
    edgeDataProvider: Provider<TDataItem, Any>,
    targetIdProvider: Provider<TEdgeDataItem, Any>,
    edgeCreator: EdgeCreator<TEdgeDataItem>,
  )
  
  /**
   * Registers a provider for source node ids to which edges are created using the provided `edgeCreator`.
   * @param [predecessorIdsProvider] A function that yields the source node ids for each node data item associated with this [AdjacencyNodesSource].
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addPredecessorIds">Online Documentation</a>
   */
  fun addPredecessorIds(
    predecessorIdsProvider: Provider<TDataItem, IEnumerable<Any>>,
    edgeCreator: EdgeCreator<TDataItem>,
  )
  
  /**
   * Registers a provider for node data items associated with a `predecessorNodesSource` to which edges are created using the provided `edgeCreator`.
   * @param [TPredecessorDataItem] The type of the predecessor data items.
   * @param [predecessorsProvider] A function that yields the predecessor data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [predecessorNodesSource] The nodes source for the predecessor data items.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addPredecessorsSource">Online Documentation</a>
   */
  fun <TPredecessorDataItem> addPredecessorsSource(
    predecessorsProvider: Provider<TDataItem, Any>,
    predecessorNodesSource: AdjacencyNodesSource<TPredecessorDataItem>,
    edgeCreator: EdgeCreator<TDataItem>,
  )
  
  /**
   * Registers a provider for target node ids to which edges are created using the provided `edgeCreator`.
   * @param [successorIdsProvider] A function that yields the target node ids for each node data item associated with this [AdjacencyNodesSource].
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addSuccessorIds">Online Documentation</a>
   */
  fun addSuccessorIds(
    successorIdsProvider: Provider<TDataItem, IEnumerable<Any>>,
    edgeCreator: EdgeCreator<TDataItem>,
  )
  
  /**
   * Registers a provider for node data items associated with a `successorNodesSource` to which edges are created using the provided `edgeCreator`.
   * @param [TSuccessorDataItem] The type of the successor data items.
   * @param [successorsProvider] A function that yields the successor data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [successorNodesSource] The nodes source for the successor data items.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-addSuccessorsSource">Online Documentation</a>
   */
  fun <TSuccessorDataItem> addSuccessorsSource(
    successorsProvider: Provider<TDataItem, Any>,
    successorNodesSource: AdjacencyNodesSource<TSuccessorDataItem>,
    edgeCreator: EdgeCreator<TDataItem>,
  )
  
  /**
   * Registers a provider for outgoing edge data items whose `sourceDataProvider` function as node objects for the returned [AdjacencyNodesSource].
   * @param [TEdgeDataItem] The type of the edge data items.
   * @param [TPredecessorDataItem] The type of the predecessor data items in the source.
   * @param [edgeDataProvider] A function that yields the edge data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [sourceDataProvider] A function that yields the source node data items for each edge data item provided by `edgeDataProvider`.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @param [sourceIdProvider] An optional function that yields an id for each source node data item.
   * @return A new [AdjacencyNodesSource] for the node data items returned by `sourceDataProvider`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-createInEdgesSource">Online Documentation</a>
   */
  fun <TEdgeDataItem, TPredecessorDataItem> createInEdgesSource(
    edgeDataProvider: Provider<TDataItem, Any>,
    sourceDataProvider: Provider<TEdgeDataItem, TPredecessorDataItem>,
    edgeCreator: EdgeCreator<TEdgeDataItem>,
    sourceIdProvider: IdProvider<TPredecessorDataItem>  = definedExternally,
  ): AdjacencyNodesSource<TPredecessorDataItem>
  
  /**
   * Registers a provider for outgoing edge data items whose `targetDataProvider` function as node objects for the returned [AdjacencyNodesSource].
   * @param [TEdgeDataItem] The type of the edge data items.
   * @param [TSuccessorDataItem] The type of the successor data items in the source.
   * @param [edgeDataProvider] A function that yields the edge data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [targetDataProvider] A function that yields the target node data items for each edge data item provided by `edgeDataProvider`.
   * @param [edgeCreator] The creator that is used to create the edges.
   * @param [targetIdProvider] An optional function that yields an id for each target node data item.
   * @return A new [AdjacencyNodesSource] for the node data items returned by `targetDataProvider`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-createOutEdgesSource">Online Documentation</a>
   */
  fun <TEdgeDataItem, TSuccessorDataItem> createOutEdgesSource(
    edgeDataProvider: Provider<TDataItem, Any>,
    targetDataProvider: Provider<TEdgeDataItem, TSuccessorDataItem>,
    edgeCreator: EdgeCreator<TEdgeDataItem>,
    targetIdProvider: IdProvider<TSuccessorDataItem>  = definedExternally,
  ): AdjacencyNodesSource<TSuccessorDataItem>
  
  /**
   * Registers a provider for node data items functioning as node objects for the returned [AdjacencyNodesSource].
   * @param [TPredecessorDataItem] The type of the predecessor data items in the source.
   * @param [predecessorsProvider] A function that yields the predecessor data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [edgeCreator] The creator that is used to create the edges.
   * @param [idProvider] An optional function that yields an id for each source node data item.
   * @return A new [AdjacencyNodesSource] for the node data items returned by `predecessorsProvider`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-createPredecessorsSource">Online Documentation</a>
   */
  fun <TPredecessorDataItem> createPredecessorsSource(
    predecessorsProvider: Provider<TDataItem, Any>,
    edgeCreator: EdgeCreator<TDataItem>,
    idProvider: IdProvider<TPredecessorDataItem>  = definedExternally,
  ): AdjacencyNodesSource<TPredecessorDataItem>
  
  /**
   * Registers a provider for node data items functioning as node objects for the returned [AdjacencyNodesSource].
   * @param [TSuccessorDataItem] The type of the successor data items in the source.
   * @param [successorsProvider] A function that yields the successor data items for each node data item associated with this [AdjacencyNodesSource].
   * @param [edgeCreator] The creator that is used to create the edges.
   * @param [idProvider] An optional function that yields an id for each target node data item.
   * @return A new [AdjacencyNodesSource] for the node data items returned by `successorsProvider`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-createSuccessorsSource">Online Documentation</a>
   */
  fun <TSuccessorDataItem> createSuccessorsSource(
    successorsProvider: Provider<TDataItem, Any>,
    edgeCreator: EdgeCreator<TDataItem>,
    idProvider: IdProvider<TSuccessorDataItem>  = definedExternally,
  ): AdjacencyNodesSource<TSuccessorDataItem>
  
  /**
   * Optionally obtains the id for the [parent][yfiles.graph.IGraph] or `null` given each data item for which a node is created.
   * @param [dataItem] A single data item from the associated data collection in the [GraphBuilder].
   * @return The id of another node or `null` in case the node should be put in the root of the hierarchy.
   * @see [parentIdProvider]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyNodesSource%23AdjacencyNodesSource-method-getParentId">Online Documentation</a>
   */
  protected open fun getParentId(
    dataItem: TDataItem,
  ): Any?
  
  companion object : ClassMetadata<AdjacencyNodesSource<*>> {
  }
}
