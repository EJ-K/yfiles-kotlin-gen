// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.binding

import js.array.ReadonlyArray
import yfiles.graph.IEdge
import yfiles.graph.IGraph
import yfiles.graph.ILabel
import yfiles.graph.INode
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.IEventDispatcher

/**
 * Populates a graph from custom data where node data items know about their predecessors and/or successors.
 * @see [GraphBuilder]
 * @see [TreeBuilder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [AdjacencyGraphBuilder] class that operates on the given graph.
 * @param [graph] An [IGraph] instance on which this builder operates or `null` if a new [Graph][yfiles.graph.Graph] should be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-constructor-AdjacencyGraphBuilder">Online Documentation</a>
 * 
 * @property graph
 * Gets the [graph][IGraph] used by this builder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23graph">Online Documentation</a>
 */
open external class AdjacencyGraphBuilder (
final val graph: IGraph = definedExternally) : IEventDispatcher {
  /**
   * Binds a collection of data items to the given `nodesSource`.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects that is bound to the source.
   * @param [nodesSource] The source to which the data is bound.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-addNodesSource">Online Documentation</a>
   */
  fun <TDataItem> addNodesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    nodesSource: AdjacencyNodesSource<TDataItem>,
  )
  
  /**
   * Populates the graph with items generated from the bound data.
   * @return The [graph][AdjacencyGraphBuilder] of this builder populated by the defined sources.
   * @see [updateGraph]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-buildGraph">Online Documentation</a>
   */
  open fun buildGraph(): IGraph
  
  /**
   * Creates a new [AdjacencyNodesSource] and binds a collection of group node data items to it.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects to iterate and create the group nodes from.
   * @param [idProvider] An optional function that yields an ID for each element in the `data`. This ID is used by [parentIdProvider][AdjacencyNodesSource], [addSuccessorIds][AdjacencyNodesSource], and [addPredecessorIds][AdjacencyNodesSource] to resolve the parent, source, or target nodes. The ID is also used to identify nodes during [updateGraph][AdjacencyGraphBuilder].
   * @return A new [AdjacencyNodesSource] instance that can be used to further customize the creation of nodes, e.g. provide specific style [defaults][NodeCreator].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-createGroupNodesSource">Online Documentation</a>
   */
  fun <TDataItem> createGroupNodesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    idProvider: IdProvider<TDataItem>?,
  ): AdjacencyNodesSource<TDataItem>
  
  /**
   * Creates a new [AdjacencyNodesSource] and binds a collection of node data items to it.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects to iterate and create the nodes from.
   * @param [idProvider] An optional function that yields an ID for each element in the `data`. This ID is used by [parentIdProvider][AdjacencyNodesSource], [addSuccessorIds][AdjacencyNodesSource], and [addPredecessorIds][AdjacencyNodesSource] to resolve the parent, source, or target nodes. The ID is also used to identify nodes during [updateGraph][AdjacencyGraphBuilder].
   * @return A new [AdjacencyNodesSource] instance that can be used to further customize the creation of nodes, e.g. provide specific style [defaults][NodeCreator].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-createNodesSource">Online Documentation</a>
   */
  fun <TDataItem> createNodesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    idProvider: IdProvider<TDataItem>?,
  ): AdjacencyNodesSource<TDataItem>
  
  /**
   * Returns the data item the given `node` was created for.
   * @param [node] The node that was created for the data item.
   * @return The data item the given `node` was created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-getDataItem(INode)">Online Documentation</a>
   */
  open fun getDataItem(
    node: INode,
  ): Any?
  
  /**
   * Returns the data item the given `edge` was created for.
   * @param [edge] The edge that was created for the data item.
   * @return The data item the given `edge` was created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-getDataItem(IEdge)">Online Documentation</a>
   */
  open fun getDataItem(
    edge: IEdge,
  ): Any?
  
  /**
   * Returns the [INode] that was created for a data item with the given `id`.
   * @param [TId] The type of the id.
   * @param [id] The id the node was created for.
   * @return The [INode] that was created for a data item with the given `id`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-getNodeById">Online Documentation</a>
   */
  open fun <TId> getNodeById(
    id: TId,
  ): INode?
  
  /**
   * Returns the [INode] that was created for the given `item`.
   * @param [TDataItem] The type of the data item.
   * @param [item] The data item the node was created for.
   * @return The [INode] that was created for the given `item`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-getNodeForItem">Online Documentation</a>
   */
  open fun <TDataItem> getNodeForItem(
    item: TDataItem,
  ): INode?
  
  /**
   * Triggers the [edge-created][AdjacencyGraphBuilder] event.
   * @param [edge] The edge that has been created.
   * @param [dataItem] The data item from which the edge has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onEdgeCreated">Online Documentation</a>
   */
  protected open fun onEdgeCreated(
    edge: IEdge,
    dataItem: Any,
  )
  
  /**
   * Triggers the [edge-removed][AdjacencyGraphBuilder] event.
   * @param [edge] The edge that has been removed.
   * @param [dataItem] The corresponding data item of the removed edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onEdgeRemoved">Online Documentation</a>
   */
  protected open fun onEdgeRemoved(
    edge: IEdge,
    dataItem: Any,
  )
  
  /**
   * Triggers the [edge-updated][AdjacencyGraphBuilder] event.
   * @param [edge] The edge that has been updated.
   * @param [dataItem] The data item with which the edge has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onEdgeUpdated">Online Documentation</a>
   */
  protected open fun onEdgeUpdated(
    edge: IEdge,
    dataItem: Any,
  )
  
  /**
   * Triggers the [label-added][AdjacencyGraphBuilder] event.
   * @param [label] The label that has been added.
   * @param [dataItem] The data item from which the label has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onLabelAdded">Online Documentation</a>
   */
  protected open fun onLabelAdded(
    label: ILabel,
    dataItem: Any,
  )
  
  /**
   * Triggers the [label-removed][AdjacencyGraphBuilder] event.
   * @param [label] The label that has been removed.
   * @param [dataItem] The corresponding data item of the removed label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onLabelRemoved">Online Documentation</a>
   */
  protected open fun onLabelRemoved(
    label: ILabel,
    dataItem: Any,
  )
  
  /**
   * Triggers the [label-updated][AdjacencyGraphBuilder] event.
   * @param [label] The label that has been updated.
   * @param [dataItem] The data item with which the label has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onLabelUpdated">Online Documentation</a>
   */
  protected open fun onLabelUpdated(
    label: ILabel,
    dataItem: Any,
  )
  
  /**
   * Triggers the [node-created][AdjacencyGraphBuilder] event.
   * @param [node] The node that has been created.
   * @param [dataItem] The data item from which the node has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onNodeCreated">Online Documentation</a>
   */
  protected open fun onNodeCreated(
    node: INode,
    dataItem: Any,
  )
  
  /**
   * Triggers the [node-removed][AdjacencyGraphBuilder] event.
   * @param [node] The node that has been removed.
   * @param [dataItem] The corresponding data item of the removed node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onNodeRemoved">Online Documentation</a>
   */
  protected open fun onNodeRemoved(
    node: INode,
    dataItem: Any,
  )
  
  /**
   * Triggers the [node-updated][AdjacencyGraphBuilder] event.
   * @param [node] The node that has been updated.
   * @param [dataItem] The data item with which the node has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-onNodeUpdated">Online Documentation</a>
   */
  protected open fun onNodeUpdated(
    node: INode,
    dataItem: Any,
  )
  
  /**
   * Binds a new data collection to an [AdjacencyNodesSource], replacing the old one.
   * @param [TDataItem] The type of the data items in the source.
   * @param [nodesSource] The source whose data source should be reassigned.
   * @param [data] The collection of objects that is specified for the given source.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-setData">Online Documentation</a>
   */
  fun <TDataItem> setData(
    nodesSource: AdjacencyNodesSource<TDataItem>,
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
  )
  
  /**
   * Updates the graph after changes in the bound data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23AdjacencyGraphBuilder-method-updateGraph">Online Documentation</a>
   */
  open fun updateGraph()
  
  companion object : ClassMetadata<AdjacencyGraphBuilder> {
  }
}

/**
 * `node-created`: Occurs when a node has been created by any one of the [nodes sources][AdjacencyGraphBuilder].
 * @see [addNodeUpdatedHandler]
 * @see [addNodeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23node-created">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addNodeCreatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<INode, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<INode, Any>> = { event, _ -> handler(event) }
  addEventListener("node-created", listener)
  return { removeEventListener("node-created", listener) }
}

/**
 * `node-updated`: Occurs when a node has been updated.
 * @see [addNodeCreatedHandler]
 * @see [addNodeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23node-updated">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addNodeUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<INode, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<INode, Any>> = { event, _ -> handler(event) }
  addEventListener("node-updated", listener)
  return { removeEventListener("node-updated", listener) }
}

/**
 * `node-removed`: Occurs when a node has been removed from any one of the [nodes sources][AdjacencyGraphBuilder].
 * @see [addNodeCreatedHandler]
 * @see [addNodeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23node-removed">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addNodeRemovedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<INode, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<INode, Any>> = { event, _ -> handler(event) }
  addEventListener("node-removed", listener)
  return { removeEventListener("node-removed", listener) }
}

/**
 * `edge-created`: Occurs when an edge has been created by any one of [AdjacencyNodesSource]'s add or create methods.
 * @see [addEdgeUpdatedHandler]
 * @see [addEdgeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23edge-created">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addEdgeCreatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, Any>> = { event, _ -> handler(event) }
  addEventListener("edge-created", listener)
  return { removeEventListener("edge-created", listener) }
}

/**
 * `edge-updated`: Occurs when an edge has been updated.
 * @see [addEdgeCreatedHandler]
 * @see [addEdgeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23edge-updated">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addEdgeUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, Any>> = { event, _ -> handler(event) }
  addEventListener("edge-updated", listener)
  return { removeEventListener("edge-updated", listener) }
}

/**
 * `edge-removed`: Occurs when an edge has been removed.
 * @see [addEdgeCreatedHandler]
 * @see [addEdgeUpdatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23edge-removed">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addEdgeRemovedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, Any>> = { event, _ -> handler(event) }
  addEventListener("edge-removed", listener)
  return { removeEventListener("edge-removed", listener) }
}

/**
 * `label-added`: Occurs when a label has been added to a node or edge.
 * @see [addLabelUpdatedHandler]
 * @see [addLabelRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23label-added">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addLabelAddedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, Any>> = { event, _ -> handler(event) }
  addEventListener("label-added", listener)
  return { removeEventListener("label-added", listener) }
}

/**
 * `label-updated`: Occurs when a node or edge label has been updated.
 * @see [addLabelAddedHandler]
 * @see [addLabelRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23label-updated">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addLabelUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, Any>> = { event, _ -> handler(event) }
  addEventListener("label-updated", listener)
  return { removeEventListener("label-updated", listener) }
}

/**
 * `label-removed`: Occurs when a node or edge label has been removed.
 * @see [addLabelAddedHandler]
 * @see [addLabelUpdatedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/AdjacencyGraphBuilder%23label-removed">Online Documentation</a>
 */
inline fun  AdjacencyGraphBuilder.addLabelRemovedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, Any>> = { event, _ -> handler(event) }
  addEventListener("label-removed", listener)
  return { removeEventListener("label-removed", listener) }
}
