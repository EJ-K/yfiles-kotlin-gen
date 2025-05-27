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
import yfiles.collections.IEnumerable
import yfiles.geometry.Point
import yfiles.lang.ClassMetadata
import yfiles.lang.EventHandler1
import yfiles.lang.Func2
import yfiles.lang.IClassMetadata
import yfiles.lang.IEventDispatcher
import yfiles.lang.Predicate
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
open external class GraphCopier () : IEventDispatcher {
  /**
   * Gets or sets the types of items that should be [cloned][yfiles.lang.ICloneable] for the copy operation.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23cloneTypes">Online Documentation</a>
   */
  final var cloneTypes: CloneTypes
  
  /**
   * Gets or sets a property that determines whether [additional folding states][FoldingManager] should be copied to target graphs.
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
   * Adds a bend to the `targetEdge` in the `targetGraph` as a copy of the `sourceBend`.
   * @param [sourceGraph] The source graph.
   * @param [targetGraph] The target graph.
   * @param [targetEdge] The target edge to add the bend to.
   * @param [sourceBend] The source bend to copy the values from.
   * @param [offset] The offset to apply to the copied bend.
   * @param [index] The index to add the bend at.
   * @return The newly created bend or `null` if none is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-addBend">Online Documentation</a>
   */
  protected open fun addBend(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    targetEdge: IEdge,
    sourceBend: IBend,
    offset: Point,
    index: Int,
  ): IBend?
  
  /**
   * Adds a label to the `targetOwner` in the `targetGraph` as a copy of the `sourceLabel`.
   * @param [sourceGraph] The source graph.
   * @param [targetGraph] The target graph.
   * @param [targetOwner] The item owner in the target graph to add the label to.
   * @param [sourceLabel] The source label in the source graph.
   * @return The newly created label or `null` if none is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-addLabel">Online Documentation</a>
   */
  protected open fun addLabel(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    targetOwner: ILabelOwner,
    sourceLabel: ILabel,
  ): ILabel?
  
  /**
   * Adds a port to the `targetOwner` in the `targetGraph` as a copy of the `sourcePort`.
   * @param [sourceGraph] The source graph.
   * @param [targetGraph] The target graph.
   * @param [targetOwner] The port owner in the target graph to add the port to.
   * @param [sourcePort] The source port in the source graph.
   * @return The newly created port or `null` if none is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-addPort">Online Documentation</a>
   */
  protected open fun addPort(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    targetOwner: IPortOwner,
    sourcePort: IPort,
  ): IPort?
  
  /**
   * This method places the given copy into an internal cache.
   * @param [T] The type of the item to cache.
   * @param [original] The original item.
   * @param [copy] The copy of the item.
   * @see [getOrCreateCopy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-cacheCopy">Online Documentation</a>
   */
  protected open fun <T> cacheCopy(
    original: T?,
    copy: T?,
  )
  
  /**
   * Clears the cache for the [cached copies][GraphCopier] of the instance copied using this class.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-clearCopyCache">Online Documentation</a>
   */
  protected open fun clearCopyCache()
  
  /**
   * Copies a subgraph induced by an [IEnumerable] from the `sourceGraph` to the `targetGraph`.
   * @param [sourceGraph] The graph to copy the items from.
   * @param [targetGraph] The graph to copy the items to.
   * @param [copyPredicate] A predicate function which gets a model item and returns `true` if the given item should be copied.
   * @param [targetRootNode] The group node that should act as the root node for the pasted items. May be `null` if there is no such node.
   * @param [offset] The offset to apply to the copied items. Only nodes and bends will be offset explicitly, while other items will move implicitly.
   * @param [itemCopiedCallback] A delegate to invoke for each item being copied.
   * @throws ArgumentError if `targetRootNode` is not in `targetGraph`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copy(IGraph,IGraph,system.Predicate,INode,Point,ItemCopiedCallback)">Online Documentation</a>
   */
  open fun copy(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    copyPredicate: Predicate<IModelItem>,
    targetRootNode: INode?  = definedExternally,
    offset: Point  = definedExternally,
    itemCopiedCallback: ItemCopiedCallback  = definedExternally,
  )
  
  /**
   * Copies a subgraph induced by an [IEnumerable] from the `sourceGraph` to the `targetGraph`.
   * @param [sourceGraph] The graph to copy the items from.
   * @param [targetGraph] The graph to copy the items to.
   * @param [itemsToCopy] The items to copy. If `null`, the entire `sourceGraph` is copied.
   * @param [targetRootNode] The group node that should act as the root node for the pasted items. May be `null` if there is no such node.
   * @param [itemOffset] The offset to apply to the copied items. Only nodes and bends will be offset explicitly, while other items will move implicitly.
   * @param [itemCopiedCallback] A delegate to invoke for each item being copied.
   * @throws ArgumentError if `targetRootNode` is not in `targetGraph`
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copy(IGraph,IGraph,IEnumerable,INode,Point,ItemCopiedCallback)">Online Documentation</a>
   */
  open fun copy(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    itemsToCopy: IEnumerable<IModelItem>  = definedExternally,
    targetRootNode: INode?  = definedExternally,
    itemOffset: Point  = definedExternally,
    itemCopiedCallback: ItemCopiedCallback  = definedExternally,
  )
  
  /**
   * Copies an [IEdgeStyle] instance.
   * @param [graph] The graph that contains the edge.
   * @param [edge] The edge to copy the style from.
   * @return The style to apply for the copy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyEdgeStyle">Online Documentation</a>
   */
  protected open fun copyEdgeStyle(
    graph: IGraph,
    edge: IEdge,
  ): IEdgeStyle
  
  /**
   * Copies the [tag][yfiles.collections.ITagOwner] of an [IEdge].
   * @param [edge] The old edge.
   * @param [tag] The tag to copy.
   * @return The copy of the tag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyEdgeTag">Online Documentation</a>
   */
  protected open fun copyEdgeTag(
    edge: IEdge,
    tag: Tag?,
  ): Tag?
  
  /**
   * Copies a [ILabelModelParameter] for a given label.
   * @param [graph] The graph that contains the label.
   * @param [label] The label to copy the label model parameter from.
   * @return The copy of the parameter to apply for the copy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyLabelLayoutParameter">Online Documentation</a>
   */
  protected open fun copyLabelLayoutParameter(
    graph: IGraph,
    label: ILabel,
  ): ILabelModelParameter
  
  /**
   * Copies an [ILabelStyle] instance.
   * @param [graph] The graph that contains the label.
   * @param [label] The label to copy the style from.
   * @return The style to apply for the copy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyLabelStyle">Online Documentation</a>
   */
  protected open fun copyLabelStyle(
    graph: IGraph,
    label: ILabel,
  ): ILabelStyle
  
  /**
   * Copies the [tag][yfiles.collections.ITagOwner] of an [ILabel].
   * @param [label] The old label.
   * @param [tag] The tag to copy.
   * @return The copy of the tag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyLabelTag">Online Documentation</a>
   */
  protected open fun copyLabelTag(
    label: ILabel,
    tag: Tag?,
  ): Tag?
  
  /**
   * Copies an [INodeStyle] instance.
   * @param [graph] The graph that contains the node.
   * @param [node] The node to copy the style from.
   * @return The style to apply for the copy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyNodeStyle">Online Documentation</a>
   */
  protected open fun copyNodeStyle(
    graph: IGraph,
    node: INode,
  ): INodeStyle
  
  /**
   * Copies the [tag][yfiles.collections.ITagOwner] of an [INode].
   * @param [node] The old node.
   * @param [tag] The tag to copy.
   * @return The copy of the tag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyNodeTag">Online Documentation</a>
   */
  protected open fun copyNodeTag(
    node: INode,
    tag: Tag?,
  ): Tag?
  
  /**
   * Copies a [IPortLocationModelParameter] for a given port.
   * @param [graph] The graph that contains the port.
   * @param [port] The port to copy the model parameter from.
   * @return The copy of the parameter to apply for the copy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyPortLocationParameter">Online Documentation</a>
   */
  protected open fun copyPortLocationParameter(
    graph: IGraph,
    port: IPort,
  ): IPortLocationModelParameter
  
  /**
   * Copies an [IPortStyle] instance.
   * @param [graph] The graph that contains the port.
   * @param [port] The port to copy the style from.
   * @return The style to apply for the copy.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyPortStyle">Online Documentation</a>
   */
  protected open fun copyPortStyle(
    graph: IGraph,
    port: IPort,
  ): IPortStyle
  
  /**
   * Copies the [tag][yfiles.collections.ITagOwner] of an [IPort].
   * @param [port] The old port.
   * @param [tag] The tag to copy.
   * @return The copy of the tag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyPortTag">Online Documentation</a>
   */
  protected open fun copyPortTag(
    port: IPort,
    tag: Tag?,
  ): Tag?
  
  /**
   * Callback that will copy a [tag][yfiles.collections.ITagOwner] for the target graph.
   * @param [owner] The old owner of the tag.
   * @param [tag] The tag to copy.
   * @return A copy of the tag.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-copyTag">Online Documentation</a>
   */
  protected open fun copyTag(
    owner: IModelItem,
    tag: Tag?,
  ): Tag?
  
  /**
   * Adds an edge to the `targetGraph` as a copy of the `sourceEdge`.
   * @param [sourceGraph] The source graph.
   * @param [targetGraph] The target graph.
   * @param [sourceEdge] The edge in the source graph.
   * @param [targetSourcePort] The new source port in the target graph.
   * @param [targetTargetPort] The new target port in the target graph.
   * @return The newly created edge or `null` if none is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-createEdge">Online Documentation</a>
   */
  protected open fun createEdge(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    sourceEdge: IEdge,
    targetSourcePort: IPort,
    targetTargetPort: IPort,
  ): IEdge?
  
  /**
   * Creates a copy of the `sourceGroupNode` in the `targetGraph`.
   * @param [sourceGraph] The source graph.
   * @param [targetGraph] The target graph.
   * @param [sourceGroupNode] The source node to create a copy of in the `targetGraph`.
   * @param [targetParent] The parent of the group node in the target graph.
   * @param [offset] The offset to apply to the copied node.
   * @return The newly created node or `null` if none is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-createGroupNode">Online Documentation</a>
   */
  protected open fun createGroupNode(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    sourceGroupNode: INode,
    targetParent: INode?,
    offset: Point,
  ): INode?
  
  /**
   * Creates a copy of the `sourceNode` in the `targetGraph`.
   * @param [sourceGraph] The source graph.
   * @param [targetGraph] The target graph.
   * @param [sourceNode] The source node to create a copy of in the `targetGraph`.
   * @param [offset] The offset to apply to the copied node.
   * @return The newly created node or `null` if none is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-createNode(IGraph,IGraph,INode,Point)">Online Documentation</a>
   */
  protected open fun createNode(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    sourceNode: INode,
    offset: Point,
  ): INode?
  
  /**
   * Creates a copy of the `sourceNode` in the `targetGraph`.
   * @param [sourceGraph] The source graph.
   * @param [targetGraph] The target graph.
   * @param [sourceNode] The source node to create a copy of in the `targetGraph`.
   * @param [targetParent] The parent of the group node in the target graph.
   * @param [offset] The offset to apply to the copied node.
   * @return The newly created node or `null` if none is created.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-createNode(IGraph,IGraph,INode,INode,Point)">Online Documentation</a>
   */
  protected open fun createNode(
    sourceGraph: IGraph,
    targetGraph: IGraph,
    sourceNode: INode,
    targetParent: INode?,
    offset: Point,
  ): INode?
  
  /**
   * Tries to obtain a previously [cached][GraphCopier] copy for the given original.
   * @param [T] The type of the item to copy.
   * @param [itemType] The type of the item to copy.
   * @param [original] The original item.
   * @return The copy of `original` or [NO_COPY][GraphCopier] if no copy has been found.
   * @see [cacheCopy]
   * @see [getOrCreateCopy]
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-getCopy">Online Documentation</a>
   */
  protected open fun <T> getCopy(
    itemType: IClassMetadata<T>,
    original: T?,
  ): T?
  
  /**
   * Either yields a previously [cached][GraphCopier] copy for the given original or uses the `copyDelegate` to create the copy of the original.
   * @param [T] The type of the item to copy.
   * @param [tType] The type of the item to copy.
   * @param [original] The original item.
   * @param [copyDelegate] The copy delegate to create the copy.
   * @return A copy of the original, either cached, or newly created and then cached.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-getOrCreateCopy">Online Documentation</a>
   */
  protected fun <T> getOrCreateCopy(
    tType: IClassMetadata<T>,
    original: T?,
    copyDelegate: Func2<T, T>,
  ): T?
  
  /**
   * Retrieves the [FoldingManager] from the given source graph.
   * @param [sourceGraph] The source graph.
   * @return The folding manager as obtained from the lookup of the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-getSourceFoldingManager">Online Documentation</a>
   */
  protected open fun getSourceFoldingManager(
    sourceGraph: IGraph,
  ): FoldingManager?
  
  /**
   * Retrieves the [FoldingManager] from the given target graph.
   * @param [targetGraph] The target graph.
   * @return The folding manager as obtained from the lookup of the graph.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-getTargetFoldingManager">Online Documentation</a>
   */
  protected open fun getTargetFoldingManager(
    targetGraph: IGraph,
  ): FoldingManager?
  
  /**
   * Called after a bend has been copied.
   * @param [original] The original of the copied bend.
   * @param [copy] The copied bend.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onBendCopied">Online Documentation</a>
   */
  protected open fun onBendCopied(
    original: IBend,
    copy: IBend,
  )
  
  /**
   * Called after an edge has been copied.
   * @param [original] The original of the copied edge.
   * @param [copy] The copied edge.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onEdgeCopied">Online Documentation</a>
   */
  protected open fun onEdgeCopied(
    original: IEdge,
    copy: IEdge,
  )
  
  /**
   * Called after the entire graph has been copied.
   * @param [sourceGraph] The source graph from which the items have been copied.
   * @param [targetGraph] The graph to which the items have been copied.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onGraphCopied">Online Documentation</a>
   */
  protected open fun onGraphCopied(
    sourceGraph: IGraph,
    targetGraph: IGraph,
  )
  
  /**
   * Called after a label has been copied.
   * @param [original] The original of the copied label.
   * @param [copy] The copied label.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onLabelCopied">Online Documentation</a>
   */
  protected open fun onLabelCopied(
    original: ILabel,
    copy: ILabel,
  )
  
  /**
   * Called after a node has been copied.
   * @param [original] The original of the copied node.
   * @param [copy] The copied node.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onNodeCopied">Online Documentation</a>
   */
  protected open fun onNodeCopied(
    original: INode,
    copy: INode,
  )
  
  /**
   * Triggers the [object-copied][GraphCopier] event.
   * @param [event] The event argument to use.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onObjectCopied">Online Documentation</a>
   */
  protected open fun onObjectCopied(
    event: ItemCopiedEventArgs<Any>,
  )
  
  /**
   * Called after a port has been copied.
   * @param [original] The original of the copied port.
   * @param [copy] The copied port.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23GraphCopier-method-onPortCopied">Online Documentation</a>
   */
  protected open fun onPortCopied(
    original: IPort,
    copy: IPort,
  )
  
  companion object : ClassMetadata<GraphCopier> {
    /**
     * The sentinel return value for use in [getCopy][GraphCopier].
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
 * `node-copied`: Occurs after a node has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23node-copied">Online Documentation</a>
 */
inline fun  GraphCopier.addNodeCopiedHandler(
  crossinline handler: (event:ItemCopiedEventArgs<INode>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemCopiedEventArgs<INode>> = { event, _ -> handler(event) }
  addEventListener("node-copied", listener)
  return { removeEventListener("node-copied", listener) }
}

/**
 * `bend-copied`: Occurs after a bend has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23bend-copied">Online Documentation</a>
 */
inline fun  GraphCopier.addBendCopiedHandler(
  crossinline handler: (event:ItemCopiedEventArgs<IBend>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemCopiedEventArgs<IBend>> = { event, _ -> handler(event) }
  addEventListener("bend-copied", listener)
  return { removeEventListener("bend-copied", listener) }
}

/**
 * `object-copied`: Occurs after a style or tag has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23object-copied">Online Documentation</a>
 */
inline fun  GraphCopier.addObjectCopiedHandler(
  crossinline handler: (event:ItemCopiedEventArgs<Any>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemCopiedEventArgs<Any>> = { event, _ -> handler(event) }
  addEventListener("object-copied", listener)
  return { removeEventListener("object-copied", listener) }
}

/**
 * `edge-copied`: Occurs after an edge has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23edge-copied">Online Documentation</a>
 */
inline fun  GraphCopier.addEdgeCopiedHandler(
  crossinline handler: (event:ItemCopiedEventArgs<IEdge>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemCopiedEventArgs<IEdge>> = { event, _ -> handler(event) }
  addEventListener("edge-copied", listener)
  return { removeEventListener("edge-copied", listener) }
}

/**
 * `port-copied`: Occurs after a port has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23port-copied">Online Documentation</a>
 */
inline fun  GraphCopier.addPortCopiedHandler(
  crossinline handler: (event:ItemCopiedEventArgs<IPort>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemCopiedEventArgs<IPort>> = { event, _ -> handler(event) }
  addEventListener("port-copied", listener)
  return { removeEventListener("port-copied", listener) }
}

/**
 * `label-copied`: Occurs after a label has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23label-copied">Online Documentation</a>
 */
inline fun  GraphCopier.addLabelCopiedHandler(
  crossinline handler: (event:ItemCopiedEventArgs<ILabel>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemCopiedEventArgs<ILabel>> = { event, _ -> handler(event) }
  addEventListener("label-copied", listener)
  return { removeEventListener("label-copied", listener) }
}

/**
 * `graph-copied`: Occurs after the entire graph has been copied.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphCopier%23graph-copied">Online Documentation</a>
 */
inline fun  GraphCopier.addGraphCopiedHandler(
  crossinline handler: (event:ItemCopiedEventArgs<IGraph>) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemCopiedEventArgs<IGraph>> = { event, _ -> handler(event) }
  addEventListener("graph-copied", listener)
  return { removeEventListener("graph-copied", listener) }
}
