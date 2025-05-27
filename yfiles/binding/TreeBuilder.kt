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
 * Populates a graph from custom data where objects corresponding to nodes have a parent-child relationship.
 * @see [GraphBuilder]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder">Online Documentation</a>
 * 
 * @constructor Initializes a new instance of the [TreeBuilder] class that operates on the given graph.
 * @param [graph] An [IGraph] instance on which this builder operates or `null` if a new [DefaultGraph][yfiles.graph.DefaultGraph] should be created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-constructor-TreeBuilder">Online Documentation</a>
 */
external open class TreeBuilder  ( graph: IGraph?  = definedExternally) : YObject, IEventDispatcher {

/**
 * Gets the [graph][IGraph] used by this builder.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23graph">Online Documentation</a>
 */
final val graph: IGraph
/**
 * Binds a collection of root data items to the given `nodesSource`.
 * @param [TDataItem] The type of the data items in the source.
 * @param [data] The collection of objects that is bound to the source.
 * @param [nodesSource] The source to which the data is bound.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-addRootNodesSource">Online Documentation</a>
 */
 final   fun <TDataItem>addRootNodesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 nodesSource: TreeNodesSource<TDataItem> )
/**
 * Populates the graph with items generated from the bound data.
 * @return The [graph] of this builder populated by the defined sources.
 * @see [updateGraph]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-buildGraph">Online Documentation</a>
 */
 open   fun buildGraph():IGraph
/**
 * Registers a collection of root group data items functioning as entities for the [NodeCreator] of the returned [TreeNodesSource].
 * @param [TDataItem] The type of the root data items in the source.
 * @param [data] The collection of objects to iterate and create the group root nodes from.
 * @param [idProvider] An optional function that yields an id for each element in the `data`.
 * @return A new [TreeNodesSource] instance that can be used to further customize the creation, e.g. provide specific [style defaults][NodeCreator.defaults].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-createRootGroupNodesSource">Online Documentation</a>
 */
 final   fun <TDataItem>createRootGroupNodesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 idProvider: IdProvider<TDataItem>?  = definedExternally):TreeNodesSource<TDataItem>
/**
 * Registers a collection of root data items functioning as entities for the [NodeCreator] of the returned [TreeNodesSource].
 * @param [TDataItem] The type of the root data items in the source.
 * @param [data] The collection of objects to iterate and create the root nodes from.
 * @param [idProvider] An optional function that yields an id for each element in the `data`.
 * @return A new [TreeNodesSource] instance that can be used to further customize the creation, e.g. provide specific [style defaults][NodeCreator.defaults].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-createRootNodesSource">Online Documentation</a>
 */
 final   fun <TDataItem>createRootNodesSource( data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ ,
 idProvider: IdProvider<TDataItem>?  = definedExternally):TreeNodesSource<TDataItem>
/**
 * Returns the data item the given `node` was created for.
 * @param [node] The node that was created for the data item.
 * @return The data item the given `node` was created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-getDataItem(INode)">Online Documentation</a>
 */
 open   fun getDataItem( node: INode ):Any?
/**
 * Returns the data item the given `edge` was created for.
 * @param [edge] The edge that was created for the data item.
 * @return The data item the given `edge` was created for.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-getDataItem(IEdge)">Online Documentation</a>
 */
 open   fun getDataItem( edge: IEdge ):Any?
/**
 * Returns the [INode] that was created for a data item with the given `id`.
 * @param [TId] The type of the id.
 * @param [id] The id the node was created for.
 * @return The [INode] that was created for a data item with the given `id`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-getNodeById">Online Documentation</a>
 */
 open   fun <TId>getNodeById( id: TId ):INode?
/**
 * Returns the [INode] that was created for the given `item`.
 * @param [TDataItem] The type of the data item.
 * @param [item] The data item the node was created for.
 * @return The [INode] that was created for the given `item`.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-getNodeForItem">Online Documentation</a>
 */
 open   fun <TDataItem>getNodeForItem( item: TDataItem ):INode?
/**
 * Triggers the [EdgeCreated] event.
 * @param [edge] The edge that has been created.
 * @param [dataItem] The data item from which the edge has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onEdgeCreated">Online Documentation</a>
 */
 open protected   fun onEdgeCreated( edge: IEdge ,
 dataItem: Any )
/**
 * Triggers the [EdgeRemoved] event.
 * @param [edge] The edge that has been removed.
 * @param [dataItem] The corresponding data item of the removed edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onEdgeRemoved">Online Documentation</a>
 */
 open protected   fun onEdgeRemoved( edge: IEdge ,
 dataItem: Any )
/**
 * Triggers the [EdgeUpdated] event.
 * @param [edge] The edge that has been updated.
 * @param [dataItem] The data item with which the edge has been updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onEdgeUpdated">Online Documentation</a>
 */
 open protected   fun onEdgeUpdated( edge: IEdge ,
 dataItem: Any )
/**
 * Triggers the [LabelAdded] event.
 * @param [label] The label that has been added.
 * @param [dataItem] The data item from which the label has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onLabelAdded">Online Documentation</a>
 */
 open protected   fun onLabelAdded( label: ILabel ,
 dataItem: Any )
/**
 * Triggers the [LabelRemoved] event.
 * @param [label] The label that has been removed.
 * @param [dataItem] The corresponding data item of the removed label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onLabelRemoved">Online Documentation</a>
 */
 open protected   fun onLabelRemoved( label: ILabel ,
 dataItem: Any )
/**
 * Triggers the [LabelUpdated] event.
 * @param [label] The label that has been updated.
 * @param [dataItem] The data item with which the label has been updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onLabelUpdated">Online Documentation</a>
 */
 open protected   fun onLabelUpdated( label: ILabel ,
 dataItem: Any )
/**
 * Triggers the [NodeCreated] event.
 * @param [node] The node that has been created.
 * @param [dataItem] The data item from which the node has been created.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onNodeCreated">Online Documentation</a>
 */
 open protected   fun onNodeCreated( node: INode ,
 dataItem: Any )
/**
 * Triggers the [NodeRemoved] event.
 * @param [node] The node that has been removed.
 * @param [dataItem] The corresponding data item of the removed node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onNodeRemoved">Online Documentation</a>
 */
 open protected   fun onNodeRemoved( node: INode ,
 dataItem: Any )
/**
 * Triggers the [NodeUpdated] event.
 * @param [node] The node that has been updated.
 * @param [dataItem] The data item with which the node has been updated.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-onNodeUpdated">Online Documentation</a>
 */
 open protected   fun onNodeUpdated( node: INode ,
 dataItem: Any )
/**
 * Binds a new data collection to a [TreeNodesSource], replacing the old one.
 * @param [TDataItem] The type of the data items in the source.
 * @param [nodesSource] The source whose data source should be re-assigned.
 * @param [data] The collection of objects that is specified for the given source.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-setData">Online Documentation</a>
 */
 final   fun <TDataItem>setData( nodesSource: TreeNodesSource<TDataItem> ,
 data: ReadonlyArray<TDataItem> /* TDataItem[] | Iterable<TDataItem> | Map<any, TDataItem> | {[id: string]: TDataItem;} | (() => GeneratorLike<TDataItem>) */ )
/**
 * Updates the graph after changes in the bound data.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23TreeBuilder-method-updateGraph">Online Documentation</a>
 */
 open   fun updateGraph()
/**
 * Occurs when a node has been created.
 * @see [addNodeUpdatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23NodeCreated">Online Documentation</a>
 */
fun addNodeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)
fun removeNodeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)

/**
 * Occurs when a node has been updated.
 * @see [addNodeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23NodeUpdated">Online Documentation</a>
 */
fun addNodeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)
fun removeNodeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)

/**
 * Occurs when a node has been removed.
 * @see [addNodeCreatedListener]
 * @see [addNodeUpdatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23NodeRemoved">Online Documentation</a>
 */
fun addNodeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)
fun removeNodeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>>)

/**
 * Occurs when an edge has been created.
 * @see [addEdgeUpdatedListener]
 * @see [addEdgeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23EdgeCreated">Online Documentation</a>
 */
fun addEdgeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)
fun removeEdgeCreatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)

/**
 * Occurs when an edge has been updated.
 * @see [addEdgeCreatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23EdgeUpdated">Online Documentation</a>
 */
fun addEdgeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)
fun removeEdgeUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)

/**
 * Occurs when an edge has been removed.
 * @see [addEdgeUpdatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23EdgeRemoved">Online Documentation</a>
 */
fun addEdgeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)
fun removeEdgeRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<IEdge, BusinessObject>>)

/**
 * Occurs when a label has been added to a node or edge.
 * @see [addLabelUpdatedListener]
 * @see [addLabelRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23LabelAdded">Online Documentation</a>
 */
fun addLabelAddedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)
fun removeLabelAddedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)

/**
 * Occurs when a node or edge label has been updated.
 * @see [addLabelAddedListener]
 * @see [addLabelRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23LabelUpdated">Online Documentation</a>
 */
fun addLabelUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)
fun removeLabelUpdatedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)

/**
 * Occurs when a node or edge label has been removed.
 * @see [addLabelAddedListener]
 * @see [addLabelUpdatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23LabelRemoved">Online Documentation</a>
 */
fun addLabelRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)
fun removeLabelRemovedListener(listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>>)

companion object : ClassMetadata<TreeBuilder> {
}
}

/**
 * Occurs when a node has been created.
 * @see [addNodeUpdatedListener]
 * @see [addNodeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23NodeCreated">Online Documentation</a>
 */
inline fun  TreeBuilder.addNodeCreatedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23NodeUpdated">Online Documentation</a>
 */
inline fun  TreeBuilder.addNodeUpdatedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<INode, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>> = { _, event -> handler(event) }
    addNodeUpdatedListener(listener)
    return { removeNodeUpdatedListener(listener) }
}
/**
 * Occurs when a node has been removed.
 * @see [addNodeCreatedListener]
 * @see [addNodeUpdatedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23NodeRemoved">Online Documentation</a>
 */
inline fun  TreeBuilder.addNodeRemovedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<INode, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<INode, BusinessObject>> = { _, event -> handler(event) }
    addNodeRemovedListener(listener)
    return { removeNodeRemovedListener(listener) }
}
/**
 * Occurs when an edge has been created.
 * @see [addEdgeUpdatedListener]
 * @see [addEdgeRemovedListener]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23EdgeCreated">Online Documentation</a>
 */
inline fun  TreeBuilder.addEdgeCreatedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23EdgeUpdated">Online Documentation</a>
 */
inline fun  TreeBuilder.addEdgeUpdatedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23EdgeRemoved">Online Documentation</a>
 */
inline fun  TreeBuilder.addEdgeRemovedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23LabelAdded">Online Documentation</a>
 */
inline fun  TreeBuilder.addLabelAddedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23LabelUpdated">Online Documentation</a>
 */
inline fun  TreeBuilder.addLabelUpdatedHandler(
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
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/TreeBuilder%23LabelRemoved">Online Documentation</a>
 */
inline fun  TreeBuilder.addLabelRemovedHandler(
    crossinline handler: (event:GraphBuilderItemEventArgs<ILabel, BusinessObject>) -> Unit
): () -> Unit {
    val listener: EventHandler1<GraphBuilderItemEventArgs<ILabel, BusinessObject>> = { _, event -> handler(event) }
    addLabelRemovedListener(listener)
    return { removeLabelRemovedListener(listener) }
}
