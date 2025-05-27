// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import js.core.Void
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.Func2
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
import yfiles.lang.YClass
import yfiles.lang.YObject
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle
import yfiles.styles.IPortStyle

/**
 * Copies parts of an [IGraph] to another instance.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier">Online Documentation</a>
 * 
 * @constructor Creates a new instance of an [GraphCopier] with the default settings.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-constructor-GraphCopier">Online Documentation</a>
 */
external open class GraphCopier  () : YObject, IEventDispatcher {

/**
 * Gets or sets the types of items that should be [cloned][yfiles.lang.ICloneable.clone] for the copy operation.
 * 
 * By default everything but tags are cloned.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23clone">Online Documentation</a>
 */
final var clone: CloneTypes
/**
 * Gets or sets a property that determines whether [additional folding states][FoldingManager].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23copyFoldingStates">Online Documentation</a>
 */
final var copyFoldingStates: Boolean
/**
 * Gets or sets a property that determines whether grouping information should be copied to target graphs.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23copyGrouping">Online Documentation</a>
 */
final var copyGrouping: Boolean
/**
 * Gets or sets the types of objects where the referential identity should be kept across clipboard operations.
 * @see [getOrCreateCopy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23referentialIdentityTypes">Online Documentation</a>
 */
final var referentialIdentityTypes: CloneTypes
/**
 * Adds a bend to the targetEdge in the targetGraph as a copy of the source bend.
 * @param [sourceGraph] The source graph.
 * @param [targetGraph] The target graph.
 * @param [targetEdge] The target edge to add the bend to.
 * @param [sourceBend] The source bend to copy the values from.
 * @param [offset] The offset to apply to the copied bend.
 * @param [index] The index to add the bend at.
 * @return The newly created bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-addBend">Online Documentation</a>
 */
 open protected   fun addBend( sourceGraph: IGraph ,
 targetGraph: IGraph ,
 targetEdge: IEdge ,
 sourceBend: IBend ,
 offset: Point ,
 index: Int ):IBend?
/**
 * Adds a label to the target item in the targetGraph as a copy of the source label.
 * @param [sourceGraph] The source graph.
 * @param [targetGraph] The target graph.
 * @param [targetOwner] The item owner in the target graph to add the label to.
 * @param [sourceLabel] The source label in the source graph.
 * @return The newly created label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-addLabel">Online Documentation</a>
 */
 open protected   fun addLabel( sourceGraph: IGraph ,
 targetGraph: IGraph ,
 targetOwner: ILabelOwner ,
 sourceLabel: ILabel ):ILabel?
/**
 * Adds a port to the targetPortOwner in the targetGraph as a copy of the source port.
 * @param [sourceGraph] The source graph.
 * @param [targetGraph] The target graph.
 * @param [targetOwner] The port owner in the target graph to add the port to.
 * @param [sourcePort] The source port in the source graph.
 * @return The newly created port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-addPort">Online Documentation</a>
 */
 open protected   fun addPort( sourceGraph: IGraph ,
 targetGraph: IGraph ,
 targetOwner: IPortOwner ,
 sourcePort: IPort ):IPort?
/**
 * This method places the given copy into an internal cache.
 * @param [T] The type of the item to cache.
 * @param [original] The original item.
 * @param [copy] The copy of the item.
 * @see [getOrCreateCopy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-cacheCopy">Online Documentation</a>
 */
 open protected   fun <T>cacheCopy( original: T? ,
 copy: T? )
/**
 * Clears the cache for the [cached copies][cacheCopy] of the instance copied using this class.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-clearCopyCache">Online Documentation</a>
 */
 open protected   fun clearCopyCache()
/**
 * Copies `sourceGraph` to `targetGraph`.
 * @param [sourceGraph] The graph to copy.
 * @param [targetGraph] The graph to copy to.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copy(IGraph,IGraph)">Online Documentation</a>
 */
 open   fun copy( sourceGraph: IGraph ,
 targetGraph: IGraph )
/**
 * Copies a subgraph described by a predicate from the `sourceGraph` to the `targetGraph`.
 * @param [sourceGraph] The graph to copy the elements from.
 * @param [filter] The filter that decides which elements to copy.
 * @param [targetGraph] The graph to copy the elements to.
 * @param [offset] The offset to apply to the copied items. Only nodes and bends will be offset explicitly, while other items will move implicitly.
 * @param [elementCopiedCallback] A delegate to invoke for each element being copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copy(IGraph,system.Predicate,IGraph,Point,ElementCopiedCallback)">Online Documentation</a>
 */
 open   fun copy( sourceGraph: IGraph ,
 filter: Predicate<IModelItem> ,
 targetGraph: IGraph ,
 offset: Point?  = definedExternally,
 elementCopiedCallback: ElementCopiedCallback?  = definedExternally)
/**
 * Copies a subgraph induced by a predicate from the `sourceGraph` to the `targetGraph`.
 * @param [sourceGraph] The graph to copy the elements from.
 * @param [filter] The filter that decides which elements to copy.
 * @param [targetGraph] The graph to copy the elements to.
 * @param [targetRootNode] The group node that should act as the root node for the pasted elements. May be `null` if there is no such node.
 * @param [offset] The offset to apply to the copied items. Only nodes and bends will be offset explicitly, while other items will move implicitly.
 * @param [elementCopiedCallback] A delegate to invoke for each element being copied.
 * @throws ArgumentError if `targetRootNode` is not in `targetGraph`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copy(IGraph,system.Predicate,IGraph,INode,Point,ElementCopiedCallback)">Online Documentation</a>
 */
 open   fun copy( sourceGraph: IGraph ,
 filter: Predicate<IModelItem> ,
 targetGraph: IGraph ,
 targetRootNode: INode? ,
 offset: Point?  = definedExternally,
 elementCopiedCallback: ElementCopiedCallback?  = definedExternally)
/**
 * Creates a copy of the `node` in the `targetGraph`.
 * @param [sourceGraph] The source graph.
 * @param [targetGraph] The target graph.
 * @param [node] The source node to create a copy of in the `targetGraph`.
 * @param [targetParent] The parent of the group node in the target graph.
 * @param [offset] The offset to apply to the copied node.
 * @return The newly created node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyChildNode">Online Documentation</a>
 */
 open protected   fun copyChildNode( sourceGraph: IGraph ,
 targetGraph: IGraph ,
 node: INode ,
 targetParent: INode? ,
 offset: Point ):INode?
/**
 * Adds an edge to the targetGraph as a copy of the source edge.
 * @param [sourceGraph] The source graph.
 * @param [targetGraph] The target graph.
 * @param [sourceEdge] The edge in the source graph.
 * @param [targetSourcePort] The new source port in the target graph.
 * @param [targetTargetPort] The new target port in the target graph.
 * @return The newly created edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyEdge">Online Documentation</a>
 */
 open protected   fun copyEdge( sourceGraph: IGraph ,
 targetGraph: IGraph ,
 sourceEdge: IEdge ,
 targetSourcePort: IPort ,
 targetTargetPort: IPort ):IEdge?
/**
 * Copies an [IEdgeStyle] instance.
 * @param [graph] The graph that contains the edge.
 * @param [edge] The edge to copy the style from.
 * @return The style to apply for the copy.
 * @see [copy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyEdgeStyle">Online Documentation</a>
 */
 open   fun copyEdgeStyle( graph: IGraph ,
 edge: IEdge ):IEdgeStyle
/**
 * Copies the [ITagOwner.tag] of an [IEdge].
 * @param [edge] The old edge.
 * @param [tag] The tag to copy.
 * @return The copy of the tag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyEdgeTag">Online Documentation</a>
 */
 open protected   fun copyEdgeTag( edge: IEdge ,
 tag: Tag? ):Tag?
/**
 * Creates a copy of the `sourceGroupNode` in the `targetGraph`.
 * @param [sourceGraph] The source graph.
 * @param [targetGraph] The target graph.
 * @param [sourceGroupNode] The source node to create a copy of in the `targetGraph`.
 * @param [targetParent] The parent of the group node in the target graph.
 * @param [offset] The offset to apply to the copied node.
 * @return The newly created node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyGroupNode">Online Documentation</a>
 */
 open protected   fun copyGroupNode( sourceGraph: IGraph ,
 targetGraph: IGraph ,
 sourceGroupNode: INode ,
 targetParent: INode? ,
 offset: Point ):INode?
/**
 * Copies a [ILabelModelParameter] for a given label.
 * @param [graph] The graph that contains the label.
 * @param [label] The label to copy the label model parameter from.
 * @return The copy of the parameter to apply for the copy.
 * @see [copy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyLabelLayoutParameter">Online Documentation</a>
 */
 open   fun copyLabelLayoutParameter( graph: IGraph ,
 label: ILabel ):ILabelModelParameter
/**
 * Copies an [ILabelStyle] instance.
 * @param [graph] The graph that contains the label.
 * @param [label] The label to copy the style from.
 * @return The style to apply for the copy.
 * @see [copy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyLabelStyle">Online Documentation</a>
 */
 open   fun copyLabelStyle( graph: IGraph ,
 label: ILabel ):ILabelStyle
/**
 * Copies the [ITagOwner.tag] of a [ILabel].
 * @param [label] The old label.
 * @param [tag] The tag to copy.
 * @return The copy of the tag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyLabelTag">Online Documentation</a>
 */
 open protected   fun copyLabelTag( label: ILabel ,
 tag: Tag? ):Tag?
/**
 * Creates a copy of the `node` in the `targetGraph`.
 * @param [sourceGraph] The source graph.
 * @param [targetGraph] The target graph.
 * @param [node] The source node to create a copy of in the `targetGraph`.
 * @param [offset] The offset to apply to the copied node.
 * @return The newly created node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyNode">Online Documentation</a>
 */
 open protected   fun copyNode( sourceGraph: IGraph ,
 targetGraph: IGraph ,
 node: INode ,
 offset: Point ):INode?
/**
 * Copies an [INodeStyle] instance.
 * @param [graph] The graph that contains the node.
 * @param [node] The node to copy the style from.
 * @return The style to apply for the copy.
 * @see [copy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyNodeStyle">Online Documentation</a>
 */
 open   fun copyNodeStyle( graph: IGraph ,
 node: INode ):INodeStyle
/**
 * Copies the [ITagOwner.tag] of a [INode].
 * @param [node] The old node.
 * @param [tag] The tag to copy.
 * @return The copy of the tag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyNodeTag">Online Documentation</a>
 */
 open protected   fun copyNodeTag( node: INode ,
 tag: Tag? ):Tag?
/**
 * Copies a [IPortLocationModelParameter] for a given port.
 * @param [graph] The graph that contains the port.
 * @param [port] The port to copy the model parameter from.
 * @return The copy of the parameter to apply for the copy.
 * @see [copy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyPortLocationParameter">Online Documentation</a>
 */
 open   fun copyPortLocationParameter( graph: IGraph ,
 port: IPort ):IPortLocationModelParameter
/**
 * Copies an [IPortStyle] instance.
 * @param [graph] The graph that contains the port.
 * @param [port] The port to copy the style from.
 * @return The style to apply for the copy.
 * @see [copy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyPortStyle">Online Documentation</a>
 */
 open   fun copyPortStyle( graph: IGraph ,
 port: IPort ):IPortStyle
/**
 * Copies the [ITagOwner.tag] of a [IPort].
 * @param [port] The old port.
 * @param [tag] The tag to copy.
 * @return The copy of the tag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyPortTag">Online Documentation</a>
 */
 open protected   fun copyPortTag( port: IPort ,
 tag: Tag? ):Tag?
/**
 * Callback that will copy a [ITagOwner.tag] for the target graph.
 * @param [owner] The old owner of the tag.
 * @param [tag] The tag to copy.
 * @return A copy of the tag.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyTag">Online Documentation</a>
 */
 open protected   fun copyTag( owner: IModelItem ,
 tag: Tag? ):Tag?
/**
 * Tries to obtain a previously [cached][cacheCopy] copy for the given original.
 * @param [itemType] The type of the item to copy.
 * @param [original] The original item.
 * @return The copy of `original` or [NO_COPY] if no copy has been found.
 * @see [cacheCopy]
 * @see [getOrCreateCopy]
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-getCopy">Online Documentation</a>
 */
 open protected   fun <T : YObject>getCopy( itemType: YClass<T> ,
 original: T? ):T?
/**
 * Either yields a previously [cached][cacheCopy] copy for the given original or uses the `copyDelegate` to create the copy of the original.
 * @param [tType] The type of the item to copy.
 * @param [original] The original item.
 * @param [copyDelegate] The copy delegate to create the copy.
 * @return A copy of the original, either cached, or newly created and then cached.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-getOrCreateCopy">Online Documentation</a>
 */
 final   fun <T : YObject>getOrCreateCopy( tType: YClass<T> ,
 original: T? ,
 copyDelegate: Func2<T, T> ):T?
/**
 * Called after a bend has been copied.
 * @param [original] The original of the copied bend.
 * @param [copy] The copied bend.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onBendCopied">Online Documentation</a>
 */
 open protected   fun onBendCopied( original: IBend ,
 copy: IBend )
/**
 * Called after an edge has been copied.
 * @param [original] The original of the copied edge.
 * @param [copy] The copied edge.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onEdgeCopied">Online Documentation</a>
 */
 open protected   fun onEdgeCopied( original: IEdge ,
 copy: IEdge )
/**
 * Called after the entire graph has been copied.
 * @param [sourceGraph] The source graph from which the elements have been copied.
 * @param [targetGraph] The graph to which the elements have been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onGraphCopied">Online Documentation</a>
 */
 open protected   fun onGraphCopied( sourceGraph: IGraph ,
 targetGraph: IGraph )
/**
 * Called after a label has been copied.
 * @param [original] The original of the copied label.
 * @param [copy] The copied label.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onLabelCopied">Online Documentation</a>
 */
 open protected   fun onLabelCopied( original: ILabel ,
 copy: ILabel )
/**
 * Called after a node has been copied.
 * @param [original] The original of the copied node.
 * @param [copy] The copied node.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onNodeCopied">Online Documentation</a>
 */
 open protected   fun onNodeCopied( original: INode ,
 copy: INode )
/**
 * Emits the [ObjectCopied] event.
 * @param [event] The argument to use.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onObjectCopied">Online Documentation</a>
 */
 open protected   fun onObjectCopied( event: ItemCopiedEventArgs<Any> )
/**
 * Called after a port has been copied.
 * @param [original] The original of the copied port.
 * @param [copy] The copied port.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onPortCopied">Online Documentation</a>
 */
 open protected   fun onPortCopied( original: IPort ,
 copy: IPort )
/**
 * Occurs after a node has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23NodeCopied">Online Documentation</a>
 */
fun addNodeCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<INode>>)
fun removeNodeCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<INode>>)

/**
 * Occurs after a bend has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23BendCopied">Online Documentation</a>
 */
fun addBendCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IBend>>)
fun removeBendCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IBend>>)

/**
 * Occurs after a style has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23ObjectCopied">Online Documentation</a>
 */
fun addObjectCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<Any>>)
fun removeObjectCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<Any>>)

/**
 * Occurs after an edge has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23EdgeCopied">Online Documentation</a>
 */
fun addEdgeCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IEdge>>)
fun removeEdgeCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IEdge>>)

/**
 * Occurs after a port has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23PortCopied">Online Documentation</a>
 */
fun addPortCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IPort>>)
fun removePortCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IPort>>)

/**
 * Occurs after a label has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23LabelCopied">Online Documentation</a>
 */
fun addLabelCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<ILabel>>)
fun removeLabelCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<ILabel>>)

/**
 * Occurs after the entire graph has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopied">Online Documentation</a>
 */
fun addGraphCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IGraph>>)
fun removeGraphCopiedListener(listener: EventHandler1<ItemCopiedEventArgs<IGraph>>)

companion object : ClassMetadata<GraphCopier> {
/**
 * The sentinel return value for use in [getCopy].
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23NO_COPY">Online Documentation</a>
 */
protected val NO_COPY: Void
}
}

inline fun GraphCopier(
    block: GraphCopier.() -> Unit
): GraphCopier {
    return GraphCopier()
        .apply(block)
}

/**
 * Occurs after a node has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23NodeCopied">Online Documentation</a>
 */
inline fun  GraphCopier.addNodeCopiedHandler(
    crossinline handler: (event:ItemCopiedEventArgs<INode>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemCopiedEventArgs<INode>> = { _, event -> handler(event) }
    addNodeCopiedListener(listener)
    return { removeNodeCopiedListener(listener) }
}
/**
 * Occurs after a bend has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23BendCopied">Online Documentation</a>
 */
inline fun  GraphCopier.addBendCopiedHandler(
    crossinline handler: (event:ItemCopiedEventArgs<IBend>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemCopiedEventArgs<IBend>> = { _, event -> handler(event) }
    addBendCopiedListener(listener)
    return { removeBendCopiedListener(listener) }
}
/**
 * Occurs after a style has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23ObjectCopied">Online Documentation</a>
 */
inline fun  GraphCopier.addObjectCopiedHandler(
    crossinline handler: (event:ItemCopiedEventArgs<Any>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemCopiedEventArgs<Any>> = { _, event -> handler(event) }
    addObjectCopiedListener(listener)
    return { removeObjectCopiedListener(listener) }
}
/**
 * Occurs after an edge has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23EdgeCopied">Online Documentation</a>
 */
inline fun  GraphCopier.addEdgeCopiedHandler(
    crossinline handler: (event:ItemCopiedEventArgs<IEdge>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemCopiedEventArgs<IEdge>> = { _, event -> handler(event) }
    addEdgeCopiedListener(listener)
    return { removeEdgeCopiedListener(listener) }
}
/**
 * Occurs after a port has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23PortCopied">Online Documentation</a>
 */
inline fun  GraphCopier.addPortCopiedHandler(
    crossinline handler: (event:ItemCopiedEventArgs<IPort>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemCopiedEventArgs<IPort>> = { _, event -> handler(event) }
    addPortCopiedListener(listener)
    return { removePortCopiedListener(listener) }
}
/**
 * Occurs after a label has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23LabelCopied">Online Documentation</a>
 */
inline fun  GraphCopier.addLabelCopiedHandler(
    crossinline handler: (event:ItemCopiedEventArgs<ILabel>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemCopiedEventArgs<ILabel>> = { _, event -> handler(event) }
    addLabelCopiedListener(listener)
    return { removeLabelCopiedListener(listener) }
}
/**
 * Occurs after the entire graph has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopied">Online Documentation</a>
 */
inline fun  GraphCopier.addGraphCopiedHandler(
    crossinline handler: (event:ItemCopiedEventArgs<IGraph>) -> Unit
): () -> Unit {
    val listener: EventHandler1<ItemCopiedEventArgs<IGraph>> = { _, event -> handler(event) }
    addGraphCopiedListener(listener)
    return { removeGraphCopiedListener(listener) }
}
