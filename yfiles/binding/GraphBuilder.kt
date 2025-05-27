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
import yfiles.lang.YObject

/**
 * Populates a graph from custom data.
 * @see [TreeBuilder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [GraphBuilder] class that operates on the given graph.
 * @param [graph] An [IGraph] instance on which this builder operates or `null` if a new [DefaultGraph][yfiles.graph.DefaultGraph] should be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-constructor-GraphBuilder">Online Documentation</a>
 */
external open class GraphBuilder  ( graph: IGraph?  = definedExternally) : YObject, IEventDispatcher {

/**
 * Gets the [graph][IGraph] used by this builder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23graph">Online Documentation</a>
 */
final val graph: IGraph
/**
 * Binds a collection of data items to the given `edgesSource`.
 * @param [TDataItem] The type of the data items in the source.
 * @param [data] The collection of objects that is bound to the source.
 * @param [edgesSource] The source to which the data is bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-addEdgesSource">Online Documentation</a>
 */
 final   fun <TDataItem>addEdgesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 edgesSource: EdgesSource<TDataItem> )
/**
 * Binds a collection of data items to the given `nodesSource`.
 * @param [TDataItem] The type of the data items in the source.
 * @param [data] The collection of objects that is bound to the source.
 * @param [nodesSource] The source to which the data is bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-addNodesSource">Online Documentation</a>
 */
 final   fun <TDataItem>addNodesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 nodesSource: NodesSource<TDataItem> )
/**
 * Populates the graph with items generated from the bound data.
 * @return The [graph] of this builder populated by the defined sources.
 * @see [updateGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-buildGraph">Online Documentation</a>
 */
 open   fun buildGraph():IGraph
/**
 * Creates a new [EdgesSource] and binds a collection of edge data items to it.
 * @param [TDataItem] The type of the data items in the source.
 * @param [data] The collection of objects to iterate and create the edges from.
 * @param [sourceId] A provider that defines the source of the edge in the graph structure. Must resolve to the specified node id.
 * @param [targetId] A provider that defines the target of the edge in the graph structure. Must resolve to the specified node id.
 * @param [id] An optional function that yields an id for each element in the `data`. This id is used to identify the edges during [updateGraph].
 * @return A new [EdgesSource] instance that can be used to further customize the creation of edges, e.g. provide specific [style defaults][EdgeCreator.defaults].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-createEdgesSource">Online Documentation</a>
 */
 final   fun <TDataItem>createEdgesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 sourceId: Provider<TDataItem, Any> ,
 targetId: Provider<TDataItem, Any> ,
 id: IdProvider<TDataItem>?  = definedExternally):EdgesSource<TDataItem>
/**
 * Creates a new [NodesSource] and binds a collection of group node data items to it.
 * @param [TDataItem] The type of the data items in the source.
 * @param [data] The collection of objects to iterate and create the group nodes from.
 * @param [id] A function that yields an ID for each element in the `data`. If the data has no associated IDs, `null` may be used as well in which case the builder uses the objects themselves as identifiers internally.<br></br>This ID is used by [NodesSource.parentIdProvider] and [EdgesSource.sourceIdProvider] and [EdgesSource.targetIdProvider] to resolve the parent, source, or target nodes. The ID is also used to identify nodes during [updateGraph].
 * @return A new [NodesSource] instance that can be used to further customize the creation of nodes, e.g. provide specific [style defaults][NodeCreator.defaults].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-createGroupNodesSource">Online Documentation</a>
 */
 final   fun <TDataItem>createGroupNodesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 id: IdProvider<TDataItem>? ):NodesSource<TDataItem>
/**
 * Creates a new [NodesSource] and binds a collection of node data items to it.
 * @param [TDataItem] The type of the data items in the source.
 * @param [data] The collection of objects to iterate and create the nodes from.
 * @param [id] A function that yields an ID for each element in the `data`. If the data has no associated IDs, `null` may be used as well in which case the builder uses the objects themselves as identifiers internally.<br></br>This ID is used by [NodesSource.parentIdProvider] and [EdgesSource.sourceIdProvider] and [EdgesSource.targetIdProvider] to resolve the parent, source, or target nodes. The ID is also used to identify nodes during [updateGraph].
 * @return A new [NodesSource] instance that can be used to further customize the creation of nodes, e.g. provide specific [style defaults][NodeCreator.defaults].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-createNodesSource">Online Documentation</a>
 */
 final   fun <TDataItem>createNodesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 id: IdProvider<TDataItem>? ):NodesSource<TDataItem>
/**
 * Returns the data item the given `node` was created for.
 * @param [node] The node that was created for the data item.
 * @return The data item the given `node` was created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getDataItem(INode)">Online Documentation</a>
 */
 open   fun getDataItem( node: INode ):Any?
/**
 * Returns the data item the given `edge` was created for.
 * @param [edge] The edge that was created for the data item.
 * @return The data item the given `edge` was created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getDataItem(IEdge)">Online Documentation</a>
 */
 open   fun getDataItem( edge: IEdge ):Any?
/**
 * Returns the [IEdge] that was created for a data item with the given `id`.
 * @param [TId] The type of the id.
 * @param [id] The id the edge was created for.
 * @return The [IEdge] that was created for a data item with the given `id`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getEdgeById">Online Documentation</a>
 */
 open   fun <TId>getEdgeById( id: TId ):IEdge?
/**
 * Returns the [IEdge] that was created for the given `item`.
 * @param [TDataItem] The type of the data item.
 * @param [item] The data item the edge was created for.
 * @return The [IEdge] that was created for the given `item`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getEdgeForItem">Online Documentation</a>
 */
 open   fun <TDataItem>getEdgeForItem( item: TDataItem ):IEdge?
/**
 * Returns the [INode] that was created for a data item with the given `id`.
 * @param [TId] The type of the id.
 * @param [id] The id the node was created for.
 * @return The [INode] that was created for a data item with the given `id`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getNodeById">Online Documentation</a>
 */
 open   fun <TId>getNodeById( id: TId ):INode?
/**
 * Returns the [INode] that was created for the given `item`.
 * @param [TDataItem] The type of the data item.
 * @param [item] The data item the node was created for.
 * @return The [INode] that was created for the given `item`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-getNodeForItem">Online Documentation</a>
 */
 open   fun <TDataItem>getNodeForItem( item: TDataItem ):INode?
/**
 * Triggers the [EdgeCreated] event.
 * @param [edge] The edge that has been created.
 * @param [dataItem] The data item from which the edge has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onEdgeCreated">Online Documentation</a>
 */
 open protected   fun onEdgeCreated( edge: IEdge ,
 dataItem: Any )
/**
 * Triggers the [EdgeRemoved] event.
 * @param [edge] The edge that has been removed.
 * @param [dataItem] The corresponding data item of the removed edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onEdgeRemoved">Online Documentation</a>
 */
 open protected   fun onEdgeRemoved( edge: IEdge ,
 dataItem: Any )
/**
 * Triggers the [EdgeUpdated] event.
 * @param [edge] The edge that has been updated.
 * @param [dataItem] The data item with which the edge has been updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onEdgeUpdated">Online Documentation</a>
 */
 open protected   fun onEdgeUpdated( edge: IEdge ,
 dataItem: Any )
/**
 * Triggers the [LabelAdded] event.
 * @param [label] The label that has been added.
 * @param [dataItem] The data item from which the label has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onLabelAdded">Online Documentation</a>
 */
 open protected   fun onLabelAdded( label: ILabel ,
 dataItem: Any )
/**
 * Triggers the [LabelRemoved] event.
 * @param [label] The label that has been removed.
 * @param [dataItem] The corresponding data item of the removed label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onLabelRemoved">Online Documentation</a>
 */
 open protected   fun onLabelRemoved( label: ILabel ,
 dataItem: Any )
/**
 * Triggers the [LabelUpdated] event.
 * @param [label] The label that has been updated.
 * @param [dataItem] The data item with which the label has been updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onLabelUpdated">Online Documentation</a>
 */
 open protected   fun onLabelUpdated( label: ILabel ,
 dataItem: Any )
/**
 * Triggers the [NodeCreated] event.
 * @param [node] The node that has been created.
 * @param [dataItem] The data item from which the node has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onNodeCreated">Online Documentation</a>
 */
 open protected   fun onNodeCreated( node: INode ,
 dataItem: Any )
/**
 * Triggers the [NodeRemoved] event.
 * @param [node] The node that has been removed.
 * @param [dataItem] The corresponding data item of the removed node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onNodeRemoved">Online Documentation</a>
 */
 open protected   fun onNodeRemoved( node: INode ,
 dataItem: Any )
/**
 * Triggers the [NodeUpdated] event.
 * @param [node] The node that has been updated.
 * @param [dataItem] The data item with which the node has been updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-onNodeUpdated">Online Documentation</a>
 */
 open protected   fun onNodeUpdated( node: INode ,
 dataItem: Any )
/**
 * Binds a new data collection to a [NodesSource], replacing the old one.
 * @param [TDataItem] The type of the data items in the source.
 * @param [nodesSource] The source whose data source should be re-assigned.
 * @param [data] The collection of objects that is specified for the given source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-setData(NodesSource,Object)">Online Documentation</a>
 */
 final   fun <TDataItem>setData( nodesSource: NodesSource<TDataItem> ,
 data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ )
/**
 * Binds a new data collection to a [EdgesSource], replacing the old one.
 * @param [TDataItem] The type of the data items in the source.
 * @param [edgesSource] The source whose data source should be re-assigned.
 * @param [data] The collection of objects that is specified for the given source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-setData(EdgesSource,Object)">Online Documentation</a>
 */
 final   fun <TDataItem>setData( edgesSource: EdgesSource<TDataItem> ,
 data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ )
/**
 * Updates the graph after changes in the bound data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23GraphBuilder-method-updateGraph">Online Documentation</a>
 */
 open   fun updateGraph()
/**
 * Occurs when a node has been created by any one of the [nodes sources][createNodesSource].
 * @see [addNodeUpdatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23NodeCreated">Online Documentation</a>
 */
fun addNodeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)
fun removeNodeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)

/**
 * Occurs when a node has been updated.
 * @see [addNodeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23NodeUpdated">Online Documentation</a>
 */
fun addNodeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)
fun removeNodeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)

/**
 * Occurs when a node has been removed from any one of the [nodes sources][createNodesSource].
 * @see [addNodeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23NodeRemoved">Online Documentation</a>
 */
fun addNodeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)
fun removeNodeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)

/**
 * Occurs when an edge has been created by any one of the [edges sources][createEdgesSource].
 * @see [addEdgeUpdatedListener]
 * @see [addEdgeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23EdgeCreated">Online Documentation</a>
 */
fun addEdgeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)
fun removeEdgeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)

/**
 * Occurs when an edge has been updated.
 * @see [addEdgeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23EdgeUpdated">Online Documentation</a>
 */
fun addEdgeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)
fun removeEdgeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)

/**
 * Occurs when an edge has been removed.
 * @see [addEdgeUpdatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23EdgeRemoved">Online Documentation</a>
 */
fun addEdgeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)
fun removeEdgeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)

/**
 * Occurs when a label has been added to a node or edge.
 * @see [addLabelUpdatedListener]
 * @see [addLabelRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23LabelAdded">Online Documentation</a>
 */
fun addLabelAddedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)
fun removeLabelAddedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)

/**
 * Occurs when a node or edge label has been updated.
 * @see [addLabelAddedListener]
 * @see [addLabelRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23LabelUpdated">Online Documentation</a>
 */
fun addLabelUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)
fun removeLabelUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)

/**
 * Occurs when a node or edge label has been removed.
 * @see [addLabelAddedListener]
 * @see [addLabelUpdatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23LabelRemoved">Online Documentation</a>
 */
fun addLabelRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)
fun removeLabelRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)

companion object : ClassMetadata<GraphBuilder> {
}
}

/**
 * Occurs when a node has been created by any one of the [nodes sources][createNodesSource].
 * @see [addNodeUpdatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23NodeCreated">Online Documentation</a>
 */
inline fun  GraphBuilder.addNodeCreatedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<INode, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>> = { _, event -> handler(event) }
    addNodeCreatedListener(listener)
    return { removeNodeCreatedListener(listener) }
}
/**
 * Occurs when a node has been updated.
 * @see [addNodeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23NodeUpdated">Online Documentation</a>
 */
inline fun  GraphBuilder.addNodeUpdatedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<INode, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>> = { _, event -> handler(event) }
    addNodeUpdatedListener(listener)
    return { removeNodeUpdatedListener(listener) }
}
/**
 * Occurs when a node has been removed from any one of the [nodes sources][createNodesSource].
 * @see [addNodeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23NodeRemoved">Online Documentation</a>
 */
inline fun  GraphBuilder.addNodeRemovedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<INode, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>> = { _, event -> handler(event) }
    addNodeRemovedListener(listener)
    return { removeNodeRemovedListener(listener) }
}
/**
 * Occurs when an edge has been created by any one of the [edges sources][createEdgesSource].
 * @see [addEdgeUpdatedListener]
 * @see [addEdgeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23EdgeCreated">Online Documentation</a>
 */
inline fun  GraphBuilder.addEdgeCreatedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>> = { _, event -> handler(event) }
    addEdgeCreatedListener(listener)
    return { removeEdgeCreatedListener(listener) }
}
/**
 * Occurs when an edge has been updated.
 * @see [addEdgeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23EdgeUpdated">Online Documentation</a>
 */
inline fun  GraphBuilder.addEdgeUpdatedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>> = { _, event -> handler(event) }
    addEdgeUpdatedListener(listener)
    return { removeEdgeUpdatedListener(listener) }
}
/**
 * Occurs when an edge has been removed.
 * @see [addEdgeUpdatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23EdgeRemoved">Online Documentation</a>
 */
inline fun  GraphBuilder.addEdgeRemovedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<IEdge, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>> = { _, event -> handler(event) }
    addEdgeRemovedListener(listener)
    return { removeEdgeRemovedListener(listener) }
}
/**
 * Occurs when a label has been added to a node or edge.
 * @see [addLabelUpdatedListener]
 * @see [addLabelRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23LabelAdded">Online Documentation</a>
 */
inline fun  GraphBuilder.addLabelAddedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>> = { _, event -> handler(event) }
    addLabelAddedListener(listener)
    return { removeLabelAddedListener(listener) }
}
/**
 * Occurs when a node or edge label has been updated.
 * @see [addLabelAddedListener]
 * @see [addLabelRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23LabelUpdated">Online Documentation</a>
 */
inline fun  GraphBuilder.addLabelUpdatedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>> = { _, event -> handler(event) }
    addLabelUpdatedListener(listener)
    return { removeLabelUpdatedListener(listener) }
}
/**
 * Occurs when a node or edge label has been removed.
 * @see [addLabelAddedListener]
 * @see [addLabelUpdatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphBuilder%23LabelRemoved">Online Documentation</a>
 */
inline fun  GraphBuilder.addLabelRemovedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>> = { _, event -> handler(event) }
    addLabelRemovedListener(listener)
    return { removeLabelRemovedListener(listener) }
}
