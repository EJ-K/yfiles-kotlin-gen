// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "WRONG_MODIFIER_CONTAINING_DECLARATION",
    "WRONG_EXTERNAL_DECLARATION",
)

@file:JsModule("yfiles")

package yfiles.graph

import yfiles.collections.IListEnumerable
import yfiles.collections.ItemEventArgs
import yfiles.geometry.Point
import yfiles.geometry.Rect
import yfiles.geometry.Size
import yfiles.lang.ClassMetadata
import yfiles.lang.EventArgs
import yfiles.lang.EventHandler1
import yfiles.lang.IClassMetadata
import yfiles.styles.IEdgeStyle
import yfiles.styles.ILabelStyle
import yfiles.styles.INodeStyle
import yfiles.styles.IPortStyle

/**
 * An abstract [IGraph] implementation that delegates all of its work to an existing implementation.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase">Online Documentation</a>
 * 
 * @constructor Creates a new instance that wraps a given [IGraph].
 * @param [graph] The graph to wrap.
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-constructor-GraphWrapperBase">Online Documentation</a>
 */
abstract external class GraphWrapperBase protected constructor(
  graph: IGraph,
) : IGraph {
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edgeDefaults">Online Documentation</a>
   */
  open override var edgeDefaults: IEdgeDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edges">Online Documentation</a>
   */
  open override val edges: IListEnumerable<IEdge>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23groupNodeDefaults">Online Documentation</a>
   */
  open override var groupNodeDefaults: INodeDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23labels">Online Documentation</a>
   */
  open override val labels: IListEnumerable<ILabel>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23nodeDefaults">Online Documentation</a>
   */
  open override var nodeDefaults: INodeDefaults
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23nodes">Online Documentation</a>
   */
  open override val nodes: IListEnumerable<INode>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23ports">Online Documentation</a>
   */
  open override val ports: IListEnumerable<IPort>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23tag">Online Documentation</a>
   */
  final override var tag: Tag?
  
  /**
   * Gets the graph that has been wrapped by this instance.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23wrappedGraph">Online Documentation</a>
   */
  final var wrappedGraph: IGraph?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addBend">Online Documentation</a>
   */
  override fun addBend(
    edge: IEdge,
    location: Point,
    index: Int,
  ): IBend
  
  /**
   * Adds event handlers that propagate graph events from `graph` to listeners on this instance.
   * @param [graph] The graph for which event propagators should be created
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addEventHandlers">Online Documentation</a>
   */
  protected open fun addEventHandlers(
    graph: IGraph,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addLabel">Online Documentation</a>
   */
  override fun addLabel(
    owner: ILabelOwner,
    text: String,
    layoutParameter: ILabelModelParameter,
    style: ILabelStyle,
    preferredSize: Size?,
    tag: Tag?,
  ): ILabel
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-addPort">Online Documentation</a>
   */
  override fun addPort(
    owner: IPortOwner,
    locationParameter: IPortLocationModelParameter,
    style: IPortStyle,
    tag: Tag?,
  ): IPort
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-contains">Online Documentation</a>
   */
  override operator fun contains(
    item: IModelItem,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createEdge">Online Documentation</a>
   */
  override fun createEdge(
    sourcePort: IPort,
    targetPort: IPort,
    style: IEdgeStyle,
    tag: Tag?,
  ): IEdge
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createEdge">Online Documentation</a>
   */
  override fun createEdge(
    source: INode,
    target: INode,
    style: IEdgeStyle,
    tag: Tag?,
  ): IEdge
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createGroupNode">Online Documentation</a>
   */
  override fun createGroupNode(
    parent: INode?,
    layout: Rect,
    style: INodeStyle,
    tag: Tag?,
  ): INode
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createNode">Online Documentation</a>
   */
  override fun createNode(
    layout: Rect,
    style: INodeStyle,
    tag: Tag?,
  ): INode
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-createNode">Online Documentation</a>
   */
  override fun createNode(
    parent: INode?,
    layout: Rect,
    style: INodeStyle,
    tag: Tag?,
  ): INode
  
  /**
   * Clears the internal state of this instance and released memory and bound listeners.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-dispose">Online Documentation</a>
   */
  open fun dispose()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-edgesAt">Online Documentation</a>
   */
  override fun edgesAt(
    port: IPort,
    type: AdjacencyTypes,
  ): IListEnumerable<IEdge>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-edgesAt">Online Documentation</a>
   */
  override fun edgesAt(
    owner: IPortOwner,
    type: AdjacencyTypes,
  ): IListEnumerable<IEdge>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-getChildren">Online Documentation</a>
   */
  override fun getChildren(
    node: INode?,
  ): IListEnumerable<INode>
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-getParent">Online Documentation</a>
   */
  override fun getParent(
    node: INode,
  ): INode?
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-invalidateDisplays">Online Documentation</a>
   */
  override fun invalidateDisplays()
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-isGroupNode">Online Documentation</a>
   */
  override fun isGroupNode(
    node: INode,
  ): Boolean
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-lookup">Online Documentation</a>
   */
  override fun <T : Any> lookup(
    type: IClassMetadata<T>,
  ): T?
  
  /**
   * Raises the [bend-added][GraphWrapperBase] event.
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendAdded">Online Documentation</a>
   */
  protected open fun onBendAdded(
    event: ItemEventArgs<IBend>,
  )
  
  /**
   * Raises the [bend-location-changed][GraphWrapperBase] event
   * @param [bend] The bend whose location changed
   * @param [oldLocation] The bend location before the change
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendLocationChanged">Online Documentation</a>
   */
  protected open fun onBendLocationChanged(
    bend: IBend,
    oldLocation: Point,
  )
  
  /**
   * Raises the [bend-removed][GraphWrapperBase] event.
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendRemoved">Online Documentation</a>
   */
  protected open fun onBendRemoved(
    event: BendEventArgs,
  )
  
  /**
   * Raises the [bend-tag-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onBendTagChanged">Online Documentation</a>
   */
  protected open fun onBendTagChanged(
    event: ItemChangedEventArgs<IBend, Any>,
  )
  
  /**
   * Raises the [edge-created][GraphWrapperBase] event.
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeCreated">Online Documentation</a>
   */
  protected open fun onEdgeCreated(
    event: ItemEventArgs<IEdge>,
  )
  
  /**
   * Raises the [edge-ports-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgePortsChanged">Online Documentation</a>
   */
  protected open fun onEdgePortsChanged(
    event: EdgeEventArgs,
  )
  
  /**
   * Raises the [edge-removed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeRemoved">Online Documentation</a>
   */
  protected open fun onEdgeRemoved(
    event: EdgeEventArgs,
  )
  
  /**
   * Raises the [edge-style-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeStyleChanged">Online Documentation</a>
   */
  protected open fun onEdgeStyleChanged(
    event: ItemChangedEventArgs<IEdge, IEdgeStyle>,
  )
  
  /**
   * Raises the [edge-tag-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onEdgeTagChanged">Online Documentation</a>
   */
  protected open fun onEdgeTagChanged(
    event: ItemChangedEventArgs<IEdge, Any>,
  )
  
  /**
   * Called when the [wrappedGraph][GraphWrapperBase] property value changes and after initialization of the field.
   * @param [oldGraph] the old value, which may be `null` the first time
   * @param [newGraph] the new value
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onGraphChanged">Online Documentation</a>
   */
  protected open fun onGraphChanged(
    oldGraph: IGraph?,
    newGraph: IGraph?,
  )
  
  /**
   * Raises the [graph-tag-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onGraphTagChanged">Online Documentation</a>
   */
  protected open fun onGraphTagChanged(
    event: ItemChangedEventArgs<IGraph, Any>,
  )
  
  /**
   * Raises the [displays-invalidated][GraphWrapperBase] event
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onInvalidateDisplays">Online Documentation</a>
   */
  protected open fun onInvalidateDisplays(
    event: EventArgs,
  )
  
  /**
   * Dispatches the [is-group-node-changed][GraphWrapperBase] event.
   * @param [event] The event args to dispatch.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onIsGroupNodeChanged">Online Documentation</a>
   */
  protected open fun onIsGroupNodeChanged(
    event: NodeEventArgs,
  )
  
  /**
   * Raises the [label-added][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelAdded">Online Documentation</a>
   */
  protected open fun onLabelAdded(
    event: ItemEventArgs<ILabel>,
  )
  
  /**
   * Raises the [label-layout-parameter-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelLayoutParameterChanged">Online Documentation</a>
   */
  protected open fun onLabelLayoutParameterChanged(
    event: ItemChangedEventArgs<ILabel, ILabelModelParameter>,
  )
  
  /**
   * Raises the [label-preferred-size-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelPreferredSizeChanged">Online Documentation</a>
   */
  protected open fun onLabelPreferredSizeChanged(
    event: ItemChangedEventArgs<ILabel, Size>,
  )
  
  /**
   * Raises the [label-removed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelRemoved">Online Documentation</a>
   */
  protected open fun onLabelRemoved(
    event: LabelEventArgs,
  )
  
  /**
   * Raises the [label-style-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelStyleChanged">Online Documentation</a>
   */
  protected open fun onLabelStyleChanged(
    event: ItemChangedEventArgs<ILabel, ILabelStyle>,
  )
  
  /**
   * Raises the [label-tag-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelTagChanged">Online Documentation</a>
   */
  protected open fun onLabelTagChanged(
    event: ItemChangedEventArgs<ILabel, Any>,
  )
  
  /**
   * Raises the [label-text-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onLabelTextChanged">Online Documentation</a>
   */
  protected open fun onLabelTextChanged(
    event: ItemChangedEventArgs<ILabel, String>,
  )
  
  /**
   * Raises the [node-created][GraphWrapperBase] event.
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeCreated">Online Documentation</a>
   */
  protected open fun onNodeCreated(
    event: ItemEventArgs<INode>,
  )
  
  /**
   * Raises the [node-layout-changed][GraphWrapperBase] event.
   * @param [node] The node whose layout changed.
   * @param [oldLayout] The node layout before the change.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeLayoutChanged">Online Documentation</a>
   */
  protected open fun onNodeLayoutChanged(
    node: INode,
    oldLayout: Rect,
  )
  
  /**
   * Raises the [node-removed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeRemoved">Online Documentation</a>
   */
  protected open fun onNodeRemoved(
    event: NodeEventArgs,
  )
  
  /**
   * Raises the [node-style-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeStyleChanged">Online Documentation</a>
   */
  protected open fun onNodeStyleChanged(
    event: ItemChangedEventArgs<INode, INodeStyle>,
  )
  
  /**
   * Raises the [node-tag-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onNodeTagChanged">Online Documentation</a>
   */
  protected open fun onNodeTagChanged(
    event: ItemChangedEventArgs<INode, Any>,
  )
  
  /**
   * Dispatches the [parent-changed][GraphWrapperBase] event.
   * @param [event] The event args to dispatch.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onParentChanged">Online Documentation</a>
   */
  protected open fun onParentChanged(
    event: NodeEventArgs,
  )
  
  /**
   * Raises the [port-added][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortAdded">Online Documentation</a>
   */
  protected open fun onPortAdded(
    event: ItemEventArgs<IPort>,
  )
  
  /**
   * Raises the [port-location-parameter-changed][GraphWrapperBase] event
   * @param [event] The parameters for the event
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortLocationParameterChanged">Online Documentation</a>
   */
  protected open fun onPortLocationParameterChanged(
    event: ItemChangedEventArgs<IPort, IPortLocationModelParameter>,
  )
  
  /**
   * Raises the [port-removed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortRemoved">Online Documentation</a>
   */
  protected open fun onPortRemoved(
    event: PortEventArgs,
  )
  
  /**
   * Raises the [port-style-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortStyleChanged">Online Documentation</a>
   */
  protected open fun onPortStyleChanged(
    event: ItemChangedEventArgs<IPort, IPortStyle>,
  )
  
  /**
   * Raises the [port-tag-changed][GraphWrapperBase] event.
   * @param [event] The parameters for the event.
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-onPortTagChanged">Online Documentation</a>
   */
  protected open fun onPortTagChanged(
    event: ItemChangedEventArgs<IPort, Any>,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-remove">Online Documentation</a>
   */
  override fun remove(
    item: IModelItem,
  )
  
  /**
   * Removes event handlers for `graph` that have been added with [addEventHandlers][GraphWrapperBase].
   * @param [graph] The graph for which event propagators should be removed
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-removeEventHandlers">Online Documentation</a>
   */
  protected open fun removeEventHandlers(
    graph: IGraph,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setBendLocation">Online Documentation</a>
   */
  override fun setBendLocation(
    bend: IBend,
    location: Point,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setEdgePorts">Online Documentation</a>
   */
  override fun setEdgePorts(
    edge: IEdge,
    sourcePort: IPort,
    targetPort: IPort,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setIsGroupNode">Online Documentation</a>
   */
  override fun setIsGroupNode(
    node: INode,
    isGroupNode: Boolean,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setLabelLayoutParameter">Online Documentation</a>
   */
  override fun setLabelLayoutParameter(
    label: ILabel,
    layoutParameter: ILabelModelParameter,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setLabelPreferredSize">Online Documentation</a>
   */
  override fun setLabelPreferredSize(
    label: ILabel,
    preferredSize: Size,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setLabelText">Online Documentation</a>
   */
  override fun setLabelText(
    label: ILabel,
    text: String,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setNodeLayout">Online Documentation</a>
   */
  override fun setNodeLayout(
    node: INode,
    layout: Rect,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setParent">Online Documentation</a>
   */
  override fun setParent(
    node: INode,
    parent: INode?,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setPortLocationParameter">Online Documentation</a>
   */
  override fun setPortLocationParameter(
    port: IPort,
    locationParameter: IPortLocationModelParameter,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
   */
  override fun setStyle(
    node: INode,
    style: INodeStyle,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
   */
  override fun setStyle(
    label: ILabel,
    style: ILabelStyle,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
   */
  override fun setStyle(
    edge: IEdge,
    style: IEdgeStyle,
  )
  
  /**
   * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23GraphWrapperBase-method-setStyle">Online Documentation</a>
   */
  override fun setStyle(
    port: IPort,
    style: IPortStyle,
  )
  
  companion object : ClassMetadata<GraphWrapperBase> {
  }
}

/**
 * `graph-tag-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23graph-tag-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addGraphTagChangedHandler(
  crossinline handler: (item:IGraph, oldValue:  Any?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<IGraph, Any>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("graph-tag-changed", listener)
  return { removeEventListener("graph-tag-changed", listener) }
}

/**
 * `node-created`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23node-created">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addNodeCreatedHandler(
  crossinline handler: (item:INode) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<INode>> = { event, _ -> handler(event.item) }
  addEventListener("node-created", listener)
  return { removeEventListener("node-created", listener) }
}

/**
 * `node-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23node-removed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addNodeRemovedHandler(
  crossinline handler: (event:NodeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<NodeEventArgs> = { event, _ -> handler(event) }
  addEventListener("node-removed", listener)
  return { removeEventListener("node-removed", listener) }
}

/**
 * `node-style-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23node-style-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addNodeStyleChangedHandler(
  crossinline handler: (item:INode, oldValue:  INodeStyle?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<INode, INodeStyle>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("node-style-changed", listener)
  return { removeEventListener("node-style-changed", listener) }
}

/**
 * `node-layout-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23node-layout-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addNodeLayoutChangedHandler(
  crossinline handler: (node: INode, oldLayout: Rect) -> Unit
): () -> Unit {
  val listener: NodeLayoutChangedHandler = { node, oldLayout, _ -> handler(node, oldLayout) }
  addEventListener("node-layout-changed", listener)
  return { removeEventListener("node-layout-changed", listener) }
}

/**
 * `node-tag-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23node-tag-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addNodeTagChangedHandler(
  crossinline handler: (item:INode, oldValue:  Any?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<INode, Any>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("node-tag-changed", listener)
  return { removeEventListener("node-tag-changed", listener) }
}

/**
 * `edge-created`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edge-created">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addEdgeCreatedHandler(
  crossinline handler: (item:IEdge) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IEdge>> = { event, _ -> handler(event.item) }
  addEventListener("edge-created", listener)
  return { removeEventListener("edge-created", listener) }
}

/**
 * `edge-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edge-removed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addEdgeRemovedHandler(
  crossinline handler: (event:EdgeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<EdgeEventArgs> = { event, _ -> handler(event) }
  addEventListener("edge-removed", listener)
  return { removeEventListener("edge-removed", listener) }
}

/**
 * `edge-style-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edge-style-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addEdgeStyleChangedHandler(
  crossinline handler: (item:IEdge, oldValue:  IEdgeStyle?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<IEdge, IEdgeStyle>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("edge-style-changed", listener)
  return { removeEventListener("edge-style-changed", listener) }
}

/**
 * `edge-ports-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edge-ports-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addEdgePortsChangedHandler(
  crossinline handler: (event:EdgeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<EdgeEventArgs> = { event, _ -> handler(event) }
  addEventListener("edge-ports-changed", listener)
  return { removeEventListener("edge-ports-changed", listener) }
}

/**
 * `edge-tag-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23edge-tag-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addEdgeTagChangedHandler(
  crossinline handler: (item:IEdge, oldValue:  Any?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<IEdge, Any>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("edge-tag-changed", listener)
  return { removeEventListener("edge-tag-changed", listener) }
}

/**
 * `bend-added`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23bend-added">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addBendAddedHandler(
  crossinline handler: (item:IBend) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IBend>> = { event, _ -> handler(event.item) }
  addEventListener("bend-added", listener)
  return { removeEventListener("bend-added", listener) }
}

/**
 * `bend-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23bend-removed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addBendRemovedHandler(
  crossinline handler: (event:BendEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<BendEventArgs> = { event, _ -> handler(event) }
  addEventListener("bend-removed", listener)
  return { removeEventListener("bend-removed", listener) }
}

/**
 * `bend-location-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23bend-location-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addBendLocationChangedHandler(
  crossinline handler: (bend: IBend, oldLocation: Point) -> Unit
): () -> Unit {
  val listener: BendLocationChangedHandler = { bend, oldLocation, _ -> handler(bend, oldLocation) }
  addEventListener("bend-location-changed", listener)
  return { removeEventListener("bend-location-changed", listener) }
}

/**
 * `bend-tag-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23bend-tag-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addBendTagChangedHandler(
  crossinline handler: (item:IBend, oldValue:  Any?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<IBend, Any>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("bend-tag-changed", listener)
  return { removeEventListener("bend-tag-changed", listener) }
}

/**
 * `label-added`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23label-added">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addLabelAddedHandler(
  crossinline handler: (item:ILabel) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<ILabel>> = { event, _ -> handler(event.item) }
  addEventListener("label-added", listener)
  return { removeEventListener("label-added", listener) }
}

/**
 * `label-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23label-removed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addLabelRemovedHandler(
  crossinline handler: (event:LabelEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<LabelEventArgs> = { event, _ -> handler(event) }
  addEventListener("label-removed", listener)
  return { removeEventListener("label-removed", listener) }
}

/**
 * `label-style-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23label-style-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addLabelStyleChangedHandler(
  crossinline handler: (item:ILabel, oldValue:  ILabelStyle?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelStyle>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("label-style-changed", listener)
  return { removeEventListener("label-style-changed", listener) }
}

/**
 * `label-preferred-size-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23label-preferred-size-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addLabelPreferredSizeChangedHandler(
  crossinline handler: (item:ILabel, oldValue:  Size?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<ILabel, Size>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("label-preferred-size-changed", listener)
  return { removeEventListener("label-preferred-size-changed", listener) }
}

/**
 * `label-text-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23label-text-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addLabelTextChangedHandler(
  crossinline handler: (item:ILabel, oldValue:  String?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<ILabel, String>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("label-text-changed", listener)
  return { removeEventListener("label-text-changed", listener) }
}

/**
 * `label-layout-parameter-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23label-layout-parameter-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addLabelLayoutParameterChangedHandler(
  crossinline handler: (item:ILabel, oldValue:  ILabelModelParameter?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<ILabel, ILabelModelParameter>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("label-layout-parameter-changed", listener)
  return { removeEventListener("label-layout-parameter-changed", listener) }
}

/**
 * `label-tag-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23label-tag-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addLabelTagChangedHandler(
  crossinline handler: (item:ILabel, oldValue:  Any?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<ILabel, Any>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("label-tag-changed", listener)
  return { removeEventListener("label-tag-changed", listener) }
}

/**
 * `port-added`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23port-added">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addPortAddedHandler(
  crossinline handler: (item:IPort) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemEventArgs<IPort>> = { event, _ -> handler(event.item) }
  addEventListener("port-added", listener)
  return { removeEventListener("port-added", listener) }
}

/**
 * `port-removed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23port-removed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addPortRemovedHandler(
  crossinline handler: (event:PortEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<PortEventArgs> = { event, _ -> handler(event) }
  addEventListener("port-removed", listener)
  return { removeEventListener("port-removed", listener) }
}

/**
 * `port-style-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23port-style-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addPortStyleChangedHandler(
  crossinline handler: (item:IPort, oldValue:  IPortStyle?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<IPort, IPortStyle>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("port-style-changed", listener)
  return { removeEventListener("port-style-changed", listener) }
}

/**
 * `port-location-parameter-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23port-location-parameter-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addPortLocationParameterChangedHandler(
  crossinline handler: (item:IPort, oldValue:  IPortLocationModelParameter?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<IPort, IPortLocationModelParameter>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("port-location-parameter-changed", listener)
  return { removeEventListener("port-location-parameter-changed", listener) }
}

/**
 * `port-tag-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23port-tag-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addPortTagChangedHandler(
  crossinline handler: (item:IPort, oldValue:  Any?) -> Unit
): () -> Unit {
  val listener: EventHandler1<ItemChangedEventArgs<IPort, Any>> = { event, _ -> handler(event.item, event.oldValue) }
  addEventListener("port-tag-changed", listener)
  return { removeEventListener("port-tag-changed", listener) }
}

/**
 * `displays-invalidated`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23displays-invalidated">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addDisplaysInvalidatedHandler(
  crossinline handler: () -> Unit
): () -> Unit {
  val listener: EventHandler1<EventArgs> = { _, _ -> handler() }
  addEventListener("displays-invalidated", listener)
  return { removeEventListener("displays-invalidated", listener) }
}

/**
 * `parent-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23parent-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addParentChangedHandler(
  crossinline handler: (event:NodeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<NodeEventArgs> = { event, _ -> handler(event) }
  addEventListener("parent-changed", listener)
  return { removeEventListener("parent-changed", listener) }
}

/**
 * `is-group-node-changed`
 * @see <a href="https://docs.yworks.com/yfileshtml/#/api/GraphWrapperBase%23is-group-node-changed">Online Documentation</a>
 */
inline fun  GraphWrapperBase.addIsGroupNodeChangedHandler(
  crossinline handler: (event:NodeEventArgs) -> Unit
): () -> Unit {
  val listener: EventHandler1<NodeEventArgs> = { event, _ -> handler(event) }
  addEventListener("is-group-node-changed", listener)
  return { removeEventListener("is-group-node-changed", listener) }
}
