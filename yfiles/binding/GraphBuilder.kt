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
 * Populates a graph from custom data.
 * @see [TreeBuilder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GraphBuilder] class that operates on the given graph.
 * @param [graph] An [IGraph] instance on which this builder operates. If omitted, a new [Graph][yfiles.graph.Graph] will be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-constructor-GraphBuilder">Online Documentation</a>
 * 
 * @property graph
 * Gets the [graph][IGraph] used by this builder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23graph">Online Documentation</a>
 */
open external class GraphBuilder (
final val graph: IGraph = definedExternally) : IEventDispatcher {
  /**
   * Binds a collection of data items to the given `edgesSource`.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects that is bound to the source.
   * @param [edgesSource] The source to which the data is bound.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-addEdgesSource">Online Documentation</a>
   */
  fun <TDataItem> addEdgesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    edgesSource: EdgesSource<TDataItem>,
  )
  
  /**
   * Binds a collection of data items to the given `nodesSource`.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects that is bound to the source.
   * @param [nodesSource] The source to which the data is bound.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-addNodesSource">Online Documentation</a>
   */
  fun <TDataItem> addNodesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    nodesSource: NodesSource<TDataItem>,
  )
  
  /**
   * Populates the graph with items generated from the bound data.
   * @return The [graph][GraphBuilder] of this builder populated by the defined sources.
   * @see [updateGraph]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-buildGraph">Online Documentation</a>
   */
  open fun buildGraph(): IGraph
  
  /**
   * Creates a new [EdgesSource] and binds a collection of edge data items to it.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects to iterate and create the edges from.
   * @param [sourceId] A provider that defines the source of the edge in the graph structure. Must resolve to the specified node id.
   * @param [targetId] A provider that defines the target of the edge in the graph structure. Must resolve to the specified node id.
   * @param [id] An optional function that yields an id for each element in the `data`. This id is used to identify the edges during [updateGraph][GraphBuilder].
   * @return A new [EdgesSource] instance that can be used to further customize the creation of edges, e.g. provide specific style [defaults][EdgeCreator].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-createEdgesSource">Online Documentation</a>
   */
  fun <TDataItem> createEdgesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    sourceId: Provider<TDataItem, Any>,
    targetId: Provider<TDataItem, Any>,
    id: IdProvider<TDataItem>  = definedExternally,
  ): EdgesSource<TDataItem>
  
  /**
   * Creates a new [NodesSource] and binds a collection of group node data items to it.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects to iterate and create the group nodes from.
   * @param [id] A function that yields an ID for each element in the `data`. If the data has no associated IDs, `null` may be used as well in which case the builder uses the objects themselves as identifiers internally.<br></br>This ID is used by [parentIdProvider][NodesSource] and [sourceIdProvider][EdgesSource] and [targetIdProvider][EdgesSource] to resolve the parent, source, or target nodes. The ID is also used to identify nodes during [updateGraph][GraphBuilder].
   * @return A new [NodesSource] instance that can be used to further customize the creation of nodes, e.g. provide specific style [defaults][NodeCreator].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-createGroupNodesSource">Online Documentation</a>
   */
  fun <TDataItem> createGroupNodesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    id: IdProvider<TDataItem>?,
  ): NodesSource<TDataItem>
  
  /**
   * Creates a new [NodesSource] and binds a collection of node data items to it.
   * @param [TDataItem] The type of the data items in the source.
   * @param [data] The collection of objects to iterate and create the nodes from.
   * @param [id] A function that yields an ID for each element in the `data`. If the data has no associated IDs, `null` may be used as well in which case the builder uses the objects themselves as identifiers internally.<br></br>This ID is used by [parentIdProvider][NodesSource] and [sourceIdProvider][EdgesSource] and [targetIdProvider][EdgesSource] to resolve the parent, source, or target nodes. The ID is also used to identify nodes during [updateGraph][GraphBuilder].
   * @return A new [NodesSource] instance that can be used to further customize the creation of nodes, e.g. provide specific style [defaults][NodeCreator].
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-createNodesSource">Online Documentation</a>
   */
  fun <TDataItem> createNodesSource(
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
    id: IdProvider<TDataItem>?,
  ): NodesSource<TDataItem>
  
  /**
   * Returns the data item the given `node` was created for.
   * @param [node] The node that was created for the data item.
   * @return The data item the given `node` was created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getDataItem(INode)">Online Documentation</a>
   */
  open fun getDataItem(
    node: INode,
  ): Any?
  
  /**
   * Returns the data item the given `edge` was created for.
   * @param [edge] The edge that was created for the data item.
   * @return The data item the given `edge` was created for.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getDataItem(IEdge)">Online Documentation</a>
   */
  open fun getDataItem(
    edge: IEdge,
  ): Any?
  
  /**
   * Returns the [IEdge] that was created for a data item with the given `id`.
   * @param [TId] The type of the id.
   * @param [id] The id the edge was created for.
   * @return The [IEdge] that was created for a data item with the given `id`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getEdgeById">Online Documentation</a>
   */
  open fun <TId> getEdgeById(
    id: TId,
  ): IEdge?
  
  /**
   * Returns the [IEdge] that was created for the given `item`.
   * @param [TDataItem] The type of the data item.
   * @param [item] The data item the edge was created for.
   * @return The [IEdge] that was created for the given `item`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getEdgeForItem">Online Documentation</a>
   */
  open fun <TDataItem> getEdgeForItem(
    item: TDataItem,
  ): IEdge?
  
  /**
   * Returns the [INode] that was created for a data item with the given `id`.
   * @param [TId] The type of the id.
   * @param [id] The id the node was created for.
   * @return The [INode] that was created for a data item with the given `id`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getNodeById">Online Documentation</a>
   */
  open fun <TId> getNodeById(
    id: TId,
  ): INode?
  
  /**
   * Returns the [INode] that was created for the given `item`.
   * @param [TDataItem] The type of the data item.
   * @param [item] The data item the node was created for.
   * @return The [INode] that was created for the given `item`.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getNodeForItem">Online Documentation</a>
   */
  open fun <TDataItem> getNodeForItem(
    item: TDataItem,
  ): INode?
  
  /**
   * Triggers the [edge-created][GraphBuilder] event.
   * @param [edge] The edge that has been created.
   * @param [dataItem] The data item from which the edge has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onEdgeCreated">Online Documentation</a>
   */
  protected open fun onEdgeCreated(
    edge: IEdge,
    dataItem: Any,
  )
  
  /**
   * Triggers the [edge-removed][GraphBuilder] event.
   * @param [edge] The edge that has been removed.
   * @param [dataItem] The corresponding data item of the removed edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onEdgeRemoved">Online Documentation</a>
   */
  protected open fun onEdgeRemoved(
    edge: IEdge,
    dataItem: Any,
  )
  
  /**
   * Triggers the [edge-updated][GraphBuilder] event.
   * @param [edge] The edge that has been updated.
   * @param [dataItem] The data item with which the edge has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onEdgeUpdated">Online Documentation</a>
   */
  protected open fun onEdgeUpdated(
    edge: IEdge,
    dataItem: Any,
  )
  
  /**
   * Triggers the [label-added][GraphBuilder] event.
   * @param [label] The label that has been added.
   * @param [dataItem] The data item from which the label has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onLabelAdded">Online Documentation</a>
   */
  protected open fun onLabelAdded(
    label: ILabel,
    dataItem: Any,
  )
  
  /**
   * Triggers the [label-removed][GraphBuilder] event.
   * @param [label] The label that has been removed.
   * @param [dataItem] The corresponding data item of the removed label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onLabelRemoved">Online Documentation</a>
   */
  protected open fun onLabelRemoved(
    label: ILabel,
    dataItem: Any,
  )
  
  /**
   * Triggers the [label-updated][GraphBuilder] event.
   * @param [label] The label that has been updated.
   * @param [dataItem] The data item with which the label has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onLabelUpdated">Online Documentation</a>
   */
  protected open fun onLabelUpdated(
    label: ILabel,
    dataItem: Any,
  )
  
  /**
   * Triggers the [node-created][GraphBuilder] event.
   * @param [node] The node that has been created.
   * @param [dataItem] The data item from which the node has been created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onNodeCreated">Online Documentation</a>
   */
  protected open fun onNodeCreated(
    node: INode,
    dataItem: Any,
  )
  
  /**
   * Triggers the [node-removed][GraphBuilder] event.
   * @param [node] The node that has been removed.
   * @param [dataItem] The corresponding data item of the removed node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onNodeRemoved">Online Documentation</a>
   */
  protected open fun onNodeRemoved(
    node: INode,
    dataItem: Any,
  )
  
  /**
   * Triggers the [node-updated][GraphBuilder] event.
   * @param [node] The node that has been updated.
   * @param [dataItem] The data item with which the node has been updated.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onNodeUpdated">Online Documentation</a>
   */
  protected open fun onNodeUpdated(
    node: INode,
    dataItem: Any,
  )
  
  /**
   * Binds a new data collection to a [NodesSource], replacing the old one.
   * @param [TDataItem] The type of the data items in the source.
   * @param [nodesSource] The source whose data source should be reassigned.
   * @param [data] The collection of objects that is specified for the given source.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-setData(NodesSource,any)">Online Documentation</a>
   */
  fun <TDataItem> setData(
    nodesSource: NodesSource<TDataItem>,
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
  )
  
  /**
   * Binds a new data collection to a [EdgesSource], replacing the old one.
   * @param [TDataItem] The type of the data items in the source.
   * @param [edgesSource] The source whose data source should be reassigned.
   * @param [data] The collection of objects that is specified for the given source.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-setData(EdgesSource,any)">Online Documentation</a>
   */
  fun <TDataItem> setData(
    edgesSource: EdgesSource<TDataItem>,
    data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => Generator<TDataItem>) */,
  )
  
  /**
   * Updates the graph after changes in the bound data.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-updateGraph">Online Documentation</a>
   */
  open fun updateGraph()
  
  companion object : ClassMetadata<GraphBuilder> {
  }
}

/**
 * `node-created`: Occurs when a node has been created by any one of the [nodes sources][GraphBuilder].
 * @see [addNodeUpdatedHandler]
 * @see [addNodeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23node-created">Online Documentation</a>
 */
inline fun  GraphBuilder.addNodeCreatedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23node-updated">Online Documentation</a>
 */
inline fun  GraphBuilder.addNodeUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<INode, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<INode, Any>> = { event, _ -> handler(event) }
  addEventListener("node-updated", listener)
  return { removeEventListener("node-updated", listener) }
}

/**
 * `node-removed`: Occurs when a node has been removed from any one of the [nodes sources][GraphBuilder].
 * @see [addNodeCreatedHandler]
 * @see [addNodeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23node-removed">Online Documentation</a>
 */
inline fun  GraphBuilder.addNodeRemovedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<INode, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<INode, Any>> = { event, _ -> handler(event) }
  addEventListener("node-removed", listener)
  return { removeEventListener("node-removed", listener) }
}

/**
 * `edge-created`: Occurs when an edge has been created by any one of the [edges sources][GraphBuilder].
 * @see [addEdgeUpdatedHandler]
 * @see [addEdgeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23edge-created">Online Documentation</a>
 */
inline fun  GraphBuilder.addEdgeCreatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, Any>> = { event, _ -> handler(event) }
  addEventListener("edge-created", listener)
  return { removeEventListener("edge-created", listener) }
}

/**
 * `edge-updated`: Occurs when an edge has been updated.
 * @see [addEdgeCreatedHandler]
 * @see [addNodeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23edge-updated">Online Documentation</a>
 */
inline fun  GraphBuilder.addEdgeUpdatedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, Any>> = { event, _ -> handler(event) }
  addEventListener("edge-updated", listener)
  return { removeEventListener("edge-updated", listener) }
}

/**
 * `edge-removed`: Occurs when an edge has been removed.
 * @see [addEdgeUpdatedHandler]
 * @see [addNodeRemovedHandler]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23edge-removed">Online Documentation</a>
 */
inline fun  GraphBuilder.addEdgeRemovedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23label-added">Online Documentation</a>
 */
inline fun  GraphBuilder.addLabelAddedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23label-updated">Online Documentation</a>
 */
inline fun  GraphBuilder.addLabelUpdatedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23label-removed">Online Documentation</a>
 */
inline fun  GraphBuilder.addLabelRemovedHandler(
  crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, Any>> = { event, _ -> handler(event) }
  addEventListener("label-removed", listener)
  return { removeEventListener("label-removed", listener) }
}
